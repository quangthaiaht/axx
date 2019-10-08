package it.bt.com.testcases;

import it.bt.com.config.WebInit;
import it.bt.com.definitions.DefinedPageElements;
import it.bt.com.definitions.DefinedPageElements.Page_Login;
import it.bt.com.definitions.DefinedPageElements.Page_User_Registration;
import it.bt.com.utilities.CommonUtils;
import it.bt.com.utilities.Utilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TC_01_001_Registration_New_User extends WebInit {

	@BeforeTest
	public void SetupEnv() throws IOException {		
		Init();
	}

	@org.testng.annotations.Test
	public void TC_001_Registration_New_User() {
		System.out.println("input email ");
		CommonUtils.sendKeys(driver, timeWait, DefinedPageElements.Page_Login.txtEmail, "test.xnqoykhh@mailosaur.io");
		System.out.println("input email ");
		CommonUtils.sendKeys(driver, timeWait, DefinedPageElements.Page_Login.txtEmail, "test.xnqoykhh@mailosaur.io");
		System.out.println("run test");
	}

	@AfterTest
	public void TearDown() {		
		CommonUtils.captureScreenshot(driver, this.getClass().getSimpleName());	    
		System.out.println("[" + this.getClass().getSimpleName() + "] - END");
	}
}
