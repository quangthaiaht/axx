package it.bt.com.utilities;

import it.bt.com.definitions.DefinedPageElements.Aparments_Tab;
import it.bt.com.definitions.DefinedPageElements.My_Projects_Tab;
import it.bt.com.definitions.DefinedPageElements.Page_Login;
import it.bt.com.definitions.DefinedPageElements.Page_Sites_List;
import it.bt.com.definitions.DefinedPageElements.Profiles;
import it.bt.com.definitions.DefinedPageElements.Project_Activation_Tab;
import it.bt.com.definitions.DefinedPageElements.Project_Management;
import it.bt.com.definitions.DefinedPageElements.Settings_Tab;
import it.bt.com.definitions.DefinedPopUpElements.Popup_New_Software_Download;
import it.bt.com.definitions.DefinedPopUpElements.Popup_Session_Already_Opened;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.search.FromTerm;
import javax.mail.search.SearchTerm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.sun.mail.imap.IMAPFolder;

import io.appium.java_client.android.AndroidDriver;

import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

public class Utilities {

	private static final String SMTP_HOST_NAME = "smtp.gmail.com";
	private static final int SMTP_HOST_PORT = 465;
	private static final String SMTP_AUTH_USER = "bt.crono.stage@gmail.com";
	private static final String SMTP_AUTH_PWD = "tatest2015";
	private static final String IMAP_HOST_NAME = "imap.gmail.com";
	
	//https://www.w3schools.com/tags/ref_colornames.asp
	
	public static void sendEmail() throws Exception {
		Properties props = new Properties();

		props.put("mail.transport.protocol", "smtps");
		props.put("mail.smtps.host", SMTP_HOST_NAME);
		props.put("mail.smtps.auth", "true");
		// props.put("mail.smtps.quitwait", "false");

		Session mailSession = Session.getDefaultInstance(props);
		mailSession.setDebug(true);
		Transport transport = mailSession.getTransport();

		MimeMessage message = new MimeMessage(mailSession);
		message.setSubject("Testing SMTP-SSL");
		message.setContent("This is a test", "text/plain");

		message.addRecipient(Message.RecipientType.TO, new InternetAddress("hn.crono.stage@gmail.com"));

		transport.connect(SMTP_HOST_NAME, SMTP_HOST_PORT, SMTP_AUTH_USER, SMTP_AUTH_PWD);

		transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
		transport.close();
	}

