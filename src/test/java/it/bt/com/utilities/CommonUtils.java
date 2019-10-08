package it.bt.com.utilities;


import it.bt.com.config.WebInit;
import it.bt.com.definitions.DefinedPageElements.Page_Login;
import it.bt.com.definitions.DefinedPageElements.Page_Sites_List;
import it.bt.com.definitions.DefinedPopUpElements.Popup_New_Software_Download;
import it.bt.com.definitions.DefinedPopUpElements.Popup_Session_Already_Opened;
import it.bt.com.definitions.DefinedPopUpElements.Popup_Waring;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import io.appium.java_client.android.AndroidDriver;

public class CommonUtils extends WebInit {
	
	public static int elementHighlightTime = WebInit.hightlightTime; 
	
	public static String getInputText(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath) {
		try {
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			String currentText = webDriver.findElement(By.xpath(xpath)).getAttribute("value");
			System.out.println("[getInputText] Input Text: " + currentText);
			return currentText;
		} catch (Exception e) {
			System.out.println("[Exception] " + e.getMessage());
			return null;
		}
	}

	public static String getText(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath) {
		try {
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		} catch (Exception e) {
			System.out.println("[Exception] Not found <" + xpath + ">: " + e.getMessage());
			return null;
		}

		try {
			String text = webDriver.findElement(By.xpath(xpath)).getText();
			System.out.println("[getText] Text: " + text);
			return text;
		} catch (Exception e) {
			System.out.println("[Exception] Text value of <" + xpath + "> field dose not exist: " + e.getMessage());
			return null;
		}
	}
	
