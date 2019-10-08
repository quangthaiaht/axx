package it.bt.com.config;

import it.bt.com.definitions.DefinedPageElements.Page_Sites_List;
import it.bt.com.definitions.EnvironmentParameters;
import it.bt.com.definitions.UserProfile;
import it.bt.com.utilities.CommonUtils;
import it.bt.com.utilities.Utilities;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import bsh.Capabilities;
import io.appium.java_client.android.AndroidDriver;

public class WebInit {

	protected static String url;
	protected static AndroidDriver<?> driver;
	protected static WebDriverWait timeWait;
	protected static int hightlightTime;
	protected static int popupLoadWait;
	protected static int pageLoadWait;
	protected static int imageLoadWait;
	protected static EnvironmentParameters envParams = new EnvironmentParameters();
	protected static DesiredCapabilities caps= new DesiredCapabilities();
	protected static UserProfile userProfile1 = new UserProfile();
	protected static UserProfile userProfile2 = new UserProfile();
	protected static UserProfile userProfile3 = new UserProfile();
	protected static UserProfile userProfile4 = new UserProfile();
	protected static UserProfile userProfile5 = new UserProfile();
	protected static Document doc;
	
	
	protected static Boolean continueTest = true;

    public static Boolean getContinueTest() {
        return continueTest;
    }

    public static void setContinueTest(Boolean continueTest) {
    	WebInit.continueTest = continueTest;
    }
	