	public static String getTempPwd(String email, String emailPass, String emailFrom) {
		IMAPFolder folder = null;
		Store store = null;
		String subject = null, body = null;
		String TemporaryPassword = null;

		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");
		Session session = Session.getDefaultInstance(props, null);

		try {
			System.out.println("*********** Begin connected '" + IMAP_HOST_NAME + "' with account <" + email
					+ "> and password <" + emailPass + "> ***********");
			store = session.getStore("imaps");
			store.connect(IMAP_HOST_NAME, email, emailPass);

			System.out.println("...Connected OK!...");
			folder = (IMAPFolder) store.getFolder("Inbox"); //This works for both email account

			System.out.println("...Open folder...");
			if (!folder.isOpen())
				folder.open(Folder.READ_ONLY);

			System.out.println("...Get messages from e-mail...");
			//Message[] messages = folder.getMessages();
			SearchTerm sender = new FromTerm(new InternetAddress(emailFrom));
			Message[] messages = folder.search(sender);
			for (int i = messages.length - 1; i >= 0; i--) {
				System.out.println("...Read e-mail " + (i + 1) + "...");
				Message msg = messages[i];

				subject = msg.getSubject();
				body = msg.getContent().toString();
				switch (subject) {
				case "ACWeb portal, new user activation":
					System.out.println("...Found '" + subject + "' [English]...");
					TemporaryPassword = getPassword_EN(body);
					break;
				case "ACWeb portail, nouvelle activation par l'utilisateur":
					System.out.println("...Found '" + subject + "' [French]...");
					TemporaryPassword = getPassword_FN(body);
					break;
				default:
					System.out.println("...Not found '" + subject + "'...");
					break;
				}
				if (!TemporaryPassword.isEmpty())
					break;
			}

		} catch (MessagingException e) {
			System.out.println("[ERROR-1] Conneted failed: ");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR-2] Get body message from e-mail: ");
			e.printStackTrace();
		} finally {
			System.out.println("...Close '" + IMAP_HOST_NAME + "'...");
			if (folder != null && folder.isOpen()) {
				try {
					folder.close(true);
				} catch (MessagingException e) {
					e.printStackTrace();
				}
			}
			if (store != null) {
				try {
					store.close();
				} catch (MessagingException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("*********** Read e-mail finished ***********");
		return TemporaryPassword;
	}

	public static String getPassword_EN(String body) {
		String[] a = body.split("Password:");
		String[] b = a[1].split("<br>*");
		return b[0].trim();
	}

	public static String getPassword_FN(String body) {
		String[] a = body.split("Mot de passe:");
		String[] b = a[1].split("<br>*");
		return b[0].trim();
	}

	public static String getUtcTime() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
		f.setTimeZone(TimeZone.getTimeZone("UTC"));

		return f.format(new Date());
	}
	
	public static String getTimeByDefaultTimezone(String timeFormat) {
		
		SimpleDateFormat f = new SimpleDateFormat(timeFormat);
	  	f.setTimeZone(TimeZone.getDefault());

		return f.format(new Date());
	}
	
	public static Date convertStringToDate(String dString, String timeFormat) {
		Date date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(timeFormat);
			date = sdf.parse(dString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	public static String ConvertDateToString(Date dDate, String dFormat) {
		SimpleDateFormat sdf = new SimpleDateFormat(dFormat);
		return sdf.format(dDate);
	}
	
	public static Date addMinutes(Date inputDate, int minutes) {
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		//Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		calendar.add(Calendar.MINUTE, minutes);
		return calendar.getTime();
	}
	
	public static Date addHours(Date date, int hours) {
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		//Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR_OF_DAY, hours);
		return calendar.getTime();
	}

	public static boolean Verify_Page(AndroidDriver<?> driver, WebDriverWait timeWait, String page, String KeyPage) {
		
		CommonUtils.waitPageIsReadyAfterSomeSeconds(driver, page, 3);
		String PAGE = CommonUtils.getText(driver, timeWait, KeyPage);
		if (PAGE.equals(page)) {
			System.out.println("Page [" + page + "] appears");
			//Utilities.Delay(3);
			return true;
		} else {
			System.out.println("[Error] Verify '" + page + "' page failed !");
			Assert.fail();
			return false;
		}
	}

	public static void Enable_Radios_And_Timebands(AndroidDriver<?> driver, WebDriverWait timeWait) {

		// click 'My Project' tab
		CommonUtils.clickElement(driver, timeWait, Page_Sites_List.TAB_MY_PROJECT, "TAB_MY_PROJECT");

		// click 'Project Management' icon
		if (Verify_Page(driver, timeWait, "My Projects", My_Projects_Tab.LI_CONTROL_UNIT))
			CommonUtils.clickElement(driver, timeWait, My_Projects_Tab.MAGNIFYING_GLASS, "'Project Management' icon");

		// Click on tab Setting
		CommonUtils.clickElement(driver, timeWait, Project_Management.Settings_TAB, "Settings tab");

		// Click Add Radio Group
		CommonUtils.clickElement(driver, timeWait, Settings_Tab.BUTTON_Add_Radio_group, "Add Radio Group");
		CommonUtils.typeText(driver, timeWait, Settings_Tab.INPUT_Radio_Group, "Radio Group Name", "Group-Radio-1");
		CommonUtils.clickElement(driver, timeWait, Settings_Tab.BUTTON_Save, "Save");
		CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Settings_Tab.SELECT_Button_Right, 1),
				"Choose button right ", "Big Gate");
		CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Settings_Tab.SELECT_Button_Left, 1),
				"Choose button right ", "Big Gate");

		// Click on "yes" to enable Time bands
		CommonUtils.clickElement(driver, timeWait, Settings_Tab.RADIO_Time_bands_Yes, "Enable Time-bands");

