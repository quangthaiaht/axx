package it.bt.com.utilities;


import it.bt.com.config.WebInit;
import it.bt.com.definitions.DefinedPageElements.Gates_Setting_Tab;
import it.bt.com.definitions.DefinedPageElements.Gates_Tab;
import it.bt.com.definitions.DefinedPageElements.Gateways_Tab;
import it.bt.com.definitions.DefinedPageElements.My_Projects_Tab;
import it.bt.com.definitions.DefinedPageElements.Page_Installation_Type;
import it.bt.com.definitions.DefinedPageElements.Page_Site_Detail;
import it.bt.com.definitions.DefinedPageElements.Page_Site_New;
import it.bt.com.definitions.DefinedPageElements.Page_Sites_List;
import it.bt.com.definitions.DefinedPageElements.Plant_Testing_Tab;
import it.bt.com.definitions.DefinedPageElements.Project_Activation_Tab;
import it.bt.com.definitions.DefinedPageElements.Settings_Tab;
import it.bt.com.definitions.DefinedPageElements.Structure_Definition_Tab;
import it.bt.com.definitions.DefinedPageElements.System_Address_Tab;
import it.bt.com.definitions.DefinedPageElements.System_Data_Tab;
import it.bt.com.definitions.DefinedPopUpElements.Popup_Session_Already_Opened;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.w3c.dom.Document;

import io.appium.java_client.android.AndroidDriver;

public class CreatePlant extends WebInit {

	public static ArrayList<Integer> CheckPlantByName(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait, int imageLoadWait, String PlantName, Document doc) {
		
		System.out.println("\n[Check_Plant_By_Name] Start");
		
		int rowOrder = 0;
		int page = 0;
		ArrayList<Integer> rowOrderAndPage;
		String xpath = "";		

		//Get SiteOrder in sites list
		rowOrderAndPage = CommonUtils.getOrderAndPageByNameInTable(driver, timeWait, My_Projects_Tab.PlantName,
				My_Projects_Tab.next_endUsersSiteTablePager, PlantName);
		rowOrder = rowOrderAndPage.get(0);
		page = rowOrderAndPage.get(1);
		if (rowOrder > 1) {
			CommonUtils.goToPageByNumber(driver, timeWait, My_Projects_Tab.ui_pg_input, page);

			xpath = My_Projects_Tab.ProjectManagement.replace("rowOrder", Integer.toString(rowOrder));
			if (CommonUtils.checkElement(driver, timeWait, xpath) == true) {
				System.out.println("OK; Verified rowOrder: " + rowOrder + "; ProjectManagement; " + "xpath: " + xpath);
			} else {
				System.out.println("KO; Verified rowOrder: " + rowOrder + "; ProjectManagement; " + "xpath: " + xpath);
			}

			xpath = My_Projects_Tab.ProjectConfiguration.replace("rowOrder", Integer.toString(rowOrder));
			if (CommonUtils.checkElement(driver, timeWait, xpath) == true) {
				System.out.println("OK; Verified rowOrder: " + rowOrder + "; ProjectConfiguration; " + "xpath: "
						+ xpath);
			} else {
				System.out.println("KO; Verified rowOrder: " + rowOrder + "; ProjectConfiguration; " + "xpath: "
						+ xpath);
			}

			xpath = My_Projects_Tab.DeleteProject.replace("rowOrder", Integer.toString(rowOrder));
			if (CommonUtils.checkElement(driver, timeWait, xpath) == true) {
				System.out.println("OK; Verified rowOrder: " + rowOrder + "; DeleteProject; " + "xpath: " + xpath);
			} else {
				System.out.println("KO; Verified rowOrder: " + rowOrder + "; DeleteProject; " + "xpath: " + xpath);
			}
		} else {
			System.out.println("NOT Found PlantName: " + PlantName);
		}

		System.out.println("\n[Check_Plant_By_Name] End");
		return rowOrderAndPage;
	}
	
	public static void GotoNewProjectPage(AndroidDriver<?> driver, WebDriverWait timeWait) {
		
		// CLick "NEW PROJECT" Tab
		System.out.println("\n[Go_To_New_Project_Page_By_Click] Opening 'New Project' page...");
		CommonUtils.clickElement(driver, timeWait, Page_Sites_List.TAB_NEW_PROJECT, "NEW PROJECT");
		CommonUtils.waitPageIsReady(driver, "Site New");

		// Verify Elements showed on Site New page
		if (CommonUtils.checkElement(driver, timeWait, Page_Site_New.INPUT_SITE_NAME) == false
				|| CommonUtils.checkElement(driver, timeWait, Page_Site_New.INPUT_CONTACT_NAME) == false
				|| CommonUtils.checkElement(driver, timeWait, Page_Site_New.BUTTON_SAVE_NEXT) == false) {
			System.out.println("\n[Go_To_New_Project_Page_By_Click] Error: Page 'New Project' did not appear!\n");
			Assert.fail();
		} else {
			System.out.println("[Go_To_New_Project_Page_By_Click] Page 'New Project' appeared");
		}
	}	
	
	public static void InputInfo(AndroidDriver<?> driver, WebDriverWait timeWait, String siteName, Document doc) {
		
		System.out.println("\n[Input_Info] Start");
		
		String SITE_DESCRIPTION = CommonUtils.getElementsByTagName(doc, "GENERAL_INFO", "SITE_DESCRIPTION");
		String SITE_ADDRESS_STREET = CommonUtils.getElementsByTagName(doc, "GENERAL_INFO", "SITE_ADDRESS_STREET");
		String SITE_ADDRESS_STREET_NUMBER = CommonUtils.getElementsByTagName(doc, "GENERAL_INFO", "SITE_ADDRESS_STREET_NUMBER");
		String SITE_ADDRESS_COUNTRY = CommonUtils.getElementsByTagName(doc, "GENERAL_INFO", "SITE_ADDRESS_COUNTRY");
		String SITE_ADDRESS_PROVINCE = CommonUtils.getElementsByTagName(doc, "GENERAL_INFO", "SITE_ADDRESS_PROVINCE");
		String SITE_ADDRESS_CITY = CommonUtils.getElementsByTagName(doc, "GENERAL_INFO", "SITE_ADDRESS_CITY");
		String CONTACT_NAME = CommonUtils.getElementsByTagName(doc, "GENERAL_INFO", "CONTACT_NAME");
		String CONTACT_SURNAME = CommonUtils.getElementsByTagName(doc, "GENERAL_INFO", "CONTACT_SURNAME");
		String CONTACT_EMAIL = CommonUtils.getElementsByTagName(doc, "GENERAL_INFO", "CONTACT_EMAIL");
		String CONTACT_MOBILE_PHONE_NUMBER = CommonUtils.getElementsByTagName(doc, "GENERAL_INFO", "CONTACT_MOBILE_PHONE_NUMBER");
		String CONTACT_TELEPHONE_NUMBER = CommonUtils.getElementsByTagName(doc, "GENERAL_INFO", "CONTACT_TELEPHONE_NUMBER");
		
		CommonUtils.typeText(driver, timeWait, Page_Site_New.INPUT_SITE_NAME, "Site Name", siteName);		
		CommonUtils.typeText(driver, timeWait, Page_Site_New.INPUT_SITE_DESCRIZIONE, "Site Description", SITE_DESCRIPTION);		
		CommonUtils.typeText(driver, timeWait, Page_Site_New.INPUT_SITE_ADDRESS_STREET, "Site Address Street", SITE_ADDRESS_STREET);
		CommonUtils.typeText(driver, timeWait, Page_Site_New.INPUT_SITE_ADDRESS_STREET_NUMBER, "Site Address No", SITE_ADDRESS_STREET_NUMBER);
		CommonUtils.modifyDropDownBox(driver, timeWait, Page_Site_New.SELECT_SITE_ADDRESS_COUNTRY, "Country", SITE_ADDRESS_COUNTRY);
		CommonUtils.modifyDropDownBox(driver, timeWait, Page_Site_New.SELECT_SITE_ADDRESS_PROVINCE, "Province", SITE_ADDRESS_PROVINCE);
		CommonUtils.waitForEnabled(timeWait, Page_Site_New.SELECT_SITE_ADDRESS_CITY);
		CommonUtils.modifyDropDownBox(driver, timeWait, Page_Site_New.SELECT_SITE_ADDRESS_CITY, "City", SITE_ADDRESS_CITY);
		CommonUtils.waitForEnabled(timeWait, Page_Site_New.SELECT_SITE_ADDRESS_CITY_NUMBER);
		CommonUtils.typeText(driver, timeWait, Page_Site_New.INPUT_CONTACT_NAME, "Contact Name", CONTACT_NAME);
		CommonUtils.typeText(driver, timeWait, Page_Site_New.INPUT_CONTACT_SURNAME, "Contact SurName", CONTACT_SURNAME);
		CommonUtils.typeText(driver, timeWait, Page_Site_New.INPUT_CONTACT_EMAIL, "Contact E-Mail", CONTACT_EMAIL);
		CommonUtils.typeText(driver, timeWait, Page_Site_New.INPUT_CONTACT_MOBILE_PHONE_NUMBER, "Mobile Phone No", CONTACT_MOBILE_PHONE_NUMBER);
		CommonUtils.typeText(driver, timeWait, Page_Site_New.INPUT_CONTACT_TELEPHONE_NUMBER, "Telephone No", CONTACT_TELEPHONE_NUMBER);

		System.out.println("\n[Input_Info] End");
	}

	public static void Definition_Type_Services_And_Installed_Systems(AndroidDriver<?> driver, WebDriverWait timeWait, int systemType, boolean videoDoorEntrySystem, int serviceType) {
		
		System.out.println("\n[Definition_Type_Services_And_Installed_Systems] Start");

		if (systemType == 1) {	//The access control system will manage only the readers.
			
			CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.SYSTEM_TYPE_1, "System Type 1");
		
		} else {	//The access control system will manage the readers, video door entry system and external panel address book.
			
			CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.SYSTEM_TYPE_2, "System Type 2");
			