	public static String getHiddenText(AndroidDriver<?> driver, WebDriverWait timeWait, String xpath) {
		
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(By.xpath(xpath));

			js.executeScript("arguments[0].setAttribute('type', '')",element);

			//String text = driver.findElement(By.xpath(xpath)).getAttribute("value");			
			String text = driver.findElement(By.xpath(xpath)).getAttribute("textContent");
			
			System.out.println("[getHiddenText] Text: " + text);
			return text;
			
		} catch (Exception e) {
			System.out.println("[Exception] Text value of <" + xpath + "> field dose not exist: " + e.getMessage());
			return null;
		}
	}
	
	public static String getInnerHTML(AndroidDriver<?> driver, WebDriverWait timeWait, String xpath) {
		
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(By.xpath(xpath));

			js.executeScript("arguments[0].setAttribute('type', '')",element);

			String text = driver.findElement(By.xpath(xpath)).getAttribute("innerHTML");	
			return text;
			
		} catch (Exception e) {
			System.out.println("[Exception] Text value of <" + xpath + "> field dose not exist: " + e.getMessage());
			return null;
		}
	}
	
	public static String getTextAndHighlight(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath) {
		try {
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		} catch (Exception e) {
			System.out.println("[Exception] Not found <" + xpath + ">: " + e.getMessage());
			return null;
		}

		try {
			String text = webDriver.findElement(By.xpath(xpath)).getText();
			Utilities.highLightElement_green(driver, xpath, 300);
			Utilities.highLightElement(driver, xpath, 300);
			Utilities.highLightElement_green(driver, xpath, 300);
			Utilities.highLightElement(driver, xpath, 300);
			Utilities.highLightElement_green(driver, xpath, 300);
			Utilities.highLightElement(driver, xpath, 300);
			System.out.println("[getText] Text: " + text);
			return text;
		} catch (Exception e) {
			System.out.println("[Exception] Text value of <" + xpath + "> field dose not exist: " + e.getMessage());
			return null;
		}
	}

	public static String getAttribute(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath, String attribute) {
		try {
			String value = webDriver.findElement(By.xpath(xpath)).getAttribute(attribute);
			System.out.println("Attribute: " + attribute + ", value: '" + value);
			return value;
		} catch (Exception e) {
			System.out.println("[Exception] Not found <" + xpath + ">: " + e.getMessage());
			return null;
		}

	}

	public static String getSelectedValue_Combobox(AndroidDriver<?> webDriver, String xpath) {

		Select comboBox = new Select(webDriver.findElement(By.xpath(xpath)));
		String selectedComboValue = comboBox.getFirstSelectedOption().getText();

		return selectedComboValue;
	}

	public static void typeText(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath, String inputElement,
			String value) {
		try {
			System.out.println("...fill '" + inputElement + "' with '" + value + "'");
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Utilities.highLightElement(webDriver, xpath, elementHighlightTime);
			Utilities.Delay(1);
			webDriver.findElement(By.xpath(xpath)).clear();
			webDriver.findElement(By.xpath(xpath)).sendKeys(value);
			
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
	}

	public static void clearText(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath, String modifiedKey) {
		System.out.println("...clear value of '" + modifiedKey + "'");
		webDriver.findElement(By.xpath(xpath)).clear();
	}

	public static void modifyText(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath, String modifiedKey,
			String modifiedValue) {
		try {			
			System.out.println("...update value of '" + modifiedKey + "' to '" + modifiedValue + "'");
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Utilities.highLightElement(webDriver, xpath, elementHighlightTime);
			//Utilities.Delay(1);
			WebElement targetElement = webDriver.findElement(By.xpath(xpath));
			targetElement.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			webDriver.findElement(By.xpath(xpath)).sendKeys(modifiedValue);
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
	}

	public static void sendKey(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath, Keys key) {
		try {			
			System.out.println("Sending key '" + key + "'");
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Utilities.highLightElement(webDriver, xpath, elementHighlightTime);
			webDriver.findElement(By.xpath(xpath)).sendKeys(key);
			System.out.println("Sent key '" + key + "'");
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
	}

	public static boolean isElementEnabled(AndroidDriver<?> webDriver, String elementId) {
		boolean checkElement = false;
		try {
			checkElement = webDriver.findElement(By.id(elementId)).isDisplayed();
		} catch (Exception e) {
			System.out
					.println("[Exception] Time out when finding element with id:" + elementId + ": " + e.getMessage());
			Assert.fail();;
		}
		return checkElement;
	}

	public static boolean enableORdisable(AndroidDriver<?> webDriver, String xpath) {
		boolean checkElement = false;
		try {
			checkElement = webDriver.findElement(By.xpath(xpath)).isEnabled();
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element with xpath:" + xpath + ": " + e.getMessage());
			//Assert.fail();;
		}
		return checkElement;
	}

	public static boolean enableORdisable_nonControls(AndroidDriver<?> webDriver, String xpath, String attribute,
			String value[]) {
		boolean checkElement = false;
		try {
			String actual_value = webDriver.findElement(By.xpath(xpath)).getAttribute(attribute);
			System.out.println("Actual value: '" + actual_value + "'");
			if (Arrays.asList(value).contains(actual_value)) {
				System.out.println("Value of attribute: '" + attribute + "' contains value: '" + actual_value + "'");
				checkElement = true;
			} else {
				System.out.println("Value of attribute: '" + attribute + "' NOT contain value: '" + actual_value + "'");
			}
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element with xpath:" + xpath + ": " + e.getMessage());
		}
		return checkElement;
	}

	public static int countRowOfTable(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String tableId) {
		int rowNo = 0;
		try {
			rowNo = webDriver.findElements(By.xpath("//*[@id='" + tableId + "']/tbody/tr")).size();
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding table with id:" + tableId + ": " + e.getMessage());
			Assert.fail();;
		}
		return rowNo;
	}

	public static int countColOfTable(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String tableId) {
		int colNo = 0;
		try {
			colNo = webDriver.findElements(By.xpath("//*[@id='" + tableId + "']/tbody/tr[@id='1']/td")).size();
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding table with id:" + tableId + ": " + e.getMessage());
			Assert.fail();;
		}
		return colNo;
	}

	public static int countElement(AndroidDriver<?> webDriver, String xpath) {
		int colNo = 0;
		try {
			colNo = webDriver.findElements(By.xpath(xpath)).size();
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding table with xpath: " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
		return colNo;
	}

	public static String getTableData(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath) {
		try {
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			String currentText = webDriver.findElement(By.xpath(xpath)).getText();
			System.out.println("[getTableData] Data: " + currentText);
			return currentText;
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding table with xpath:" + xpath + ": " + e.getMessage());
			//Assert.fail();;
			return null;
		}

	}

	public static ArrayList<Integer> getOrderAndPageByNameInTable(AndroidDriver<?> driver, WebDriverWait timeWait,
			String general_xpath, String nextPage_xpath, String Name) {
		int rowOrder = 2;
		int page = 1;
		ArrayList<Integer> rowOrderAndPage = new ArrayList<Integer>();
		String xpath = "";
		boolean first_row_found = false;
		boolean row_found = false;

		System.out.println("[Execute] Start GetOrderByNameInTable");

		//Pre-condition is the first row must be found
		xpath = general_xpath.replace("rowOrder", "1");
		for (int i = 1; i < 5; i++) {
			if (CommonUtils.checkElement(driver, timeWait, xpath)) {
				first_row_found = true;
				System.out.println("Found the first row of table");
				break;
			} else {
				System.out.println("Not find the first row of table");
			}
		}

		if (first_row_found == false) {
			rowOrderAndPage.add(0, 0);
			rowOrderAndPage.add(1, 0);
			return rowOrderAndPage;
		}

		for (page = 1; page <= 3; page++) {
			for (rowOrder = 2;; rowOrder++) {
				xpath = general_xpath.replace("rowOrder", Integer.toString(rowOrder));
				System.out.println("Verify Order: " + rowOrder + "; xpath: " + xpath);
				if (CommonUtils.checkElement(driver, timeWait, xpath) == true) {
					if (CommonUtils.getText(driver, timeWait, xpath).equals(Name)) {
						row_found = true;
						break;
					}
				} else {
					break;
				}
			}
			if (row_found)
				break;
			else if (CommonUtils.checkNextPageAndClickNextPage(driver, nextPage_xpath))
				continue;
			else
				break;
		}

		if (!row_found) {
			rowOrderAndPage.add(0, 1);
			rowOrderAndPage.add(1, 1);
		} else {
			System.out.println("[Execute] Found rowOrder " + rowOrder + " in page " + page);
			rowOrderAndPage.add(0, rowOrder);
			rowOrderAndPage.add(1, page);
		}
		System.out.println("[Execute] End GetOrderByNameInTable");
		return rowOrderAndPage;
	}

	public static boolean checkSelectRadio(AndroidDriver<?> webDriver, String xpath) {
		boolean x = webDriver.findElement(By.xpath(xpath)).isSelected();
		if (x == true) {
			System.out.println("[Result] Radio element <" + xpath + "> is selected");
			return true;
		} else {
			System.out.println("[Result] Radio element <" + xpath + "> is not selected");
			return false;
		}
	}
	
	// Tung
	public static boolean checkSelectCheckBox(AndroidDriver<?> webDriver, String xpath) {
		boolean x = webDriver.findElement(By.xpath(xpath)).isSelected();
		if (x == true) {
			System.out.println("[Result] CheckBox element <" + xpath + "> is selected");
			return true;
		} else {
			System.out.println("[Result] CheckBox element <" + xpath + "> is not selected");
			return false;
		}

	}

	public static void modifyDropDownBox(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath,
			String modifiedKey, String modifiedValue) {
		try {
			System.out.println("...update value of '" + modifiedKey + "' to '" + modifiedValue + "'");
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Utilities.Delay(1);
			
			Utilities.highLightElement(webDriver, xpath, elementHighlightTime);						
			Select select = new Select(webDriver.findElement(By.xpath(xpath)));
			//Select select = new Select(webDriver.findElement(By.id("id_lingua")));
			select.selectByVisibleText(modifiedValue);
			
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
	}

	public static void selectFirstOptionInDropDownBox(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath,
			String modifiedKey) {
		try {
			System.out.println("...select first option of '" + modifiedKey + "'");
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Utilities.Delay(1);
			
			Utilities.highLightElement(webDriver, xpath, elementHighlightTime);			
			Select select = new Select(webDriver.findElement(By.xpath(xpath)));
			//Select select = new Select(webDriver.findElement(By.id("id_lingua")));
			select.selectByIndex(0);
			
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
	}

	public static void selectOptionInDropDownBoxByIndex(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath,
			String modifiedKey, int index) {
		try {
			System.out.println("...select option of '" + modifiedKey + "' with index: " + index);
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Utilities.Delay(1);
			
			Utilities.highLightElement(webDriver, xpath, elementHighlightTime);
			//JavascriptExecutor jse = (JavascriptExecutor) webDriver;
			//jse.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(By.xpath(xpath)));			
			Select select = new Select(webDriver.findElement(By.xpath(xpath)));
			//Select select = new Select(webDriver.findElement(By.id("id_lingua")));
			select.selectByIndex(index);
			
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
	}
	
	public static void selectOptionInDropDownBoxByValue(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath,
			String modifiedKey, String value) {
		try {
			System.out.println("...select option of '" + modifiedKey + "' with value: " + value);
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Utilities.Delay(1);
			
			Utilities.highLightElement(webDriver, xpath, elementHighlightTime);		
			Select select = new Select(webDriver.findElement(By.xpath(xpath)));
			select.selectByValue(value);
			
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
	}


	public static void selectOptionInDropDownBoxByXpath(AndroidDriver<?> webDriver, WebDriverWait webDriverWait,
			String xpath_list, String xpath_item, String modifiedKey) {
		try {
			System.out.println("...select option of '" + modifiedKey + "'");
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_item)));
			Utilities.Delay(1);
			Utilities.highLightElement(webDriver, xpath_item, elementHighlightTime);
			CommonUtils.clickElement(webDriver, webDriverWait, xpath_list, "Dropdown list");			
			CommonUtils.clickElement(webDriver, webDriverWait, xpath_item, "Select item");
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath_item + ": " + e.getMessage());
			Assert.fail();;
		}
	}

	public static void moveByTab(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath) {
		try {			
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Utilities.highLightElement(webDriver, xpath, elementHighlightTime);
			webDriver.findElement(By.xpath(xpath)).sendKeys(Keys.TAB);
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
	}

	public static void waitForVisible(WebDriverWait webDriverWait, String xpath) {
		try {
			System.out.println("...Wait for <" + xpath + "> is visible");
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
	}

	public static void waitForNoVisible(WebDriverWait webDriverWait, String xpath) {
		try {
			webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
		} catch (Exception e) {
			System.out.println("[Exception] Time out waiting for element '" + xpath + "' to disappear" + ": "
					+ e.getMessage());
			Assert.fail();;
		}
	}

	public static void waitForEnabled(WebDriverWait webDriverWait, String xpath) {
		try {
			webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		} catch (Exception e) {
			System.out.println("[Exception] Time out when wait for element '" + xpath + "' enabled" + ": "
					+ e.getMessage());
			Assert.fail();;
		}
	}
	
	public static void clickGoToHomePage(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath, String buttonName) {
		
		try {			
			System.out.println("Click [" + buttonName + "]");
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Utilities.Delay(1);
			
			Utilities.highLightElement(webDriver, xpath, elementHighlightTime);			
			webDriver.findElement(By.xpath(xpath)).click();
			System.out.println("Clicked [" + buttonName + "] done!");
			
			// Wait Page load completed
			CommonUtils.waitPageIsReady(driver, "[ACWeb Home]");
			
			// Close PopUp Session Already Opened if it appears
			if (CommonUtils.checkElement(driver, timeWait, Popup_Session_Already_Opened.BUTTON_CONTINUE) == true) {
				System.out.println("[Execute] Page 'Session Already Opened' appears");
				CommonUtils.clickElement(driver, timeWait, Popup_Session_Already_Opened.BUTTON_CONTINUE, "Continue");
			}
			
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
	}	

	public static void clickElement(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath, String buttonName) {
		try {			
			System.out.println("Click " + buttonName + "");
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Utilities.Delay(1);
			Utilities.highLightElement(webDriver, xpath, elementHighlightTime);			
			webDriver.findElement(By.xpath(xpath)).click();
			System.out.println("Clicked " + buttonName + " done!");
			
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
	}
	
	public static void clickElementWithoutHighlight(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath, String buttonName) {
		try {
			
			System.out.println("Click [" + buttonName + "]");
			//webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			//TimeUnit.SECONDS.sleep(1);
			webDriver.findElement(By.xpath(xpath)).click();
			System.out.println("Clicked [" + buttonName + "] done!");
			
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
	}

	public static void clickElementAfterSomeSeconds(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath,
			String buttonName, int imageLoadWait) {
		try {			
			System.out.println("...click '" + buttonName + "'");
			TimeUnit.SECONDS.sleep(imageLoadWait);
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Utilities.Delay(1);
			
			Utilities.highLightElement(webDriver, xpath, elementHighlightTime);
			webDriver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
	}

	public static boolean checkAndClickElement(AndroidDriver<?> webDriver, String xpath) {
		boolean clickElement = false;
		try {
			if (webDriver.findElement(By.xpath(xpath)).isDisplayed()
					&& webDriver.findElement(By.xpath(xpath)).isEnabled()) {
				webDriver.findElement(By.xpath(xpath)).click();
				waitPageIsReady(webDriver, "New tab/page");
				clickElement = true;
			}
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element" + xpath + ": " + e.getMessage());
		}
		return clickElement;
	}

	public static boolean checkNextPageAndClickNextPage(AndroidDriver<?> webDriver, String xpath) {
		boolean clickNextPage = false;
		try {
			String[] value = new String[20];
			value[0] = "ui-pg-button ui-corner-all";

			if (CommonUtils.enableORdisable_nonControls(webDriver, xpath, "class", value)) {
				System.out.println("NextPage is enabled!!!");
				webDriver.findElement(By.xpath(xpath)).click();
				waitPageIsReady(webDriver, "Next page");
				clickNextPage = true;
			}
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element" + xpath + ": " + e.getMessage());
		}
		return clickNextPage;
	}

	public static void closePopUpInFrame(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath) {
		try {			
			System.out.println("Close Pop-up");
			webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			Utilities.highLightElement(webDriver, xpath, elementHighlightTime);
			webDriver.findElement(By.xpath(xpath)).click();
			System.out.println("Pop-up closed");
			
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
		webDriver.switchTo().defaultContent();
	}

	public static boolean waitElement(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath) {
		try {
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			return true;
		} catch (Exception e) {
			System.out.println("Not Found '" + xpath + "'" + ": " + e.getMessage());
			return false;
		}
	}

	public static boolean checkElement(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath) {
		try {
			webDriver.findElement(By.xpath(xpath));
			return true;
		} catch (Exception e) {
			System.out.println("Not Found: " + xpath);
			return false;
		}
	}
	
	public static boolean checkElementRedBullet(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath) {
		try {
			webDriver.findElement(By.xpath(xpath));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean checkElementAndHighlight(AndroidDriver<?> driver, WebDriverWait timeWait, String xpath) {
		try {
			driver.findElement(By.xpath(xpath));
			Utilities.highLightElement_green(driver, xpath, 300);
			Utilities.highLightElement(driver, xpath, 300);
			Utilities.highLightElement_green(driver, xpath, 300);
			Utilities.highLightElement(driver, xpath, 300);
			Utilities.highLightElement_green(driver, xpath, 300);
			Utilities.highLightElement(driver, xpath, 300);
			return true;
		} catch (Exception e) {
			System.out.println("Not Found: " + xpath);
			return false;
		}
	}

	public static void refreshPage(AndroidDriver<?> webDriver, String pageName) {
		
		try {
			System.out.println("\n~ ~ ~ Refresh page '" + pageName + "' ~ ~ ~");
			webDriver.navigate().refresh();
			
			waitPageIsReady(webDriver, pageName);
			
		} catch (Exception e) {
			System.out.println("[Exception] Refesh Page '" + pageName + "': " + e.getMessage());
		}
	}
	
	public static void waitPageIsReady(AndroidDriver<?> driver, String pageName) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Utilities.Delay(pageLoadWait);
		try {
			long startTime = System.currentTimeMillis();			
			
			if (js.executeScript("return document.readyState").toString().equals("complete")) {
				long stopTime = System.currentTimeMillis();
			    long elapsedTime = stopTime - startTime;
				System.out.println("Page '" + pageName + "' appears\n");				
			}	
			
		} catch (Exception e) {
			System.out.println("\nException: Page " + pageName + " could not loaded: " + e.getMessage());
		}
	}

	public static void waitPageIsReadyAfterSomeSeconds(AndroidDriver<?> webDriver, String pageName, int s) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		try {
			//Firstly, sleep s seconds; then wait for the page load in case low loading
			TimeUnit.SECONDS.sleep(s);

			for (int i = s + 1; i < 25; i++) {
				if (js.executeScript("return document.readyState").toString().equals("complete")) {
					System.out.println("Page " + pageName + "... loaded after " + i + "s!");
					break;
				}
				System.out.println("Page " + pageName + " loading...");
				TimeUnit.SECONDS.sleep(1);
			}
		} catch (InterruptedException e) {
			System.out.println("Exception: Page " + pageName + " could not loaded: " + e.getMessage());
		}
	}

	public static void goToPageByNumber(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, String xpath, int pageNumber) {
		try {
			CommonUtils.typeText(webDriver, webDriverWait, xpath, "pageNumber", String.valueOf(pageNumber));
			System.out.println("Going to page: '" + pageNumber);
			CommonUtils.sendKey(webDriver, webDriverWait, xpath, Keys.RETURN);
			Utilities.Delay(1);
			waitPageIsReady(webDriver, "Page " + pageNumber);
		} catch (Exception e) {
			System.out.println("[Exception] goToPage '" + pageNumber + ": " + e.getMessage());
		}
	}

	public static void VerifyPage(AndroidDriver<?> driver, WebDriverWait timeWait, String page, String KeyPage) {
		
		try {
			CommonUtils.waitPageIsReady(driver, page);
			
			String PAGE = CommonUtils.getText(driver, timeWait, KeyPage);
			
			if (PAGE.equals(page)) {
				System.out.println("\nPage \"" + page + "\" appeared");
			} else {
				System.out.println("\nError: Page \"" + page + "\" did not appear");
				Assert.fail();;
			}
			
		} catch (Exception e) {
			System.out.println("\nException: " + e.getMessage());
			Assert.fail();;
		}
	}

	public static void VerifyPageAfterSomeSeconds(AndroidDriver<?> driver, WebDriverWait timeWait, String page,
			String KeyPage, int pageLoadWait) {
		CommonUtils.waitPageIsReadyAfterSomeSeconds(driver, page, pageLoadWait);
		String PAGE = CommonUtils.getText(driver, timeWait, KeyPage);
		if (PAGE.equals(page)) {
			System.out.println("Verify '" + page + "' page success");
		} else {
			System.out.println("[Error] Verify '" + page + "' page failed! Actual KeyPage: " + PAGE);
			Assert.fail();;
		}
	}

	public static void Alert(AndroidDriver<?> webDriver, WebDriverWait webDriverWait, boolean acceptORdismiss) {
		try {
			webDriverWait.until(ExpectedConditions.alertIsPresent());
			if (acceptORdismiss == true) {
				webDriver.switchTo().alert().accept();
			} else {
				webDriver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			System.out.println("[Exception] Not found Alert: " + e.getMessage());
		}
	}

	static final String str = "0123456789abcdefhijkprstuvwxABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	static Random rnd = new Random();

	public static String randomString(int n) {
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++)
			sb.append(str.charAt(rnd.nextInt(str.length())));
		return sb.toString();
	}

	public static String random(int n, int a, int A) {
		String num = "0123456789";
		String str = "abcdefhijkprstuvwx";
		String STR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		Random rnd = new Random();

		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++)
			sb.append(num.charAt(rnd.nextInt(num.length())));

		StringBuilder sb2 = new StringBuilder(a);
		for (int i = 0; i < a; i++)
			sb2.append(str.charAt(rnd.nextInt(str.length())));

		StringBuilder sb3 = new StringBuilder(A);
		for (int i = 0; i < A; i++)
			sb3.append(STR.charAt(rnd.nextInt(STR.length())));

		return sb3.toString() + sb2.toString() + sb.toString();
	}

	public static String setNumber(String strIn, int i) {
		return strIn.replace("NUMBER", String.valueOf(i));
	}
	
	public static String getCellNumber(String xpathCell, int row, int column) {
		return xpathCell.replace("rowOrder", String.valueOf(row)).replace("columnOrder", String.valueOf(column));
	}

	public static String setStr(String str, String i) {
		return str.replace("STRING", i);
	}
	
	public static void Login(AndroidDriver<?> driver, WebDriverWait timeWait, String Username, String Password) {
		
		System.out.println("\n=========== LOGIN START ===========\n");
		boolean isLogged = false;
		boolean isHomeAppeared = false;
		int lan = 0;
		int attempLogin = 1;

		while (!isLogged) {
			System.out.println("[Login] Trying to login... Attemp : " + attempLogin + "\n");

			System.out.println("[Login] Fill username '" + Username + "'");
			CommonUtils.typeText(driver, timeWait, Page_Login.INPUT_USERNAME, "Username", Username);

			CommonUtils.clickElementWithoutHighlight(driver, timeWait, Page_Login.INPUT_PASSWORD_PLAIN, "Password");

			System.out.println("[Login] Fill password '" + Password + "'");
			CommonUtils.typeText(driver, timeWait, Page_Login.INPUT_PASSWORD, "Password", Password);

			CommonUtils.clickElement(driver, timeWait, Page_Login.BUTTON_SUBMIT, "Submit");
			Utilities.Delay(pageLoadWait);
			
			turnOffImplicitWaits();
			
			for (int i = 0; i < 20; i++) {
				if (CommonUtils.checkElement(driver, timeWait, Page_Login.ERROR_MSG) == true) {										
					System.out.println("[Login] ### Error: " + CommonUtils.getText(driver, timeWait, Page_Login.ERROR_MSG) + "\n");
					i = 100;	
					
				} else {					
					if (CommonUtils.checkElement(driver, timeWait, Page_Login.INPUT_USERNAME) == false) {
						System.out.println("\n[Login] >>> Login OK (take " + i + " s)\n");
						isLogged = true;
						i = 100;
						
					} else {
						String currentUsername = CommonUtils.getInputText(driver, timeWait, Page_Login.INPUT_USERNAME);
						if (!Username.equals(currentUsername)) {
							System.out.println("\n[Login] ### Error with username: '" + currentUsername + "'. Trying again...\n");
							i = 100;
						}
					}
					
				}
				Utilities.Delay(1);
			}
			
			if (attempLogin == 3) {
				if (isLogged == false) {
					System.out.println("[Login] Error: The maximum attemp of login is reached");
					Assert.fail();;
				} else
					break;
			}
			attempLogin += 1;
		}
		
		while (!isHomeAppeared) {
			
			lan+=1;
			System.out.println("[Login] Wait for Home page appears...");
			
			// Close PopUp New Software Download if it appears
			if (CommonUtils.checkElement(driver, timeWait, Popup_New_Software_Download.BUTTON_CLOSED) == true) {
				System.out.println("[Login] PopUp 'New Software Download' appears");
				isHomeAppeared = true;
				CommonUtils.closePopUpInFrame(driver, timeWait, Popup_New_Software_Download.BUTTON_CLOSED);
				System.out.println("\n[Login] Home page appeared after " + lan + " s\n");
			}
						
			// Close PopUp Session Already Opened if it appears
			if (CommonUtils.checkElement(driver, timeWait, Popup_Session_Already_Opened.BUTTON_CONTINUE) == true) {
				System.out.println("[Login] Page 'Session Already Opened' appears");
				CommonUtils.clickElement(driver, timeWait, Popup_Session_Already_Opened.BUTTON_CONTINUE, "Continue");
			}
			
			if (lan > 15){
				isHomeAppeared = true;
				System.out.println("[Login] Home page appeared after " + lan + " s");
			}
			Utilities.Delay(1);
		}
		
		turnOnImplicitWaits();
		
		// Verify Elements showed on Home page
		System.out.println("[Login] Verify Expected Result on Page 'ACWeb Home'");
		if (CommonUtils.checkElement(driver, timeWait, Page_Sites_List.MENU_BAR) == false
				|| CommonUtils.checkElement(driver, timeWait, Page_Sites_List.BADGE_SEARCH) == false
				|| CommonUtils.checkElement(driver, timeWait, Page_Sites_List.MAP) == false) {
			System.out.println("[Login] Login ERROR !");
			Assert.fail();;
		} else {
			System.out.println("\n=========== LOGIN SUCCESSFULLY ===========\n");
		}

	}

	public static void Login_Wait_And_Retry(AndroidDriver<?> driver, WebDriverWait timeWait, String Username, String Password) {
		
		System.out.println("\n=========== LOGIN START ===========\n");
		boolean isLogged = false;
		boolean isHomeAppeared = false;
		int lan = 0;
		int attempLogin = 1;
		//int timeLogin = 1;	//seconds
		int timeLogin = 60;	//seconds

		while (!isLogged) {
			System.out.println("[Login] Trying to login... Attemp : " + attempLogin + "\n");

			System.out.println("[Login] Fill username '" + Username + "'");
			CommonUtils.typeText(driver, timeWait, Page_Login.INPUT_USERNAME, "Username", Username);
			
			CommonUtils.clickElementWithoutHighlight(driver, timeWait, Page_Login.INPUT_PASSWORD_PLAIN, "Password");

			System.out.println("[Login] Fill password '" + Password + "'");
			CommonUtils.typeText(driver, timeWait, Page_Login.INPUT_PASSWORD, "Password", Password);

			CommonUtils.clickElement(driver, timeWait, Page_Login.BUTTON_SUBMIT, "Submit");
			Utilities.Delay(pageLoadWait);
			
			CommonUtils.turnOffImplicitWaits();
			
			for (int i = 0; i < 20; i++) {
				if (CommonUtils.checkElement(driver, timeWait, Page_Login.ERROR_MSG) == true) {		
					
					System.out.println("[Login] ### Error: " + CommonUtils.getText(driver, timeWait, Page_Login.ERROR_MSG) + "\n");
					i = 100;	
					
				} else {
					
					if (CommonUtils.checkElement(driver, timeWait, Page_Login.INPUT_USERNAME) == false) {
						System.out.println("\n[Login] >>> Login OK (take " + i + " s)\n");
						isLogged = true;
						i = 100;
						
					} else {
						String currentUsername = CommonUtils.getInputText(driver, timeWait, Page_Login.INPUT_USERNAME);
						if (!Username.equals(currentUsername)) {
							System.out.println("\n[Login] ### Error with username: '" + currentUsername + "'. Trying again...\n");
							i = 100;
						}
					}
					
				}
				
				Utilities.Delay(1);
			}
			
			if (attempLogin == 3) {	
				if (isLogged == false) {
					System.out.println("[Login] Error: The maximum (3) attemps of login is reached");
					Assert.fail();;
				} else
					break;
			}
			
			if (isLogged == false) {
				System.out.println("\n\nLOGIN NOT SUCCESSFULLY --> WAIT 10 MINUTES BEFORE START THE TEST AGAIN !!!");
				for (int m = 1; m <= 10; m++) {
					Utilities.Delay(timeLogin);	//wait 1 minutes
					System.out.println("\nRemaining Time before re-execute the test: " + (10 - m) + " minutes");
				}					
				System.out.println("\nRE-STARTING THE LOGIN AGAIN...\n");
			}
			
			attempLogin += 1;
		}
		
		while (!isHomeAppeared) {
			
			lan+=1;
			System.out.println("[Login] Wait for Home page appears...");
			
			// Close PopUp New Software Download if it appears
			if (CommonUtils.checkElement(driver, timeWait, Popup_New_Software_Download.BUTTON_CLOSED) == true) {
				System.out.println("[Login] PopUp 'New Software Download' appears");
				isHomeAppeared = true;
				CommonUtils.closePopUpInFrame(driver, timeWait, Popup_New_Software_Download.BUTTON_CLOSED);
				System.out.println("\n[Login] Home page appeared after " + lan + " s\n");
			}
						
			// Close PopUp Session Already Opened if it appears
			if (CommonUtils.checkElement(driver, timeWait, Popup_Session_Already_Opened.BUTTON_CONTINUE) == true) {
				System.out.println("[Login] Page 'Session Already Opened' appears");
				CommonUtils.clickElement(driver, timeWait, Popup_Session_Already_Opened.BUTTON_CONTINUE, "Continue");
			}
			
			if (lan > 15){
				isHomeAppeared = true;
				System.out.println("[Login] Home page appeared after " + lan + " s");
			}
			Utilities.Delay(1);
		}
		
		CommonUtils.turnOnImplicitWaits();
		
		// Verify Elements showed on Home page
		System.out.println("[Login] Verify Expected Result on Page 'ACWeb Home'");
		if (CommonUtils.checkElement(driver, timeWait, Page_Sites_List.MENU_BAR) == false
				|| CommonUtils.checkElement(driver, timeWait, Page_Sites_List.BADGE_SEARCH) == false
				|| CommonUtils.checkElement(driver, timeWait, Page_Sites_List.MAP) == false) {
			System.out.println("[Login] Login ERROR !");
			Assert.fail();;
		} else {
			System.out.println("\n=========== LOGIN SUCCESSFULLY ===========\n");
		}

	}
	
	public static void Logout(AndroidDriver<?> driver, WebDriverWait timeWait) {
		System.out.println("\n[Logout] - Test");

		// Click BUTTON_LOGOUT if exits
		if (CommonUtils.checkElement(driver, timeWait, Page_Sites_List.BUTTON_LOGOUT) == true) {
			System.out.println("[Execute] BUTTON_LOGOUT is found");
			CommonUtils.clickElement(driver, timeWait, Page_Sites_List.BUTTON_LOGOUT, "Logout");
		}

		if (CommonUtils.checkElement(driver, timeWait, Popup_Waring.POPUP_WARNING_PAGE_CONTAINS_UNSAVED_DATA) == true) {
			System.out.println("[Execute] Closing POPUP_WARNING_PAGE_CONTAINS_UNSAVED_DATA...");
			CommonUtils.clickElement(driver, timeWait, Popup_Waring.BUTTON_LEAVE_WITHOUTH_SAVE, "Leave withouth save");
		}

		CommonUtils.waitPageIsReady(driver, "ACWeb Login");

		// Verify Elements showed on Login page
		System.out.println("[Execute] Verify Expected Result on Page 'ACWeb Login'");
		if (CommonUtils.checkElement(driver, timeWait, Page_Login.INPUT_USERNAME) == false
				|| CommonUtils.checkElement(driver, timeWait, Page_Login.INPUT_PASSWORD) == false
				|| CommonUtils.checkElement(driver, timeWait, Page_Login.BUTTON_SUBMIT) == false) {
			System.out.println("Logout failed !");
			Assert.fail();;
		} else {
			System.out.println("[Execute] Logout: OK");
		}

	}
	
	public static void Quick_Logout(AndroidDriver<?> driver, WebDriverWait timeWait, String logoutXpath) {
		CommonUtils.clickElement(driver, timeWait, logoutXpath, "<a> Logout");
		CommonUtils.waitPageIsReady(driver, "Login page");
	}
	
	public static String getElementsByTagName(Document doc, String tagParentName, String tagChildtName) {
		System.out.println("\n[getElementsByTagName]:");
		String value = "";
		try {
			NodeList nList = doc.getElementsByTagName(tagParentName);
			if (nList.getLength() == 0)
				System.out.println("[Execute] nList is emtpy");
			//else 
			//System.out.println("[Execute] nList.getLength() is " + nList.getLength());

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("Current Element: " + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					//System.out.println("Student roll no : " 
					//   + eElement.getAttribute("rollno"));
					value = eElement.getElementsByTagName(tagChildtName).item(0).getTextContent();
					System.out.println("Tag: " + tagChildtName + " has value as " + value);
				}
			}
		} catch (Exception e) {
			System.out.println("[getElementsByTagName] " + tagChildtName + " is: " + e.getMessage());
		}

		return value;
	}

	public static void captureScreenshot(AndroidDriver<?> driver, String screenshotName) {
		try {
			//Local time zone   
			SimpleDateFormat dateFormatGmt = new SimpleDateFormat("yyyyMMddHHmm");
			String timestamp = dateFormatGmt.format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String path = "./Screenshots/" + screenshotName + "_" + timestamp + ".png";
			FileUtils.copyFile(source, new File(path));
			System.out.println("Screenshot taken as: " + path);
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}

	public static void Scroll_Page_To_Element(WebDriver driver, String xpath) {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(xpath)));		
	}
	
	public static void Scroll_Page_To_End_Page(AndroidDriver<?> driver) {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public static void turnOffImplicitWaits() {
	    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}
	
	public static void changeImplicitWaits(int sec ) {
	    driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void turnOnImplicitWaits() {
	    driver.manage().timeouts().implicitlyWait(envParams.getACWEB_IMPLICITLY_WAIT(), TimeUnit.SECONDS);
	}

	public static void sendKeys(AndroidDriver<?> driver, WebDriverWait timeWait, String xpath, String string) {
		try {			
			System.out.println("Sending key '" + xpath + "'");
			timeWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Utilities.highLightElement(driver, xpath, elementHighlightTime);
			driver.findElement(By.xpath(xpath)).sendKeys(string);
			System.out.println("Sent key '" + string + "'");
		} catch (Exception e) {
			System.out.println("[Exception] Time out when finding element " + xpath + ": " + e.getMessage());
			Assert.fail();;
		}
		
	}
}
