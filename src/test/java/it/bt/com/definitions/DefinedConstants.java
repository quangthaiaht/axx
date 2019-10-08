package it.bt.com.definitions;

public class DefinedConstants {
	public static final class Driver {
		public static final String FIREFOX_DRIVER = "FirefoxDriver";
		public static final String CHROME_DRIVER = "ChromeDriver";
		public static final String IE_DRIVER = "InternetExplorerDriver";
	}

	public static final class Plant {
		public static boolean WEB_PLANT_EXISTED = false;
		public static boolean LOCAL_PLANT_EXISTED = false;
	}

	public static final class WindowsApplications {
		public static final String NOTEPAD_APP = "notepad.exe";
		public static final String NOTEPAD_PATH = "C:\\Windows\\System32\\" + NOTEPAD_APP;
		public static final String EXCEL_APP = "EXCEL.EXE";
		public static final String EXCEL_PATH = "C:\\Program Files (x86)\\Microsoft Office\\Office16\\" + EXCEL_APP;
		
	}
	
	public static final class MessageWarning {
		public static final String MSG_WARNING_GATE_NOT_Associated_Central_Unit = "Associated to central unit : not associated";
		public static final String DDN_WARNING = "Not associable to a central unit";
		public static final String MSG_VALIDATION_ALL_RULES = "All validation rules were successfully verified";
		public static final String PASSEPARTOUT_SUCCESSFUL_ASSOCIATION = "Providers correctly associated";
		public static final String SAVED_OPERATION_SUCCESSFULLY = "Saving operation completed successfully";
		
	}
	
	public static final class MessageRules {
		public static final String RULE_01 = "AC Control Unit addressing check";
		public static final String RULE_02 = "External Panel addressing check";
		public static final String RULE_03 = "Riser Interface addressing check";
		public static final String RULE_04 = "Vigik readers addressing check";
		public static final String RULE_05 = "Gates addressing check";
		public static final String RULE_06 = "Gates and buildings associations check";
		public static final String RULE_07 = "Central unit and gates associations check";
		public static final String RULE_08 = "Gates and central units associations check";
		public static final String RULE_09 = "Apartments addressing check";
		public static final String RULE_10 = "Presence of Gates with Access Control components check";
		public static final String RULE_11 = "Gates and gateways associations check";
	}
	
	public static final class MessagePassepartout {
		public static final String MESSAGE_01 = "Provider successfully updated";
		public static final String MESSAGE_02 = "Keyboard code is too short, length min: 4 max: 9";
		public static final String MESSAGE_03 = "Numeric field is not valid";
	}
	
	public static final class MessageReinitializeAC {
		public static final String INIT_CENTERUNIT_SUCCESS = "Initializing commands generated";
	}

}