			if (videoDoorEntrySystem == true) {	//Video door entry system will be divided by one or more riser interface (mod=5). 
				CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.SYSTEM_TYPE_2_WITH_VDE, "With VDE");
			} else {
				CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.SYSTEM_TYPE_2_NO_VDE, "No VDE");
			}
		}

		if (serviceType == 1)//Local management. Access Control Portal will provide only I/O service.
			CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.SERVICE_TYPE_1, "OFFLINE type");
		else
			//Online management. Access Control Portal will provide remote access to the plant and I/O.
			CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.SERVICE_TYPE_2, "ONLINE type");

		CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.BUTTON_START_FULL_CUSTOMER_SITE, "Start with a full CUSTOM site");
		Utilities.Delay(pageLoadWait);

		System.out.println("\n[Definition_Type_Services_And_Installed_Systems] End");
	}

	public static void Definition_Number_Buildings_And_Number_Of_Apartments(AndroidDriver<?> driver, WebDriverWait timeWait, String buildingName, String numOfApartment) {
		
		System.out.println("\n[Definition_Number_Buildings_And_Number_Of_Apartments] Start");

		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.INPUT_NAME_OF_THE_BUILDING, 0), "Building Name", buildingName);

		CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.SELECT_NUMBER_OF_APARTMENT, 0), "Total Apartments", numOfApartment);

		CommonUtils.clickElement(driver, timeWait, Structure_Definition_Tab.BUTTON_SAVE_NEXT_TAB_STRUCTURE, "Save & Next");
		Utilities.Delay(pageLoadWait);

		System.out.println("\n[Definition_Number_Buildings_And_Number_Of_Apartments] End");
	}

	public static void Distribution_Of_Apartments(AndroidDriver<?> driver, WebDriverWait timeWait, String numOfFloor, String numOfApartment) {
		
		System.out.println("\n[Distribution_Of_Apartments] Start");

		//CommonUtils.VerifyPage(driver, timeWait, "Floors", Structure_Definition_Tab.LI_FLOORS);

		SetUpFloors(driver, timeWait, numOfFloor, numOfApartment);

		CommonUtils.clickElement(driver, timeWait, Structure_Definition_Tab.BUTTON_SAVE_NEXT_FLOORS, "Save & Next");
		Utilities.Delay(pageLoadWait);

		System.out.println("\n[Distribution_Of_Apartments] End");
	}

	public static void SetUpFloors(AndroidDriver<?> driver, WebDriverWait timeWait, String numOfFloor, String numOfApartment) {
		
		System.out.println("\n[SetUp_Floors] Start");
		int Number_Of_Floors = Integer.parseInt(numOfFloor);

		CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.SELECT_NUMBER_OF_FLOORS, 0), "Number of Floors", numOfFloor);

		for (int i = 0; i < Number_Of_Floors; i++) {
			CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.SELECT_NUMBER_APARTMENT_FLOORS, i), "Number of apartments", numOfApartment);
		}

		System.out.println("\n[SetUp_Floors] End");
	}

	public static void Definition_Gates_And_Devices(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait, int imageLoadWait, Document doc, int systemType) {
		
		System.out.println("\n[Definition_Gates_And_Devices] Start");

		CommonUtils.VerifyPage(driver, timeWait, "Gates", Gates_Tab.LI_GATES);

		SetUpGate(driver, timeWait, doc, systemType, 1);
		
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_SAVE_NEXT_GATE, "Save & Next");
		Utilities.Delay(pageLoadWait);
		
		System.out.println("\n[Definition_Gates_And_Devices] End");
	}

	public static void SetUpGate(AndroidDriver<?> driver, WebDriverWait timeWait, Document doc, int systemType, int gateOrder) {
		
		System.out.println("\n[SetUp Gate] Start");

		if (gateOrder > 1) {
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_ADD_GATE, "Add Gate");
			Utilities.Delay(popupLoadWait);
		}

		String GATES_NAME = CommonUtils.getElementsByTagName(doc, "GATES", "GATE_NAME_" + gateOrder);		
		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Gates_Tab.GATES_NAME, gateOrder - 1), "Name Gate", GATES_NAME);

		if (systemType == 2) {//The access control system will manage the readers, video door entry system and external panel address book.
			CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_DDN, gateOrder - 1), "DDN");
				
			CommonUtils.waitForVisible(timeWait, Gates_Tab.DDN_SELECTION);
			
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.DDN_OPTION_2, "ddnSelection");

			CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_RADIO_READER, gateOrder - 1), "Radio Reader");
		}

		CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_VIGIK_READER, gateOrder - 1), "Vigik reader");

		System.out.println("\n[SetUp Gate] End");
	}

	public static void Setup_Gate_Basic(AndroidDriver<?> driver, WebDriverWait timeWait, Document doc, boolean systemVDE) {
		
		System.out.println("\n[Setup_Gate_Basic] Start");

		String GATES_NAME = CommonUtils.getElementsByTagName(doc, "GATES", "GATE_NAME_1");
		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Gates_Tab.GATES_NAME, 0), "Name Gate", GATES_NAME);

		// Choose DDN
		if (systemVDE == true) {//The access control system will manage the readers, video door entry system and external panel address book.
			CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_DDN, 0), "DDN");
			CommonUtils.waitForVisible(timeWait, Gates_Tab.DDN_SELECTION);
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.DDN_OPTION_2, "choose 'Linea300 - DDN'");
			//CommonUtils.clickElement(driver, timeWait, Gates_Tab.DDN_OPTION_1, "choose 'Nouvelle Sfera - DDN'");
		}

		// Choose KeyPad
		//		CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_KEYPAD, 0),
		//				"'KeyPad' option");

		System.out.println("\n[Setup_Gate_Basic] End");
	}
	
	public static void Setup_Gate_With_VDE_And_Vigik(AndroidDriver<?> driver, WebDriverWait timeWait, String gateName, boolean systemVDE) {
		
		System.out.println("\n[Setup_Gate_With_VDE_And_Vigik] Start");

		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Gates_Tab.GATES_NAME, 0), "Name Gate", gateName);

		// Choose DDN
		if (systemVDE == true) {//The access control system will manage the readers, video door entry system and external panel address book.
			CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_DDN, 0), "DDN");
			Utilities.Delay(popupLoadWait);
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.DDN_OPTION_2, "choose 'Linea300 - DDN'");
		}

		CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_VIGIK_READER, 0), "Vigik reader");

		System.out.println("\n[Setup_Gate_With_VDE_And_Vigik] End");
	}

	public static void Configure_Gates (AndroidDriver<?> driver, WebDriverWait timeWait, int gateOrder, int DDN, boolean Vigik, boolean Badge, boolean Keypad, boolean Radio) {
		
		// DDN: [0,1,2]
		// Vigik, Badge, Keypad, Radio: [True,False]
		
		String gateX = String.valueOf(gateOrder);
		String GATES_NAME = CommonUtils.getElementsByTagName(doc, "GATES", "GATE_NAME_1");
		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Gates_Tab.GATES_NAME, 0), "Name of Gate", GATES_NAME);
		
		// Choose DDN
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.CHECKBOX_GATE_DDN.replace("NUMBER", gateX), "<checkbox> DDN");
		CommonUtils.waitForVisible(timeWait, Gates_Tab.DDN_SELECTION);
		
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.DDN_OPTION_X.replace("NUMBER", String.valueOf(DDN)), "ddnSelection");
		
		// Choose Vigik
		if (Vigik == true) {
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.CHECKBOX_GATE_VIGIK_READER.replace("NUMBER", gateX), "<checkbox> Vigik reader");
		}
		
		// Choose Badge
		if (Badge == true) {
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.CHECKBOX_GATE_BADGE_READER.replace("NUMBER", gateX), "<checkbox> Badge reader");
		}
		
		// Choose Keypad
		if (Keypad == true) {
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.CHECKBOX_GATE_KEYPAD.replace("NUMBER", gateX), "<checkbox> Keypad");
		}
		
		// Choose Radio
		if (Keypad == true) {
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.CHECKBOX_GATE_RADIO_READER.replace("NUMBER", gateX), "<checkbox> Radio reader");
		}
		
		// Click 'Save & Next'
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_SAVE_NEXT_GATE, "Save & Next");
		
	}
	
	public static void Association_Gates_And_Buildings(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait, int gateOrder) {
		
		System.out.println("\n[Association_Gates_And_Buildings] Start");

		Association_Gates_And_Buildings_SetUp(driver, timeWait, gateOrder);

		CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_GATES_BUILDINGS_SAVE_NEXT, "<button> Save & Next");
		Utilities.Delay(pageLoadWait);

		System.out.println("\n[Association_Gates_And_Buildings] End");
	}

	public static void Association_Gates_And_Buildings_SetUp(AndroidDriver<?> driver, WebDriverWait timeWait, int gateOrder) {
		
		System.out.println("\n[Association_Gates_And_Buildings_SetUp] Start");

		CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_LINK_GATES, "Link Gates");
		
		CommonUtils.waitForVisible(timeWait, Gates_Tab.POPUP_SELECT_GATE);
		Utilities.Delay(popupLoadWait);
		if (gateOrder == 1)
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.CHECKBOX_1, "CheckBox 1");
		else
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.CHECKBOX_2, "CheckBox 2");

		CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_OK_GATES, "OK");
		
		CommonUtils.waitForNoVisible(timeWait, Gates_Tab.POPUP_SELECT_GATE);

		System.out.println("\n[Association_Gates_And_Buildings_SetUp] End");
	}

	public static void Definition_Central_Access_Control(AndroidDriver<?> driver, WebDriverWait timeWait, Document doc) {
		
		System.out.println("\n[Definition_Central_Access_Control] Start");

		Definition_Central_Access_Control_Setup(driver, timeWait, doc);
		
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Save & Next");
		Utilities.Delay(pageLoadWait);	

		System.out.println("\n[Definition_Central_Access_Control] End");
	}

	public static void Definition_Central_Access_Control_Setup(AndroidDriver<?> driver, WebDriverWait timeWait, Document doc) {
		
		System.out.println("\n[Definition_Central_Access_Control_Setup] Start");
		
		String CONTROL_UNIT_NAME = CommonUtils.getElementsByTagName(doc, "GATE_1", "CONTROL_UNIT");
		
		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Control Unit", CONTROL_UNIT_NAME);
		
		CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.SELECT_CONTROL_UNIT_ADDRESS, 0), "Control Unit Address", "0");
		
		CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.BUTTON_CONTROL_UNIT_LINK_GATES, 0), "Link Gates");
		
		CommonUtils.waitForVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
		Utilities.Delay(popupLoadWait);
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_1, "CheckBox 1");
		
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK_GATES, "OK");
		
		CommonUtils.waitForNoVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);

		System.out.println("\n[Definition_Central_Access_Control_Setup] End");
	}

	public static void Gateways_Definition(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait, int imageLoadWait, Document doc) {
		
		System.out.println("\n[Gateways_Definition] Start");

		CommonUtils.VerifyPage(driver, timeWait, "Gateway", System_Data_Tab.LI_GATE_WAY);

		String GATEWAY_NAME = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_NAME_1");
		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Gateway Name", GATEWAY_NAME);

		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_GATE_WAY_LINK_GATE, "Link Gates");
		
		CommonUtils.waitForVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
		Utilities.Delay(popupLoadWait);
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_1, "Check Box Select Gate");

		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK, "Button OK");

		CommonUtils.waitForNoVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);

		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Button Save & Next");
		Utilities.Delay(pageLoadWait);

		System.out.println("\n[Gateways_Definition] End");
	}

	public static void Check_System_Structure(AndroidDriver<?> driver, WebDriverWait timeWait, int serviceType, Document doc) {
		
		System.out.println("\n[Check_System_Structure] Start");

		CommonUtils.VerifyPage(driver, timeWait, "System Address", System_Address_Tab.LI_SYSTEM_ADDRESS);
		
		if (serviceType == 2) {//Online management. Access Control Portal will provide remote access to the plant and I/O.
			String GATEWAY_FW_VERSION = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_FW_VERSION_1");
			System.out.println("[Execute] FW_VERSION of gateway: " + GATEWAY_FW_VERSION);
			CommonUtils.typeText(driver, timeWait, System_Address_Tab.Gateway_FW_VER, "Gateway_FW_VER", GATEWAY_FW_VERSION);

			String GATEWAY_SERIAL_NUMBER = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_SERIAL_NUMBER_1");
			System.out.println("[Execute] serialNumber of gateway: " + GATEWAY_SERIAL_NUMBER);
			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATEWAY_SERIAL_NUMBER, "GATEWAY_SERIAL_NUMBER", GATEWAY_SERIAL_NUMBER);
		}
		
		Utilities.Delay(2);
		CommonUtils.clickElement(driver, timeWait, System_Address_Tab.BUTTON_VALIDATE_PROJECT, "Validate Project");
		Utilities.Delay(pageLoadWait);
		
		System.out.println("\n[Check_System_Structure] End");
	}

	public static void Project_Activation(AndroidDriver<?> driver, WebDriverWait timeWait) {
		
		System.out.println("\n[Project_Activation] Start");

		CommonUtils.clickElement(driver, timeWait, Project_Activation_Tab.BUTTON_ACTIVATE_PROJECT, "Activate Project");
		Utilities.Delay(pageLoadWait);
		
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		CommonUtils.captureScreenshot(driver, "Plant_Activation_" + timeStamp);
		
		System.out.println("\n[Project_Activation] End");
	}

	public static void Save_Project(AndroidDriver<?> driver, WebDriverWait timeWait, int serviceType) {
		
		System.out.println("\n[Save_Project] Start");

		if (serviceType == 2) {//Online management. Access Control Portal will provide remote access to the plant and I/O.
			String Site_ID = CommonUtils.getInputText(driver, timeWait, Gateways_Tab.Site_ID_ONLINE);
			if (Site_ID == null) {
				System.out.println("Site_ID is null");
				return;
			} else
				System.out.println("Site_ID is " + Site_ID);

			String PASSWORD_PLANT = "12345";
			System.out.println("PASSWORD_PLANT: " + PASSWORD_PLANT);
			CommonUtils.typeText(driver, timeWait, Gateways_Tab.INPUT_Site_Password_ONLINE, "PASSWORD_PLANT", PASSWORD_PLANT);
			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_NEXT_ONLINE, "Save & Next");

			CommonUtils.waitForVisible(timeWait, Gateways_Tab.POPUP_IMPORT_PROGRAMMER);

			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_INITIALIZE, "initialize");
			
			CommonUtils.waitForVisible(timeWait, Gateways_Tab.DIALOG);

			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.CLOSE_DIALOG, "close");		
			Utilities.Delay(pageLoadWait);
			CommonUtils.waitPageIsReady(driver, "Plant testing");
				
		} else {
			String Site_ID = CommonUtils.getInputText(driver, timeWait, Gateways_Tab.Site_ID);
			if (Site_ID == null) {
				System.out.println("Site_ID is null");
				return;
			} else
				System.out.println("Site_ID is " + Site_ID);

			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_SAVE, "Save & Next");

			CommonUtils.waitForVisible(timeWait, Gateways_Tab.POPUP_IMPORT_TYPE);
			
			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_INITIALIZE, "INITIALIZE");
			
			CommonUtils.waitForNoVisible(timeWait, Gateways_Tab.POPUP_IMPORT_TYPE);

			CommonUtils.waitForVisible(timeWait, Gateways_Tab.POPUP_PLANT_FAMILY_INITIALIZED);
			
			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_PLANT_FAMILY_INITIALIZED_CLOSE, "Close");
			Utilities.Delay(pageLoadWait);
		}

		System.out.println("\n[Save_Project] End");
	}

	public static void Create_Plant(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait, int imageLoadWait,
			String plantName, Document doc, int systemType, boolean videoDoorEntrySystem, int serviceType) {
		
		System.out.println("\n[Create_Plant] Start...");
				
		Go_To_New_Site_Page(driver, timeWait);
		
		// page "General Info"
		InputInfo(driver, timeWait, plantName, doc);
		
		CommonUtils.clickElement(driver, timeWait, Page_Site_New.BUTTON_SAVE_NEXT, "Save & Next");
		Utilities.Delay(pageLoadWait);		
		CommonUtils.VerifyPage(driver, timeWait, "Installation Type", Page_Site_New.LI_INSTALLATION_TYPE);
		
		// page 'Installation Type'
		Definition_Type_Services_And_Installed_Systems(driver, timeWait, systemType, videoDoorEntrySystem, serviceType);
		
		// page 'Buildings/Risers'
		String NAME_OF_THE_BUILDING = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "BUILDING_NAME_1");
		String NUMBER_OF_APARTMENT = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "NUMBER_OF_APARTMENTS_OF_BUILDING");
		Definition_Number_Buildings_And_Number_Of_Apartments(driver, timeWait, NAME_OF_THE_BUILDING, NUMBER_OF_APARTMENT);

		if (systemType == 2)//The access control system will manage the readers, video door entry system and external panel address book.
		{	
			// page 'Floors' page (if needed)
			String NUMBER_OF_FLOORS = CommonUtils.getElementsByTagName(doc, "FLOORS", "NUMBER_OF_FLOORS");
			String NUMBER_OF_APARTMENTS = CommonUtils.getElementsByTagName(doc, "APARTMENTS", "NUMBER_OF_APARTMENTS");
			Distribution_Of_Apartments(driver, timeWait, NUMBER_OF_FLOORS, NUMBER_OF_APARTMENTS);
		}
		
		// page 'Gates'
		Definition_Gates_And_Devices(driver, timeWait, pageLoadWait, imageLoadWait, doc, systemType);
		
		// page 'Gates and Buildings/Risers'
		Association_Gates_And_Buildings(driver, timeWait, pageLoadWait, 1);
		
		// page 'Control Unit'
		Definition_Central_Access_Control(driver, timeWait, doc);

		if (serviceType == 2) {	//Online management. Access Control Portal will provide remote access to the plant and I/O.
			// page 'Gateways'
			CreatePlant.Gateways_Definition(driver, timeWait, pageLoadWait, imageLoadWait, doc);
		}
		
		// page 'System Address'
		CreatePlant.Check_System_Structure(driver, timeWait, serviceType, doc);
		
		// page 'Activate Project'
		CreatePlant.Project_Activation(driver, timeWait);
		
		CreatePlant.Save_Project(driver, timeWait, serviceType);

		System.out.println("\n[Create_Plant] Finished\n");
	}

	public static void deleteAllSites(AndroidDriver<?> driver, WebDriverWait timeWait, String password) {
		
		System.out.println("\n[deleteAllSites] Start");

		int rowOrder = 2;
		int page = 1;
		String xpath = "";
		String PlantName = "";
				
		CommonUtils.refreshPage(driver, "TAB_MY_PROJECT");
		
		if (CommonUtils.checkElement(driver, timeWait, Popup_Session_Already_Opened.BUTTON_CONTINUE) == true) {
			System.out.println("[Execute] Close PopUp 'Session Already Opened'");
			CommonUtils.clickElement(driver, timeWait, Popup_Session_Already_Opened.BUTTON_CONTINUE, "Continue");
		}

		for (page = 1; page <= 3; page++) {
			for (rowOrder = 2;;) {
				
				xpath = My_Projects_Tab.PlantName.replace("rowOrder", String.valueOf(rowOrder));
				System.out.println("Verify PlantName at Order: " + rowOrder + "; page: " + page);
				
				if (CommonUtils.checkElement(driver, timeWait, xpath) == true) {
					PlantName = CommonUtils.getText(driver, timeWait, xpath);
					System.out.println("Deleting PlantName: " + PlantName);
					xpath = My_Projects_Tab.DeleteProject.replace("rowOrder", String.valueOf(rowOrder));
					
					if (CommonUtils.checkElement(driver, timeWait, xpath) == true) {
						CommonUtils.clickElement(driver, timeWait, xpath, "DeleteProject");
						CommonUtils.waitForVisible(timeWait, My_Projects_Tab.POPUP_CONFIRM_DELETE);
						System.out.println("[Execute] Found POPUP_CONFIRM_DELETE after trying to delete the PlantName: " + PlantName);
						CommonUtils.typeText(driver, timeWait, My_Projects_Tab.INPUT_PASSWORD, "INPUT_PASSWORD", password);

						CommonUtils.clickElement(driver, timeWait, My_Projects_Tab.BUTTON_OK, "BUTTON_OK");
						CommonUtils.Alert(driver, timeWait, true);
						CommonUtils.waitForVisible(timeWait, My_Projects_Tab.BUTTON_CLOSE_DIALOG);
						System.out.println("[Execute] Removing PlantName: " + PlantName + " and got message: " + CommonUtils.getText(driver, timeWait, My_Projects_Tab.BUTTON_CLOSE_MESSAGE));
						CommonUtils.clickElement(driver, timeWait, My_Projects_Tab.BUTTON_CLOSE_DIALOG, "BUTTON_CLOSE_DIALOG");
						CommonUtils.waitForNoVisible(timeWait, My_Projects_Tab.BUTTON_CLOSE_DIALOG);
						CommonUtils.waitForNoVisible(timeWait, My_Projects_Tab.POPUP_CONFIRM_DELETE);

						CommonUtils.waitPageIsReady(driver, "Page " + page);
						System.out.println("[Execute] Removed PlantName: " + PlantName + " exists in at order: " + rowOrder + " in page " + page);
						
						CommonUtils.refreshPage(driver, "ACWeb Home");
						
					} else {
						System.out.println("[Execute] Not able to remove PlantName: " + PlantName);
						rowOrder = rowOrder + 1;
					}

				} else
					break;

			}
			
			if (!CommonUtils.checkNextPageAndClickNextPage(driver, My_Projects_Tab.next_endUsersSiteTablePager))
				break;
		}
		
		System.out.println("\n[deleteAllSites] End");
	}
	
	public static void Delete_Site_By_Row(AndroidDriver<?> driver, WebDriverWait timeWait, int rowNum, String password) {
		
		int totalRow = 0;
		String rowNumber = String.valueOf(rowNum);
		
		try {

			List<WebElement> rows = (List<WebElement>) driver.findElements(By.xpath(My_Projects_Tab.TABLE_PLANT_LIST));
			totalRow = rows.size();
			
			System.out.println("\n[Delete_Site] Found " + (totalRow - 1) + " sites in the Site Table");

			if (totalRow > 1) {
				
				String xpathName = My_Projects_Tab.TABLE_PLANT_COL_PROJ_NAME.replace("NUMBER", rowNumber);
				String xpathServType = My_Projects_Tab.TABLE_PLANT_COL_SERV_TYPE.replace("NUMBER", rowNumber);
				String xpathDelete = My_Projects_Tab.PROJ_DEL_ICON.replace("NUMBER", rowNumber);

				String prjName = CommonUtils.getTableData(driver, timeWait, xpathName);
				String servType = CommonUtils.getTableData(driver, timeWait, xpathServType);
				
				if ("LOCAL".equals(servType)) {
					System.out.println("\n[Delete_Site] Deleting Local site '" + prjName + "' at row #" + rowNumber + "...");
					
					CommonUtils.clickElement(driver, timeWait, xpathDelete, "<icon> Delete Project");

					// Wait for Pop-up 'Confirmation Delete'
					CommonUtils.waitForVisible(timeWait, My_Projects_Tab.POPUP_CONFIRM_DELETE);

					// Fill password
					CommonUtils.typeText(driver, timeWait, My_Projects_Tab.INPUT_PASSWORD, "INPUT_PASSWORD", password);

					// Click 'OK' button and confirm Deletion
					CommonUtils.clickElement(driver, timeWait, My_Projects_Tab.BUTTON_OK, "'OK' button");
					CommonUtils.Alert(driver, timeWait, true);
					CommonUtils.waitForVisible(timeWait, My_Projects_Tab.BUTTON_CLOSE_DIALOG);
					CommonUtils.clickElement(driver, timeWait, My_Projects_Tab.BUTTON_CLOSE_DIALOG, "BUTTON_CLOSE_DIALOG");
					CommonUtils.waitForNoVisible(timeWait, My_Projects_Tab.BUTTON_CLOSE_DIALOG);
					CommonUtils.waitForNoVisible(timeWait, My_Projects_Tab.POPUP_CONFIRM_DELETE);

					System.out.println("[Delete_Site] Site '" + prjName + "' is deleted!\n");
					
				} else {
					System.out.println("Site '" + prjName + "' is an Online site --> by-pass");
				}
			}			

		} catch (Exception e) {
			System.out.println("[Delete_Local_Plant] ERROR: Failed while deleting Local Plant");
		}
	}
	
	public static void Setup_Installation_Type(AndroidDriver<?> driver, WebDriverWait timeWait, boolean systemVDE, boolean devidedVDE, boolean serviceOnline) {
		//
		//	systemVDE = true: 	include VDE (Video Door Entry)
		//	systemVDE = false: no VDE (Video Door Entry)
		//	devidedVDE = true:	Video door entry system will be divided by one or more riser interface (YES option) 
		//	devidedVDE = false:	Video door entry system will not be divided by one or more riser interface (NO option)
		//	serviceOnline = true:	ONLINE Plant type
		//	serviceOnline = false: 	LOCAL Plant type
		//
				
		System.out.println("\n[Setup_Installation_Type] Start");

		if (systemVDE == false)
			CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.SYSTEM_TYPE_1, "System Type 1");
		else {
			CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.SYSTEM_TYPE_2, "System Type 2");
			
			if (devidedVDE == true)
				CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.SYSTEM_TYPE_2_WITH_VDE, "With VDE");
			else
				CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.SYSTEM_TYPE_2_NO_VDE, "No VDE");
		}

		if (serviceOnline == false)
			CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.SERVICE_TYPE_1, "OFFLINE type");
		else
			CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.SERVICE_TYPE_2, "ONLINE type");

		// Click CUSTOM Site button
		CommonUtils.clickElement(driver, timeWait, Page_Installation_Type.BUTTON_START_FULL_CUSTOMER_SITE, "'Start with a full CUSTOM site' button");

		if (Utilities.Verify_Page(driver, timeWait, "Buildings/Risers", Structure_Definition_Tab.LI_BUILDINGS_RISERS))
			System.out.println("\n[Setup_Installation_Type] End");
	}

	public static boolean Create_Plant_With_Customize(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait,
			int imageLoadWait, String plantName, Document doc, boolean systemVDE, boolean devidedVDE, boolean serviceOnline) {
		
		System.out.println("\n[Create_Plant_With_Customize] Start");
		
		boolean isCreated = false;
		try {
			
			if (serviceOnline == true)
				System.out.println("[Create_Plant_With_Customize] Plant type: ONLINE");
			else
				System.out.println("[Create_Plant_With_Customize] Plant type: LOCAL");

			if (systemVDE == true)
				System.out.println("[Create_Plant_With_Customize] Include VDE? --> YES");
			else
				System.out.println("[Create_Plant_With_Customize] Include VDE? --> NO");

			if (devidedVDE == true)
				System.out.println("[Create_Plant_With_Customize] Devide VDE? --> YES");
			else
				System.out.println("[Create_Plant_With_Customize] Devide VDE? --> NO");

			Go_To_New_Site_Page(driver, timeWait);
			
			// page "General Info"
			InputInfo(driver, timeWait, plantName, doc);
			
			CommonUtils.clickElement(driver, timeWait, Page_Site_New.BUTTON_SAVE_NEXT, "Save & Next");
			Utilities.Delay(pageLoadWait);
			
			// page 'Installation Type'
			Setup_Installation_Type(driver, timeWait, systemVDE, devidedVDE, serviceOnline);

			// page 'Buildings/Risers'
			String BUILDING_NAME = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "BUILDING_NAME_1");
			String APARTMENT_COUNT = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "NUMBER_OF_APARTMENTS_OF_BUILDING");
			Definition_Number_Buildings_And_Number_Of_Apartments(driver, timeWait, BUILDING_NAME, APARTMENT_COUNT);

			// page 'Floors' page (if needed)
			if (systemVDE == true) {	//The access control system will manage the readers, video door entry system and external panel address book.
				String NUMBER_OF_FLOORS = CommonUtils.getElementsByTagName(doc, "FLOORS", "NUMBER_OF_FLOORS");
				String NUMBER_OF_APARTMENTS = CommonUtils.getElementsByTagName(doc, "APARTMENTS", "NUMBER_OF_APARTMENTS");
				CreatePlant.Distribution_Of_Apartments(driver, timeWait, NUMBER_OF_FLOORS, NUMBER_OF_APARTMENTS);
			}

			// page 'Gates'
			Setup_Gate_Basic(driver, timeWait, doc, systemVDE);
			
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_SAVE_NEXT_GATE, "Save&Next");
			Utilities.Delay(pageLoadWait);
			CommonUtils.VerifyPage(driver, timeWait, "Gates and Buildings/Risers", Gates_Tab.LI_GATES_BUILDINGS_RISERS_TAB);
			
			// page 'Gates and Buildings/Risers'
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_LINK_GATES, "Link Gates");
			Utilities.Delay(popupLoadWait);
			
			CommonUtils.waitForVisible(timeWait, Gates_Tab.POPUP_SELECT_GATE);
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.CHECKBOX_1, "CheckBox 1");
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_OK_GATES, "OK");
			CommonUtils.waitForNoVisible(timeWait, Gates_Tab.POPUP_SELECT_GATE);

			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_GATES_BUILDINGS_SAVE_NEXT, "Save & Next");
			Utilities.Delay(pageLoadWait);
			CommonUtils.VerifyPage(driver, timeWait, "Control Unit", System_Data_Tab.LI_CONTROL_UNIT);
			
			// page 'Control Unit'
			String CONTROL_UNIT_NAME = CommonUtils.getElementsByTagName(doc, "GATE_1", "CONTROL_UNIT");
			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Control Unit Name", CONTROL_UNIT_NAME);
			
			CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.SELECT_CONTROL_UNIT_ADDRESS, 0), "Control Unit Address", "0");
			
			CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.BUTTON_CONTROL_UNIT_LINK_GATES, 0), "Link Gates");
			Utilities.Delay(popupLoadWait);
			
			CommonUtils.waitForVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_1, "CheckBox 1");
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK_GATES, "OK");
			CommonUtils.waitForNoVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Save & Next");
			Utilities.Delay(pageLoadWait);

			// page 'Gateway'
			if (serviceOnline == true) // If ONLINE type
			{
				String GATEWAY_NAME = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_NAME_1");

				CommonUtils.VerifyPage(driver, timeWait, "Gateway", System_Data_Tab.LI_GATE_WAY);
				CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Gateway Name", GATEWAY_NAME);
				CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_GATE_WAY_LINK_GATE, "Link Gates");
				CommonUtils.waitForVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
				CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_1, "Check Box Select Gate");
				CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK, "Button OK");
				CommonUtils.waitForNoVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
				
				CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Button Save&Next");
				Utilities.Delay(pageLoadWait);
				CommonUtils.VerifyPage(driver, timeWait, "System Address", System_Address_Tab.LI_SYSTEM_ADDRESS);
			}

			// page 'System Address'
			if (serviceOnline == true) { // ONLINE plant type
				String GATEWAY_FW_VERSION = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_FW_VERSION_1");
				String GATEWAY_SERIAL_NUMBER = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_SERIAL_NUMBER_1");
				
				System.out.println("\n[Gateway Verion Firmware] = " + GATEWAY_FW_VERSION);
				System.out.println("[Gateway Serial Device Number] = " + GATEWAY_SERIAL_NUMBER);

				CommonUtils.typeText(driver, timeWait, System_Address_Tab.Gateway_FW_VER, "Verion Firmware", GATEWAY_FW_VERSION);
				CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATEWAY_SERIAL_NUMBER, "Serial Device Number", GATEWAY_SERIAL_NUMBER);
			}

			// Click 'Validate Project' button
			CommonUtils.clickElement(driver, timeWait, System_Address_Tab.BUTTON_VALIDATE_PROJECT, "Validate Project");
			Utilities.Delay(pageLoadWait);
			
			// Click Activate Project
			CommonUtils.clickElement(driver, timeWait, Project_Activation_Tab.BUTTON_ACTIVATE_PROJECT, "Activate Project");
			Utilities.Delay(pageLoadWait);

			// Finalize 'Gateways' page with Site's password
			if (serviceOnline == true) {
				String siteID = CommonUtils.getInputText(driver, timeWait, Gateways_Tab.Site_ID_ONLINE);
				System.out.println("Site's ID (generated): " + siteID);
				CommonUtils.typeText(driver, timeWait, Gateways_Tab.INPUT_Site_Password_ONLINE, "Site Password", "12345");
				CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_NEXT_ONLINE, "Save & Next");
				CommonUtils.waitForVisible(timeWait, Gateways_Tab.POPUP_IMPORT_PROGRAMMER);
				CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_INITIALIZE, "Initialize");
				CommonUtils.waitForVisible(timeWait, Gateways_Tab.DIALOG);
				CommonUtils.clickElement(driver, timeWait, Gateways_Tab.CLOSE_DIALOG, "close");

				System.out.println("\n[Create_Plant_With_Customize] Plant is created");
			}

			// Verify 'Plant Testing' page
			CommonUtils.waitPageIsReady(driver, "Plant testing");
			if (Utilities.Verify_Page(driver, timeWait, "Plant testing", Plant_Testing_Tab.LI_PLANTESTING)) {
				int i = 0;
				boolean createSuccess = false;
				while (i <= 65) {
					i += 1;
					Utilities.Delay(60);
					CommonUtils.refreshPage(driver, "Plant testing");

					if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.GREEN_MAIN_BULLET) == true) {
						System.out.println("[MAIN PANEL] is GREEN !");
						createSuccess = true;
						i = 100;	//break
					} else {
						System.out.println("Gateway has not called after " + i + " minutes...");
					}
					
					if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.RED_MAIN_BULLET) == true) {
						System.out.println("[MAIN PANEL] is RED ! Some Error occurs");
						Assert.fail();
					}
				}

				if (createSuccess == true) {
					System.out.println("PLANT '" + plantName + "' IS CREATED SUCCESSFULLY");
					isCreated = true;
				} else {
					System.out.println("[ERROR] PLANT: '" + plantName + "' CANNOT CONNECT TO GATEWAY");
					isCreated = false;
					Assert.fail();
				}
			}

		} catch (Exception e) {
			System.out.println("[ERROR] FAILED TO CREATE PLANT: '" + plantName);
			isCreated = false;
		}

		// Now in 'Plant testing' page
		if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.SETTINGS_link)) {
			CommonUtils.clickElement(driver, timeWait, Plant_Testing_Tab.SETTINGS_link, "SETTINGS hyperlink");			
		}
				
		CommonUtils.waitPageIsReady(driver, "Settings");
		
		// Click Confirm Settings
		if (CommonUtils.checkElement(driver, timeWait, Settings_Tab.BUTTON_CONFIRM_SETTINGS_HUNG)) {
			CommonUtils.clickElement(driver, timeWait, Settings_Tab.BUTTON_CONFIRM_SETTINGS_HUNG, "Confirm Settings");			
		}
		
		CommonUtils.waitPageIsReady(driver, "Settings");
		Utilities.Delay(pageLoadWait);

		// Click Gates left-tab
		CommonUtils.clickElement(driver, timeWait, Settings_Tab.GATES, "Gates left-tab");
		CommonUtils.waitPageIsReady(driver, "Gates");

		// Click 'Gates' left-menu-tab
		CommonUtils.clickElement(driver, timeWait, Gates_Setting_Tab.By_Gates_Tab, "By Gate");

		// Click check-box to assign Family to Gate
		CommonUtils.clickElement(driver, timeWait, Gates_Setting_Tab.CheckBox_Building, "CheckBox Building");

		// Click Apply button
		CommonUtils.clickElement(driver, timeWait, Gates_Setting_Tab.Apply_Button, "Apply");

		CommonUtils.waitPageIsReady(driver, "Gates");
		
		// Print Result
		String currentText = CommonUtils.getText(driver, timeWait, Gates_Setting_Tab.MSG_Success);
		System.out.println("Found message: " + currentText);
		
		// Delete all LOCAL Plant type
		//CreatePlant.Delete_All_Local_Plants(driver, timeWait, "tatest2015");
				
		System.out.println("\n[Create_Plant_With_Customize] End");

		return isCreated;
	}

	public static boolean Create_Online_Plant(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait, int imageLoadWait, String plantName, Document doc, boolean systemVDE, boolean devidedVDE) {
		
		boolean isCreated = false;
		String BUILDING_NAME = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "BUILDING_NAME_1");
		String GATES_NAME = CommonUtils.getElementsByTagName(doc, "GATES", "GATE_NAME_1");
		String APARTMENT_COUNT = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "NUMBER_OF_APARTMENTS_OF_BUILDING");
		String NUMBER_OF_FLOORS = CommonUtils.getElementsByTagName(doc, "FLOORS", "NUMBER_OF_FLOORS");
		String NUMBER_OF_APARTMENTS = CommonUtils.getElementsByTagName(doc, "APARTMENTS", "NUMBER_OF_APARTMENTS");
		String CONTROL_UNIT_NAME = CommonUtils.getElementsByTagName(doc, "GATE_1", "CONTROL_UNIT");
		String GATEWAY_NAME = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_NAME_1");
		String GATEWAY_FW_VERSION = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_FW_VERSION_1");
		String GATEWAY_SERIAL_NUMBER = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_SERIAL_NUMBER_1");
		String pwd = "12345";
		//String groupName = CommonUtils.getElementsByTagName(doc, "TIMEBAND_GROUPS", "TIMEBAND_GROUP_NAME");
		
		try {

			if (systemVDE == true)
				System.out.println("\n[Create_Online_Plant] Include VDE? --> YES");
			else
				System.out.println("\n[Create_Online_Plant] Include VDE? --> NO");

			if (devidedVDE == true)
				System.out.println("\n[Create_Online_Plant] Devide VDE? --> YES");
			else
				System.out.println("\n[Create_Online_Plant] Devide VDE? --> NO");

			Go_To_New_Site_Page(driver, timeWait);
			
			// page "General Info"
			InputInfo(driver, timeWait, plantName, doc);
			
			CommonUtils.clickElement(driver, timeWait, Page_Site_New.BUTTON_SAVE_NEXT, "<button> Save & Next");
			Utilities.Delay(pageLoadWait);
			
			// page 'Installation Type'
			Setup_Installation_Type(driver, timeWait, systemVDE, devidedVDE, true);

			// page 'Buildings/Risers'			
			Definition_Number_Buildings_And_Number_Of_Apartments(driver, timeWait, BUILDING_NAME, APARTMENT_COUNT);

			// page 'Floors' page (if needed)
			if (systemVDE == true) {	//The access control system will manage the readers, video door entry system and external panel address book.				
				CreatePlant.Distribution_Of_Apartments(driver, timeWait, NUMBER_OF_FLOORS, NUMBER_OF_APARTMENTS);
			}

			// page 'Gates'
			Setup_Gate_With_VDE_And_Vigik(driver, timeWait, GATES_NAME, systemVDE);
			
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_SAVE_NEXT_GATE, "<button> Save & Next");
			Utilities.Delay(pageLoadWait);
			
			// page 'Gates and Buildings/Risers'
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_LINK_GATES, "<button> Link Gates");
			Utilities.Delay(popupLoadWait);
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.CHECKBOX_1, "<checkbox> Gate 1");
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_OK_GATES, "OK");
			Utilities.Delay(popupLoadWait);

			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_GATES_BUILDINGS_SAVE_NEXT, "Save & Next");
			Utilities.Delay(pageLoadWait);
			
			// page 'Control Unit'			
			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Control Unit Name", CONTROL_UNIT_NAME);			
			CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.SELECT_CONTROL_UNIT_ADDRESS, 0), "Control Unit Address", "0");
			
			CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.BUTTON_CONTROL_UNIT_LINK_GATES, 0), "Link Gates");
			Utilities.Delay(popupLoadWait);
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_1, "<checkbox> Gate 1");
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK_GATES, "OK");
			Utilities.Delay(popupLoadWait);
			
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Save & Next");
			Utilities.Delay(pageLoadWait);

			// page 'Gateway'
			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Gateway Name", GATEWAY_NAME);
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_GATE_WAY_LINK_GATE, "<button> Link Gates");
			Utilities.Delay(popupLoadWait);
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_1, "<checkbox> Gate 1");
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK, "<button> OK");
			Utilities.Delay(popupLoadWait);
			
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "<button> Save&Next");
			Utilities.Delay(pageLoadWait);			

			// page 'System Address'			
			System.out.println("\n[Gateway Verion Firmware] = " + GATEWAY_FW_VERSION);
			System.out.println("\n[Gateway Serial Device Number] = " + GATEWAY_SERIAL_NUMBER);

			CommonUtils.typeText(driver, timeWait, System_Address_Tab.Gateway_FW_VER, "Verion Firmware", GATEWAY_FW_VERSION);
			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATEWAY_SERIAL_NUMBER, "Serial Device Number", GATEWAY_SERIAL_NUMBER);
			
			// Click 'Validate Project' button
			CommonUtils.clickElement(driver, timeWait, System_Address_Tab.BUTTON_VALIDATE_PROJECT, "<button> Validate Project");
			Utilities.Delay(pageLoadWait);	
			
			// Click Activate Project			
			CommonUtils.clickElement(driver, timeWait, Project_Activation_Tab.BUTTON_ACTIVATE_PROJECT, "<button> Activate Project");
			Utilities.Delay(pageLoadWait);	
			
			// Finalize 'Gateways' page with Site's password			
			String siteID = CommonUtils.getInputText(driver, timeWait, Gateways_Tab.Site_ID_ONLINE);
			System.out.println("Site's ID (generated): " + siteID);
			CommonUtils.typeText(driver, timeWait, Gateways_Tab.INPUT_Site_Password_ONLINE, "Site Password", pwd);
			
			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_NEXT_ONLINE, "<button> Save & Next");
			Utilities.Delay(pageLoadWait);	
			CommonUtils.waitForVisible(timeWait, Gateways_Tab.POPUP_IMPORT_PROGRAMMER);
			
			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_INITIALIZE, "<button> Initialize");
			CommonUtils.waitForVisible(timeWait, Gateways_Tab.DIALOG);
			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.CLOSE_DIALOG, "<button> Close");
			Utilities.Delay(pageLoadWait);	

			// Verify 'Plant Testing' page
			if (Utilities.Verify_Page(driver, timeWait, "Plant testing", Plant_Testing_Tab.LI_PLANTESTING)) {
				int i = 0;
				boolean createSuccess = false;
				while (i <= 65) {
					i += 1;
					Utilities.Delay(60);
					CommonUtils.refreshPage(driver, "Plant testing");

					if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.GREEN_MAIN_BULLET) == true) {
						System.out.println("[MAIN PANEL] is GREEN !");
						createSuccess = true;
						i = 100;	//break
					} else {
						System.out.println("Gateway has not called after " + i + " minutes...");
					}
					
					if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.RED_MAIN_BULLET) == true) {
						System.out.println("[MAIN PANEL] is RED ! Some Error occurs");
						Assert.fail();
					}
				}

				if (createSuccess == true) {
					System.out.println("PLANT '" + plantName + "' IS CREATED SUCCESSFULLY");
					isCreated = true;
				} else {
					System.out.println("[ERROR] PLANT: '" + plantName + "' CANNOT CONNECT TO GATEWAY");
					isCreated = false;
					Assert.fail();
				}
			}

		} catch (Exception e) {
			System.out.println("[ERROR] FAILED TO CREATE PLANT: '" + plantName);
			isCreated = false;
		}

		// Now in 'Plant testing' page
		if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.SETTINGS_link)) {
			CommonUtils.clickElement(driver, timeWait, Plant_Testing_Tab.SETTINGS_link, "SETTINGS hyperlink");	
			Utilities.Delay(pageLoadWait);	
		}
				
		CommonUtils.waitPageIsReady(driver, "Settings");
		
		// Click Add Radio Group