		// Click Confirm Setting
		CommonUtils.clickElement(driver, timeWait, Settings_Tab.CONFIRM_SETTING, "Confirm Settings");
		
	}

	public static void Create_Time_Bands(AndroidDriver<?> driver, WebDriverWait timeWait, String groupName, String timebandName) {
		System.out.println("Start 'Create_Time_Bands'");

		Delay(3);

		// click 'My Project' tab
		CommonUtils.clickElement(driver, timeWait, Page_Sites_List.TAB_MY_PROJECT, "TAB_MY_PROJECT");

		// click 'Project Management' icon
		if (Verify_Page(driver, timeWait, "My Projects", My_Projects_Tab.LI_CONTROL_UNIT))
			CommonUtils.clickElement(driver, timeWait, My_Projects_Tab.MAGNIFYING_GLASS, "'Project Management' icon");

		// click 'Profile' tab
		if (Utilities.Verify_Page(driver, timeWait, "Apartments", Aparments_Tab.LI_APARMENTS))
			CommonUtils.clickElement(driver, timeWait, Settings_Tab.PROFILES, "'Profiles' tab");

		// click 'New Group' button
		if (Utilities.Verify_Page(driver, timeWait, "Profiles", Profiles.LI_PROFILES))
			CommonUtils.clickElement(driver, timeWait, Profiles.BUTTON_NEW_GROUP, "'New Group' button");

		// fill group (profile) name
		if (CommonUtils.checkElement(driver, timeWait, Profiles.POPUP_UPDATE_GROUP_NAME) == true) {
			CommonUtils.typeText(driver, timeWait, Profiles.INPUT_GROUP_NAME, "New Profile Name", groupName);
			CommonUtils.clickElement(driver, timeWait, Profiles.BUTTON_CREATE_NEW_GROUP, "'OK' button");
		}

		Delay(5);

		// click 'New Time Band' button
		if (Utilities.Verify_Page(driver, timeWait, "Profiles", Profiles.LI_PROFILES))
			CommonUtils.clickElement(driver, timeWait, Profiles.BUTTON_NEW_TIMEBAND, "'New Time Band' button");

		// fill Time-band setting
		if (CommonUtils.checkElement(driver, timeWait, Profiles.POPUP_NEW_TIMEBAND_TITLE) == true) {
			CommonUtils.typeText(driver, timeWait, Profiles.INPUT_TIMEBAND_NAME, "Time Band Name", timebandName);
			CommonUtils.modifyDropDownBox(driver, timeWait, Profiles.DROPDOWNLIST_TIMEFROM_HOUR, "From Hour", "01");
			CommonUtils.modifyDropDownBox(driver, timeWait, Profiles.DROPDOWNLIST_TIMEFROM_MINUTE, "From Minute", "00");
			CommonUtils.modifyDropDownBox(driver, timeWait, Profiles.DROPDOWNLIST_TIMETO_HOUR, "To Hour", "23");
			CommonUtils.modifyDropDownBox(driver, timeWait, Profiles.DROPDOWNLIST_TIMETO_MINUTE, "To Minute", "00");

			CommonUtils.clickElement(driver, timeWait, Profiles.BUTTON_SAVE, "'Save' button");
		}

		// click 'Apply' button
		if (Utilities.Verify_Page(driver, timeWait, "Profiles", Profiles.LI_PROFILES))
			CommonUtils.clickElement(driver, timeWait, Profiles.BUTTON_APPLY, "'Apply' button");
		
		Delay(5);
	}

	public static void Delay(int secWaitTime) {
		try {
			TimeUnit.SECONDS.sleep(secWaitTime);
		} catch (InterruptedException e) {
			System.out.println("[Exception] TimeUnit.SECONDS.sleep()" + e.getMessage());
		}
	}

	public static boolean Check_Element_By_Xpath(WebDriver driver, WebDriverWait timeWait, String pageXpath, String pageName) {
		try {
			driver.findElement(By.xpath(pageXpath));
			return true;
		} catch (Exception e) {
			System.out.println("[Warning] Not found element: " + pageXpath);
			return false;
		}
	}
	
	public static boolean Validate_Element(WebDriver driver, WebDriverWait timeWait, String eName, String eXpath) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		try {
			
			if (js.executeScript("return document.readyState").toString().equals("complete")) {				
				if (Check_Element_By_Xpath(driver, timeWait, eXpath, eName)) {
					return true;
				}								
			}			
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());			
		}
		return false;
	}

	public static void MultiLogin(AndroidDriver<?> driver, WebDriverWait timeWait, String Username, String Password) {
		System.out.println("\n[MultiLogin] - Test");
		boolean isLogged = false;
		int attempLogin = 1;

		while (isLogged == false) {
			System.out.println("[Execute] Trying to login... Attemp : " + attempLogin);

			System.out.println("[Execute] Fill username '" + Username + "'");
			CommonUtils.typeText(driver, timeWait, Page_Login.INPUT_USERNAME, "Username", Username);

			CommonUtils.clickElement(driver, timeWait, Page_Login.INPUT_PASSWORD_PLAIN, "Password");

			System.out.println("[Execute] Fill password '" + Password + "'");
			CommonUtils.typeText(driver, timeWait, Page_Login.INPUT_PASSWORD, "Password", Password);

			CommonUtils.clickElement(driver, timeWait, Page_Login.BUTTON_SUBMIT, "Submit");

			if (Validate_Element(driver, timeWait, "LOGIN button", Page_Login.BUTTON_SUBMIT))
				isLogged = false;
			else
				isLogged = true;

			if ((attempLogin == 3) && (isLogged == false)) {
				//isLogged = true;
				System.out.println("[Execute] Error: The maximum attemp of login is reached");
				Assert.fail();
			}
			attempLogin += 1;
		}

		// Wait Page load completed
		CommonUtils.waitPageIsReady(driver, "ACWeb Home");

		// Close PopUp Session Already Opened if it appears
		if (CommonUtils.checkElement(driver, timeWait, Popup_Session_Already_Opened.BUTTON_CONTINUE) == true) {
			System.out.println("[Execute] Close PopUp 'Session Already Opened'");
			CommonUtils.clickElement(driver, timeWait, Popup_Session_Already_Opened.BUTTON_CONTINUE, "Continue");
		}

		// Close PopUp New Software Download if it appears
		if (CommonUtils.checkElement(driver, timeWait, Popup_New_Software_Download.BUTTON_CLOSED) == true) {
			System.out.println("[Execute] Close PopUp 'New Software Download'");
			CommonUtils.closePopUpInFrame(driver, timeWait, Popup_New_Software_Download.BUTTON_CLOSED);
		}

		// Verify Elements showed on Home page
		System.out.println("[Execute] Verify Expected Result on Page 'ACWeb Home'");
		if (CommonUtils.checkElement(driver, timeWait, Page_Sites_List.MENU_BAR) == false
				|| CommonUtils.checkElement(driver, timeWait, Page_Sites_List.BADGE_SEARCH) == false
				|| CommonUtils.checkElement(driver, timeWait, Page_Sites_List.MAP) == false) {
			System.out.println("Login failed !");
			Assert.fail();
		} else {
			System.out.println("[Execute] Expected Result: OK (Success)");
		}

	}

	public static void VerifyRule(AndroidDriver<?> driver, WebDriverWait timeWait, String Rule, String xpathStatusRule) {
		String getRule = "";
		int amountOFrule = CommonUtils.countElement(driver, Project_Activation_Tab.Rule);
		boolean foundRule = false;
		boolean statusRule = false;
		int attempCheckRule = 1;
		
		System.out.println("##### Rule Number: " + amountOFrule + " #####");
		
		while (foundRule == false) {

			getRule = Project_Activation_Tab.Rule + "[" + attempCheckRule + "]/span";
			if (CommonUtils.getText(driver, timeWait, getRule).contains(Rule)) {

				statusRule = CommonUtils.checkElement(driver, timeWait, getRule + xpathStatusRule);
				if (statusRule) {
					System.out.println("... Verify the rule => SUCCESS");
					foundRule = true;
				} else {
					System.out.println("... Verify the rule => FAILURE");
					Assert.fail();
				}
			} else {
				foundRule = false;
			}

			if (attempCheckRule == amountOFrule) {
				if (foundRule == false) {
					System.out.println("[Exception] Not found: " + Rule);
					Assert.fail();
				} else
					break;
			}
			attempCheckRule += 1;
		}
	}
	
	public static void VerifyRuleWithHighlightError (AndroidDriver<?> driver, WebDriverWait timeWait, String Rule, String xpathStatusRule) {
		
		String xpathRule = "";
		String xpathRuleContent = "";
		int amountOFrule = CommonUtils.countElement(driver, Project_Activation_Tab.Rule);
		boolean foundRule = false;
		boolean statusRule = false;
		int attempCheckRule = 1;
		
		System.out.println("##### Rule Number: " + amountOFrule + " #####");
		
		while (foundRule == false) {

			xpathRule = Project_Activation_Tab.Rule + "[" + attempCheckRule + "]/span";
			xpathRuleContent = Project_Activation_Tab.RULE_CONTENT + "[" + attempCheckRule + "]";
			
			if (CommonUtils.getText(driver, timeWait, xpathRule).contains(Rule)) {

				statusRule = CommonUtils.checkElementAndHighlight(driver, timeWait, xpathRule + xpathStatusRule);
				
				if (statusRule) {
					CommonUtils.clickElementWithoutHighlight(driver, timeWait, xpathRule, "<rule> '" + Rule + "'");
					Delay(3);
					highLightElement_green(driver, xpathRuleContent, 300);
					highLightElement(driver, xpathRuleContent, 300);
					highLightElement_green(driver, xpathRuleContent, 300);
					highLightElement(driver, xpathRuleContent, 300);
					highLightElement_green(driver, xpathRuleContent, 300);
					highLightElement(driver, xpathRuleContent, 300);
					
					System.out.println("[VERIFY RULE] SUCCESS: Rule '" + Rule + "' is shown as expected");
					foundRule = true;
					
				} else {
					System.out.println("[VERIFY RULE] FAILURE: Rule '" + Rule + "' is not shown as expected");
					Assert.fail();
				}
				
			} else {
				foundRule = false;
			}

			if (attempCheckRule == amountOFrule) {
				if (foundRule == false) {
					System.out.println("[Exception] Not found: " + Rule);
					Assert.fail();
				} else
					break;
			}
			attempCheckRule += 1;
		}
	}
	
	public static boolean VerifyRuleExist(AndroidDriver<?> driver, WebDriverWait timeWait, String Rule) {
		String getRule = "";
		int amountOFrule = CommonUtils.countElement(driver, Project_Activation_Tab.Rule);
		boolean foundRule = false;
		int attempCheckRule = 1;

		System.out.println("##### Number of the rule: " + amountOFrule + " #####");

		while (foundRule == false) {
			getRule = Project_Activation_Tab.Rule + "[" + attempCheckRule + "]/span";
			if (CommonUtils.getText(driver, timeWait, getRule).contains(Rule)) {
				foundRule = true;
			}
			
			if (attempCheckRule == amountOFrule) {
				if (foundRule == false) {
					System.out.println("[Exception] Not found: " + Rule);
				} else{
					System.out.println("[Exception] Found: " + Rule);
				}
				break;
			}
			attempCheckRule += 1;
		}
		return foundRule;
	}
	
	public static void DeleteFile(String filePath) {

		try {
			File file = new File(filePath);

			if (file.delete()) {
				System.out.println(file.getName() + " is deleted!");
			} else {
				System.out.println("[Warning] Cannot delete file '" + filePath + "'");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		//		File directory = new File("C:\\test");
		//		File[] files = directory.listFiles();
		//		for (File file : files) {
		//			if (file.delete()) {
		//				System.out.println(file.getName() + " is deleted!");
		//			} else {
		//				System.out.println("Delete operation is failed.");
		//			}
		//		}

	}

	public static void OpenWindowsApplication(String notepadXpath, String filePath) {
		
		Process process;
		Runtime runtime = Runtime.getRuntime();
		
		try {
			
			// create a new array of 2 strings
	         String[] cmdArray = new String[2];

	         // first argument is the program we want to open
	         cmdArray[0] = notepadXpath;

	         // second argument is a txt file we want to open with notepad
	         cmdArray[1] = filePath;
	         
	         // create a process and execute cmdArray and currect environment
	         process = runtime.exec(cmdArray,null);			
			
			//process = Runtime.getRuntime().exec("notepad.exe");
			//process = runtime.exec(notepadXpath + " " + filePath);
			//process.waitFor();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void CloseWindowsApplication(String appName) {

		Runtime runtime = Runtime.getRuntime();

		try {
			runtime.exec("taskkill /IM " + appName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String ReadTextFileContent(String filePath) {
		//List<String> lines = new ArrayList<String>();
		String line = null;
		String contentFile = "";

		try {

			System.out.println("Reading file '" + filePath + "'...");
			File f1 = new File(filePath);

			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);

			//int i = 0;
			while ((line = br.readLine()) != null) {
				if (line.contains("apartment_id")) {
					System.out.println("Reading Apartment Configuration content...");
				}

				contentFile = contentFile + line;
				//i++;
			}
			fr.close();
			br.close();

			//System.out.println("Complete reading Apartment Configuration content:");
			//System.out.println(contentFile);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return contentFile;
	}

	public static void ModifyTextFileUTF8(String filePath, String outputPath, String oldString, String newString)
    {	
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"UTF-8"));
		    String line;
		    
		    Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputPath), "UTF-8"));
	
		    try {
	
		        while ((line = br.readLine()) != null) {
		        			        	
		            out.write(line.replaceAll(oldString, newString));
		            out.write("\n");		            	
		        }
	
		    } finally {
	
		        br.close();
		        out.close();	
		    }
		} catch (IOException e)
        {
            e.printStackTrace();
        }
		
		Utilities.Delay(10);
    }
	
	public static void ModifyExportedFile(String csvFilePath, String modifiedValue) throws Exception {

		Scanner main = new Scanner(new File(csvFilePath));
		String cvsSplitBy = "	";
		StringBuilder builder = new StringBuilder();
		int totalTab = 0;

		try {
			int line = 0;
			while (main.hasNext()) {

				String[] wordsInLine = main.nextLine().split(cvsSplitBy);
				for (String word : wordsInLine) {

					if (modifiedValue.equals(word)) {
						System.out.println("[Modify] Old Value: " + word);
						word = word + "_Edited";
						System.out.println("[Modify] New Value: " + word);
					}

					builder.append(word).append(cvsSplitBy);
				}
				line++;
				builder.deleteCharAt(builder.lastIndexOf(cvsSplitBy));
				if (line == 2) {
					totalTab = Count_Tab(builder.toString());
					//System.out.println("totalTab temp = " + totalTab);
					for (int i = 0; i < 20 - totalTab; i++) {
						builder.append("\t");
					}
				}
				builder.append("\n");
			}

			// Close current csv file
			if (main != null)
				main.close();

			// Delete old file
			File oldfCSCFile = new File(csvFilePath);
			if (oldfCSCFile.delete()) {
				System.out.println("Temporary file is deleted!");
			} else {
				System.out.println("Delete operation is failed.");
			}

			// Write new file
			FileWriter newCSVFile = new FileWriter(createReplacedCsv(csvFilePath));

			newCSVFile.write(builder.toString());
			newCSVFile.close();

		} catch (Exception e) {
			System.out.println("Update excel file failed");
		}
	}
	
	public static File changeExtension(File file, String extension) {
		String filename = file.getName();

		if (filename.contains(".")) {
			filename = filename.substring(0, filename.lastIndexOf('.'));
		}
		filename += "." + extension;

		file.renameTo(new File(file.getParentFile(), filename));
		return file;
	}

	public static int Count_Tab(String str) {

		int counter = 0;
		for (char c : str.toCharArray()) {
			//System.out.println(c);
			if ("\t".equals("" + c)) {
				counter = counter + 1;
			}
		}
		return counter;
	}

	private static File createReplacedCsv(String filePath) throws Exception {
		File replacedCsv = new File(filePath);
		replacedCsv.createNewFile();
		return replacedCsv;
	}
	
	public static String timeStampFormat(String timeStamp) {
		String converted_timeStamp = "";
		try {
			SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = sdf.parse(timeStamp);
			
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			converted_timeStamp = dt.format(date);
			System.out.println("Conveted timeStamp: " + converted_timeStamp);
		} catch (Exception e) {
			System.out.println("[Exception] Cannot format date of LAST_DATA_SENT_TIMESTAMP: " + timeStamp + ": " + e.getMessage());
			Assert.fail();
		}
		return converted_timeStamp;
	}
	
	public static int timeStampCompare(String timeStamp1, String timeStamp2) {
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date;
		int result = 0;
		try {
			date = sdf.parse(timeStamp1);
			long timeInMillisSinceEpoch1 = date.getTime();
			
			date = sdf.parse(timeStamp2);
			long timeInMillisSinceEpoch2 = date.getTime();
			
			if(timeInMillisSinceEpoch1 > timeInMillisSinceEpoch2)
				result = 1;
			else if(timeInMillisSinceEpoch1 == timeInMillisSinceEpoch2)
				result = 0;
			else
				result = -1;
		} catch (Exception e) {
			System.out.println("[Exception] Cannot format date of timeStamp1: " + timeStamp1 + " and timeStamp2: " + timeStamp2 + ": "+ e.getMessage());
			Assert.fail();
		}
		return result;
	}

	public static void highLightElement(AndroidDriver<?> driver, String xpathElement, int highlightTime) {
			
		WebElement element = driver.findElement(By.xpath(xpathElement));
		
		 
		try 
		{
			Thread.sleep(highlightTime);
		} 
		catch (InterruptedException e) {		 
			System.out.println(e.getMessage());
		} 
		 
		
	}
	
	public static void highLightElement_green(WebDriver driver, String xpathElement, int highlightTime) {
		
		WebElement element = driver.findElement(By.xpath(xpathElement));
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		
		js.executeScript("arguments[0].setAttribute('style', 'background: lime; border: 2px solid black;');", element);
		 
		try 
		{
			Thread.sleep(highlightTime);
		} 
		catch (InterruptedException e) {		 
			System.out.println(e.getMessage());
		} 
		 
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
	}
	
	public static void highLightCheckedElement(AndroidDriver<?> driver, String xpathElement, int highlightTime) {
		
		WebElement element = driver.findElement(By.xpath(xpathElement));
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		
		js.executeScript("arguments[0].setAttribute('style', 'background: orange; border: 2px solid yellow;');", element);
		 
		try 
		{
			Thread.sleep(highlightTime);
			Thread.sleep(highlightTime);			
		} 
		catch (InterruptedException e) {		 
			System.out.println(e.getMessage());
		} 
		 
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
	}

	public static String[] utf8_name_generation() {
		
		String[] utf8_name = new String[4];
				
		utf8_name[0] = "¿‡¬‚«Á…È";
		utf8_name[1] = "»Ë ÍÀÎ";
		utf8_name[2] = "ŒÓœÔ‘Ù";
		utf8_name[3] = "Ÿ˘€˚‹¸";
		
		return utf8_name;		
	}
	
	public static String[] utf8_long_name_generation() {
		
		String[] utf8_name = new String[10];
		
		utf8_name[0] = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoUuTtQqRr";
		utf8_name[1] = "PpSsWwYySsZzXxVv123_‡¿‚¬‰ƒ·¡";
		utf8_name[2] = "È…Ë»Í ÎÀÏÃÓŒÔœíÚ“Ù‘ˆ÷Ò˘Ÿ˚€¸‹Á«";
		
		return utf8_name;		
	}

	public static String getRandomString() {
        String SALTCHARS = "ABCDE1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 8) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
	public static String generateBadgeId() {
		
        String SALTCHARS = "ABCDE1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 8) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

	public static String xmlFormat(String xml) {

		try
	    {
	        final InputSource src = new InputSource(new StringReader(xml));
	        final Node document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(src).getDocumentElement();

	        final DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
	        final DOMImplementationLS impl = (DOMImplementationLS) registry.getDOMImplementation("LS");
	        final LSSerializer writer = impl.createLSSerializer();

	        writer.getDomConfig().setParameter("format-pretty-print", Boolean.TRUE);
	        writer.getDomConfig().setParameter("xml-declaration", true);

	        return writer.writeToString(document);
	    } catch (Exception e)
	    {
	        e.printStackTrace();
	        return xml;
	    }
    }

	public static String getTextOfLabel(AndroidDriver<?> driver, WebDriverWait timeWait, String xpath) {
		
		String text = "";
		try
	    {
			text = driver.findElement(By.xpath(xpath)).getText();
			
	    } catch (Exception e)
	    {
	        e.printStackTrace();	        
	    }
		
		return text;
    }
	
	
}