	private void LoadUserProfile(String userProfileFilePath, UserProfile userProfile) {
		Properties prop = new Properties();
		InputStream input = null;
		//Path userProfileFilePath = Paths.get(envPath, userFileName);
		System.out.println("::: Load '" + userProfileFilePath + "' file:");
		try {
			input = new FileInputStream(userProfileFilePath);
			if (input != null) {
				prop.load(input);
				Enumeration<?> e = prop.propertyNames();
				while (e.hasMoreElements()) {
					String key = (String) e.nextElement();
					String value = prop.getProperty(key);
					if ("Surname".equals(key)) {
						userProfile.setSURNAME(value);
						System.out.println("Surname: " + value);
					}
					if ("Name".equals(key)) {
						userProfile.setNAME(value);
						System.out.println("Name: " + value);
					}
					if ("CompanyName".equals(key)) {
						userProfile.setCOMPANY_NAME(value);
						System.out.println("CompanyName: " + value);
					}
					if ("CompanyIdentificationCode".equals(key)) {
						userProfile.setCOMPANY_IDENTIFICATION_CODE(value);
						System.out.println("CompanyIdentificationCode: " + value);
					}
					if ("Language".equals(key)) {
						userProfile.setLANGUAGE(value);
						System.out.println("Language: " + value);
					}
					if ("Province".equals(key)) {
						userProfile.setPROVINCE(value);
						System.out.println("Province: " + value);
					}
					if ("City".equals(key)) {
						userProfile.setCITY(value);
						System.out.println("City: " + value);
					}
					if ("PostCode".equals(key)) {
						userProfile.setPOSTCODE(value);
						System.out.println("PostCode: " + value);
					}
					if ("Street".equals(key)) {
						userProfile.setSTREET(value);
						System.out.println("Street: " + value);
					}
					if ("StreetNumber".equals(key)) {
						userProfile.setSTREET_NUMBER(value);
						System.out.println("StreetNumber: " + value);
					}
					if ("TelephoneNumber".equals(key)) {
						userProfile.setTELEPHONE_NUMBER(value);
						System.out.println("TelephoneNumber: " + value);
					}
					if ("MobilePhoneNumber".equals(key)) {
						userProfile.setMOBILE_PHONE_NUMBER(value);
						System.out.println("MobilePhoneNumber: " + value);
					}
					if ("Email".equals(key)) {
						userProfile.setEMAIL(value);
						System.out.println("Email: " + value);
					}
					if ("EmailPassword".equals(key)) {
						userProfile.setEMAIL_PASSWORD(value);
						System.out.println("EmailPassword: " + value);
					}
					if ("Username".equals(key)) {
						userProfile.setUSERNAME(value);
						System.out.println("Username: " + value);
					}
					if ("Password".equals(key)) {
						userProfile.setPASSWORD(value);
						System.out.println("Password: " + value);
					}
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void LoadEnvironment(String envFilePath) {
		Properties prop = new Properties();
		InputStream input = null;
		System.out.println("::: Load '" + envFilePath + "' file:");
		try {
			input = new FileInputStream(envFilePath);
			if (input != null) {
				prop.load(input);
				Enumeration<?> e = prop.propertyNames();
				while (e.hasMoreElements()) {
					String key = (String) e.nextElement();
					String value = prop.getProperty(key);
					System.out.println(key + " = " + value);
					caps.setCapability("browserName","");
					if ("endpointUrl".equals(key))
						envParams.setACWEB_ENDPOINT_URL(value);
					if ("implicitlyWait".equals(key))
						envParams.setACWEB_IMPLICITLY_WAIT(Integer.parseInt(value));
					if ("explicityWait".equals(key))
						envParams.setACWEB_EXPLICIT_WAIT(Integer.parseInt(value));
					if ("pageLoadWait".equals(key))
						envParams.setACWEB_PAGE_LOAD_WAIT(Integer.parseInt(value));
					if ("imageLoadWait".equals(key))
						envParams.setACWEB_IMAGE_LOAD_WAIT(Integer.parseInt(value));
					if ("highlightTime".equals(key))
						envParams.setACWEB_HIGHTLIGHT_TIME(Integer.parseInt(value));
					if ("popupLoadWait".equals(key))
						envParams.setACWEB_POPUP_LOAD_WAIT(Integer.parseInt(value));
					if ("emailFrom".equals(key))
						envParams.setACWEB_EMAIL_FROM(value);
					if ("userProfile1".equals(key))
						envParams.setACWEB_USER_PROFILE1(value);
					if ("userProfile2".equals(key))
						envParams.setACWEB_USER_PROFILE2(value);
					if ("userProfile3".equals(key))
						envParams.setACWEB_USER_PROFILE3(value);
					if ("userProfile4".equals(key))
						envParams.setACWEB_USER_PROFILE4(value);
					if ("userProfile5".equals(key))
						envParams.setACWEB_USER_PROFILE5(value);
					if ("PlantName".equals(key))
						envParams.setPlantName(value);
					if ("PlantConfig".equals(key))
						envParams.setPlantConfig(value);
					if ("BadgeID".equals(key))
						envParams.setBadgeID(value);
					if ("notepadApp".equals(key))
						envParams.setNotepadApp(value);
					if ("excelApp".equals(key))
						envParams.setExcelApp(value);
					if ("deviceName".equals(key))
						caps.setCapability(key,value);
					if ("deviceOrientation".equals(key))
						caps.setCapability(key,value);
					if ("platformName".equals(key))
						caps.setCapability(key,value);
					if ("platformVersion".equals(key))
						caps.setCapability(key,value);
					if ("appPackage".equals(key))
						caps.setCapability(key,value);
					if("appActivity".equals(key))
						caps.setCapability(key,value);
					if("username".equals(key))
						envParams.setUserName(value);
					if("accessKey".equals(key))
						envParams.setAccessKey(value);
					if("deviceOrientation".equals(key))
						caps.setCapability(key,value);
					if("platformVersion".equals(key))
						caps.setCapability(key,value);
					if("deviceName".equals(key))
						caps.setCapability(key,value);
					if("app".equals(key))
						caps.setCapability(key,value);
					if("platformVersion".equals(key))
						caps.setCapability(key,value);
					if("platformVersion".equals(key))
						caps.setCapability(key,value);
					if("platformVersion".equals(key))
						caps.setCapability(key,value);
					if("platformVersion".equals(key))
						caps.setCapability(key,value);
					if("platformVersion".equals(key))
						caps.setCapability(key,value);
						
					
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (NumberFormatException nex) {
			nex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void LoadPlantConfigFile(String PlantConfigFile) {
		InputStream input = null;
		System.out.println("::: Load '" + PlantConfigFile + "' file:");
		try {
			input = new FileInputStream(PlantConfigFile);
			if (input != null) {
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder;
				dBuilder = dbFactory.newDocumentBuilder();
				doc = dBuilder.parse(input);
				doc.getDocumentElement().normalize();
				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ParserConfigurationException e) {
			System.out.println("[Exception] ParserConfigurationException: " + e.getMessage());
		} catch (SAXException e) {
			System.out.println("[Exception] SAXException: " + e.getMessage());
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					System.out.println("[Exception]: " + e.getMessage());
				}
			}
		}
	}
	
	protected void Init() throws IOException {
		File file = new File("");
		
		this.LoadEnvironment(file.getAbsoluteFile()+"/env/envsaucelabs.properties");
		
		Properties properties = new Properties();
		
		this.LoadUserProfile(envParams.getACWEB_USER_PROFILE1(), userProfile1);
		this.LoadUserProfile(envParams.getACWEB_USER_PROFILE2(), userProfile2);
		this.LoadUserProfile(envParams.getACWEB_USER_PROFILE3(), userProfile3);
		this.LoadUserProfile(envParams.getACWEB_USER_PROFILE4(), userProfile4);
		this.LoadUserProfile(envParams.getACWEB_USER_PROFILE5(), userProfile5);
		this.LoadPlantConfigFile(envParams.getPlantConfig());
		if(caps.getCapability("platformName").equals("Android"))
		{
			   driver = new AndroidDriver(new URL("http://"+envParams.getUserName()+":"+envParams.getAccessKey()+"@ondemand.saucelabs.com:80/wd/hub"), caps);
		}
		
//			System.out.println("::: Open Browser");
//			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
//			//driver = new ChromeDriver();
//			
//			System.out.println("::: Set ChromeOptions");
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--no-sandbox");
//			//options.addArguments("enable-automation");
//			//options.addArguments("--headless");
//			//options.addArguments("--disable-extensions");
//			//options.addArguments("--dns-prefetch-disable");
//			//options.addArguments("--disable-gpu");
//			driver = new ChromeDriver(options);
//
//			//import org.openqa.selenium.ie.InternetExplorerDriver;
//			//System.setProperty("webdriver.ie.driver", System.getProperty("browser"));
//			//driver = new InternetExplorerDriver();
//
//			//import org.openqa.selenium.firefox.FirefoxDriver;
//			//driver = new FirefoxDriver();
		
		
		hightlightTime = envParams.getACWEB_HIGHTLIGHT_TIME();
		popupLoadWait = envParams.getACWEB_POPUP_LOAD_WAIT();
		pageLoadWait = envParams.getACWEB_PAGE_LOAD_WAIT();
		imageLoadWait = envParams.getACWEB_IMAGE_LOAD_WAIT();
		
		timeWait = new WebDriverWait(driver, envParams.getACWEB_EXPLICIT_WAIT());
		
	}
	
//	protected void Init_Firefox() {
//
//		this.LoadEnvironment(System.getProperty("environment"));
//		this.LoadUserProfile(envParams.getACWEB_USER_PROFILE1(), userProfile1);
//		this.LoadUserProfile(envParams.getACWEB_USER_PROFILE2(), userProfile2);
//		this.LoadUserProfile(envParams.getACWEB_USER_PROFILE3(), userProfile3);
//		this.LoadUserProfile(envParams.getACWEB_USER_PROFILE4(), userProfile4);
//		this.LoadUserProfile(envParams.getACWEB_USER_PROFILE5(), userProfile5);
//		this.LoadPlantConfigFile(envParams.getPlantConfig());
//		
//		driver = new FirefoxDriver();
//		
//		hightlightTime = envParams.getACWEB_HIGHTLIGHT_TIME();
//		popupLoadWait = envParams.getACWEB_POPUP_LOAD_WAIT();
//		pageLoadWait = envParams.getACWEB_PAGE_LOAD_WAIT();
//		imageLoadWait = envParams.getACWEB_IMAGE_LOAD_WAIT();
//		driver.manage().timeouts().implicitlyWait(envParams.getACWEB_IMPLICITLY_WAIT(), TimeUnit.SECONDS);
//		timeWait = new WebDriverWait(driver, envParams.getACWEB_EXPLICIT_WAIT());
//		driver.manage().window().maximize();
//
//		System.out.println("::: Navigate Url: " + envParams.getACWEB_ENDPOINT_URL());
//		driver.get(envParams.getACWEB_ENDPOINT_URL());
//	}

	protected void Close() {

		System.out.println("::: Logging out...");
		if (CommonUtils.checkElement(driver, timeWait, Page_Sites_List.BUTTON_LOGOUT) == true)
			CommonUtils.clickElement(driver, timeWait, Page_Sites_List.BUTTON_LOGOUT, "Logout");

		System.out.println("::: Closing Browser...");
		Utilities.Delay(pageLoadWait);
		driver.close();
		driver.quit();
	}

}