//		CommonUtils.clickElement(driver, timeWait, Settings_Tab.BUTTON_Add_Radio_group, "<button> Add Radio Group");
//		CommonUtils.typeText(driver, timeWait, Settings_Tab.INPUT_Radio_Group, "Radio Group Name", groupName);
//		CommonUtils.clickElement(driver, timeWait, Settings_Tab.BUTTON_Save, "<button> Save");
//		CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Settings_Tab.SELECT_Button_Right, 1), "Choose button right ", GATES_NAME);
//		CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Settings_Tab.SELECT_Button_Left, 1), "Choose button right ", GATES_NAME);
		
		// Enable Time bands
		CommonUtils.clickElement(driver, timeWait, Settings_Tab.RADIO_Time_bands_Yes, "<radio> Enable Time-bands");
		
		// Click Confirm Settings
		if (CommonUtils.checkElement(driver, timeWait, Settings_Tab.BUTTON_CONFIRM_SETTINGS_HUNG)) {
			CommonUtils.clickElement(driver, timeWait, Settings_Tab.BUTTON_CONFIRM_SETTINGS_HUNG, "<button> Confirm Settings");	
			Utilities.Delay(pageLoadWait);	
		}
		
		CommonUtils.waitPageIsReady(driver, "Settings");
		
		// Now go to home-page
		Go_To_Home_Page(driver, timeWait);
		
		return isCreated;
	}
	
	public static boolean Create_Online_Plant_For_First_Access(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait, int imageLoadWait, String plantName, Document doc, boolean systemVDE, boolean devidedVDE) {
		
		boolean isCreated = false;
		String BUILDING_NAME = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "BUILDING_NAME_1");
		String GATES_NAME = CommonUtils.getElementsByTagName(doc, "GATES", "GATE_NAME_1");
		String APARTMENT_COUNT = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "NUMBER_OF_APARTMENTS_OF_BUILDING");
		String NUMBER_OF_FLOORS = CommonUtils.getElementsByTagName(doc, "FLOORS", "NUMBER_OF_FLOORS");
		String NUMBER_OF_APARTMENTS = CommonUtils.getElementsByTagName(doc, "APARTMENTS", "NUMBER_OF_APARTMENTS");
		String CONTROL_UNIT_NAME = CommonUtils.getElementsByTagName(doc, "GATE_1", "CONTROL_UNIT");
		String GATEWAY_NAME = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_NAME_1");
		String GATEWAY_FW_VERSION = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_FW_VERSION_1");
		String GATEWAY_SERIAL_NUMBER = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_SERIAL_NUMBER_1");
		String pwd = "12345";
		//String groupName = CommonUtils.getElementsByTagName(doc, "TIMEBAND_GROUPS", "TIMEBAND_GROUP_NAME");
		
		try {

			if (systemVDE == true)
				System.out.println("\n[Create_Online_Plant] Include VDE? --> YES");
			else
				System.out.println("\n[Create_Online_Plant] Include VDE? --> NO");

			if (devidedVDE == true)
				System.out.println("\n[Create_Online_Plant] Devide VDE? --> YES");
			else
				System.out.println("\n[Create_Online_Plant] Devide VDE? --> NO");

			Go_To_New_Site_Page(driver, timeWait);
			
			// page "General Info"
			InputInfo(driver, timeWait, plantName, doc);
			
			CommonUtils.clickElement(driver, timeWait, Page_Site_New.BUTTON_SAVE_NEXT, "<button> Save & Next");
			Utilities.Delay(pageLoadWait);
			
			// page 'Installation Type'
			Setup_Installation_Type(driver, timeWait, systemVDE, devidedVDE, true);

			// page 'Buildings/Risers'			
			Definition_Number_Buildings_And_Number_Of_Apartments(driver, timeWait, BUILDING_NAME, APARTMENT_COUNT);

			// page 'Floors' page (if needed)
			if (systemVDE == true) {	//The access control system will manage the readers, video door entry system and external panel address book.				
				CreatePlant.Distribution_Of_Apartments(driver, timeWait, NUMBER_OF_FLOORS, NUMBER_OF_APARTMENTS);
			}

			// page 'Gates'
			Setup_Gate_With_VDE_And_Vigik(driver, timeWait, GATES_NAME, systemVDE);
			
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_SAVE_NEXT_GATE, "<button> Save & Next");
			Utilities.Delay(pageLoadWait);
			
			// page 'Gates and Buildings/Risers'
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_LINK_GATES, "<button> Link Gates");
			Utilities.Delay(popupLoadWait);
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.CHECKBOX_1, "<checkbox> Gate 1");
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_OK_GATES, "OK");
			Utilities.Delay(popupLoadWait);

			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_GATES_BUILDINGS_SAVE_NEXT, "Save & Next");
			Utilities.Delay(pageLoadWait);
			
			// page 'Control Unit'			
			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Control Unit Name", CONTROL_UNIT_NAME);			
			CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.SELECT_CONTROL_UNIT_ADDRESS, 0), "Control Unit Address", "0");
			
			CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.BUTTON_CONTROL_UNIT_LINK_GATES, 0), "Link Gates");
			Utilities.Delay(popupLoadWait);
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_1, "<checkbox> Gate 1");
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK_GATES, "OK");
			Utilities.Delay(popupLoadWait);
			
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Save & Next");
			Utilities.Delay(pageLoadWait);

			// page 'Gateway'
			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Gateway Name", GATEWAY_NAME);
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_GATE_WAY_LINK_GATE, "<button> Link Gates");
			Utilities.Delay(popupLoadWait);
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_1, "<checkbox> Gate 1");
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK, "<button> OK");
			Utilities.Delay(popupLoadWait);
			
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "<button> Save&Next");
			Utilities.Delay(pageLoadWait);			

			// page 'System Address'			
			System.out.println("\n[Gateway Verion Firmware] = " + GATEWAY_FW_VERSION);
			System.out.println("\n[Gateway Serial Device Number] = " + GATEWAY_SERIAL_NUMBER);

			CommonUtils.typeText(driver, timeWait, System_Address_Tab.Gateway_FW_VER, "Verion Firmware", GATEWAY_FW_VERSION);
			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATEWAY_SERIAL_NUMBER, "Serial Device Number", GATEWAY_SERIAL_NUMBER);
			
			// Click 'Validate Project' button
			CommonUtils.clickElement(driver, timeWait, System_Address_Tab.BUTTON_VALIDATE_PROJECT, "<button> Validate Project");
			Utilities.Delay(pageLoadWait);	
			
			// Click Activate Project			
			CommonUtils.clickElement(driver, timeWait, Project_Activation_Tab.BUTTON_ACTIVATE_PROJECT, "<button> Activate Project");
			Utilities.Delay(pageLoadWait);	
			
			// Finalize 'Gateways' page with Site's password			
			String siteID = CommonUtils.getInputText(driver, timeWait, Gateways_Tab.Site_ID_ONLINE);
			System.out.println("Site's ID (generated): " + siteID);
			CommonUtils.typeText(driver, timeWait, Gateways_Tab.INPUT_Site_Password_ONLINE, "Site Password", pwd);
			
			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_NEXT_ONLINE, "<button> Save & Next");
			Utilities.Delay(pageLoadWait);	
			CommonUtils.waitForVisible(timeWait, Gateways_Tab.POPUP_IMPORT_PROGRAMMER);
			
			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_INITIALIZE, "<button> Initialize");
			CommonUtils.waitForVisible(timeWait, Gateways_Tab.DIALOG);
			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.CLOSE_DIALOG, "<button> Close");
			Utilities.Delay(pageLoadWait);	

			// Verify 'Plant Testing' page
			if (Utilities.Verify_Page(driver, timeWait, "Plant testing", Plant_Testing_Tab.LI_PLANTESTING)) {
				int i = 0;
				boolean createSuccess = false;
				while (i <= 65) {
					i += 1;
					Utilities.Delay(60);
					CommonUtils.refreshPage(driver, "Plant testing");

					if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.GREEN_MAIN_BULLET) == true) {
						System.out.println("[MAIN PANEL] is GREEN !");
						createSuccess = true;
						i = 100;	//break
					} else {
						System.out.println("Gateway has not called after " + i + " minutes...");
					}
					
					if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.RED_MAIN_BULLET) == true) {
						System.out.println("[MAIN PANEL] is RED ! Some Error occurs");
						Assert.fail();
					}
				}

				if (createSuccess == true) {
					System.out.println("PLANT '" + plantName + "' IS CREATED SUCCESSFULLY");
					isCreated = true;
				} else {
					System.out.println("[ERROR] PLANT: '" + plantName + "' CANNOT CONNECT TO GATEWAY");
					isCreated = false;
					Assert.fail();
				}
			}

		} catch (Exception e) {
			System.out.println("[ERROR] FAILED TO CREATE PLANT: '" + plantName);
			isCreated = false;
		}
				
		return isCreated;
	}
	
	public static HashMap<String, String> Load_All_Gates_From_Config_File() {
		
		HashMap<String, String> hmap = new HashMap<String, String>();
		
		int totalGates = Integer.valueOf(CommonUtils.getElementsByTagName(doc, "REAL_GATES", "NUMBER_REAL_GATE"));
		
		for (int i = 1; i <= totalGates; i++) {
			String name = CommonUtils.getElementsByTagName(doc, "REAL_GATE_" + String.valueOf(i), "GATE_NAME");
			hmap.put(String.valueOf(i), name);
		}
		
		return hmap;
	}
	
	public static int Get_Row_Number_By_Gate_Name_For_Building(int numberBuilding, String gateName) {
		
		int rowNumber = 0;
		List<WebElement> elements = (List<WebElement>) driver.findElements(By.xpath(CommonUtils.setNumber(Gates_Tab.TABLE_GATES_BUILDING, numberBuilding)));
		int totalRow = elements.size();
		System.out.println("\n>>> Finding '" + gateName + "' to associate with Building (number) " + numberBuilding + "...");
		System.out.println(">>> Found " + (totalRow - 1) + " gates in the table");
		
		for (int i = 2; i <= totalRow; i++) {
			
			String xpathGateName = Gates_Tab.TABLE_GATES_BUILDING_GATENAME.replace("BUILDINGNUMBER", String.valueOf(numberBuilding)).replace("GATENUMBER", String.valueOf(i));
			
			String gateNameText = CommonUtils.getTableData(driver, timeWait, xpathGateName);
			System.out.println(">>> row " + i + ": " + gateNameText);
			if (gateName.equals(gateNameText)) {
				rowNumber = i;
				System.out.println("\n>>> '" + gateName + "' is present at row " + rowNumber + " in the table\n");
				break;
			}
		}
				
		return rowNumber;
	}
	
	public static int Get_Row_Number_By_Gate_Name_For_Central(int numberCentral, String gateName) {
		
		int rowNumber = 0;
		List<WebElement> elements = (List<WebElement>) driver.findElements(By.xpath(CommonUtils.setNumber(System_Data_Tab.TABLE_LINK_GATES_CENTRAL, numberCentral)));
		int totalRow = elements.size();
		
		System.out.println("\n>>> Finding '" + gateName + "' to associate with Central (number) " + numberCentral + "...");
		System.out.println(">>> Found " + (totalRow - 1) + " gates in the table");
		
		for (int i = 2; i <= totalRow; i++) {
			
			String xpathGateName = System_Data_Tab.TABLE_LINK_GATES_CENTRAL_GATENAME.replace("CENTRALNUMBER", String.valueOf(numberCentral)).replace("GATENUMBER", String.valueOf(i));
			String gateNameText = CommonUtils.getTableData(driver, timeWait, xpathGateName);
			System.out.println(">>> row " + i + ": " + gateNameText);
			if (gateName.equals(gateNameText)) {
				rowNumber = i;				
				System.out.println(">>> '" + gateName + "' is present at row " + rowNumber + " in the table\n");
				break;
			}
		}
		
		System.out.println("\n>>> The gate '" + gateName + "' is present at row " + rowNumber + " in the table\n");		
		return rowNumber;
	}
	
	public static boolean Create_Online_Plant_Full_Configuration(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait, int imageLoadWait, String plantName, Document doc, boolean systemVDE, boolean devidedVDE) {
		
		boolean isCreated = false;
		//String CONTROL_UNIT_NAME = CommonUtils.getElementsByTagName(doc, "GATE_1", "CONTROL_UNIT");
		String GATEWAY_NAME = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_NAME_1");
		String GATEWAY_FW_VERSION = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_FW_VERSION_1");
		String GATEWAY_SERIAL_NUMBER = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_SERIAL_NUMBER_1");
		//String GATEWAY_SERIAL_NUMBER = "321A54C1";
		
		String pwd = "12345";
		//String groupName = CommonUtils.getElementsByTagName(doc, "TIMEBAND_GROUPS", "TIMEBAND_GROUP_NAME");
		
		String BUILDING_NAME_1 = CommonUtils.getElementsByTagName(doc, "REAL_BUILDING_1", "BUILDING_NAME");
		String BUILDING_NAME_2 = CommonUtils.getElementsByTagName(doc, "REAL_BUILDING_2", "BUILDING_NAME");
		String NUMBER_OF_APARTMENT_BUILDING_1 = CommonUtils.getElementsByTagName(doc, "REAL_BUILDING_1", "NUMBER_APARTMENTS_OF_BUILDING");
		String NUMBER_OF_APARTMENT_BUILDING_2 = CommonUtils.getElementsByTagName(doc, "REAL_BUILDING_2", "NUMBER_APARTMENTS_OF_BUILDING");
		String BUILDING_1_NUMBER_OF_FLOORS = CommonUtils.getElementsByTagName(doc, "REAL_BUILDING_1", "NUMBER_FLOORS");
		String BUILDING_1_FLOOR_NUMBER_OF_APARTMENTS = CommonUtils.getElementsByTagName(doc, "REAL_BUILDING_1", "NUMBER_APARTMENTS_OF_FLOOR");
		String BUILDING_2_NUMBER_OF_FLOORS = CommonUtils.getElementsByTagName(doc, "REAL_BUILDING_2", "NUMBER_FLOORS");
		String BUILDING_2_FLOOR_NUMBER_OF_APARTMENTS = CommonUtils.getElementsByTagName(doc, "REAL_BUILDING_2", "NUMBER_APARTMENTS_OF_FLOOR");
				
		try {

			if (systemVDE == true)
				System.out.println("\n[Create_Online_Plant] Include VDE? --> YES");
			else
				System.out.println("\n[Create_Online_Plant] Include VDE? --> NO");

			if (devidedVDE == true)
				System.out.println("\n[Create_Online_Plant] Devide VDE? --> YES");
			else
				System.out.println("\n[Create_Online_Plant] Devide VDE? --> NO");

			Go_To_New_Site_Page(driver, timeWait);
			
			// page "General Info"
			InputInfo(driver, timeWait, plantName, doc);
			
			CommonUtils.clickElement(driver, timeWait, Page_Site_New.BUTTON_SAVE_NEXT, "<button> Save & Next");
			Utilities.Delay(pageLoadWait);
			
			// page 'Installation Type'
			Setup_Installation_Type(driver, timeWait, systemVDE, devidedVDE, true);

			//~~~~~~~~~~~~~~~~~ page 'Buildings/Risers'			
			// Configure Building 1
			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.INPUT_NAME_OF_THE_BUILDING, 0), "<input> Building Name 1", BUILDING_NAME_1);
			CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.SELECT_NUMBER_OF_APARTMENT, 0), "<dropbox> Number of Apartments", NUMBER_OF_APARTMENT_BUILDING_1);
						
			// Add 1 Building
			CommonUtils.clickElement(driver, timeWait, Structure_Definition_Tab.BUTTON_ADD_BUILDING, "<button> Add Buildings");
			
			// Configure Building 2
			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.INPUT_NAME_OF_THE_BUILDING, 1), "<input> Building Name 1", BUILDING_NAME_2);
			CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.SELECT_NUMBER_OF_APARTMENT, 1), "<dropbox> Number of Apartments", NUMBER_OF_APARTMENT_BUILDING_2);
			
			CommonUtils.clickElement(driver, timeWait, Structure_Definition_Tab.BUTTON_SAVE_NEXT_TAB_STRUCTURE, "<button> Save & Next");
			Utilities.Delay(pageLoadWait);

			//~~~~~~~~~~~~~~~~~ page 'Floors'
			// Configure Floor 1 
			CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.DROPBOX_BUILDING_NUM_FLOORS, 0), "<dropbox> Number of Floors B0", BUILDING_1_NUMBER_OF_FLOORS);
			CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.DROPBOX_BUILDING_NUM_APARTMENTS, 0), "<dropbox> Number of Apartments F0", BUILDING_1_FLOOR_NUMBER_OF_APARTMENTS);

			// Configure Floor 2
			CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.DROPBOX_BUILDING_NUM_FLOORS, 1), "<dropbox> Number of Floors B1", BUILDING_2_NUMBER_OF_FLOORS);
			CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.DROPBOX_BUILDING_NUM_APARTMENTS, 1), "<dropbox> Number of Apartments F1", BUILDING_2_FLOOR_NUMBER_OF_APARTMENTS);
			
			CommonUtils.clickElement(driver, timeWait, Structure_Definition_Tab.BUTTON_SAVE_NEXT_FLOORS, "<button> Save & Next");
			Utilities.Delay(pageLoadWait);

			//~~~~~~~~~~~~~~~~~ page Gates
			int totalGates = Integer.valueOf(CommonUtils.getElementsByTagName(doc, "REAL_GATES", "NUMBER_REAL_GATE"));	
			
			for(int i = 0; i < totalGates; i++) {
				
				String gateOrder = String.valueOf(i + 1);
				String GATE_NAME = CommonUtils.getElementsByTagName(doc, "REAL_GATE_" + gateOrder, "GATE_NAME");
				String GATE_INSTALLED_ON = CommonUtils.getElementsByTagName(doc, "REAL_GATE_" + gateOrder, "INSTALLED_ON");
				String GATE_DDN_OPTION = CommonUtils.getElementsByTagName(doc, "REAL_GATE_" + gateOrder, "DDN");
				String GATE_VIGIK_OPTION = CommonUtils.getElementsByTagName(doc, "REAL_GATE_" + gateOrder, "VIGIK");
				String GATE_KEYPAD_OPTION = CommonUtils.getElementsByTagName(doc, "REAL_GATE_" + gateOrder, "KEYPAD");
				String GATE_BADGE_OPTION = CommonUtils.getElementsByTagName(doc, "REAL_GATE_" + gateOrder, "BADGE");
				String GATE_RADIO_OPTION = CommonUtils.getElementsByTagName(doc, "REAL_GATE_" + gateOrder, "RADIO");
				
				System.out.println("Configure Gate " + gateOrder + ":");         
	            // Gate's name
	            CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Gates_Tab.GATES_NAME, i), "<input> Name", GATE_NAME);
	            
	            // Gate's type
	            CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Gates_Tab.BUS, i), "<dropbox> Bus", GATE_INSTALLED_ON);
	    		
				// Gate's elements
				if ("Yes".equals(GATE_DDN_OPTION)) {
					String DDN_TYPE = CommonUtils.getElementsByTagName(doc, "REAL_GATE_" + gateOrder, "DDN_TYPE");
					
					CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_DDN, i), "<checkbox> DDN");
					CommonUtils.waitForVisible(timeWait, Gates_Tab.DDN_SELECTION);
					if ("Nouvelle Sfera".equals(DDN_TYPE)) {
						CommonUtils.clickElement(driver, timeWait, Gates_Tab.DDN_OPTION_1, "ddnSelection");
					} else if ("Sfera Classic".equals(DDN_TYPE)) {
						CommonUtils.clickElement(driver, timeWait, Gates_Tab.DDN_OPTION_0, "ddnSelection");
					} else if ("Linea300".equals(DDN_TYPE)) {
						CommonUtils.clickElement(driver, timeWait, Gates_Tab.DDN_OPTION_2, "ddnSelection");
					} else {
						System.out.println("\nWrong type of DDN. Not found type named '" + DDN_TYPE + "'");					
					}
					Utilities.Delay(1);
				}
				
				if ("Yes".equals(GATE_VIGIK_OPTION)) {					
					CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_VIGIK_READER, i), "<checkbox> Vigik Reader");
					Utilities.Delay(1);
				}
							
				if ("Yes".equals(GATE_KEYPAD_OPTION)) {
					CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_KEYPAD, i), "<checkbox> KeyPad");
					Utilities.Delay(1);
				}
				
				if ("Yes".equals(GATE_BADGE_OPTION)) {
					CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_BADGE_READER, i), "<checkbox> Badge Reader");
					Utilities.Delay(1);
				}
				
				if ("Yes".equals(GATE_RADIO_OPTION)) {
					CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_RADIO_READER, i), "<checkbox> Radio Reader");
					Utilities.Delay(1);
				}
				
				if (i < totalGates - 1) {
					CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_ADD_GATE, "Add Gate");
					Utilities.Delay(popupLoadWait);
				}
			}
			
			CommonUtils.Scroll_Page_To_End_Page(driver);
			
			// Click Save & Next
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_SAVE_NEXT_GATE, "<button> Save & Next");
			Utilities.Delay(pageLoadWait);
			
			//~~~~~~~~~~~~~~~~~ page 'Gates and Buildings/Risers'
			int totalBuildings = Integer.valueOf(CommonUtils.getElementsByTagName(doc, "REAL_BUILDING", "NUMBER_REAL_BUILDING"));	
			HashMap<String, String> listGates = Load_All_Gates_From_Config_File();
					
			for(int i = 0; i < totalBuildings; i++) {
				
				String buildingOrder = String.valueOf(i + 1);
				String buildingNumber = String.valueOf(i);
				
				String buttonLinkGates = CommonUtils.setNumber(Gates_Tab.BUTTON_LINK_GATES_BUILDING, i + 1);
				String popupLinkGates = CommonUtils.setNumber(Gates_Tab.POPUP_LINK_GATES_BUILDING, i);
				String buttonConfirm = CommonUtils.setNumber(Gates_Tab.BUTTON_OK_GATES_BUILDING, i);
				
				String[] associatedGates = CommonUtils.getElementsByTagName(doc, "REAL_BUILDING_" + buildingOrder, "ASSOCIATED_GATES").split(",");
							
				CommonUtils.clickElement(driver, timeWait, buttonLinkGates, "<button> Link Gates " + String.valueOf(buildingOrder));
				Utilities.Delay(popupLoadWait);
				CommonUtils.waitForVisible(timeWait, popupLinkGates);
				for(String gateNumber : associatedGates)
				{
					String gateName = listGates.get(gateNumber);				
					int gateOrder = Get_Row_Number_By_Gate_Name_For_Building(i, gateName) - 1;
					
					String checkboxBuildingGate = Gates_Tab.CHECKBOX_GATES_BUILDING.replace("BUILDINGNUMBER", buildingNumber).replace("GATENUMBER", String.valueOf(gateOrder));
					
					System.out.println("tick " + gateName + "; row " + (gateOrder + 1) + "; xpath: " + checkboxBuildingGate);
					
					CommonUtils.clickElement(driver, timeWait, checkboxBuildingGate, "<checkbox> Gate " + gateNumber);
					Utilities.Delay(1);
				}			
				CommonUtils.clickElement(driver, timeWait, buttonConfirm, "<button> OK");
				CommonUtils.waitForNoVisible(timeWait, popupLinkGates);
				Utilities.Delay(popupLoadWait);
			}
			
			CommonUtils.Scroll_Page_To_End_Page(driver);

			// Click Save & Next
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_GATES_BUILDINGS_SAVE_NEXT, "<button> Save & Next");
			Utilities.Delay(pageLoadWait);
			
			//~~~~~~~~~~~~~~~~~ page 'Control Unit'			
			int totalCentrals = Integer.valueOf(CommonUtils.getElementsByTagName(doc, "REAL_CENTRAL", "NUMBER_REAL_CENTRAL"));	
			
			for(int i = 0; i < totalCentrals; i++) {
				
				String centralOrder = String.valueOf(i + 1);
				String CENTRAL_NAME = CommonUtils.getElementsByTagName(doc, "REAL_CENTRAL_" + centralOrder, "CENTRAL_NAME");
				String ADDRESS_C1C0 = CommonUtils.getElementsByTagName(doc, "REAL_CENTRAL_" + centralOrder, "ADDRESS_C1C0");
				
				CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, i), "Central's Name", CENTRAL_NAME);
				CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.SELECT_CONTROL_UNIT_ADDRESS, i), "Address C1C0", ADDRESS_C1C0);
							
				if (i < totalCentrals - 1) {
					CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_ADD_CONTROL_UNIT, "<button> Add Central");
					Utilities.Delay(pageLoadWait);
				}
			}
					
			for(int i = 0; i < totalCentrals; i++) {
				
				String centralNumber = String.valueOf(i);
				String centralOrder = String.valueOf(i + 1);		
				String buttonLinkGates = CommonUtils.setNumber(System_Data_Tab.BUTTON_LINK_GATES_CENTRAL, i + 1);
				String popupLinkGates = CommonUtils.setNumber(System_Data_Tab.POPUP_LINK_GATES_CENTRAL, i);
				String buttonConfirm = CommonUtils.setNumber(System_Data_Tab.BUTTON_CONFIRM_GATES_CENTRAL, i);
				
				String[] associatedGates = CommonUtils.getElementsByTagName(doc, "REAL_CENTRAL_" + centralOrder, "ASSOCIATED_GATES").split(",");
				
				CommonUtils.clickElement(driver, timeWait, buttonLinkGates, "<button> Link Gates  " + String.valueOf(centralOrder));
				Utilities.Delay(popupLoadWait);
				CommonUtils.waitForVisible(timeWait, popupLinkGates);
				for(String gateNumber : associatedGates)
				{
					String gateName = listGates.get(gateNumber);
					int gateOrder = Get_Row_Number_By_Gate_Name_For_Central(i, gateName) - 1;
					
					String checkboxBuildingGate = System_Data_Tab.CHECKBOX_GATES_CENTRAL.replace("CENTRALNUMBER", centralNumber).replace("GATENUMBER", String.valueOf(gateOrder));
					
					System.out.println("tick " + gateName + "; row " + (gateOrder + 1) + "; xpath: " + checkboxBuildingGate);
					
					CommonUtils.clickElement(driver, timeWait, checkboxBuildingGate, "<checkbox> select " + gateName);
					Utilities.Delay(1);
				}			
				CommonUtils.clickElement(driver, timeWait, buttonConfirm, "<button> OK");
				CommonUtils.waitForNoVisible(timeWait, popupLinkGates);
				Utilities.Delay(popupLoadWait);
			}
			
			// Click Save & Next
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Button Save & Next");
			Utilities.Delay(pageLoadWait);

			//~~~~~~~~~~~~~~~~ page 'Gateway'
			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Gateway's name", GATEWAY_NAME);
						
			// Click Link Gates
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_GATE_WAY_LINK_GATE, "Link Gates");
			Utilities.Delay(popupLoadWait);

			CommonUtils.waitForVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_ALL, "<checkbox> All Gates");
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK, "Button OK");
			CommonUtils.waitForNoVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
			
			// Click Save & Next
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Button Save & Next");
			Utilities.Delay(pageLoadWait);
			
			//~~~~~~~~~~~~~~~~~~ page 'System Address'		
			System.out.println("[Gateway] Verion Firmware: " + GATEWAY_FW_VERSION);
			System.out.println("[Gateway] Serial Device Number: " + GATEWAY_SERIAL_NUMBER);

			CommonUtils.typeText(driver, timeWait, System_Address_Tab.Gateway_FW_VER, "Verion Firmware", GATEWAY_FW_VERSION);

			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATEWAY_SERIAL_NUMBER, "Serial Device Number", GATEWAY_SERIAL_NUMBER);
			
			// Set addresses
			String CONTROL_1_ADDRESS_C1C0 = CommonUtils.getElementsByTagName(doc, "REAL_CENTRAL_1", "ADDRESS_C1C0");
			String CONTROL_1_ADDRESS_P = CommonUtils.getElementsByTagName(doc, "REAL_CENTRAL_1", "ADDRESS_P");
			
			String CONTROL_2_ADDRESS_C1C0 = CommonUtils.getElementsByTagName(doc, "REAL_CENTRAL_2", "ADDRESS_C1C0");
			String CONTROL_2_ADDRESS_P = CommonUtils.getElementsByTagName(doc, "REAL_CENTRAL_2", "ADDRESS_P");
			
			String CONTROL_3_ADDRESS_C1C0 = CommonUtils.getElementsByTagName(doc, "REAL_CENTRAL_3", "ADDRESS_C1C0");
			String CONTROL_3_ADDRESS_P = CommonUtils.getElementsByTagName(doc, "REAL_CENTRAL_3", "ADDRESS_P");
			
			String GATE_1_ADDRESS_P = CommonUtils.getElementsByTagName(doc, "REAL_GATE_1", "DDN_ADDRESS_P");
//			String GATE_1_VIGIK_ADDRESS_AB = CommonUtils.getElementsByTagName(doc, "REAL_GATE_1", "VIGIK_ADDRESS_AB");
//			String GATE_1_VIGIK_ADDRESS_C = CommonUtils.getElementsByTagName(doc, "REAL_GATE_1", "VIGIK_ADDRESS_C");
//			String GATE_1_KEYPAD_ADDRESS_AB = CommonUtils.getElementsByTagName(doc, "REAL_GATE_1", "KEYPAD_ADDRESS_AB");
//			String GATE_1_KEYPAD_ADDRESS_C = CommonUtils.getElementsByTagName(doc, "REAL_GATE_1", "KEYPAD_ADDRESS_C");
			
			String GATE_2_ADDRESS_P = CommonUtils.getElementsByTagName(doc, "REAL_GATE_2", "DDN_ADDRESS_P");
//			String GATE_2_VIGIK_ADDRESS_AB = CommonUtils.getElementsByTagName(doc, "REAL_GATE_2", "VIGIK_ADDRESS_AB");
//			String GATE_2_VIGIK_ADDRESS_C = CommonUtils.getElementsByTagName(doc, "REAL_GATE_2", "VIGIK_ADDRESS_C");
			
//			String GATE_3_KEYPAD_ADDRESS_AB = CommonUtils.getElementsByTagName(doc, "REAL_GATE_3", "KEYPAD_ADDRESS_AB");
			String GATE_3_KEYPAD_ADDRESS_C = CommonUtils.getElementsByTagName(doc, "REAL_GATE_3", "KEYPAD_ADDRESS_C");
			
			String GATE_4_ADDRESS_P = CommonUtils.getElementsByTagName(doc, "REAL_GATE_4", "DDN_ADDRESS_P");
//			String GATE_4_VIGIK_ADDRESS_AB = CommonUtils.getElementsByTagName(doc, "REAL_GATE_4", "VIGIK_ADDRESS_AB");
//			String GATE_4_VIGIK_ADDRESS_C = CommonUtils.getElementsByTagName(doc, "REAL_GATE_4", "VIGIK_ADDRESS_C");
			
//			String GATE_5_RADIO_ADDRESS_AB = CommonUtils.getElementsByTagName(doc, "REAL_GATE_5", "RADIO_ADDRESS_AB");
			String GATE_5_RADIO_ADDRESS_C = CommonUtils.getElementsByTagName(doc, "REAL_GATE_5", "RADIO_ADDRESS_C");
			
//			String GATE_6_BADGE_ADDRESS_AB = CommonUtils.getElementsByTagName(doc, "REAL_GATE_6", "BADGE_ADDRESS_AB");
			String GATE_6_BADGE_ADDRESS_C = CommonUtils.getElementsByTagName(doc, "REAL_GATE_6", "BADGE_ADDRESS_C");
			
			// Click Central (Control Unit)		
			String central = System_Address_Tab.LABEL_CENTRAL.replace("{GATEWAYNAME}", GATEWAY_NAME);
			CommonUtils.clickElement(driver, timeWait, central, "<label> Control Unit");
			CommonUtils.waitPageIsReady(driver, "System Address");
			
			CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.CONTROL_1_ADDRESS_C1C0, "<central 1> Address C1C0", CONTROL_1_ADDRESS_C1C0);
			CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.CONTROL_1_ADDRESS_P, "<central 1> Address P", CONTROL_1_ADDRESS_P);
			
			CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.CONTROL_2_ADDRESS_C1C0, "<central 2> Address C1C0", CONTROL_2_ADDRESS_C1C0);
			CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.CONTROL_2_ADDRESS_P, "<central 2> Address P", CONTROL_2_ADDRESS_P);
			
			CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.CONTROL_3_ADDRESS_C1C0, "<central 3> Address C1C0", CONTROL_3_ADDRESS_C1C0);
			CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.CONTROL_3_ADDRESS_P, "<central 3> Address P", CONTROL_3_ADDRESS_P);
			
			// Click Gates		
			String gate1_backbone = System_Address_Tab.LABEL_GATE_ON_BACKBONE.replace("{GATEWAYNAME}", GATEWAY_NAME).replace("{GATENAME}", listGates.get("1"));
			String gate2_riser_b1 = System_Address_Tab.LABEL_GATE_ON_RISER.replace("{GATEWAYNAME}", GATEWAY_NAME).replace("{BUILDINGNAME}", BUILDING_NAME_1).replace("{GATENAME}", listGates.get("2"));
			String gate3_riser_b1 = System_Address_Tab.LABEL_GATE_ON_RISER.replace("{GATEWAYNAME}", GATEWAY_NAME).replace("{BUILDINGNAME}", BUILDING_NAME_1).replace("{GATENAME}", listGates.get("3"));
			String gate4_riser_b2 = System_Address_Tab.LABEL_GATE_ON_RISER.replace("{GATEWAYNAME}", GATEWAY_NAME).replace("{BUILDINGNAME}", BUILDING_NAME_2).replace("{GATENAME}", listGates.get("4"));
			String gate5_riser_b2 = System_Address_Tab.LABEL_GATE_ON_RISER.replace("{GATEWAYNAME}", GATEWAY_NAME).replace("{BUILDINGNAME}", BUILDING_NAME_2).replace("{GATENAME}", listGates.get("5"));
			String gate6_riser_b2 = System_Address_Tab.LABEL_GATE_ON_RISER.replace("{GATEWAYNAME}", GATEWAY_NAME).replace("{BUILDINGNAME}", BUILDING_NAME_2).replace("{GATENAME}", listGates.get("6"));
			
			// Gate 1
			CommonUtils.clickElement(driver, timeWait, gate1_backbone, "<label> Gate 1 backbone");
			CommonUtils.waitPageIsReady(driver, "System Address");
			CommonUtils.Scroll_Page_To_End_Page(driver);
			CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.GATE_1_DDN_ADDRESS_P, "<gate 1> DDN P", GATE_1_ADDRESS_P);
//			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATE_1_KEYPAD_ADDRESS_AB, "<gate 1> KeyPad AB", GATE_1_KEYPAD_ADDRESS_AB);
//			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATE_1_KEYPAD_ADDRESS_C, "<gate 1> KeyPad C", GATE_1_KEYPAD_ADDRESS_C);
//			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATE_1_VIGIK_ADDRESS_AB, "<gate 1> Vigik AB", GATE_1_VIGIK_ADDRESS_AB);
//			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATE_1_VIGIK_ADDRESS_C, "<gate 1> Vigik C", GATE_1_VIGIK_ADDRESS_C);		
			
			// Gate 2
			CommonUtils.clickElement(driver, timeWait, gate2_riser_b1, "<label> Gate 2 building/riser1");
			CommonUtils.waitPageIsReady(driver, "System Address");	
			CommonUtils.Scroll_Page_To_End_Page(driver);
			CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.GATE_2_DDN_ADDRESS_P, "<gate 2> DDN P", GATE_2_ADDRESS_P);
//			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATE_2_VIGIK_ADDRESS_AB, "<gate 2> Vigik AB", GATE_2_VIGIK_ADDRESS_AB);
//			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATE_2_VIGIK_ADDRESS_C, "<gate 2> Vigik C", GATE_2_VIGIK_ADDRESS_C);	
			
			// Gate 3
			CommonUtils.clickElement(driver, timeWait, gate3_riser_b1, "<label> Gate 3 building/riser1");
			CommonUtils.waitPageIsReady(driver, "System Address");
			CommonUtils.Scroll_Page_To_End_Page(driver);
//			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATE_3_KEYPAD_ADDRESS_AB, "<gate 3> KeyPad AB", GATE_3_KEYPAD_ADDRESS_AB);
			CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.GATE_3_KEYPAD_ADDRESS_C, "<gate 3> KeyPad C", GATE_3_KEYPAD_ADDRESS_C);
					
			// Gate 4
			CommonUtils.clickElement(driver, timeWait, gate4_riser_b2, "<label> Gate 4 building/riser2");
			CommonUtils.waitPageIsReady(driver, "System Address");
			CommonUtils.Scroll_Page_To_End_Page(driver);
			CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.GATE_4_DDN_ADDRESS_P, "<gate 4> DDN P", GATE_4_ADDRESS_P);
//			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATE_4_VIGIK_ADDRESS_AB, "<gate 4> Vigik AB", GATE_4_VIGIK_ADDRESS_AB);
//			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATE_4_VIGIK_ADDRESS_C, "<gate 4> Vigik C", GATE_4_VIGIK_ADDRESS_C);
			
			// Gate 5
			CommonUtils.clickElement(driver, timeWait, gate5_riser_b2, "<label> Gate 5 building/riser2");
			CommonUtils.waitPageIsReady(driver, "System Address");
			CommonUtils.Scroll_Page_To_End_Page(driver);
//			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATE_5_RADIO_ADDRESS_AB, "<gate 5> Radio AB", GATE_5_RADIO_ADDRESS_AB);
			CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.GATE_5_RADIO_ADDRESS_C, "<gate 5> Radio C", GATE_5_RADIO_ADDRESS_C);
			
			// Gate 6
			CommonUtils.clickElement(driver, timeWait, gate6_riser_b2, "<label> Gate 6 building/riser2");
			CommonUtils.waitPageIsReady(driver, "System Address");
			CommonUtils.Scroll_Page_To_End_Page(driver);
//			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATE_6_BADGE_ADDRESS_AB, "<gate 6> Radio AB", GATE_6_BADGE_ADDRESS_AB);
			CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.GATE_6_BADGE_ADDRESS_C, "<gate 6> Radio C", GATE_6_BADGE_ADDRESS_C);
						
			//~~~~~~~~~~~~~~~~ Click 'Validate Project' button
			CommonUtils.clickElement(driver, timeWait, System_Address_Tab.BUTTON_VALIDATE_PROJECT, "<button> Validate Project");
			Utilities.Delay(pageLoadWait);	
			
			// Click Activate Project			
			CommonUtils.clickElement(driver, timeWait, Project_Activation_Tab.BUTTON_ACTIVATE_PROJECT, "<button> Activate Project");
			Utilities.Delay(pageLoadWait);	
			
			// Finalize 'Gateways' page with Site's password			
			String siteID = CommonUtils.getInputText(driver, timeWait, Gateways_Tab.Site_ID_ONLINE);
			System.out.println("Site's ID (generated): " + siteID);
			CommonUtils.typeText(driver, timeWait, Gateways_Tab.INPUT_Site_Password_ONLINE, "Site Password", pwd);
			
			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_NEXT_ONLINE, "<button> Save & Next");
			Utilities.Delay(pageLoadWait);	
			CommonUtils.waitForVisible(timeWait, Gateways_Tab.POPUP_IMPORT_PROGRAMMER);
			
			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_INITIALIZE, "<button> Initialize");
			CommonUtils.waitForVisible(timeWait, Gateways_Tab.DIALOG);
			CommonUtils.clickElement(driver, timeWait, Gateways_Tab.CLOSE_DIALOG, "<button> Close");
			Utilities.Delay(pageLoadWait);	

			// Verify 'Plant Testing' page
			if (Utilities.Verify_Page(driver, timeWait, "Plant testing", Plant_Testing_Tab.LI_PLANTESTING)) {
				int i = 0;
				boolean createSuccess = false;
				while (i <= 65) {
					i += 1;
					Utilities.Delay(60);
					CommonUtils.refreshPage(driver, "Plant testing");

					if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.GREEN_MAIN_BULLET) == true) {
						System.out.println("[MAIN PANEL] is GREEN !");
						createSuccess = true;
						i = 100;	//break
					} else {
						System.out.println("Gateway has not called after " + i + " minutes...");
					}
					
					if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.RED_MAIN_BULLET) == true) {
						System.out.println("[MAIN PANEL] is RED ! Some Error occurs");
						Assert.fail();
					}
				}

				if (createSuccess == true) {
					System.out.println("PLANT '" + plantName + "' IS CREATED SUCCESSFULLY");
					isCreated = true;
				} else {
					System.out.println("[ERROR] PLANT: '" + plantName + "' CANNOT CONNECT TO GATEWAY");
					isCreated = false;
					Assert.fail();
				}
			}

		} catch (Exception e) {
			System.out.println("[ERROR] FAILED TO CREATE PLANT: '" + plantName);
			isCreated = false;
		}

//		// Now in 'Plant testing' page
//		if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.SETTINGS_link)) {
//			CommonUtils.clickElement(driver, timeWait, Plant_Testing_Tab.SETTINGS_link, "SETTINGS hyperlink");	
//			Utilities.Delay(pageLoadWait);	
//		}
//				
//		CommonUtils.waitPageIsReady(driver, "Settings");
//		
//		// Click Add Radio Group
//		CommonUtils.clickElement(driver, timeWait, Settings_Tab.BUTTON_Add_Radio_group, "<button> Add Radio Group");
//		CommonUtils.typeText(driver, timeWait, Settings_Tab.INPUT_Radio_Group, "Radio Group Name", groupName);
//		CommonUtils.clickElement(driver, timeWait, Settings_Tab.BUTTON_Save, "<button> Save");
//		CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Settings_Tab.SELECT_Button_Right, 1), "Choose button right ", GATES_NAME);
//		CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Settings_Tab.SELECT_Button_Left, 1), "Choose button right ", GATES_NAME);
//		
//		// Enable Time bands
//		CommonUtils.clickElement(driver, timeWait, Settings_Tab.RADIO_Time_bands_Yes, "<radio> Enable Time-bands");
//		
//		// Click Confirm Settings
//		if (CommonUtils.checkElement(driver, timeWait, Settings_Tab.BUTTON_CONFIRM_SETTINGS_HUNG)) {
//			CommonUtils.clickElement(driver, timeWait, Settings_Tab.BUTTON_CONFIRM_SETTINGS_HUNG, "<button> Confirm Settings");	
//			Utilities.Delay(pageLoadWait);	
//		}
//		
//		CommonUtils.waitPageIsReady(driver, "Settings");
//		
//		// Now go to home-page
//		Go_To_Home_Page(driver, timeWait);
		
		return isCreated;
	}
	
	public static boolean Create_Plant_With_Customize_With_Vigik(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait,
			int imageLoadWait, String plantName, Document doc, boolean systemVDE, boolean devidedVDE, boolean serviceOnline) {
		
		System.out.println("\n[Create_Plant_With_Customize_With_Vigik] Start");
		
		boolean isCreated = false;
		try {
			
			if (serviceOnline == true)
				System.out.println("[Create_Plant_With_Customize] Plant type: ONLINE");
			else
				System.out.println("[Create_Plant_With_Customize] Plant type: LOCAL");

			if (systemVDE == true)
				System.out.println("[Create_Plant_With_Customize] Include VDE? --> YES");
			else
				System.out.println("[Create_Plant_With_Customize] Include VDE? --> NO");

			if (devidedVDE == true)
				System.out.println("[Create_Plant_With_Customize] Devide VDE? --> YES");
			else
				System.out.println("[Create_Plant_With_Customize] Devide VDE? --> NO");

			Go_To_New_Site_Page(driver, timeWait);
			
			// page "General Info"
			InputInfo(driver, timeWait, plantName, doc);
			
			CommonUtils.clickElement(driver, timeWait, Page_Site_New.BUTTON_SAVE_NEXT, "Save & Next");
			Utilities.Delay(pageLoadWait);
			
			// page 'Installation Type'
			Setup_Installation_Type(driver, timeWait, systemVDE, devidedVDE, serviceOnline);

			// page 'Buildings/Risers'
			String BUILDING_NAME = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "BUILDING_NAME_1");
			String APARTMENT_COUNT = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "NUMBER_OF_APARTMENTS_OF_BUILDING");
			Definition_Number_Buildings_And_Number_Of_Apartments(driver, timeWait, BUILDING_NAME, APARTMENT_COUNT);

			// page 'Floors' page (if needed)
			if (systemVDE == true) {	//The access control system will manage the readers, video door entry system and external panel address book.
				String NUMBER_OF_FLOORS = CommonUtils.getElementsByTagName(doc, "FLOORS", "NUMBER_OF_FLOORS");
				String NUMBER_OF_APARTMENTS = CommonUtils.getElementsByTagName(doc, "APARTMENTS", "NUMBER_OF_APARTMENTS");
				CreatePlant.Distribution_Of_Apartments(driver, timeWait, NUMBER_OF_FLOORS, NUMBER_OF_APARTMENTS);
			}

			// page 'Gates'
			String GATES_NAME = CommonUtils.getElementsByTagName(doc, "GATES", "GATE_NAME_1");
			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Gates_Tab.GATES_NAME, 0), "Name Gate", GATES_NAME);

			// Choose DDN
			if (systemVDE == true) {//The access control system will manage the readers, video door entry system and external panel address book.
				CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_DDN, 0), "DDN");
				CommonUtils.waitForVisible(timeWait, Gates_Tab.DDN_SELECTION);
				CommonUtils.clickElement(driver, timeWait, Gates_Tab.DDN_OPTION_2, "choose 'Linea300 - DDN'");
				//CommonUtils.clickElement(driver, timeWait, Gates_Tab.DDN_OPTION_1, "choose 'Nouvelle Sfera - DDN'");
			}
			// Add Vigik
			CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_VIGIK_READER, 0), "Vigik reader");
			
			
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_SAVE_NEXT_GATE, "Save&Next");
			Utilities.Delay(pageLoadWait);
			CommonUtils.VerifyPage(driver, timeWait, "Gates and Buildings/Risers", Gates_Tab.LI_GATES_BUILDINGS_RISERS_TAB);
			
			// page 'Gates and Buildings/Risers'
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_LINK_GATES, "Link Gates");
			Utilities.Delay(popupLoadWait);
			
			CommonUtils.waitForVisible(timeWait, Gates_Tab.POPUP_SELECT_GATE);
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.CHECKBOX_1, "CheckBox 1");
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_OK_GATES, "OK");
			CommonUtils.waitForNoVisible(timeWait, Gates_Tab.POPUP_SELECT_GATE);

			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_GATES_BUILDINGS_SAVE_NEXT, "Save & Next");
			Utilities.Delay(pageLoadWait);
			CommonUtils.VerifyPage(driver, timeWait, "Control Unit", System_Data_Tab.LI_CONTROL_UNIT);
			
			// page 'Control Unit'
			String CONTROL_UNIT_NAME = CommonUtils.getElementsByTagName(doc, "GATE_1", "CONTROL_UNIT");
			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Control Unit Name", CONTROL_UNIT_NAME);
			
			CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.SELECT_CONTROL_UNIT_ADDRESS, 0), "Control Unit Address", "0");
			
			CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.BUTTON_CONTROL_UNIT_LINK_GATES, 0), "Link Gates");
			Utilities.Delay(popupLoadWait);
			
			CommonUtils.waitForVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_1, "CheckBox 1");
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK_GATES, "OK");
			CommonUtils.waitForNoVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Save & Next");
			Utilities.Delay(pageLoadWait);

			// page 'Gateway'
			if (serviceOnline == true) // If ONLINE type
			{
				String GATEWAY_NAME = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_NAME_1");

				CommonUtils.VerifyPage(driver, timeWait, "Gateway", System_Data_Tab.LI_GATE_WAY);
				CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Gateway Name", GATEWAY_NAME);
				CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_GATE_WAY_LINK_GATE, "Link Gates");
				CommonUtils.waitForVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
				CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_1, "Check Box Select Gate");
				CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK, "Button OK");
				CommonUtils.waitForNoVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
				
				CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Button Save&Next");
				Utilities.Delay(pageLoadWait);
				CommonUtils.VerifyPage(driver, timeWait, "System Address", System_Address_Tab.LI_SYSTEM_ADDRESS);
			}

			// page 'System Address'
			if (serviceOnline == true) { // ONLINE plant type
				String GATEWAY_FW_VERSION = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_FW_VERSION_1");
				String GATEWAY_SERIAL_NUMBER = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_SERIAL_NUMBER_1");
				
				System.out.println("\n[Gateway Verion Firmware] = " + GATEWAY_FW_VERSION);
				System.out.println("[Gateway Serial Device Number] = " + GATEWAY_SERIAL_NUMBER);

				CommonUtils.typeText(driver, timeWait, System_Address_Tab.Gateway_FW_VER, "Verion Firmware", GATEWAY_FW_VERSION);
				CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATEWAY_SERIAL_NUMBER, "Serial Device Number", GATEWAY_SERIAL_NUMBER);
			}

			// Click 'Validate Project' button
			CommonUtils.clickElement(driver, timeWait, System_Address_Tab.BUTTON_VALIDATE_PROJECT, "Validate Project");
			
			// Click Activate Project
			if (Utilities.Verify_Page(driver, timeWait, "Project Activation", Project_Activation_Tab.LI_CONTROL_UNIT))
				CommonUtils.clickElement(driver, timeWait, Project_Activation_Tab.BUTTON_ACTIVATE_PROJECT, "Activate Project");

			// Finalize 'Gateways' page with Site's password
			if (serviceOnline == true) {
				String siteID = CommonUtils.getInputText(driver, timeWait, Gateways_Tab.Site_ID_ONLINE);
				System.out.println("Site's ID (generated): " + siteID);
				CommonUtils.typeText(driver, timeWait, Gateways_Tab.INPUT_Site_Password_ONLINE, "Site Password", "12345");
				CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_NEXT_ONLINE, "Save & Next");
				CommonUtils.waitForVisible(timeWait, Gateways_Tab.POPUP_IMPORT_PROGRAMMER);
				CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_INITIALIZE, "Initialize");
				CommonUtils.waitForVisible(timeWait, Gateways_Tab.DIALOG);
				CommonUtils.clickElement(driver, timeWait, Gateways_Tab.CLOSE_DIALOG, "close");

				System.out.println("\n[Create_Plant_With_Customize] Plant is created");
			}

			// Verify 'Plant Testing' page
			CommonUtils.waitPageIsReady(driver, "Plant testing");
			if (Utilities.Verify_Page(driver, timeWait, "Plant testing", Plant_Testing_Tab.LI_PLANTESTING)) {
				int i = 0;
				boolean createSuccess = false;
				while (i <= 65) {
					i += 1;
					Utilities.Delay(60);
					CommonUtils.refreshPage(driver, "Plant testing");

					if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.GREEN_MAIN_BULLET) == true) {
						System.out.println("[MAIN PANEL] is GREEN !");
						createSuccess = true;
						i = 100;	//break
					} else {
						System.out.println("Gateway has not called after " + i + " minutes...");
					}
					
					if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.RED_MAIN_BULLET) == true) {
						System.out.println("[MAIN PANEL] is RED ! Some Error occurs");
						Assert.fail();
					}
				}

				if (createSuccess == true) {
					System.out.println("PLANT '" + plantName + "' IS CREATED SUCCESSFULLY");
					isCreated = true;
				} else {
					System.out.println("[ERROR] PLANT: '" + plantName + "' CANNOT CONNECT TO GATEWAY");
					isCreated = false;
					Assert.fail();
				}
			}

		} catch (Exception e) {
			System.out.println("[ERROR] FAILED TO CREATE PLANT: '" + plantName);
			isCreated = false;
		}

		// Now in 'Plant testing' page
		if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.SETTINGS_link)) {
			CommonUtils.clickElement(driver, timeWait, Plant_Testing_Tab.SETTINGS_link, "SETTINGS hyperlink");			
		}
				
		CommonUtils.waitPageIsReady(driver, "Settings");
		
		// Click Confirm Settings
		if (CommonUtils.checkElement(driver, timeWait, Settings_Tab.BUTTON_CONFIRM_SETTINGS_HUNG)) {
			CommonUtils.clickElement(driver, timeWait, Settings_Tab.BUTTON_CONFIRM_SETTINGS_HUNG, "Confirm Settings");			
		}
		
		CommonUtils.waitPageIsReady(driver, "Settings");
		Utilities.Delay(pageLoadWait);
				
		System.out.println("\n[Create_Plant_With_Customize_With_Vigik] End");

		return isCreated;
	}
	
	public static void Change_Plant_From_Online_To_Local(AndroidDriver<?> driver, WebDriverWait timeWait, String plantName) {

		// Go to My Project pages		
		CommonUtils.clickGoToHomePage(driver, timeWait, Page_Sites_List.TAB_MY_PROJECT, "TAB_MY_PROJECT");

		//
		// Pre-condition: In the 'My Project' page
		//
		System.out.println("[Change_Plant_From_Online_To_Local] Start");
		
		try {
			// Click 'Project Configuration' icon
			if (Utilities.Verify_Page(driver, timeWait, "My Projects", My_Projects_Tab.LI_CONTROL_UNIT)) {
				String xpathPrjName = My_Projects_Tab.TABLE_PLANT_COL_PROJ_NAME.replace("NUMBER", "2");
				String xpathServType = My_Projects_Tab.TABLE_PLANT_COL_SERV_TYPE.replace("NUMBER", "2");
				String prjName = CommonUtils.getTableData(driver, timeWait, xpathPrjName);
				String servType = CommonUtils.getTableData(driver, timeWait, xpathServType);

				if (plantName.equals(prjName) && "WEB".equals(servType)) {
					System.out.println("[Change_Plant_From_Online_To_Local] Found an ONLINE Plant: " + prjName);
					String expectedXpath = My_Projects_Tab.PROJ_CONF_ICON.replace("NUMBER", "2");
					CommonUtils.clickElement(driver, timeWait, expectedXpath, "Project Configuration");

					// Click 'System Addressing' left-menu-tab
					if (Utilities.Verify_Page(driver, timeWait, "General Info", Page_Site_Detail.LI_General_Info))
						CommonUtils.clickElement(driver, timeWait, Page_Site_Detail.TAB_System_Addressing, "System Addressing");

					// Click DropBox to change from Online to Local plant type
					if (Utilities.Verify_Page(driver, timeWait, "System Address", System_Address_Tab.LI_SYSTEM_ADDRESS))
						CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.DROPBOX_SERVICE_TYPE, "Service Type", "Local Mng");

					// Click 'Change service type' button on the Pop-Up Confirmation
					CommonUtils.waitForVisible(timeWait, System_Address_Tab.POPUP_CONFIRM_CHANGE_SERVCE);
					CommonUtils.clickElement(driver, timeWait, System_Address_Tab.POPUP_CONFIRM_CHANGE_SERVICE_OK, "Change service type");

					// Click 'Validate Project' button
					if (Utilities.Verify_Page(driver, timeWait, "System Address", System_Address_Tab.LI_SYSTEM_ADDRESS))
						CommonUtils.clickElement(driver, timeWait, System_Address_Tab.VALIDATE_PROJECT, "Validate Project");

					// Click Activate Project
					//CommonUtils.VerifyPage(driver, timeWait, "Project Activation", Project_Activation_Tab.LI_CONTROL_UNIT);
					
					if (Utilities.Verify_Page(driver, timeWait, "Project Activation", Project_Activation_Tab.LI_CONTROL_UNIT))
						CommonUtils.clickElement(driver, timeWait, Project_Activation_Tab.BUTTON_ACTIVATE_PROJECT, "Activate Project");

					// Click 'Save' button on page 'Gateways'
					if (Utilities.Verify_Page(driver, timeWait, "Gateways", Gateways_Tab.LI_GATEWAYS))
						CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_SAVE, "Save");

					CommonUtils.waitPageIsReady(driver, "Gateways");
					
					// Come back to 'My Project' page
					CommonUtils.clickElement(driver, timeWait, Page_Sites_List.TAB_MY_PROJECT, "TAB_MY_PROJECT");
					
					if (Utilities.Verify_Page(driver, timeWait, "My Projects", My_Projects_Tab.LI_CONTROL_UNIT)) {
						String xpathLocalPlant = My_Projects_Tab.TABLE_PLANT_COL_PROJ_NAME.replace("NUMBER", "2");
						String xpathLocalPlantType = My_Projects_Tab.TABLE_PLANT_COL_SERV_TYPE.replace("NUMBER", "2");
						String localPrjName = CommonUtils.getTableData(driver, timeWait, xpathLocalPlant);
						String localServType = CommonUtils.getTableData(driver, timeWait, xpathLocalPlantType);

						if (plantName.equals(localPrjName) && "LOCAL".equals(localServType)) {
							System.out.println("[Change_Plant_From_Online_To_Local] Change Plant '" + plantName + "' to LOCAL successfully");
						} else {
							System.out.println("[Change_Plant_From_Online_To_Local] ERROR: Cannnot change Plant '" + plantName + "' to LOCAL");
						}
					}

					System.out.println("[Change_Plant_From_Online_To_Local] End");

				} else {
					System.out.println("[Change_Plant_From_Online_To_Local] Not found expected Plant to change");
					System.out.println("[Change_Plant_From_Online_To_Local] Quit...");
				}
			} else {
				System.out.println("[Change_Plant_From_Online_To_Local] Wanrning: Please go to 'My Project' page first");
			}
			
		} catch (Exception e) {
			System.out.println("[Change_Plant_From_Online_To_Local] ERROR: Failed to change Plant to LOCAL");
		}
	}

	public static void Delete_All_Local_Plants(AndroidDriver<?> driver, WebDriverWait timeWait, String password) {
		//
		// Pre-condition: In the 'My Project' page
		//
		int totalRow = 0;
		//int noRow = 2;

		// Go to My Project pages		
		CommonUtils.clickGoToHomePage(driver, timeWait, Page_Sites_List.TAB_MY_PROJECT, "TAB_MY_PROJECT");

		System.out.println("\n[Delete_Local_Plant] Start");
		if (Utilities.Verify_Page(driver, timeWait, "My Projects", My_Projects_Tab.LI_CONTROL_UNIT)) {
			try {

				List<WebElement> rows = (List<WebElement>) driver.findElements(By.xpath(My_Projects_Tab.TABLE_PLANT_LIST));
				totalRow = rows.size();
				System.out.println("Found " + (totalRow - 1) + " Plants in Table Plant List");

				if (totalRow > 1) {
					// Delete previous Local Plant
					String xpathName = My_Projects_Tab.TABLE_PLANT_COL_PROJ_NAME.replace("NUMBER", "2");
					String xpathServType = My_Projects_Tab.TABLE_PLANT_COL_SERV_TYPE.replace("NUMBER", "2");
					String xpathDelete = My_Projects_Tab.PROJ_DEL_ICON.replace("NUMBER", "2");

					String prjName = CommonUtils.getTableData(driver, timeWait, xpathName);
					String servType = CommonUtils.getTableData(driver, timeWait, xpathServType);

					System.out.println("Verify Plant '" + prjName + "'...");
					if ("LOCAL".equals(servType)) {

						System.out.println("Found LOCAL Plant '" + prjName + "'. Deleting...");

						CommonUtils.clickElement(driver, timeWait, xpathDelete, "Delete Project' icon");

						// Wait for Pop-up 'Confirmation Delete'
						CommonUtils.waitForVisible(timeWait, My_Projects_Tab.POPUP_CONFIRM_DELETE);

						// Fill password
						CommonUtils.typeText(driver, timeWait, My_Projects_Tab.INPUT_PASSWORD, "INPUT_PASSWORD", password);

						// Click 'OK' button and confirm Deletion
						CommonUtils.clickElement(driver, timeWait, My_Projects_Tab.BUTTON_OK, "'OK' button");
						CommonUtils.Alert(driver, timeWait, true);
						CommonUtils.waitForVisible(timeWait, My_Projects_Tab.BUTTON_CLOSE_DIALOG);
						CommonUtils.clickElement(driver, timeWait, My_Projects_Tab.BUTTON_CLOSE_DIALOG, "BUTTON_CLOSE_DIALOG");
						CommonUtils.waitForNoVisible(timeWait, My_Projects_Tab.BUTTON_CLOSE_DIALOG);
						CommonUtils.waitForNoVisible(timeWait, My_Projects_Tab.POPUP_CONFIRM_DELETE);

						System.out.println("[Delete_Local_Plant] Delete Local Plant '" + prjName + "'successfully");
					} else {
						System.out.println("Plant '" + prjName + "' is not LOCAL type --> by-pass");
					}
				}

				// Come back to 'My Project' page
				CommonUtils.clickGoToHomePage(driver, timeWait, Page_Sites_List.TAB_MY_PROJECT, "TAB_MY_PROJECT");

				if (Utilities.Verify_Page(driver, timeWait, "My Projects", My_Projects_Tab.LI_CONTROL_UNIT))
					System.out.println("[Delete_Local_Plant] End");

			} catch (Exception e) {
				System.out.println("[Delete_Local_Plant] ERROR: Failed while deleting Local Plant");
			}

		} else {
			System.out.println("[Delete_Local_Plant] Wanrning: Please go to 'My Project' page first");
		}
	}

	public static boolean Create_Plant_With_Customize_Multi_Buildings(AndroidDriver<?> driver, WebDriverWait timeWait,
			int pageLoadWait, int imageLoadWait, String plantName, Document doc, boolean systemVDE, boolean devidedVDE,
			boolean serviceOnline) {
		
		boolean isCreated = false;

		try {
			System.out.println("[Create_Plant_With_Customize] Start");
			if (serviceOnline == true)
				System.out.println("[Create_Plant_With_Customize] Plant type: ONLINE");
			else
				System.out.println("[Create_Plant_With_Customize] Plant type: LOCAL");

			if (systemVDE == true)
				System.out.println("[Create_Plant_With_Customize] Include VDE? --> YES");
			else
				System.out.println("[Create_Plant_With_Customize] Include VDE? --> NO");

			if (devidedVDE == true)
				System.out.println("[Create_Plant_With_Customize] Devide VDE? --> YES");
			else
				System.out.println("[Create_Plant_With_Customize] Devide VDE? --> NO");

			// Click 'New Project' tab
			if (Utilities.Verify_Page(driver, timeWait, "My Projects", My_Projects_Tab.LI_CONTROL_UNIT))
				CreatePlant.GotoNewProjectPage(driver, timeWait);

			// Fill 'General Info' page --> Save&Next
			CreatePlant.InputInfo(driver, timeWait, plantName, doc);
			CommonUtils.clickElement(driver, timeWait, Page_Site_New.BUTTON_SAVE_NEXT, "Save & Next");

			// Configure 'Installation Type' page --> CUSTOMER Site
			CommonUtils.waitPageIsReadyAfterSomeSeconds(driver, "Installation Type", pageLoadWait);
			if (Utilities.Verify_Page(driver, timeWait, "Installation Type", Page_Site_New.LI_INSTALLATION_TYPE))
				CreatePlant.Setup_Installation_Type(driver, timeWait, systemVDE, devidedVDE, serviceOnline);

			// Configure 'Buildings/Risers' page --> Save&Next
			String BUILDING_NAME = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "BUILDING_NAME_1");
			String APARTMENT_COUNT = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "NUMBER_OF_APARTMENTS_OF_BUILDING");
			CreatePlant.Definition_Number_Buildings_And_Number_Of_Apartments(driver, timeWait, BUILDING_NAME, APARTMENT_COUNT);

			// ADDED1-START: Create second Building
			String BUILDING_NAME_2 = "B2";
			String APARTMENT_COUNT_2 = "1";
			System.out.println("[Execute] Create the second Building");

			// Click Add Building
			CommonUtils.clickElement(driver, timeWait, Structure_Definition_Tab.BUTTON_ADD_BUILDING, "Add Building");

			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.INPUT_NAME_OF_THE_BUILDING, 1), "Name of the building/riser", BUILDING_NAME_2);

			CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.SELECT_NUMBER_OF_APARTMENT, 1), "Total Apartments", APARTMENT_COUNT_2);

			CommonUtils.clickElement(driver, timeWait, Structure_Definition_Tab.BUTTON_SAVE_NEXT_TAB_STRUCTURE, "Save & Next");

			System.out.println("[Execute] End Definition_Number_Buildings_And_Number_Of_Apartments");
			// ADDED1-END

			// Configure 'Floors' page (if needed) --> Save&Next
			if (systemVDE == true)//The access control system will manage the readers, video door entry system and external panel address book.
			{
				String NUMBER_OF_FLOORS = CommonUtils.getElementsByTagName(doc, "FLOORS", "NUMBER_OF_FLOORS");
				String NUMBER_OF_APARTMENTS = CommonUtils.getElementsByTagName(doc, "APARTMENTS", "NUMBER_OF_APARTMENTS");
				CreatePlant.Distribution_Of_Apartments(driver, timeWait, NUMBER_OF_FLOORS, NUMBER_OF_APARTMENTS);
			}

			// Configure 'Gates' page --> Save&Next
			if (Utilities.Verify_Page(driver, timeWait, "Gates", Gates_Tab.LI_GATES))
				Setup_Gate_Basic(driver, timeWait, doc, systemVDE);

			Utilities.Delay(pageLoadWait);

			// ADDED2-START: Add second Gate
			System.out.println("Add the second Gate");
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_ADD_GATE, "Add gate");

			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Gates_Tab.GATES_NAME, 1), "Name Gate", "Small Gate");

			// Choose DDN
			if (systemVDE == true) {//The access control system will manage the readers, video door entry system and external panel address book.
				CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_DDN, 1), "DDN");
				CommonUtils.waitForVisible(timeWait, Gates_Tab.DDN_SELECTION);
				CommonUtils.clickElement(driver, timeWait, Gates_Tab.DDN_OPTION_2, "choose 'Linea300 - DDN'");
			}
			// ADDED2-END

			Utilities.Delay(pageLoadWait);

			// Click Save&Next
			CommonUtils.clickElementAfterSomeSeconds(driver, timeWait, Gates_Tab.BUTTON_SAVE_NEXT_GATE, "Save&Next", imageLoadWait);

			// Configure 'Gates and Buildings/Risers' page --> Save&Next
			CommonUtils.VerifyPageAfterSomeSeconds(driver, timeWait, "Gates and Buildings/Risers",
					Gates_Tab.LI_GATES_BUILDINGS_RISERS_TAB, pageLoadWait);
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_LINK_GATES_1, "Link Gates (1)");
			CommonUtils.waitForVisible(timeWait, Gates_Tab.POPUP_SELECT_GATE);
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.POPUP_CHECKBOX_1, "CheckBox (1)");
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_OK_GATES, "OK");
			CommonUtils.waitForNoVisible(timeWait, Gates_Tab.POPUP_SELECT_GATE);
			Utilities.Delay(popupLoadWait);

			// ADDED3-START: Link Gates (2)
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_LINK_GATES_2, "Link Gates (2)");
			CommonUtils.waitForVisible(timeWait, Gates_Tab.POPUP_SELECT_GATE);
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.POPUP_CHECKBOX_2, "CheckBox (2)");
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_OK_GATES, "OK");
			CommonUtils.waitForNoVisible(timeWait, Gates_Tab.POPUP_SELECT_GATE);
			Utilities.Delay(popupLoadWait);
			// ADDED3-END: 

			// Click Save&Next
			CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_GATES_BUILDINGS_SAVE_NEXT, "Save & Next");

			// Configure 'Control Unit' page --> Save&Next
			CommonUtils.VerifyPageAfterSomeSeconds(driver, timeWait, "Control Unit", System_Data_Tab.LI_CONTROL_UNIT, pageLoadWait);
			
			String CONTROL_UNIT_NAME = CommonUtils.getElementsByTagName(doc, "GATE_NAME_1", "CONTROL_UNIT");			
			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Control Unit", CONTROL_UNIT_NAME);
			CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.SELECT_CONTROL_UNIT_ADDRESS, 0), "Control Unit address", "0");
			CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.BUTTON_CONTROL_UNIT_LINK_GATES, 0), "Link Gates");
			CommonUtils.waitForVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_1, "CheckBox (1)");
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK_GATES, "OK");
			CommonUtils.waitForNoVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);

			Utilities.Delay(popupLoadWait);

			// ADDED4-START: Link second Gate
			// Click Add Control Unit
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_ADD_CONTROL_UNIT, "Add Control Unit");

			CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 1), "controlUnits", "Control Unit 2");
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_CONTROL_UNIT_LINK_GATES_2, "Link Gates (2)");
			CommonUtils.waitForVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_1_2, "CheckBox (2)");
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK_GATES, "OK");
			CommonUtils.waitForNoVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
			// ADDED4-END

			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Save & Next");
			Utilities.Delay(pageLoadWait);

			// Configure 'Gateway' page --> Save&Next
			if (serviceOnline == true) // If ONLINE type
			{
				String GATEWAY_NAME = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_NAME_1");
				CommonUtils.VerifyPage(driver, timeWait, "Gateway", System_Data_Tab.LI_GATE_WAY);
				CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Gateway Name", GATEWAY_NAME);
				CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_GATE_WAY_LINK_GATE, "Link Gates");
				CommonUtils.waitForVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
				// ADDED5-START: Modify : Link All Gates
				CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_ALL, "Check Box All");
				// ADDED5-END
				CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK, "Button OK");
				CommonUtils.waitForNoVisible(timeWait, System_Data_Tab.POPUP_SELECT_GATES);
			}

			// Click Save&Next
			CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Button Save&Next");

			// Configure 'System Address' page
			CommonUtils.VerifyPage(driver, timeWait, "System Address", System_Address_Tab.LI_SYSTEM_ADDRESS);
			if (serviceOnline == true) { // ONLINE plant type
				String GATEWAY_FW_VERSION = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_FW_VERSION_1");
				String GATEWAY_SERIAL_NUMBER = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_SERIAL_NUMBER_1");
				System.out.println("[Gateway] Verion Firmware: " + GATEWAY_FW_VERSION);
				System.out.println("[Gateway] Serial Device Number: " + GATEWAY_SERIAL_NUMBER);

				CommonUtils.typeText(driver, timeWait, System_Address_Tab.Gateway_FW_VER, "Verion Firmware", GATEWAY_FW_VERSION);

				CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATEWAY_SERIAL_NUMBER, "Serial Device Number", GATEWAY_SERIAL_NUMBER);
			}

			// Click 'Validate Project' button
			CommonUtils.clickElement(driver, timeWait, System_Address_Tab.BUTTON_VALIDATE_PROJECT, "Validate Project");

			// Click Activate Project
			CommonUtils.VerifyPage(driver, timeWait, "Project Activation", Project_Activation_Tab.LI_CONTROL_UNIT);
			if (Utilities.Verify_Page(driver, timeWait, "Project Activation", Project_Activation_Tab.LI_CONTROL_UNIT))
				CommonUtils.clickElement(driver, timeWait, Project_Activation_Tab.BUTTON_ACTIVATE_PROJECT, "Activate Project");

			// Finalize 'Gateways' page with Site's password
			if (serviceOnline == true) {
				String siteID = CommonUtils.getInputText(driver, timeWait, Gateways_Tab.Site_ID_ONLINE);
				System.out.println("Site's ID (generated): " + siteID);
				CommonUtils.typeText(driver, timeWait, Gateways_Tab.INPUT_Site_Password_ONLINE, "Site Password", "12345");
				CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_NEXT_ONLINE, "Save & Next");
				CommonUtils.waitForVisible(timeWait, Gateways_Tab.POPUP_IMPORT_PROGRAMMER);
				CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_INITIALIZE, "Initialize");
				CommonUtils.waitForVisible(timeWait, Gateways_Tab.DIALOG);
				CommonUtils.clickElement(driver, timeWait, Gateways_Tab.CLOSE_DIALOG, "close");

				System.out.println("\n[Create_Plant_With_Customize] Plant is created");
			}

			// Verify 'Plant Testing' page
			CommonUtils.waitPageIsReady(driver, "Plant testing");
			if (Utilities.Verify_Page(driver, timeWait, "Plant testing", Plant_Testing_Tab.LI_PLANTESTING)) {
				int i = 0;
				boolean createSuccess = false;
				while (i <= 62) {
					i += 1;
					Utilities.Delay(60);

					if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.GREEN_MAIN_BULLET) == true) {
						System.out.println("[MAIN PANEL] is GREEN !");
						createSuccess = true;
						i = 99;
					} else if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.GREEN_GPRS_BULLET) == true) {
						System.out.println("[GPRS MODULE] is GREEN !");
						createSuccess = true;
						i = 99;
					} else if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.GREEN_GATE_BULLET) == true) {
						System.out.println("[GATE MODULE] is GREEN !");
						i = 99;
					} else if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.GREEN_CONTROL_UNIT_BULLET) == true) {
						System.out.println("[CONTROL UNIT MODULE] is GREEN !");
						i = 99;
					} else {
						System.out.println("Plant '" + plantName + "' has not connected after " + i + "minutes...");
					}
				}

				// Verify the Result of Creation
				if (createSuccess == true) {
					System.out.println("PLANT '" + plantName + "' IS CREATED SUCCESSFULLY");
					isCreated = true;
				} else {
					System.out.println("[ERROR] PLANT: '" + plantName + "' CANNOT CONNECT TO GATEWAY");
					isCreated = false;
					Assert.fail();
				}
			}

		} catch (Exception e) {
			System.out.println("[ERROR] FAILED TO CREATE PLANT: '" + plantName);
			isCreated = false;
		}

		// Come back to 'My Project' page
		CommonUtils.clickGoToHomePage(driver, timeWait, Page_Sites_List.TAB_MY_PROJECT, "TAB_MY_PROJECT");
		
		if (Utilities.Verify_Page(driver, timeWait, "My Projects", My_Projects_Tab.LI_CONTROL_UNIT))
			System.out.println("\n[Create_Plant_With_Customize] End");

		return isCreated;
	}

	public static boolean waitGreenBullet(AndroidDriver<?> driver, WebDriverWait timeWait, int maxSecondWaitTime,
			String bulletXpath) {
		//
		// Pre-condition: In 'Plant testing' page
		//
		int i = 0;
		int totalRound = 0;
		boolean result = false;

		System.out.println("Start wait for Green Bullets...");

		try {

			totalRound = maxSecondWaitTime / 30;
			totalRound += 1;

			while (i < totalRound) {
				i += 1;
				Utilities.Delay(30);
				CommonUtils.refreshPage(driver, "Plant Testing <page>");
				
				if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.RED_MAIN_BULLET) == true) {
					System.out.println("[MAIN PANEL] is RED ! Some Error occurs");
					Assert.fail();
				}

				if (CommonUtils.checkElement(driver, timeWait, bulletXpath) == true) {
					System.out.println("[Wait-Bullet-Green] BULLET is GREEN (after: " + i * 30 + " second)");
					result = true;
					i = totalRound + 1; // Exit loop
				}
			}

		} catch (Exception e) {
			result = false;
			System.out.println("[Wait-Bullet-Green] Error occurred while waiting bullet green");
		}

		if (result == false)
			System.out.println("[Wait-Bullet-Green] BULLET not change to Green after: " + maxSecondWaitTime + " second");
		
		Utilities.Delay(15);
		CommonUtils.refreshPage(driver, "Plant Testing <page>");
		
		return result;
	}
	
	public static boolean waitGreenGPRSBullet(AndroidDriver<?> driver, WebDriverWait timeWait, int maxSecondWaitTime,
			String gprsXpath) {
		//
		// Pre-condition: In 'Plant testing' page
		//
		int i = 0;
		int totalRound = 0;
		boolean result = false;

		System.out.println("Start wait for Green GPRS Bullets...");

		try {

			totalRound = maxSecondWaitTime / 30;
			totalRound += 1;

			while (i < totalRound) {
				i += 1;
				Utilities.Delay(30);
				CommonUtils.refreshPage(driver, "Plant Testing <page>");

				if (CommonUtils.checkElement(driver, timeWait, gprsXpath) == true) {
					
					System.out.println("[Wait-GPRS-Bullet-Green] GPRS BULLET IS GREEN !");
					result = true;
					
					if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.GREEN_MAIN_BULLET) == true) {
						
						System.out.println("[Wait-GPRS-Bullet-Green] MAIN BULLET IS GREEN (after: " + i * 30 + " second)");
						i = totalRound + 1; // Exit loop
					}
					
				}
				
				if (CommonUtils.checkElement(driver, timeWait, Plant_Testing_Tab.RED_GPRS_BULLET) == true) {
					System.out.println("[GPRS PANEL] is RED ! Some Error occurs");
					Assert.fail();
				}
			}

		} catch (Exception e) {
			result = false;
			System.out.println("[Wait-Bullet-Green] Error occurred while waiting bullet green");
		}

		if (result == false)
			System.out.println("[Wait-Bullet-Green] BULLET not change to Green after: " + maxSecondWaitTime + " second");
		
		Utilities.Delay(30);
		CommonUtils.refreshPage(driver, "Plant Testing <page>");
		
		return result;
	}

	public static void Reactivate_Project(AndroidDriver<?> driver, WebDriverWait timeWait) {
		//
		// Adaptation for new pop-up in ACWeb v3.18
		//
		String popup_Xpath = "//*[@id='projectNotValidatedDialog']";

		// Try to go to Home page in order to display the pop-up
		System.out.println("Trying to leave page without saving...");
		CommonUtils.clickElement(driver, timeWait, Page_Site_Detail.TAB_MY_PROJECTS, "MY PROJECTS tab");

		if (CommonUtils.checkElement(driver, timeWait, popup_Xpath)) {
			CommonUtils.clickElement(driver, timeWait, Page_Site_Detail.Dialog_go_to_validation_page, "<Button> Go to validation page");

			// Click Validate project again
			Utilities.Delay(pageLoadWait);
			CommonUtils.clickElement(driver, timeWait, System_Address_Tab.VALIDATE_PROJECT, "<Button> Validate Project (again)");

			// Click Activate Project again
			Utilities.Delay(pageLoadWait);
			CommonUtils.clickElement(driver, timeWait, Project_Activation_Tab.BUTTON_ACTIVATE_PROJECT, "<Button> Activate Project (again)");
		}
	}

	public static void Close_Pop_Up_Go_To_Validation_Page(AndroidDriver<?> driver, WebDriverWait timeWait) {
		//
		// Adaptation for new pop-up in ACWeb v3.18
		//
		String popup_Xpath = "//*[@id='projectNotValidatedDialog']";

		if (CommonUtils.checkElement(driver, timeWait, popup_Xpath)) {
			CommonUtils.clickElement(driver, timeWait, Page_Site_Detail.Dialog_continue, "<Button> Continue");
		}
	}

	public static void Recover_Environment(AndroidDriver<?> driver, WebDriverWait timeWait, String homeUrl, String password) {
		
		int totalRow = 0;
		String prjName = "";
		String servType = "";
		String xpathName = "";
		String xpathServType = "";
		String xpathDelete = "";
		String xpathConfig = "";
				
		Go_To_Home_Page(driver, timeWait);
		
		while (true) {
			
			List<WebElement> rows = (List<WebElement>) driver.findElements(By.xpath(My_Projects_Tab.TABLE_PLANT_LIST));
			totalRow = rows.size();
			System.out.println("\n[Recover_Environment] Found " + (totalRow - 1) + " plants in the Plant Table");
			
			if (totalRow > 1) {
				
				xpathName = My_Projects_Tab.TABLE_PLANT_COL_PROJ_NAME.replace("NUMBER", "2");
				xpathServType = My_Projects_Tab.TABLE_PLANT_COL_SERV_TYPE.replace("NUMBER", "2");
				xpathDelete = My_Projects_Tab.PROJ_DEL_ICON.replace("NUMBER", "2");
				xpathConfig = My_Projects_Tab.PROJ_CONF_ICON.replace("NUMBER", "2");

				prjName = CommonUtils.getTableData(driver, timeWait, xpathName);
				servType = CommonUtils.getTableData(driver, timeWait, xpathServType);

				System.out.println("\nChecking plant <" + prjName + ">...");
				
				if ("LOCAL".equals(servType)) {

					System.out.println("\n[Recover_Environment] <" + prjName + "> is a LOCAL plant. Deleting...");
					CommonUtils.clickElement(driver, timeWait, xpathDelete, "Delete Project' icon");

					// Wait for Pop-up 'Confirmation Delete'
					CommonUtils.waitForVisible(timeWait, My_Projects_Tab.POPUP_CONFIRM_DELETE);

					// Fill password
					CommonUtils.typeText(driver, timeWait, My_Projects_Tab.INPUT_PASSWORD, "INPUT_PASSWORD", password);

					// Click 'OK' button and confirm Deletion
					CommonUtils.clickElement(driver, timeWait, My_Projects_Tab.BUTTON_OK, "'OK' button");
					CommonUtils.Alert(driver, timeWait, true);
					CommonUtils.waitForVisible(timeWait, My_Projects_Tab.BUTTON_CLOSE_DIALOG);
					CommonUtils.clickElement(driver, timeWait, My_Projects_Tab.BUTTON_CLOSE_DIALOG, "BUTTON_CLOSE_DIALOG");
					CommonUtils.waitForNoVisible(timeWait, My_Projects_Tab.BUTTON_CLOSE_DIALOG);
					CommonUtils.waitForNoVisible(timeWait, My_Projects_Tab.POPUP_CONFIRM_DELETE);
					
					CommonUtils.refreshPage(driver, "My Project");

					System.out.println("\n[Recover_Environment] lant <" + prjName + "> is deleted!");
					
				} else {
					
					System.out.println("\n[Recover_Environment] <" + prjName + "> is an Online plant");
					
					CommonUtils.clickElement(driver, timeWait, xpathConfig, "Project Configuration' icon");
					Utilities.Delay(pageLoadWait);

					// Click 'System Addressing' left-menu-tab					
					CommonUtils.clickElement(driver, timeWait, Page_Site_Detail.TAB_System_Addressing, "System Addressing tab");
					Utilities.Delay(pageLoadWait);
					
					// Click DropBox to change from Online to Local plant type
					CommonUtils.modifyDropDownBox(driver, timeWait, System_Address_Tab.DROPBOX_SERVICE_TYPE, "Service Type", "Local Mng");

					// Click 'Change service type' button on the Pop-Up Confirmation
					CommonUtils.waitForVisible(timeWait, System_Address_Tab.POPUP_CONFIRM_CHANGE_SERVCE);
					CommonUtils.clickElement(driver, timeWait, System_Address_Tab.POPUP_CONFIRM_CHANGE_SERVICE_OK, "Change service type button");
					Utilities.Delay(pageLoadWait);
					Utilities.Delay(pageLoadWait);
					
					// Click 'Validate Project' button
					CommonUtils.clickElement(driver, timeWait, System_Address_Tab.VALIDATE_PROJECT, "Validate Project button");
					Utilities.Delay(pageLoadWait);
					
					// Click 'Activate Project'
					CommonUtils.clickElement(driver, timeWait, Project_Activation_Tab.BUTTON_ACTIVATE_PROJECT, "Activate Project button");
					Utilities.Delay(pageLoadWait);
					Utilities.Delay(pageLoadWait);
					
					// Click 'Save' button on page 'Gateways'
					CommonUtils.clickElement(driver, timeWait, Gateways_Tab.BUTTON_SAVE, "Save button");
					Utilities.Delay(pageLoadWait);
					CommonUtils.waitPageIsReady(driver, "[Current Page]");
					
					// Come back to 'My Project' page
					CommonUtils.clickElement(driver, timeWait, Page_Sites_List.TAB_MY_PROJECT, "TAB_MY_PROJECT");
					Utilities.Delay(pageLoadWait);
					
					if (Utilities.Verify_Page(driver, timeWait, "My Projects", My_Projects_Tab.LI_CONTROL_UNIT)) {
						
						String currentPrjName = CommonUtils.getTableData(driver, timeWait, xpathName);
						String currentServType = CommonUtils.getTableData(driver, timeWait, xpathServType);

						if (prjName.equals(currentPrjName) && "LOCAL".equals(currentServType)) {
							System.out.println("\n[Recover_Environment] Change plant <" + currentPrjName + "> from ONLINE to LOCAL successfully");
						} else {
							System.out.println("\n[Recover_Environment] ERROR: Cannnot change plant <" + currentPrjName + "> from ONLINE to LOCAL");
						}
					}
				}
				
			} else {
				System.out.println("\n[Recover_Environment] All plants are deleted!\n\n");				
				break;
			}			
		}				
	}

	public static void Go_To_Home_Page (AndroidDriver<?> driver, WebDriverWait timeWait) {
		
		System.out.println("\n[Go_To_Home_Page] Going...");
		String homepage = envParams.getACWEB_ENDPOINT_URL() + "/acweb/sites_list.page";
		driver.get(homepage);
		Utilities.Delay(pageLoadWait);
		System.out.println("[Go_To_Home_Page] Homepage appeared");
	}
	
	public static void Go_To_New_Site_Page (AndroidDriver<?> driver, WebDriverWait timeWait) {
		
		System.out.println("\n[Go_To_New_Site_Page] Start");
		String homepage = envParams.getACWEB_ENDPOINT_URL() + "/acweb/site_new.page";
		driver.get(homepage);
		Utilities.Delay(pageLoadWait);
		System.out.println("\n[Go_To_New_Site_Page] Finished\n");
	}

	public static void Create_Plant_Not_Activated(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait, int imageLoadWait,
			String plantName, Document doc, int systemType, boolean videoDoorEntrySystem, int serviceType) {
		
		System.out.println("\n[Create_Plant] Start...");
				
		Go_To_New_Site_Page(driver, timeWait);
		
		// page "General Info"
		InputInfo(driver, timeWait, plantName, doc);
		
		CommonUtils.clickElement(driver, timeWait, Page_Site_New.BUTTON_SAVE_NEXT, "Save & Next");
		Utilities.Delay(pageLoadWait);		
		CommonUtils.VerifyPage(driver, timeWait, "Installation Type", Page_Site_New.LI_INSTALLATION_TYPE);
		
		// page 'Installation Type'
		Definition_Type_Services_And_Installed_Systems(driver, timeWait, systemType, videoDoorEntrySystem, serviceType);
		
		// page 'Buildings/Risers'
		Definition_Multi_Buildings(driver, timeWait);

		if (systemType == 2)//The access control system will manage the readers, video door entry system and external panel address book.
		{	
			// page 'Floors' page (if needed)
			String NUMBER_OF_FLOORS = CommonUtils.getElementsByTagName(doc, "FLOORS", "NUMBER_OF_FLOORS");
			String NUMBER_OF_APARTMENTS = CommonUtils.getElementsByTagName(doc, "APARTMENTS", "NUMBER_OF_APARTMENTS");
			Distribution_Of_Apartments(driver, timeWait, NUMBER_OF_FLOORS, NUMBER_OF_APARTMENTS);
		}
		
		// page 'Gates'	
		Definition_Multi_Gates(driver, timeWait, videoDoorEntrySystem);
		
		// page 'Gates and Buildings/Risers'
		Association_Multi_Gates_And_Buildings(driver, timeWait);
		
		// page 'Control Unit'
		Definition_Multi_Central_Access_Control(driver, timeWait, pageLoadWait);

		if (serviceType == 2) {	//Online management. Access Control Portal will provide remote access to the plant and I/O.
			// page 'Gateways'
			CreatePlant.Definition_Multi_Gateways(driver, timeWait, pageLoadWait);
		}
		
		// page 'System Address'
		CreatePlant.Check_System_Structure_Multi_Gateways(driver, timeWait, serviceType, doc);

		System.out.println("\n[Create_Plant] Finished\n");
	}

	public static void Create_Plant_Unactivated(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait, int imageLoadWait,
			String plantName, Document doc, int systemType, boolean videoDoorEntrySystem, int serviceType) {
		
		System.out.println("\n[Create_Plant] Start...");
				
		Go_To_New_Site_Page(driver, timeWait);
		
		// page "General Info"
		InputInfo(driver, timeWait, plantName, doc);
		
		CommonUtils.clickElement(driver, timeWait, Page_Site_New.BUTTON_SAVE_NEXT, "Save & Next");
		Utilities.Delay(pageLoadWait);		
				
		// page 'Installation Type'
		Definition_Type_Services_And_Installed_Systems(driver, timeWait, systemType, videoDoorEntrySystem, serviceType);
		
		// page 'Buildings/Risers'
		Definition_Multi_Buildings(driver, timeWait);
		
		// page 'Floors' ==> Click Save & Next
		CommonUtils.clickElement(driver, timeWait, Structure_Definition_Tab.BUTTON_SAVE_NEXT_FLOORS, "Save & Next");
		Utilities.Delay(pageLoadWait);
		
		// page 'Gates'	
		Definition_Multi_Gates(driver, timeWait, videoDoorEntrySystem);
		
		// page 'Gates and Buildings/Risers'
		Association_Multi_Gates_And_Buildings(driver, timeWait);
		
		// page 'Control Unit'
		Definition_Multi_Central_Access_Control(driver, timeWait, pageLoadWait);

		// page 'Gateway'
		CreatePlant.Definition_Multi_Gateways(driver, timeWait, pageLoadWait);
		
		// page 'System Address'
		//CreatePlant.Check_System_Structure_Multi_Gateways(driver, timeWait, serviceType, doc);
		
		// page 'Activate Project'
		//CreatePlant.Project_Activation(driver, timeWait);
		
		//CreatePlant.Save_Project(driver, timeWait, serviceType);

		System.out.println("\n[Create_Plant] Finished\n");
	}
	
	public static void Definition_Multi_Buildings(AndroidDriver<?> driver, WebDriverWait timeWait){
		
		String NAME_OF_THE_BUILDING_1 = "BUILDING_01";
		String NAME_OF_THE_BUILDING_2 = "BUILDING_02";
		
		//String NUMBER_OF_APARTMENT_1 = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "NUMBER_OF_APARTMENTS_OF_BUILDING");
		//String NUMBER_OF_APARTMENT_2 = CommonUtils.getElementsByTagName(doc, "BUILDING_1", "NUMBER_OF_APARTMENTS_OF_BUILDING");
		
		// Add building_1
		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.INPUT_NAME_OF_THE_BUILDING, 0), "Building Name", NAME_OF_THE_BUILDING_1);
		//CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.SELECT_NUMBER_OF_APARTMENT, 0), "Total Apartments", NUMBER_OF_APARTMENT_1);
		
		CommonUtils.clickElement(driver, timeWait, Structure_Definition_Tab.BUTTON_ADD_BUILDING, "Add building/riser");
		Utilities.Delay(pageLoadWait);
		
		// Add building_2
		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.INPUT_NAME_OF_THE_BUILDING, 1), "Building Name", NAME_OF_THE_BUILDING_2);
		//CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(Structure_Definition_Tab.SELECT_NUMBER_OF_APARTMENT, 1), "Total Apartments", NUMBER_OF_APARTMENT_2);

		CommonUtils.clickElement(driver, timeWait, Structure_Definition_Tab.BUTTON_SAVE_NEXT_TAB_STRUCTURE, "Save & Next");
		Utilities.Delay(pageLoadWait);

	}
	
	public static void Definition_Multi_Gates(AndroidDriver<?> driver, WebDriverWait timeWait, boolean systemVDE){
		
		// Configure 'Gates' page --> Save&Next
		String GATE_NAME_1 = "GATE_01";
		String GATE_NAME_2 = "GATE_02";
		
		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Gates_Tab.GATES_NAME, 0), "<input> Gate 1 Name", GATE_NAME_1);

		CommonUtils.modifyDropDownBox(driver, timeWait, Gates_Tab.BUS.replace("NUMBER", "0"), "Installed_On_Bus", "Riser");
				
		CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_DDN, 0), "DDN");
		Utilities.Delay(popupLoadWait);
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.DDN_OPTION_2, "choose 'Linea300 - DDN'");		
		Utilities.Delay(popupLoadWait);

		// ADDED2-START: Add second Gate
		System.out.println("Add the second Gate");
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_ADD_GATE, "<button> Add gate");
		
		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(Gates_Tab.GATES_NAME, 1), "Gate 2 name", GATE_NAME_2);

		CommonUtils.modifyDropDownBox(driver, timeWait, Gates_Tab.BUS.replace("NUMBER", "1"), "Installed_On_Bus", "Riser");
				
		CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(Gates_Tab.CHECKBOX_GATE_DDN, 1), "DDN");
		Utilities.Delay(popupLoadWait);
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.DDN_OPTION_2, "choose 'Linea300 - DDN'");
		Utilities.Delay(popupLoadWait);
		
		// Click Save&Next
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_SAVE_NEXT_GATE,  "<button> Save & Next");
		Utilities.Delay(pageLoadWait);
	}
	
	public static void Association_Multi_Gates_And_Buildings(AndroidDriver<?> driver, WebDriverWait timeWait){
		
		// Configure 'Gates and Buildings/Risers' page --> Save&Next
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_LINK_GATES_1, "Link Gates (1)");
		Utilities.Delay(popupLoadWait);
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.CHECKBOX_BUILDING_1, "CheckBox (1)");
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_OK_GATES, "OK");
		Utilities.Delay(popupLoadWait);

		// ADDED3-START: Link Gates (2)
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_LINK_GATES_2, "Link Gates (2)");
		Utilities.Delay(popupLoadWait);
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.CHECKBOX_BUILDING_RISER_2, "CheckBox (2)");
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_OK, "OK");
		Utilities.Delay(popupLoadWait);
		// ADDED3-END:

		// Click Save&Next
		CommonUtils.clickElement(driver, timeWait, Gates_Tab.BUTTON_GATES_BUILDINGS_SAVE_NEXT, "Save & Next");
		Utilities.Delay(pageLoadWait);
	}
	
	public static void Definition_Multi_Central_Access_Control(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait ){
		
		// Configure 'Control Unit' page --> Save&Next
		String CONTROL_UNIT_1 = "CONTROL_01" + System_Data_Tab.MULTI_SPACE;
		String CONTROL_UNIT_2 = "CONTROL_02" + System_Data_Tab.MULTI_SPACE;
		
		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 0), "Control Unit 1", CONTROL_UNIT_1);
		
		//CommonUtils.modifyDropDownBox(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.SELECT_CONTROL_UNIT_ADDRESS, 0), "Control Unit address", "0");
		CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.BUTTON_CONTROL_UNIT_LINK_GATES, 0), "Link Gates (1)");
		Utilities.Delay(popupLoadWait);
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CONTROL_UNIT_CHECKBOX_1, "CheckBox (1)");
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK_GATES, "OK");
		Utilities.Delay(popupLoadWait);

		// ADDED4-START: Link second Control Unit
		// Click Add Control Unit
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_ADD_CONTROL_UNIT, "<button> Add Control Unit");
		
		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.INPUT_CONTROL_UNIT_NAME, 1), "Control Unit 2", CONTROL_UNIT_2);
		
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_CONTROL_UNIT_LINK_GATES_2, "Link Gates (2)");
		Utilities.Delay(popupLoadWait);
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CONTROL_UNIT_CHECKBOX_2, "CheckBox (2)");
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK_GATES_2, "OK");
		Utilities.Delay(popupLoadWait);
		// ADDED4-END

		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Save & Next");
		Utilities.Delay(pageLoadWait);
	}
	
	public static void Definition_Multi_Gateways(AndroidDriver<?> driver, WebDriverWait timeWait, int pageLoadWait){
		
		// Configure 'Gateways' page --> Save&Next
		String GATEWAY_NAME_1 = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_NAME_1") + System_Data_Tab.MULTI_SPACE;
		String GATEWAY_NAME_2 = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_NAME_1") + "_02" + System_Data_Tab.MULTI_SPACE;
		
		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.NAME_GATEWAY, 0), "Gateway 1 Name", GATEWAY_NAME_1);
		
		CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.BUTTON_LINK_GATES, 0), "Link Gates");
		Utilities.Delay(popupLoadWait);
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_GATE_WAY_1, "CheckBox (1)");
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK, "Button OK");
		Utilities.Delay(popupLoadWait);
		
		// Click Add Gateway
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_ADD_GATEWAY, "<button> Add Gateway");
		Utilities.Delay(popupLoadWait);

		CommonUtils.typeText(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.NAME_GATEWAY, 1), "Gateway 2 Name", GATEWAY_NAME_2);
		
		CommonUtils.clickElement(driver, timeWait, CommonUtils.setNumber(System_Data_Tab.BUTTON_LINK_GATES, 1), "Link Gates");
		Utilities.Delay(popupLoadWait);
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.CHECKBOX_GATE_WAY_2, "CheckBox (2)");
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_OK_GATES_2, "Button OK");
		Utilities.Delay(popupLoadWait);

		// Click Save&Next
		CommonUtils.clickElement(driver, timeWait, System_Data_Tab.BUTTON_SAVE_NEXT, "Button Save&Next");
		Utilities.Delay(pageLoadWait);
	}
	
	public static void Check_System_Structure_Multi_Gateways(AndroidDriver<?> driver, WebDriverWait timeWait, int serviceType, Document doc) {
		
		if (serviceType == 2) {//Online management. Access Control Portal will provide remote access to the plant and I/O.
			
			String GATEWAY_NAME_2 = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_NAME_1") + "_02";
						
			String GATEWAY_FW_VERSION_1 = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_FW_VERSION_1");			
			String GATEWAY_FW_VERSION_2 = CommonUtils.getElementsByTagName(doc, "GATEWAY_1", "GATEWAY_FW_VERSION_1");
			
			String GATEWAY_SERIAL_NUMBER_1 = Utilities.getRandomString();
			String GATEWAY_SERIAL_NUMBER_2 = Utilities.getRandomString();			
									
			CommonUtils.typeText(driver, timeWait, System_Address_Tab.Gateway_FW_VER, "Gateway_FW_VER", GATEWAY_FW_VERSION_1);
						
			CommonUtils.typeText(driver, timeWait, System_Address_Tab.GATEWAY_SERIAL_NUMBER, "GATEWAY_SERIAL_NUMBER", GATEWAY_SERIAL_NUMBER_1);
						
			CommonUtils.clickElement(driver, timeWait, System_Address_Tab.TREE_GATE_WAY.replace("STRING", GATEWAY_NAME_2), "gateway2");			
			Utilities.Delay(pageLoadWait);
			
			CommonUtils.typeText(driver, timeWait, System_Address_Tab.FW_VER_GATE_WAY_2, "Gateway_FW_VER", GATEWAY_FW_VERSION_2);
			
			CommonUtils.typeText(driver, timeWait, System_Address_Tab.SERIAL_NUMBER_GATE_WAY_2, "GATEWAY_SERIAL_NUMBER", GATEWAY_SERIAL_NUMBER_2);
		}
		
		CommonUtils.clickElement(driver, timeWait, System_Address_Tab.BUTTON_VALIDATE_PROJECT, "Validate Project");
		Utilities.Delay(pageLoadWait);
		
	}
}
