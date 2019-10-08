package it.bt.com.definitions;

public class DefinedPageElements {

	public static final class Page_Login {
		public static final String txtEmail = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.EditText[1]";//img[contains(@src, 'flag_france.png')]
		public static final String IMG_English = "//a[contains(@href, 'en_FR')]";//img[contains(@src, 'flag_united_kingdom.png')]

		public static final String INPUT_USERNAME = "//*[@id='username']";
		public static final String INPUT_PASSWORD = "//*[@id='password']";
		public static final String INPUT_PASSWORD_PLAIN = "//*[@id='password-plain']";
		public static final String BUTTON_SUBMIT = "//*[@id='fm1']//*[@class='uThinBtn round']";
		public static final String BUTTON_FORGOT_PASSWORD = "//p[1]//*[@class='a-small']";
		public static final String BUTTON_REGISTRED = "//p[2]//*[@class='a-small']";

		public static final String ERROR_MSG = "//*[@id='msg']";
	}

	public static final class Page_User_Registration {
		public static final String Select_language = "//select[@id='languageSel']";

		//Contact:
		public static final String INPUT_Name = "//input[@name='nome']";
		public static final String INPUT_Surname = "//input[@name='cognome']";
		public static final String INPUT_Company_Name = "//input[@id='ragione_sociale']";
		public static final String INPUT_Company_Identification_Code = "//input[@id='piva']";
		public static final String INPUT_Email = "//input[@name='email']";

		//Address:
		public static final String SELECT_Country = "//select[@id='idNazione']";
		public static final String SELECT_Province = "//select[@id='idProvincia']";
		public static final String SELECT_City = "//select[@id='idComune']";
		public static final String SELECT_Post_code = "//select[@id='cap']";
		public static final String INPUT_Street = "//input[@id='via']";
		public static final String INPUT_Street_Number = "//input[@id='civico']";
		public static final String INPUT_Telephone_Number = "//input[@name='telefono']";
		public static final String INPUT_Mobile_Phone_Number = "//input[@name='cellulare']";

		//Access:
		public static final String INPUT_Login = "//input[@name='login']";
		public static final String INPUT_Confirm_Login = "//input[@name='confirm_login']";

		//Contract:
		public static final String RADIO_Accept = "//input[@id='accettazione_1']";
		public static final String RADIO_Agree_1 = "//input[@id='trattamentoDati2_1']";
		public static final String RADIO_Agree_2 = "//input[@id='privacyTerzi_1']";
		public static final String RADIO_Agree_3 = "//input[@id='privacyBticino_1']";
		public static final String RADIO_Agree_4 = "//input[@id='trattamentoDati_1']";

		public static final String BUTTON_Save = "//button[@name='save']";
		public static final String BUTTON_Cancel = "//button[@name='cancel']";

		//Saving operation completed successfully
		public static final String SUCCESS_MSG = "//*[@id='retMsg']";
		public static final String BUTTON_DownloadDocument = "//button[@class='thickBtn round'][1]";
		public static final String BUTTON_GoToLogin = "//button[@class='thickBtn round'][2]";
	}

	public static final class Page_First_login {
		public static final String INPUT_New_Password = "//input[@id='new_password']";
		public static final String INPUT_Confirm_New_Password = "//input[@id='new_password_confirm']";
		public static final String BUTTON_Modify = "//button[@class='thinBtn round small_li_width']";
		public static final String ERROR_MSG = "//*[@id='new_password_errMsg']";
	}

	public static final class Page_Sites_List {
		public static final String BADGE_SEARCH = "//*[@class='searchBar']//input[@id='badgeSearch']";
		public static final String BADGE_SEARCH_ErrorDialog = "//*[@id='btErrorDialog']";
		public static final String BADGE_SEARCH_ErrorDialog_Close = "//*[@class='ui-dialog-buttonset']/button";
		public static final String BUTTON_BADGE_SEARCH = "//*[@class='searchBar']//input[@id='btnSearchBadge']";
		public static final String BUTTON_BADGE_SEARCH_INLINE = "//*[@class='searchBar']//input[@id='btnSeachBadgeInline']";
		public static final String badgeReadingPopSearch = "//*[@id='badgeReadingPopSearch']";
		public static final String badgeID = "//*[@id='badgeReadingPopSearch']//input[@id='badgeID']";
		public static final String badgeID_setTyping = "//*[@id='badgeReadingPopSearch']//input[@id='setTyping']";
		public static final String badgeID_setReading = "//*[@id='badgeReadingPopSearch']//input[@id='setReading']";
		public static final String BUTTON_BADGE_SEARCH_retry = "//*[@id='badgeReadingPopSearch']//button[@class='retry']";
		public static final String BUTTON_BADGE_SEARCH_OK = "//*[@id='badgeReadingPopSearch']//button[@class='ok']";
		public static final String BUTTON_BADGE_SEARCH_closeDialogX = "//*[@id='badgeReadingPopSearch']//*[@class='closeDialogX']";
		public static final String MENU_BAR = "//*[@id='main_navigation']";
		public static final String MAP = "//*[@id='statusDetailsComponentId']//*[@id='plantInformationComponent']//*[@id='map']";
		public static final String TAB_PROFILE = "//*[@id='liLiv1_my_profile']//*[@id='my_profile']";
		public static final String TAB_PASSEPARTOUT = "//*[@id='ppt_manager']";
		public static final String TAB_NEW_PROJECT = "//*[@id='new_project']";
		public static final String TAB_MY_PROJECT = "//*[@id='my_projects']";
		public static final String TAB_PLANT_USERS = "//*[@id='users']";
		public static final String TAB_STATUS = "//*[@id='liLiv1_status']//*[@id='status']";
		public static final String My_Project = "//*[@id='main_navigation']/*[@class='navigButton']/*[@class='projects']";
		public static final String My_Project_Gate = "//*[@class='plant_menu']/*[@class='plant_navigation']/*[@class='round ']/*[@class='round gate']";
		public static final String My_Project_System_data = "//*[@class='plant_menu']/*[@class='plant_navigation']/*[@class='round ']/*[@class='round system_data']";

		public static final String BUTTON_Invitations = "//*[@id='header']//*[@id='headerLogo']//*[@class='user_data']//a[1]";
		public static final String BUTTON_Help = "//*[@id='header']//*[@id='headerLogo']//*[@class='user_data']//a[2]";
		public static final String BUTTON_LOGOUT = "//*[@id='header']//*[@id='headerLogo']//*[@class='user_data']//a[3]";
		
		public static final String Table_Plant = "//*[@id='gbox_endUsersSiteTable']//*[@id='endUsersSiteTable_pName']//*[@id='jqgh_endUsersSiteTable_pName']";
		public static final String Map_Location = "//*[@id='statusDetailsComponentId']//*[@id='plantInformationComponent']//*[@id='map']//*[@class='gm-style']/div[1]/div[3]/div";
		
		public static final String LINK_DIALOG_ERROR = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@id='btErrorDialog']/a";
	
		public static final String MSG_TAB_IS_ALREADY_OPENED = "//*[@class='info']//*[@class='oneColumnContent']//*[@class='mainContent']/div";
		
	}

	//Home > My Projects
	public static final class My_Projects_Tab {
		public static final String LI_CONTROL_UNIT = "//*[@class='active']";
		public static final String SiteTable = "//div[@class='mainContent']//table[@id='endUsersSiteTable']//*[@role='row'][1]";
		public static final String SiteRow = "//table[@id='endUsersSiteTable']/tbody/tr";
		public static final String MAGNIFYING_GLASS = "//input[@class='spyGlassBtn']";
		public static final String DELETE = "//input[@class='delInlineBtn']";
		public static final String ICON_DELETE = "//*[@id='" + "STRING" + "']//input[@class='delInlineBtn']";
		public static final String EDIT = "//input[@class='editSaveInlineBtn']";
		public static final String ICON_Management = "//*[@class='spyGlassBtn']";

		public static final String My_Projects_Row = "//table[@id='endUsersSiteTable']/tbody/tr";
		public static final String ACTIONS_Column = "//table[@id='endUsersSiteTable']/tbody/tr[" + "NUMBER" + "]/td[7]";

		public static final String POPUP_CONFIRM_DELETE = "//*[@id='popupDeleteSite']";
		public static final String X_CLOSE_POPUP = "//*[@id='deleteSiteForm']//*[@class='closeDialogX']";
		public static final String INPUT_PASSWORD = "//input[@id='password']";
		public static final String BUTTON_CANCEL = "//*[@id='deleteSiteForm']//*[@class='d-btns']//button[@class='thinBtn round left closeDialog']";
		public static final String BUTTON_OK = "//*[@id='deleteSiteForm']//*[@class='d-btns']//button[@class='thinBtn round right']";

		public static final String UI_DIALOG = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']";
		public static final String BUTTON_CLOSE_MESSAGE = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//div[@id='btErrorDialog']";
		public static final String BUTTON_CLOSE_DIALOG = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//button[@type='button']";

		public static final String plantID = "//div[@class='mainContent']//table[@id='endUsersSiteTable']//*[@role='row'][rowOrder]";
		public static final String PlantName = "//div[@class='mainContent']//table[@id='endUsersSiteTable']//*[@role='row'][rowOrder]//*[@role='gridcell'][2]";
		public static final String ProjectManagement = "//div[@class='mainContent']//table[@id='endUsersSiteTable']//*[@role='row'][rowOrder]//input[1]";
		public static final String ProjectConfiguration = "//div[@class='mainContent']//table[@id='endUsersSiteTable']//*[@role='row'][rowOrder]//input[2]";
		public static final String DeleteProject = "//div[@class='mainContent']//table[@id='endUsersSiteTable']//*[@role='row'][rowOrder]//input[3]";
		public static final String next_endUsersSiteTablePager = "//div[@class='mainContent']//td[@id='next_endUsersSiteTablePager']";
		public static final String ui_pg_input = "//div[@class='mainContent']//input[@class='ui-pg-input']";

		public static final String PROJ_CONF_ICON = "//*[@id='gview_endUsersSiteTable']//table[@id='endUsersSiteTable']/tbody/tr[NUMBER]/td[7]/input[@class='editSaveInlineBtn']";
		public static final String PROJ_DEL_ICON = "//*[@id='gview_endUsersSiteTable']//table[@id='endUsersSiteTable']/tbody/tr[NUMBER]/td[7]/input[@class='delInlineBtn']";
		public static final String TABLE_PLANT_LIST = "//*[@id='gview_endUsersSiteTable']//table[@id='endUsersSiteTable']/tbody/tr";
		public static final String TABLE_PLANT_COL_PROJ_NAME = "//*[@id='gview_endUsersSiteTable']//table[@id='endUsersSiteTable']/tbody/tr[NUMBER]/td[2]";
		public static final String TABLE_PLANT_COL_SERV_TYPE = "//*[@id='gview_endUsersSiteTable']//table[@id='endUsersSiteTable']/tbody/tr[NUMBER]/td[5]";
	
		public static final String TABLE_ICON_CONFIGURATION = "//*[@id='endUsersSiteTable']/tbody/tr[2]/td[7]/input[@class='editSaveInlineBtn']";
		public static final String ICON_CONFIGURATION_X = "//*[@id='endUsersSiteTable']/tbody/tr[NUMBER]/td[7]/input[@class='editSaveInlineBtn']";
		public static final String ICON_MANAGEMENT_X = "//*[@id='endUsersSiteTable']/tbody/tr[NUMBER]/td[7]/input[@class='spyGlassBtn']";
	}

	public static final class Page_Site_Detail {
		public static final String LI_General_Info = "//*[@class='active'][2]";
		public static final String TAB_General_Info = "//*[@id='general_info']";
		public static final String TAB_Structure_Definition = "//*[@id='structure_definition']";
		public static final String TAB_Gate = "//*[@class='round gates']";
		public static final String TAB_System_Data = "//*[@class='round system_data']";
		public static final String TAB_System_Addressing = "//*[@id='system_addressing']";
		public static final String TAB_Gateways = "//*[@id='gateways']";
		public static final String TAB_Plant_Testing = "//*[@id='plant_testing']";

		public static final String TAB_MY_PROJECTS = "//*[@class='projects']";
		public static final String TAB_NEW_PROJECT = "//*[@class='new_project']";
		public static final String Button_Save_Next = "//*[@id='formSiteData']//button[@id='btnNext']";
		public static final String Popup_dialog = "//*[@role='dialog']";
		public static final String Dialog_confirm = "//*[@class='ui-dialog-buttonset']/button[1]";
		public static final String Input_Site_Name = "//*[@id='plantInfoFields']/*[@class='odd'][1]/*[@id='nome']";
		public static final String Label_Apartment = "//*[@class='devices system_address_devices']/ul[@class='tree']/li[@class='open']/ul/li[@class='open'][2]/ul/li//div";
		public static final String Central_Unit = "//*[@class='info']/*[@class='system_definition']/*[@class='devices system_address_devices']/ul[@class='tree']/li[@class='open']/ul/li[1]/div";
		public static final String External_Panel = "//*[@id='viewDetailsSection']//ul/li[@class='equal'][2]/*[@hidden='true']";
		public static final String Dialog_confirm_leave_without_save = "//*[@class='ui-dialog-buttonset']/button[2]";
		public static final String Dialog_go_to_validation_page = "//*[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//*[@class='ui-dialog-buttonset']//*[@class='unsavedDataDialogButton'][1]";
		public static final String Dialog_continue = "//*[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//*[@class='ui-dialog-buttonset']//*[@class='unsavedDataDialogButton'][2]";
		
		public static final String Icon_General_Info = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-header-0']/span[@class='complete'][2]";
		
		public static final String TAB_STRUCTURE_DEFINITION = "//*[@class='menu']//*[@class='plant_navigation']//*[@id='liLiv2_structure_definition']//*[@id='structure_definition']";
	}

	public static final class Page_End_User_Personal_Data {
		public static final String TAB_PROFILE = "//*[@id='ui-id-1']";
		public static final String TAB_CONTRACT = "//*[@id='ui-id-2']";
		public static final String TAB_ADDRESS_BOOK = "//*[@id='ui-id-4']";

		public static final String BUTTON_MODIFY = "//*[@id='modPersDataForm']//*[@class='twoColForm'][11]//*[@class='small'][2]//*[@class='thickBtn round']";
		public static final String BUTTON_CANCEL = "//*[@id='modPersDataForm']//*[@class='twoColForm'][11]//*[@class='small'][1]//*[@class='thickBtn round']";

		// Sub-Tab "Profile"
		public static final String INPUT_SURNAME = "//*[@id='modPersDataForm']//*[@class='twoColForm'][1]//*[@class='small'][1]//input[@name='nome']";
		public static final String INPUT_NAME = "//*[@id='modPersDataForm']//*[@class='twoColForm'][1]//*[@class='small'][2]//input[@name='cognome']";
		public static final String INPUT_COMPANY_NAME = "//*[@id='modPersDataForm']//*[@class='twoColForm'][2]//*[@class='small'][1]//input[@name='ragione_sociale']";
		public static final String INPUT_SIRET_NUMBER = "//*[@id='modPersDataForm']//*[@class='twoColForm'][2]//*[@class='small'][2]//input[@name='piva']";
		public static final String INPUT_EMAIL = "//*[@id='modPersDataForm']//*[@class='twoColForm'][3]//*[@class='small']//input[@name='email']";
		public static final String DROPDOWNBOX_LANGUAGE = "//*[@id='id_lingua']";
		public static final String DROPDOWNBOX_DEPARTMENT = "//*[@id='id_provincia']";
		public static final String DROPDOWNBOX_CITY = "//*[@id='id_comune']";
		public static final String DROPDOWNBOX_POSTCODE = "//*[@id='cap']";
		public static final String INPUT_STREET = "//*[@id='modPersDataForm']//*[@class='twoColForm'][6]//*[@class='small'][1]//input[@name='via']";
		public static final String INPUT_STREET_NUMBER = "//*[@id='modPersDataForm']//*[@class='twoColForm'][6]//*[@class='small'][2]//input[@name='civico']";
		public static final String INPUT_TELEPHONE_NUMBER = "//*[@id='modPersDataForm']//*[@class='twoColForm'][7]//*[@class='small'][1]//input[@name='telefono']";
		public static final String INPUT_MOBIPHONE_NUMBER = "//*[@id='modPersDataForm']//*[@class='twoColForm'][7]//*[@class='small'][2]//input[@name='cellulare']";
		public static final String INPUT_LOGIN = "//*[@id='modPersDataForm']//*[@class='twoColForm'][9]//*[@class='small'][1]//input[@name='username']";
		public static final String INPUT_NEW_PASSWORD = "//*[@id='new_password']";
		public static final String INPUT_CONFIRM_NEW_PASSWORD = "//*[@id='new_password_confirm']";

		public static final String LABEL_SAVED_PROFILE_SUCCESS = "//*[@id='tabs']//*[@id='tabs-1']//*[@id='retMsg']";
		public static final String LABEL_SAVED_PROFILE_ERROR = "//*[@id='tabs']//*[@id='tabs-1']//*[@id='errMsg']";

		public static final String LABEL_SAVED_PROFILE_SUCCESS_ID = "retMsg";
		public static final String LABEL_SAVED_PROFILE_ERROR_ID = "errMsg";
		public static final String LABEL_ERROR_SURNAME_ID = "error_nome";
		public static final String LABEL_ERROR_NAME_ID = "error_cognome";
		public static final String LABEL_ERROR_EMAIL_ID = "error_email";
		public static final String LABEL_ERROR_PROVINCE_ID = "error_id_provincia";
		public static final String LABEL_ERROR_CITY_ID = "error_id_comune";
		public static final String LABEL_ERROR_POSTCODE_ID = "error_cap";
		public static final String LABEL_ERROR_STREET_ID = "error_via";
		public static final String LABEL_ERROR_STREET_NUMBER_ID = "error_civico";
		public static final String LABEL_ERROR_LANGUAGE_ID = "error_id_lingua";
		public static final String LABEL_ERROR_LOGIN_ID = "error_username";
		public static final String LABEL_ERROR_NEW_PASSWORD_ID = "error_new_password";

		// Sub-Tab "Contract"
		public static final String BUTTON_DOWNLOAD_CONTRACT = "//*[@id='ui-tabs-1']//*[@class='container clearfix']//*[@class='info']//*[@class='mainContent']//*[@class='thinBtn round']";

		// Sub-Tab "Address-Book"
		public static final String BUTTON_ADDRESS_BOOK_ADD_NEW = "//*[@id='newBtn']";
		public static final String BUTTON_DELETE_CONTACT = "//*[@class='deleteRow']";
		
		public static final String BUTTON_EDIT_CONTACT = "//*[@id='contactListT']/tbody/tr[2]/td[6]//*[@class='editSaveInlineBtn']";
		public static final String BUTTON_SAVE_CONTACT = "//*[@id='contactListT']/tbody/tr[2]/td[6]//*[@class='editSaveInlineBtn save']";
		public static final String BUTTON_DEL_CONTACT = "//*[@id='contactListT']/tbody/tr[2]/td[6]//*[@class='deleteRow']";
		public static final String INPUT_ENTRY_NAME = "//*[@id='contactListT']/tbody/tr[2]/td[1]/input[@id='1_nome']";
		public static final String INPUT_ENTRY_SURNAME = "//*[@id='contactListT']/tbody/tr[2]/td[2]/input[@id='1_cognome']";
		public static final String INPUT_ENTRY_COMPANY_NAME = "//*[@id='contactListT']/tbody/tr[2]/td[3]/input[@id='1_ragione_sociale']";
		public static final String INPUT_ENTRY_EMAIL = "//*[@id='contactListT']/tbody/tr[2]/td[5]/input[@id='1_email']";
		public static final String TABLE_COL_NAME = "//*[@id='contactListT']/tbody/tr[@id='1']/td[1]";
		public static final String TABLE_COL_SURNAME = "//*[@id='contactListT']/tbody/tr[@id='1']/td[2]";
		public static final String TABLE_COL_COMPANY_NAME = "//*[@id='contactListT']/tbody/tr[@id='1']/td[3]";
		public static final String TABLE_COL_EMAIL = "//*[@id='contactListT']/tbody/tr[@id='1']/td[5]";
		public static final String POPUP_SAVE_ERROR = "//*[@id='btErrorDialog']";
		public static final String POPUP_SAVE_ERROR_CLOSE = "//*[@class='ui-dialog-buttonset']/button";
		public static final String LABLE_POPUP_ERROR_EMAIL = "//*[@id='btErrorDialog']//*/li[1]";
		public static final String LABLE_POPUP_ERROR_NAME = "//*[@id='btErrorDialog']//*/li[2]";
		public static final String LABLE_POPUP_ERROR_SURNAME = "//*[@id='btErrorDialog']//*/li[3]";
		public static final String LABLE_POPUP_ERROR_COMPANY_NAME = "//*[@id='btErrorDialog']//*/li[4]";
		public static final String POPUP_DIALOG_ERROR = "//*[@id='infocnt']";
		public static final String POPUP_DIALOG_ERROR_CLOSE = "//*[@id='info_id']//*[@id='closedialog']";
		
		
		public static final String Column = "//table[@id='contactListT']/tbody/tr[2]/td[" + "NUMBER" + "]";

		// Form "Add New Contact (sub-tab "Address Book")"
		public static final String POPUP_ADD_NEW_CONTACT = "//*[@id='formNewContact']";
		public static final String INPUT_ADDRESS_BOOK_NAME = "//*[@id='formNewContact']//*[@class='twoColForm'][1]//*[@id='nome']";
		public static final String INPUT_ADDRESS_BOOK_SURNAME = "//*[@id='formNewContact']//*[@class='twoColForm'][1]//*[@id='cognome']";
		public static final String INPUT_ADDRESS_BOOK_COMPANY_NAME = "//*[@id='formNewContact']//*[@class='twoColForm'][2]//*[@id='ragione_sociale']";
		public static final String INPUT_ADDRESS_BOOK_EMAIL = "//*[@id='formNewContact']//*[@class='twoColForm'][2]//*[@id='email']";

		public static final String BUTTON_SAVE = "//*[@id='formNewContact']//*[@class='d-cnt']//*[@class='d-btns-red']//*[@class='thinBtn round right']";
		public static final String BUTTON_CANCEL_ADD_CONTACT = "//*[@id='formNewContact']//*[@class='d-cnt']//*[@class='d-btns-red']//*[@class='thinBtn round left closeDialog']";

		public static final String LABEL_ERROR_CONTACT_NAME_ID = "error_nome";
		public static final String LABEL_ERROR_CONTACT_SURNAME_ID = "error_cognome";
		public static final String LABEL_ERROR_CONTACT_COMPANY_NAME_ID = "error_ragione_sociale";
		public static final String LABEL_ERROR_CONTACT_EMAIL_ID = "error_email";

		public static final String POPUP_DELETE_CONTACT = "//*[@id='delContactPop']";
		public static final String BUTTON_CONFIRM_DELETE_CONTACT = "//*[@id='delContactPop']//*[@id='formDelContact']//*[@class='d-btns']//*[@class='thinBtn round right']";
		public static final String BUTTON_CONFIRM_CANCEL_CONTACT = "//*[@id='delContactPop']//*[@id='formDelContact']//*[@class='d-btns']//*[@class='thinBtn round left closeDialog']";

		public static final String TABLE_CONTACT_LIST_ID = "contactListT";
	}
		
	public static final class Page_Site_New {
		public static final String LI_New_Project = "//*[@class='active']";
		public static final String INPUT_SITE_NAME = "//input[@id='nome']";
		public static final String INPUT_SITE_DESCRIZIONE = "//input[@id='descrizione']";
		public static final String INPUT_SITE_ADDRESS_STREET = "//input[@id='via']";
		public static final String INPUT_SITE_ADDRESS_STREET_NUMBER = "//input[@id='civico']";
		public static final String SELECT_SITE_ADDRESS_COUNTRY = "//select[@id='idNazione']";
		public static final String SELECT_SITE_ADDRESS_PROVINCE = "//select[@id='idProvincia']";
		public static final String SELECT_SITE_ADDRESS_CITY = "//select[@id='idComune']";
		public static final String SELECT_SITE_ADDRESS_CITY_NUMBER = "//select[@id='cap']";
		public static final String Search_On_Map = "//*[@data-toggle='modal']";//"//*[@id='formSiteData']//*[@id='searchOnMapModal']";
		public static final String Search_On_Map_searchStreetId = "//*[@id='formSiteData']//*[@id='searchOnMapModal']//*[@id='searchStreetId']";
		public static final String Search_On_Map_searchNumberId = "//*[@id='formSiteData']//*[@id='searchOnMapModal']//*[@id='searchNumberId']";
		public static final String Search_On_Map_searchCountryId = "//*[@id='formSiteData']//*[@id='searchOnMapModal']//*[@id='searchCountryId']";
		public static final String Search_On_Map_searchProvinceId = "//*[@id='formSiteData']//*[@id='searchOnMapModal']//*[@id='searchProvinceId']";
		public static final String Search_On_Map_searchCityId = "//*[@id='formSiteData']//*[@id='searchOnMapModal']//*[@id='searchCityId']";
		public static final String Search_On_Map_searchZipCodeId = "//*[@id='formSiteData']//*[@id='searchOnMapModal']//*[@id='searchZipCodeId']";
		public static final String Search_On_Map_Reset = "//*[@id='formSiteData']//*[@id='searchOnMapModal']//*[@id='reset']";
		public static final String Search_On_Map_Search = "//*[@id='formSiteData']//*[@id='searchOnMapModal']//*[@id='search']";
		public static final String Search_On_Map_Save = "//*[@id='formSiteData']//*[@id='searchOnMapModal']//*[@id='save']";
		public static final String Search_On_Map_Close = "//*[@id='formSiteData']//*[@id='searchOnMapModal']//*[@class='close']";
		public static final String INPUT_CONTACT_NAME = "//input[@id='nomeContatto_0']";
		public static final String INPUT_CONTACT_SURNAME = "//input[@id='cognomeContatto_0']";
		public static final String INPUT_CONTACT_EMAIL = "//input[@id='email_0']";
		public static final String INPUT_CONTACT_MOBILE_PHONE_NUMBER = "//input[@id='cell_0']";
		public static final String INPUT_CONTACT_TELEPHONE_NUMBER = "//input[@id='tel_0']";

		public static final String ERROR_MSG = "//div[@class='errorMsg']";
		public static final String CONFIRM_MSG = "//div[@class='confirmMsg']";

		public static final String BUTTON_BACK = "//button[@id='btnBack']";
		public static final String BUTTON_SAVE = "//button[@id='btnSave']";
		public static final String BUTTON_SAVE_NEXT = "//button[@id='btnNext']";

		//Page Installation Type (from NEW PROJECT page when click to 'Save & Next' button)
		public static final String LI_INSTALLATION_TYPE = "//*[@class='active']";
		public static final String SYSTEM_1 = "//input[@id='systemType1']";
		public static final String SYSTEM_2 = "//input[@id='systemType2']";
		public static final String SYSTEM_2_NO = "//input[@id='videoDoorEntrySystemType1']";
		public static final String SYSTEM_2_YES = "//input[@id='videoDoorEntrySystemType2']";

		public static final String TYPE_OF_1 = "//*[@id='serviceType1']";
		public static final String TYPE_OF_2 = "//*[@id='serviceType2']";
		public static final String BUTTON_START = "//input[@id='startWithAFullCustomSite']";
		
		public static final String TAB_MY_PROJECT = "//*[@id='my_projects']";
		
		public static final String TAB_GATE = "//*[@id='liLiv2_gate']//*[@id='gate']";
		public static final String MAIN_CONTENT = "//*[@class='info']//*[@class='mainContent']/div";
		public static final String TITLE = "//*[@class='info']//*[@class='title']";
		
	}
	
	public static final class Page_Installation_Type {
		
		public static final String LI_INSTALLATION_TYPE = "//*[@id='header']//*[@class='breadcrumb'][2]//*[@class='active']";
		
		public static final String TAB_CUSTOM_SITE = "//*[@id='tab_custom_site_link']";
		public static final String TAB_FORM_TEMPLATE = "//*[@id='tab_start_from_template_link']";
		
		public static final String SYSTEM_TYPE_1 = "//*[@id='systemType1']";
		public static final String SYSTEM_TYPE_2 = "//*[@id='systemType2']";
		public static final String SYSTEM_TYPE_2_NO_VDE = "//*[@id='videoDoorEntrySystemType1']";
		public static final String SYSTEM_TYPE_2_WITH_VDE = "//*[@id='videoDoorEntrySystemType2']";
		public static final String SERVICE_TYPE_1 = "//*[@id='serviceType1']";
		public static final String SERVICE_TYPE_2 = "//*[@id='serviceType2']";
		
		public static final String BUTTON_START_FULL_CUSTOMER_SITE = "//*[@id='startWithAFullCustomSite']";
		public static final String BUTTON_START_FROM_TEMPLATE = "//*[@id='tab_start_from_template_link']";
		public static final String TAB_MY_PROJECT = "//*[@id='main_navigation']//*[@class=' navigButton'][1]//*[@class='projects']";
	}
	
	public static final class Structure_Definition_Tab {
		//Home > Project > Structure Definition > Buildings/Risers
		public static final String LI_BUILDINGS_RISERS = "//*[@class='active']";
		public static final String BUILDINGS_RISERS_NUMBER = "//*[@id='clHeader_" + "NUMBER" + "']";
		public static final String INPUT_NAME_OF_THE_BUILDING = "//input[@id='name" + "NUMBER" + "']";
		public static final String SELECT_NUMBER_OF_APARTMENT = "//select[@id='appNr" + "NUMBER" + "']";
		public static final String SELECT_INSTALLATION_TYPE = "//select[@id='buildingType0']";
		public static final String BUTTON_ADD_BUILDING = "//*[@id='addBuilding']";
		public static final String BUTTON_SAVE_TAB_STRUCTURE = "//*[@id='SAVE']";
		public static final String BUTTON_SAVE_NEXT_TAB_STRUCTURE = "//*[@id='NEXT']";

		public static final String SUCCESS_MSG = "//div[@class='success']";
		public static final String ERROR_MSG = "//*[@id='buildingForm.errors']";
		
		//Home > Project > Structure Definition > Floors
		public static final String LI_FLOORS = "//*[@class='active']";
		public static final String SELECT_NUMBER_OF_FLOORS = "//select[@id='buildings" + "NUMBER" + "nrFloors'][@name='buildings[" + "NUMBER" + "].nrFloors']";
		public static final String SELECT_NUMBER_APARTMENT_FLOORS = "//select[@id='b0_f" + "NUMBER" + "']";
		public static final String BUTTON_BACK_FLOORS = "//button[@id='BACK']";
		public static final String BUTTON_SAVE_FLOORS = "//button[@id='SAVE']";
		public static final String BUTTON_SAVE_NEXT_FLOORS = "//button[@id='NEXT']";		
		public static final String CHECKBOX_INHERITS_FROM_THE_FIRST = "//*[@id='inherit_" + "NUMBER" + "']";
		public static final String TOTAL_APARTMENTS = "//*[@id='totalApartments" + "NUMBER" + "']";

		//Home > Project > Structure Definition > delete structure
		public static final String DEL_BUILDING_1 = "//*[@id='delBuilding_0']";
		public static final String POPUP_CONFIRM = "//*[@id='confirm_0']";
		public static final String BUTTON_DETELE = "//*[@id='confirmDelete_0']";
		public static final String POPUP_ERROR = "//*[@id='ErrorModal']";
		public static final String POPUP_ERROR_Confirm = "//*[@id='ErrorModal']//*[@class='round']";
		public static final String TAB_Structure_Definition = "//*[@class='round definition']";

		public static final String Delete_Building = "//*[@id='delBuilding_" + "NUMBER" + "']";
		public static final String POPUP_Delete = "//*[@id='confirm_" + "NUMBER" + "']";
		public static final String Delete_Confirm = "//*[@id='confirmDelete_" + "NUMBER" + "']";
		
		public static final String DROPBOX_BUILDING_NUM_FLOORS = "//*[@id='buildings" + "NUMBER" + "nrFloors']";
		public static final String DROPBOX_BUILDING_NUM_APARTMENTS = "//*[@id='floorFormId']//*[@id='floors_" + "NUMBER" + "']//*[@id='b" + "NUMBER" + "_f0']";

		public static final String MULTI_SPACE = "    ";
		public static final String TAB_SYSTEM_ADDRESSING = "//*[@id='system_addressing']";
		public static final String TAB_STRUCTURE_DEFINITION = "//*[@id='structure_definition']";
	}

	public static final class Gates_Tab {
		//Home > Project > Gate Definition > Gates
		public static final String Show_GATES_tab = "//*[@class='plant_navigation']//*[@id='liLiv2_gate']";

		public static final String LI_GATES = "//*[@class='active']";
		public static final String GATES_NAME = "//input[@id='name_" + "NUMBER" + "']";
		public static final String BUS = "//select[@id='gateType_" + "NUMBER" + "']";
		public static final String GATE_NUMBER = "//*[@id='clHeader_" + "NUMBER" + "']";

		public static final String CHECKBOX_GATE_DDN = "//input[@id='ddn_" + "NUMBER" + "']";
		// DDN selection pop-up in Gates tab when click to 'CHECKBOX_GATE_DDN'
		public static final String DDN_SELECTION = "//div[@id='ddnSelection']";
		public static final String DDN_OPTION_0 = "//input[@id='ddn_option_0']";//Sfera Classic ref. 342630
		public static final String DDN_OPTION_1 = "//input[@id='ddn_option_1']";//Nouvelle Sfera - DDN ref. 352500
		public static final String DDN_OPTION_2 = "//input[@id='ddn_option_2']";//Linea300 ref. 308040
		public static final String CheckBox_DDN = "//input[@id='ddn_" + "NUMBER" + "']";

		public static final String Delete_Gates = "//form[@id='gatesFormId']//*[@id='delGate_" + "NUMBER" + "']";
		public static final String CHECKBOX_GATE_VIGIK_READER = "//input[@id='vigikReader_" + "NUMBER" + "']";
		public static final String CHECKBOX_GATE_BADGE_READER = "//input[@id='badgeReader_" + "NUMBER" + "']";
		public static final String CHECKBOX_GATE_KEYPAD = "//input[@id='keypad_" + "NUMBER" + "']";
		public static final String CHECKBOX_GATE_RADIO_READER = "//input[@id='radioReader_" + "NUMBER" + "']";
		public static final String IMG_DEVICES = "//*[@id='devices_" + "NUMBER" + "']";
		public static final String BUTTON_ADD_GATE = "//*[@id='addGate']";
		public static final String BUTTON_BACK_GATE = "//button[@id='BACK']";
		public static final String BUTTON_SAVE_GATE = "//button[@id='SAVE']";
		public static final String BUTTON_SAVE_NEXT_GATE = "//*[@id='NEXT']"; //"//button[@id='NEXT']";
		public static final String RADIO_DEVICE = "//div[@class='d_3']";

		public static final String SUCCESS_MSG_GATE = "//div[@class='success']";
		public static final String ERROR_MSG_GATE = "//*[@id='gateForm.errors']";
		public static final String ERROR_MSG_GATE0_NAME = "//*[@id='gates0.name.errors']";

		//Home > Project > Gate Definition > Gates and Buildings/Risers
		public static final String LI_GATES_BUILDINGS_RISERS_TAB = "//*[@class='active']";
		public static final String BUTTON_LINK_GATES = "//*[@class='addGatesToBuilding round']";
		public static final String POPUP_SELECT_GATE = "//*[@id='gatesSelect_0']";
		public static final String CHECKBOX_ALL = "//*[@id='cb_gates_modalGrid_0']";
		public static final String CHECKBOX_1 = "//*[@id='jqg_gates_modalGrid_0_1']";
		public static final String CHECKBOX_2 = "//*[@id='jqg_gates_modalGrid_0_2']";
		public static final String BUTTON_OK_GATES = "//*[@id='ok_0']";
		public static final String BUTTON_CANCEL_GATES = "//*[@id='gatesSelect_0']//*[@class='modal-body']//*[@class='modalActions']//*[@class='round']";
		public static final String BUTTON_GATES_BUILDINGS_BACK = "//button[@id='BACK']";
		public static final String BUTTON_GATES_BUILDINGS_SAVE = "//button[@id='SAVE']";
		public static final String BUTTON_GATES_BUILDINGS_SAVE_NEXT = "//button[@id='NEXT']";
		public static final String BUTTON_LINK_GATE2 = "//*[@class='clearfix'][2]//*[@class='addGatesToBuilding round']";
		public static final String CHECKBOX = "//*[@id='jqg_gates_modalGrid_1_1']";
		public static final String BUTTON_OK = "//*[@id='ok_1']";

		public static final String SUCCESS_MSG_GATES_BUILDINGS = "//div[@class='success']";

		public static final String DELETE_GATE = "//*[@id='delGate_" + "NUMBER" + "']";
		public static final String POPUP_DELETE_GATE = "//*[@id='confirm_" + "NUMBER" + "']";
		public static final String BUTTON_DETELE_GATE = "//*[@id='confirmDelete_" + "NUMBER" + "']";
		public static final String POPUP_ERROR_DETELE = "//*[@id='ErrorModal']";
		public static final String ERROR_Confirm = "//*[@id='ErrorModal']//*[@class='round']";

		public static final String TAB_Gate = "//*[@class='round gate']";
		public static final String TAB_System_Addressing = "//*[@id='system_addressing']";
		public static final String TAB_Gateways = "//*[@class='round system_addressing']";

		public static final String BUTTON_LINK_GATES_1 = "//*[@id='buildingsGatesFormId']//*[@class='clearfix'][1]//*[@class='addGatesToBuilding round']";
		public static final String BUTTON_LINK_GATES_2 = "//*[@id='buildingsGatesFormId']//*[@class='clearfix'][2]//*[@class='addGatesToBuilding round']";
		public static final String POPUP_CHECKBOX_1 = "//*[@id='gview_gates_modalGrid_0']//table[@id='gates_modalGrid_0']/tbody/tr[2]/td[1]/input";
		public static final String POPUP_CHECKBOX_2 = "//*[@id='gview_gates_modalGrid_0']//table[@id='gates_modalGrid_0']/tbody/tr[3]/td[1]/input";

		public static final String SYS_DATA_LEFT_TAB = "//*[@class='plant_menu']//*[@class='round '][3]/a[@class='round system_data']/span";

		public static final String POPUP_SELECT_GATE_1 = "//*[@id='gatesSelect_1']";
		public static final String POPUP_SELECT_GATE_1_CHECKBOX_2 = "//*[@id='gatesSelect_1']//table[@id='gates_modalGrid_1']/tbody/tr[3]/td[1]/input";
		public static final String POPUP_SELECT_GATE_1_BUTTON_OK_ = "//*[@id='ok_1']";
		
		public static final String LINKGATE2_CHECKBOX1 = "//*[@id='jqg_gates_modalGrid_1_1']";	//second building, 1st gate
		public static final String BUTTON_LINK_GATES_BUILDING = "//*[@id='buildingsGatesFormId']//*[@class='clearfix'][NUMBER]//*[@class='addGatesToBuilding round']";
		public static final String POPUP_LINK_GATES_BUILDING = "//*[@id='gatesSelect_NUMBER']";
		public static final String BUTTON_OK_GATES_BUILDING = "//*[@id='ok_NUMBER']";
		public static final String CHECKBOX_GATES_BUILDING = "//*[@id='jqg_gates_modalGrid_BUILDINGNUMBER_GATENUMBER']";
		public static final String TABLE_GATES_BUILDING = "//*[@id='gates_modalGrid_NUMBER']/tbody/tr";
		public static final String TABLE_GATES_BUILDING_GATENAME = "//*[@id='gates_modalGrid_BUILDINGNUMBER']/tbody/tr[GATENUMBER]/td[3]";
		
		public static final String DDN_OPTION_X = "//input[@id='ddn_option_" + "NUMBER" + "']";
		public static final String CHECKBOX_GATES_X = "//*[@id='jqg_gates_modalGrid_BNUMBER_GNUMBER']";
		public static final String BUTTON_OK_X = "//*[@id='ok_NUMBER']";
		
		public static final String TAB_MY_PROJECT = "//*[@id='main_navigation']//*[@class=' navigButton']//*[@class='projects']";
		public static final String MSG_VALIDATION = "//*[@id='projectNotValidatedDialog']";
		public static final String BUTTON_CONTINUE = "//button[@class='unsavedDataDialogButton'][2]";
		public static final String BUTTON_GOTO_VALIDATION = "//button[@class='unsavedDataDialogButton'][1]";
	
		public static final String CHECKBOX_BUILDING_2 = "//*[@id='jqg_gates_modalGrid_1_2']";
		public static final String CHECKBOX_BUILDING_1 = "//*[@id='jqg_gates_modalGrid_0_1']";
		public static final String CHECKBOX_BUILDING_RISER_2 = "//*[@id='jqg_gates_modalGrid_1_1']";
		
		public static final String TAB_MENU_MYPROJECT = "//*[@id='header']//*[@id='main_navigation']//*[@class='projects']";
		public static final String POPUP_MODIFY_GOTOVALIDATIONPAGE = "//button[@class='unsavedDataDialogButton'][1]";
		
		
	}

	public static final class System_Data_Tab {
		
		public static final String BUTTON_BACK = "//button[@id='BACK']";
		public static final String BUTTON_SAVE = "//button[@id='SAVE']";
		public static final String BUTTON_SAVE_NEXT = "//button[@id='NEXT']";

		//Home > Project > System Data > Control Unit
		public static final String LI_CONTROL_UNIT = "//*[@class='active']";
		public static final String LI_CONTROL_UNIT_2 = "//*[@class='active'][2]";
		public static final String INPUT_CONTROL_UNIT_NAME = "//input[@id='name_" + "NUMBER" + "']";
		public static final String INPUT_CONTROL_UNIT_TYPE = "//*[@id='type_0']";
		public static final String CONTROL_UNIT_NUMBER = "//*[@id='clHeader_" + "NUMBER" + "']";
		public static final String SELECT_CONTROL_UNIT_ADDRESS = "//select[@id='address_" + "NUMBER" + "']";
		public static final String BUTTON_CONTROL_UNIT_LINK_GATES = "//*[@class='addGatesToUnit round']"; //*[@class='addGatesToUnit round'][@href='#gatesSelect_"+ Number +"']
		public static final String BUTTON_CONTROL_UNIT_LINK_GATES_2 = "//*[@class='clearfix'][2]//*[@class='addGatesToUnit round']"; //*[@class='addGatesToUnit round'][@href='#gatesSelect_"+ Number +"']
		public static final String BUTTON_CONTROL_UNIT_1_LINK_GATES = "//*[@id='controlUnitFormId']//*[@class='clearfix'][1]//*[@class='addGatesToUnit round']";
		public static final String BUTTON_CONTROL_UNIT_2_LINK_GATES = "//*[@id='controlUnitFormId']//*[@class='clearfix'][2]//*[@class='addGatesToUnit round']";

		public static final String CONTROL_UNIT_CHECKBOX_ALL = "//*[@id='cb_modalGrid_0']";
		public static final String CONTROL_UNIT_CHECKBOX_1 = "//*[@id='jqg_modalGrid_0_1']";
		public static final String CONTROL_UNIT_CHECKBOX_2 = "//*[@id='jqg_modalGrid_1_1']";
		public static final String CONTROL_UNIT_CHECKBOX_1_TC_03_10 = "//*[@id='controlUnitFormId']//*[@id='jqg_modalGrid_0_1']";
		public static final String BUTTON_OK_GATES = "//*[@id='ok_0']";
		public static final String BUTTON_OK_GATES_2 = "//*[@id='ok_1']";
		public static final String BUTTON_CANCEL_GATES = "//*[@id='gatesSelect_0']//*[@class='modal-body']//*[@class='modalActions']//*[@class='round']";
		public static final String BUTTON_ADD_CONTROL_UNIT = "//*[@id='addUnit']";
		public static final String Button_Link_Gate = "//*[@class='clearfix'][" + "NUMBER"
				+ "]//a[@class='addGatesToUnit round']";
		public static final String CheckBox_ControlUnit = "//*[@id='cb_modalGrid_" + "NUMBER" + "']";
		public static final String Button_Link_Gate_Nhan = "//*[@class='clearfix'][" + "NUMBER"
				+ "]//*[@class='gridAction']/*[@class='addGatesToUnit round']";
		public static final String CheckBox_ControlUnit_Nhan = "//*[@id='jqg_modalGrid_1_" + "NUMBER" + "']";
		public static final String Button_Associate_OK = "//*[@id='ok_" + "NUMBER" + "']";
		public static final String Button_Delete_ControlUnit = "//*[@class='cl_actions']/*[@id='delUnit_" + "NUMBER" + "']";

		public static final String Delete_ContrlUnit = "//*[@id='confirmDelete_" + "NUMBER" + "']";
		public static final String TAB_System_Data = "//*[@class='round system_data']";
		
		public static final String DROPDOWNBOX_CONTROL_UNIT_ADDRESS_0 = "//*[@id='address_0']";
		public static final String DROPDOWNBOX_CONTROL_UNIT_ADDRESS_1 = "//*[@id='address_1']";
		
		public static final String BUTTON_LINK_GATES_CENTRAL = "//*[@id='controlUnitFormId']//*[@class='clearfix'][NUMBER]//*[@class='addGatesToUnit round']";
		public static final String POPUP_LINK_GATES_CENTRAL = "//*[@id='gatesSelect_NUMBER']";
		public static final String BUTTON_CONFIRM_GATES_CENTRAL = "//*[@id='ok_NUMBER']";
		public static final String CHECKBOX_GATES_CENTRAL = "//*[@id='jqg_modalGrid_CENTRALNUMBER_GATENUMBER']";
		public static final String TABLE_LINK_GATES_CENTRAL = "//*[@id='modalGrid_NUMBER']/tbody/tr";
		public static final String TABLE_LINK_GATES_CENTRAL_GATENAME = "//*[@id='modalGrid_CENTRALNUMBER']/tbody/tr[GATENUMBER]/td[3]";
		
		
		//Home > Project > System Data > GateWay
		public static final String LI_GATE_WAY = "//*[@class='active']";
		public static final String LI_GATE_WAY_2 = "//*[@class='active'][2]";
		public static final String BUTTON_GATE_WAY_LINK_GATE = "//*[@class='addGatesToGateway round']";
		public static final String POPUP_SELECT_GATES = "//*[@id='gatesSelect_0']";
		public static final String POPUP_SELECT_GATES_2 = "//*[@id='gatesSelect_1']";
		public static final String CHECKBOX_ALL = "//*[@id='cb_modalGrid_0']";
		public static final String CHECKBOX_1 = "//*[@id='jqg_modalGrid_0_1']";
		public static final String CHECKBOX_2_GATE = "//*[@id='jqg_modalGrid_0_2']";
		public static final String CHECKBOX_1_TC_03023 = "//*[@id='gatewayFormId']//*[@id='jqg_modalGrid_0_1']";
		public static final String CheckBox_2 = "//*[@id='jqg_modalGrid_0_" + "NUMBER" + "']";
		public static final String BUTTON_OK = "//*[@id='ok_0']";
		public static final String BUTTON_CANE = "//*[@id='gatesSelect_0']//*[@class='modal-body']//*[@class='modalActions']//*[@class='round']";
		public static final String BUTTON_LINK_GATES = "//a[@href='#gatesSelect_" + "NUMBER" + "'][@class='addGatesToGateway round']";
		public static final String CHECKBOX_GATE_WAY_1 = "//*[@id='jqg_modalGrid_0_1']";
		public static final String CHECKBOX_GATE_WAY_2 = "//*[@id='jqg_modalGrid_1_1']";

		public static final String SUCCESS_MSG_CONTROL_UNIT = "//div[@class='success']";
		public static final String ERROR_MSG_CONTROL_UNIT = "//*[@id='controlUnitForm.errors']";

		public static final String GATEWAY_NUMBER = "//*[@id='clHeader_" + "NUMBER" + "']";
		public static final String NAME_GATEWAY = "//input[@id='name_" + "NUMBER" + "']";
		public static final String BUS = "//select[@id='installationType_" + "NUMBER" + "']";
		public static final String BUTTON_ADD_GATEWAY = "//*[@id='addGateway']";
		public static final String ERROR_MSG_GATEWAY = "//*[@id='gatewayFormId']//*[@id='gatewayForm.errors']";
		public static final String SUCCESS_MSG_GATEWAY = "";

		public static final String CHECKBOX_1_2 = "//*[@id='modalGrid_1']/tbody/tr[2]/td[1]/input";
		public static final String BUTTON_LINK_GATE_2 = "//*[@id='controlUnitFormId']//*[@class='clearfix'][2]//*[@class='gridAction']/a[@class='addGatesToUnit round']";
		public static final String INPUT_CONTROL_UNIT_NAME_2 = "//*[@id='controlUnitFormId']//*[@class='clearfix'][2]//*[@id='name_1']";
		public static final String POPUP_2_BUTTON_OK = "//*[@id='ok_1']";
		
		public static final String BUTTON_LINK_GATEWAY_X = "//*[@id='gatewayFormId']//*[@class='clearfix'][NUMBER]//*[@class='addGatesToGateway round']";
		public static final String BUTTON_DELETE_GATEWAY_X = "//*[@id='delGateway_NUMBER']";
		public static final String BUTTON_DELETE_CONFIRM_X = "//*[@id='confirmDelete_NUMBER']";
	
		public static final String TAB_SYSTEM_DATA = "//*[@id='system_data']";
		public static final String MULTI_SPACE = "    ";
	}

	public static final class Setup_Service {
		public static final String SELECT_SERVICE = "//select[@id='serviceType']";
		public static final String LOCAL = "Local Mng";
		public static final String ONLINE = "Online Mng";

		public static final String POPUP_CHANGE_SERVICE = "//*[@id='changeServiceTypeDialog']";
		public static final String BUTTON_CHANGE = "//button[@id='ok']";
		public static final String BUTTON_DONOT_CHANGE = "//button[@id='cancel']";
	}

	//Home > Project > System Data > System Address
	public static final class System_Address_Tab {
		public static final String LI_SYSTEM_ADDRESS = "//*[@class='active']";
		//public static final String BUTTON_BACK = "//button[@id='BACK']";
		public static final String BUTTON_BACK = "//*[@id='BACK']";
		public static final String BUTTON_SAVE = "//button[@id='SAVE']";
		public static final String BUTTON_VALIDATE_PROJECT = "//button[@id='VALIDATE_PROJECT']";
		public static final String LABEL_APARTMENTS = "//*[@class='devices system_address_devices']/*[@class='tree']/*[@class='open']//*[@class='open'][2]/ul/li[1]";
		public static final String APARTMENT = "//*[@class='devices system_address_devices']/*[@class='tree']/*[@class='open']//*[@class='open'][2]/ul/li[2]";
		public static final String LABEL_APARTMENTS_1 = "//*[@class='devices system_address_devices']/*[@class='tree']/*[@class='open']//*[@class='open'][3]/ul/li/div[1]";
		public static final String DETAIL_APARTMENTS = "//div[@id='viewDetailsSection']";
		public static final String APARTMENT_LOCAL_ADDRESS_1 = "//*[@name='selectedBuilding.floors[0].apartments[0].logicalAddress']";
		public static final String APARTMENT_LOCAL_ADDRESS_2 = "//*[@name='selectedBuilding.floors[0].apartments[1].logicalAddress']";
		public static final String APARTMENT_LOCAL_ADDRESS_3 = "//*[@name='selectedBuilding.floors[1].apartments[0].logicalAddress']";
		public static final String APARTMENT_LOCAL_ADDRESS_4 = "//*[@name='selectedBuilding.floors[1].apartments[1].logicalAddress']";
		public static final String APARTMENT_LOCAL_ADDRESS_5 = "//*[@name='selectedBuilding.floors[2].apartments[0].logicalAddress']";
		public static final String APARTMENT_LOCAL_ADDRESS_6 = "//*[@name='selectedBuilding.floors[2].apartments[1].logicalAddress']";
		public static final String APARTMENT_LOCAL_ADDRESS_7 = "//*[@name='selectedBuilding.floors[3].apartments[0].logicalAddress']";
		public static final String APARTMENT_LOCAL_ADDRESS_8 = "//*[@name='selectedBuilding.floors[3].apartments[1].logicalAddress']";
		public static final String SUCCESS_MGS_APARTMENT_ADDRESS = "//div[@class='success']";
		public static final String LABEL_Gates = "//*[@id='Gate1__backboneGatesGate1__Big Gate']";
		public static final String LABEL_GATES_HUNG = "//*[@class='devices system_address_devices']/*[@class='tree']/*[@class='open']//*[@class='open'][1]/ul/li[1]";

		public static final String Gateway_FW_VER = "//*[@class='gate_components clearfix']//*[@inputtype='firmwareVersion']";
		public static final String GATEWAY_SERIAL_NUMBER = "//*[@class='gate_components clearfix']//*[@inputtype='serialNumber']";
		public static final String NAME_DEVICES = "//*[@class='backboneGateTreeElement']";
		public static final String BUTTON_PRINT = "//*[@id='printIcon']";
		public static final String POPUP_PRINT = "//div[@id='modal-print']";
		public static final String PRINT = "//*[@text='Print']";
		public static final String CANCEL_PRINT = "//*[@text='Cancel']";
		public static final String VALIDATE_PROJECT = "//*[@id='VALIDATE_PROJECT']";

		public static final String Apartment1 = "//*[@class='devices system_address_devices']//*[@class='open'][2]/*[@class='interfaceTreeElementWithoutGateway']";
		public static final String Apartment2 = "//*[@class='devices system_address_devices']//*[@class='open'][3]/*[@class='interfaceTreeElementWithoutGateway']";
		public static final String RiserBaseAddress = "//*[@id='viewDetailsSection']//*[@class='twoColForm clearfix']/*[@class='equal'][1]/select[@inputtype='riserBaseAddress']";
		public static final String Father_Node = "//*[@id='localManagement']";
		public static final String Father_Node_ERROR = "//*[@id='localManagement' and @class='colla parentTreeElementError']";
		public static final String Control_Units_Node = "//*[@id='localManagement__cuLocalManagement']";
		public static final String Control_Units_Node_ERROR = "//*[@id='localManagement__cuLocalManagement' and @class='controlUnitTreeElementWithoutGateway treeElementError']";
		public static final String Control_Unit_2_ERROR_DETAIL = "//*[@id='viewDetailsSection']//*[@class='gate_components clearfix'][2]//*[@class='warning']";
		public static final String Gate_Node = "//*[@id='localManagement__backboneGatesLocalManagement']";
		public static final String Gate_Father_Node_ERROR = "//*[@id='localManagement__backboneGatesLocalManagement' and @class='colla parentTreeElementError']";
		public static final String Li_Gate = "//*[@id='localManagement__backboneGatesLocalManagement__nameGate']";
		public static final String Li_Gate_General = "//*[contains(@id, 'serviceType') and contains(@id, 'nameGate')]";
		public static final String Gate_Node_ERROR = "//*[@id='localManagement__backboneGatesLocalManagement__nameGate' and @class='backboneGateTreeElement treeElementError']";
		public static final String Gate_Node_ERROR_DETAIL = "//*[@id='viewDetailsSection']//*[@class='component_header clearfix']//*[@class='warning']";
		public static final String External_Panel_Address = "//*[@name='selectedGate.runtimeDevices[0].runtimeKeyObjects[0].runtimeKeyObjectConfs[1].keyValue']";
		public static final String Gate2_External_Panel_Address = "//*[@name='selectedGate.runtimeDevices[1].runtimeKeyObjects[0].runtimeKeyObjectConfs[1].keyValue']";
		
		public static final String DROPBOX_SERVICE_TYPE = "//*[@id='plantInformationComponent']//*[@id='plantInformationForm']//select[@id='serviceType']";
		public static final String POPUP_CONFIRM_CHANGE_SERVCE = "//*[@id='changeServiceTypeDialog']";
		public static final String POPUP_CONFIRM_CHANGE_SERVICE_OK = "//*[@id='changeServiceTypeDialog']//button[@id='ok']";
		public static final String POPUP_CONFIRM_CHANGE_SERVICE_CANCEL = "//*[@id='changeServiceTypeDialog']//button[@id='cancel']";

		public static final String My_Project = "//*[@id='main_navigation']/*[@class=' navigButton']/*[@class='projects']";
		public static final String LI_RISER_X = "//*[@id='localManagement__" + "RISERNAME" + "']";
		public static final String RISER_ADDRESS = "//*[@name='selectedInterface.runtimeKeyObjects[0].runtimeKeyObjectConfs[0].keyValue']";
		public static final String RISER_WARNING = "//*[@id='viewDetailsSection']//*[@class='warning']";
		
		public static final String LI_APARTMENT_X = "//*[@id='localManagement__APARTMENTNAME__apartmentAddress']";
		public static final String APARTMENT_1_ADDRESS = "//*[@id='apartment_1']";
		public static final String APARTMENT_2_ADDRESS = "//*[@id='apartment_2']";
		
		public static final String LI_APARTMENT_NO_RISER_X = "//*[@id='localManagement__apartmentAddress__APARTMENTNAME']";
		public static final String BUTTON_BACK_new = "//*[@id='BACK']";
		
		public static final String MSG_GATE_Associated_Central_Unit = "//*[@id='viewDetailsSection']//*[@class='device_header clearfix']//*[contains(text(), 'Associated to central unit')]";
		public static final String MSG_WARNING_DDN = "//*[@id='viewDetailsSection']//*[@class='device_header clearfix']//*[@class='warningDDN']";
		public static final String TABLE_LOGICAL_ASSOCIATION = "//*[@id='table-gba']/tbody/tr[rowNum]/td[colNum]";
		
		public static final String LABEL_CENTRAL = "//*[@id='tab_devices_view']//*[@id='{GATEWAYNAME}__cu{GATEWAYNAME}']";
		public static final String LABEL_GATE_ON_BACKBONE = "//*[@id='tab_devices_view']//*[@id='{GATEWAYNAME}__backboneGates{GATEWAYNAME}__{GATENAME}']";
		public static final String LABEL_GATE_ON_RISER = "//*[@id='tab_devices_view']//*[@id='{GATEWAYNAME}__{BUILDINGNAME}__riserGates{BUILDINGNAME}__{GATENAME}']";
		
		public static final String VIEW_STRUCTURE = "//*[@id='tab_devices_view']//*[@class='system_definition']//*[@class='tree']";
		public static final String VIEW_DETAIL = "//*[@id='tab_devices_view']//*[@class='system_definition']//*[@id='viewDetailsSection']";
		
		public static final String CONTROL_1_ADDRESS_C1C0 = "//*[@class='gate_components clearfix'][1]//*[@class='equal'][1]/select";
		public static final String CONTROL_1_ADDRESS_P = "//*[@class='gate_components clearfix'][1]//*[@class='equal'][2]/select";
		
		public static final String CONTROL_2_ADDRESS_C1C0 = "//*[@class='gate_components clearfix'][2]//*[@class='equal'][1]/select";
		public static final String CONTROL_2_ADDRESS_P = "//*[@class='gate_components clearfix'][2]//*[@class='equal'][2]/select";
		
		public static final String CONTROL_3_ADDRESS_C1C0 = "//*[@class='gate_components clearfix'][3]//*[@class='equal'][1]/select";
		public static final String CONTROL_3_ADDRESS_P = "//*[@class='gate_components clearfix'][3]//*[@class='equal'][2]/select";
		
		public static final String GATE_1_DDN_ADDRESS_P = "//*[@class='component_details clearfix'][1]//*[@class='equal']/select";
		public static final String GATE_1_KEYPAD_ADDRESS_AB = "//*[@class='component_details clearfix'][2]//*[@class='equal'][1]/input";
		public static final String GATE_1_KEYPAD_ADDRESS_C = "//*[@class='component_details clearfix'][2]//*[@class='equal'][2]/select";
		public static final String GATE_1_VIGIK_ADDRESS_AB = "//*[@class='component_details clearfix'][3]//*[@class='equal'][1]/input";
		public static final String GATE_1_VIGIK_ADDRESS_C = "//*[@class='component_details clearfix'][3]//*[@class='equal'][2]/input";
		
		public static final String GATE_2_DDN_ADDRESS_P = "//*[@class='component_details clearfix'][1]//*[@class='equal']/select";
		public static final String GATE_2_VIGIK_ADDRESS_AB = "//*[@class='component_details clearfix'][2]//*[@class='equal'][1]/input";
		public static final String GATE_2_VIGIK_ADDRESS_C = "//*[@class='component_details clearfix'][2]//*[@class='equal'][2]/input";
		
		public static final String GATE_3_KEYPAD_ADDRESS_AB = "//*[@class='component_details clearfix']//*[@class='equal'][1]/input";
		public static final String GATE_3_KEYPAD_ADDRESS_C = "//*[@class='component_details clearfix']//*[@class='equal'][2]/select";
		
		public static final String GATE_4_DDN_ADDRESS_P = "//*[@class='component_details clearfix'][1]//*[@class='equal']/select";
		public static final String GATE_4_VIGIK_ADDRESS_AB = "//*[@class='component_details clearfix'][2]//*[@class='equal'][1]/input";
		public static final String GATE_4_VIGIK_ADDRESS_C = "//*[@class='component_details clearfix'][2]//*[@class='equal'][2]/input";
		
		public static final String GATE_5_RADIO_ADDRESS_AB = "//*[@class='component_details clearfix']//*[@class='equal'][1]/input";
		public static final String GATE_5_RADIO_ADDRESS_C = "//*[@class='component_details clearfix']//*[@class='equal'][2]/select";
		
		public static final String GATE_6_BADGE_ADDRESS_AB = "//*[@class='component_details clearfix']//*[@class='equal'][1]/input";
		public static final String GATE_6_BADGE_ADDRESS_C = "//*[@class='component_details clearfix']//*[@class='equal'][2]/select";
	
		public static final String MSG_SAVE_SUCCESSFULLY = "//*[@id='newSystemAddressFormId']//*[@id='tab_devices_view']//*[@class='success']";
	
		public static final String TAB_SYSTEM_DATA = "//*[@class='plant_menu']//*[@class='plant_navigation']//*[@class='round'][1]//*[@class='round system_data']";
		public static final String NODE_GATEWAY_X = "//*[@id='tab_devices_view']//*[@id='NUMBER']";
		public static final String NODE_RISER_GATE_X = "//*[@id='{GATEWAY}__{BUILDING}__riserGates{BUILDING}__{GATE}']";
		public static final String NODE_BACKBONE_RGATE_X = "//*[@id='{GATEWAY}__{BUILDING}__backboneGates{BUILDING}__{GATE}']";
		public static final String NOTE_APARTMENT_X = "//*[@id='{GATEWAY}__{BUILDING}__apartmentAddress']";
		public static final String NOTE_BUILDING_X = "//*[@id='{GATEWAY}__{BUILDING}']";
		
		public static final String GATE_X__ADDRESS_P = "//*[@class='component_details clearfix'][1]//*[@class='equal']/select";
		public static final String GATE_X__ADDRESS_C = "//*[@class='component_details clearfix'][2]//*[@class='equal'][2]/select";
		
		public static final String HEADER_SYSTEM_ADDRESS = "//*[@id='header']//*[@class='breadcrumb']//*[@class='active']";
		
		public static final String TREE_GATE_WAY = "//*[@id='"+ "STRING"+ "']";
		public static final String FW_VER_GATE_WAY_2 = "//*[@class='twoColForm clearfix']//*[@inputtype='firmwareVersion']";
		public static final String SERIAL_NUMBER_GATE_WAY_2 = "//*[@class='twoColForm clearfix']//*[@inputtype='serialNumber']";
		public static final String NAME_NOTE_GATEWAY_OR_CTRL = "//*[@id='viewDetailsSection']//span[@class='info']";
		public static final String NOTE_CTRL = "//*[@id='"+ "STRING" + "__cu" + "STRING" + "']";
		public static final String NOTE_BUILDING = "//*[@id='" + "GATE_WAY_NAME" + "__" + "BUIDING_NAME" + "']";
		public static final String NOTE_GATE = "//*[@id='" + "GATE_WAY_NAME" + "__backboneGates" + "GATE_WAY_NAME" + "__" + "GATE_NAME" + "']";
		public static final String NAME_NOTE_GATE = "//*[@id='tab_devices_view']//*[@id='selectedGate.name']";
		public static final String NOTE_APARTMENT_ADDRESS = "//*[@id='" + "GATE_WAY_NAME" + "__" + "BUIDING_NAME" + "__apartmentAddress']";
		public static final String NAME_NOTE_BUILDING = "//*[@id='selectedBuilding.name']";
		public static final String TAB_Structure_Definition = "//*[@class='round definition']";
		
		public static final String TH_TABLE_GATES = "//*[@id='table-gates']/thead/tr[1]/th[1]";
		public static final String TH_TABLE_APARTMENT = "//*[@id='table-ap']/thead/tr[1]/th[1]";
		public static final String TH_TABLE_CENTRAL_UNITS = "//*[@id='table-cu']/thead/tr[1]/th[1]";
		public static final String TD_TABLE_GATES_DETAILS = "//*[@id='table-gd']/tbody/tr[1]/td[1]";
		public static final String TD_TABLE_GATES_BUILDING_ASSOCIATIONS = "//*[@id='table-gba']/thead/tr[1]/th[1]";
		public static final String DATA_COLUMN_TABLE_GATES_BUILDING_ASSOCIATIONS_X = "//*[@id='table-gba']/tbody/tr[1]/td[{NUMBER}]";
		public static final String NOTE_GATE_LOCAL = "//*[@id='localManagement__{BUILDING_NAME}__riserGates{BUILDING_NAME}__{GATE_NAME}']";
		public static final String READER_ADDRESS_C = "//*[@class='twoColForm clearfix']//*[@class='equal']//*[@inputtype='readerAddress']";
		public static final String EXTERNAL_PANEL_ADDRESS_P = "//*[@class='twoColForm clearfix']//*[@class='equal']//*[@inputtype='externalPanelAddress']";
		public static final String NOTE_GATE_LOCAL_BACKBONE = "//*[@id='localManagement__backboneGatesLocalManagement__{GATE_NAME}']";
		
		public static final String TAB_GATE = "//*[@class='menu']//*[@class='plant_menu']//*[@class='plant_navigation']//*[@class='round gate']";
	}

	//Home > Project > System Data > System Project Activation
	public static final class Project_Activation_Tab {
		public static final String LI_CONTROL_UNIT = "//*[@class='active']";
		public static final String BUTTON_BACK = "//button[@id='BACK']";
		public static final String BUTTON_ACTIVATE_PROJECT = "//button[@id='ACTIVATE_PROJECT']";

		public static final String Rule = "//*[@id='rules']//*[@class='r_collapsible rules collapse-close']";
		public static final String IMG_Ok_Hand = "//img[contains(@src, 'ok_hand.png')]";
		public static final String IMG_Nok_Hand = "//img[contains(@src, 'nok_hand.png')]";

		//public static final String TAB_SYSTEM_DATA = "//*[@class='plant_menu']//*[@class='plant_navigation']//*[@class='round'][2]//*[@class='round system_data']";
		public static final String TAB_SYSTEM_DATA = "//*[@class='menu']//*[@class='plant_menu']//*[@class='plant_navigation']//*[@class='round']//*[@class='round system_data']";
		public static final String TAB_GATE = "//*[@class='plant_menu']//*[@class='round gate']";
		public static final String MSG_CORRECT_ALL_RULES = "//*[@id='rules']/p";
		
		public static final String IMG_Ok = "//img[contains(@src, 'ok.png')]";
		public static final String IMG_Nok = "//img[contains(@src, 'nok.png')]";
		
		public static final String TAB_SYSTEM_ADDRESSING = "//*[@id='system_addressing']";
		public static final String RULE_CONTENT = "//*[@id='rules']//*[@class='ruleContent']";
		
		public static final String RULE_6 = "//*[@id='rules']//ul//li[6]";
		public static final String TAB_SYSTEM_DATA_1 = "//*[@class='round ']//*[@class='round system_data']";
		public static final String TAB_STRUCTURE_DEFINITION = "//*[@class='round definition']";
		
	}
	

	//Home > Project > (Plant_Name) > Gateways
	public static final class Gateways_Tab {
		public static final String Show_Gateway_tab = "//*[@class='plant_navigation']//*[@id='liLiv2_gateways']";
		public static final String h2 = "//*[@id='localSiteOK']/h2";

		public static final String LI_GATEWAYS = "//*[@class='active'][2]";//"//@li[4]";
		public static final String BUTTON_BACK = "//button[@class='thinBtn round fleft']";
		public static final String BUTTON_SAVE = "//button[@id='btnSave']";
		public static final String Site_ID = "//input[@id='idImpiantoLoc']";

		public static final String Site_ID_ONLINE = "//input[@id='idImpianto']";
		public static final String INPUT_Site_Password_ONLINE = "//input[@id='passwordNew']";
		public static final String BUTTON_BACK_ONLINE = "//*[@id='formSiteData']//button[@class='thinBtn round fleft']";
		public static final String BUTTON_SAVE_ONLINE = "//*[@id='formSiteData']//button[@class='thinBtn round']";
		public static final String BUTTON_NEXT_ONLINE = "//*[@id='formSiteData']//button[@class='thinBtn round fright']";

		public static final String POPUP_IMPORT_TYPE = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all']";
		public static final String closeDialogX = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all']//*[@class='closeDialogX']";
		public static final String BUTTON_IMPORT_NOW = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all']//button[1]";
		public static final String POPUP_IMPORT_FROM_LOCAL_PROGRAMMER = "//*[@id='importPop']";
		public static final String SELECT_driveID_Import = "//*[@id='importPop']//*[@class='FBR-btns'][1]//*[@id='driveID']";
		public static final String BUTTON_Import_Cancel = "//*[@id='importPop']//*[@class='thinBtn round ok'][1]";
		public static final String BUTTON_Import = "//*[@id='importPop']//*[@class='thinBtn round ok'][2]";
		public static final String importDialog = "//*[@id='importDialog']";
		public static final String From_Family = "//*[@id='importDialog']//*[@id='gbox_ogrid']//*[@id='ogrid']//tr[2]/td[1]/input";
		public static final String From_Family_2 = "//*[@id='importDialog']//*[@id='gbox_ogrid']//*[@id='ogrid']//tr[3]/td[1]/input";
		public static final String From_Family_3 = "//*[@id='importDialog']//*[@id='gbox_ogrid']//*[@id='ogrid']//tr[4]/td[1]/input";
		public static final String Add_Family = "//*[@id='importDialog']//*[@id='add']";
		public static final String Remove_Family = "//*[@id='importDialog']//*[@id='remove']";
		public static final String Sellect_Building = "//*[@id='importDialog']//*[@id='buildings']";
		public static final String Save_importDialog = "//*[@id='importDialog']//*[@class='thinBtn round right']";
		public static final String POPUP_importSuccess = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@id='btErrorDialog' and text()='Import successful']";
		public static final String Close_POPUP_importSuccess = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@id='btErrorDialog' and text()='Import successful']/..//*[@class='ui-dialog-buttonset']/button";
		public static final String Close_importDialog = "//*[@id='importDialog']//*[@class='thinBtn round left']";
		public static final String BUTTON_INITIALIZE = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all']//button[2]";
		public static final String BUTTON_IMPORT_LATER = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all']//button[3]";
		public static final String POPUP_FAMILY_NOT_INITIALIZED = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@id='btErrorDialog' and text()='Plant families not initialized, you can choose it later']";
		public static final String Close_POPUP_FAMILY_NOT_INITIALIZED = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@id='btErrorDialog' and text()='Plant families not initialized, you can choose it later']/..//*[@class='ui-dialog-buttonset']/button";
		public static final String BUTTON_ImportNow_After_Click_ImportPostponne = "//*[@id='choose-import']//*[@class='thinBtn round'][1]";
		public static final String BUTTON_INITIALIZE_After_Click_ImportPostponne = "//*[@id='choose-import']//*[@class='thinBtn round'][2]";
		public static final String POPUP_PLANT_FAMILY_NOT_INITIALIZED = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']";
		public static final String BUTTON_PLANT_FAMILY_NOT_INITIALIZED_CLOSE = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//div[@class='ui-dialog-buttonset']";
		public static final String POPUP_PLANT_FAMILY_INITIALIZED = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']";
		public static final String BUTTON_PLANT_FAMILY_INITIALIZED_CLOSE = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//div[@class='ui-dialog-buttonset']";

		public static final String INPUT_SIMCARD_NUMBER = "//*[@id='simCcid_0']";
		public static final String INPUT_PASSWORD_PLANT = "//*[@id='passwordNew']";
		public static final String POPUP_IMPORT_PROGRAMMER = "//*[@id='savingOk']";
		public static final String IMPORT_NOW = "//*[contains(@onclick,'EXPORT')]";
		public static final String INITIALIZE = "//*[contains(@onclick,'siteInitFamilies()')]";
		public static final String DIALOG = "//div[@id='btErrorDialog']";
		public static final String CLOSE_DIALOG = "//*[@class='ui-dialog-buttonset']";

		public static final String LINK_SETTINGS = "//*[@id='noGatewaysTip']//*[@class='titleForm']//a";
		public static final String TAB_MY_PROJECTS = "//*[@id='main_navigation']//*[@id='liLiv1_my_projects']//*[@id='my_projects']";
		public static final String CHECKBOX_ALL_FAMILY = "//*[@id='igrid_cb']//*[@id='cb_igrid']";
	}

	//Home > Project > Plant_Testing
	public static final class Plant_Testing_Tab {
		public static final String LI_PLANTESTING = "//*[@class='active'][2]";
		public static final String DEVICE = "//*[text()='" + "STRING" + "']";
		public static final String DDN = "//*[text()='DDN (" + "STRING" + ")']";
		public static final String ControlUnit = "//*[text()='" + "STRING" + "']";
		public static final String Keypad = "//*[text()='KeyPad (" + "STRING" + ")']";
		public static final String BADGE_VIGIK = "";
		public static final String BADGE_RADIO = "";
		public static final String Gateway_Panels_Content = "//*[@id='gateway_panels_content']//*[@id='external_panels_content']//*[@class='gate_components clearfix']["
				+ "NUMBER" + "]";
		public static final String ICON_Reinitialize_Device_GPRS = "//*[@class='cl_actions diagnostics_device_actions']//*[@id='device_diagnostics_actions']//*[@id='device_diagnostics_resend'][@class='reinitializeBtn']";
		public static final String BUTTON_Resend_Diagnostic_command_DNN = "//*[@id='device_diagnostics_resend']";
		public static final String BUTTON_Reinitialize_Device_DNN = "//*[@id='device_diagnostics_reinit']";
		public static final String Key = "//*[@class='twoColForm clearfix diagnostics_device_details'][1]";
		public static final String Status_Green = "//*[@class='cl_actions diagnostics_device_actions']//*[@id='device_diagnostics_result']//*[@class='thumbUpGreen']";
		public static final String POPUP_REINITIALIZE_DEVICE = "//*[@id='confirm_reinit_gw']";
		public static final String BUTTON_Yes = "//*[@class='d-cnt']//button[@id='confirm_resend_click_ok']";
		public static final String BUTTON_Close = "//*[@class='ui-dialog-buttonset']/button";
		public static final String Status_Info_Yellow = "//*[@class='infoBox']//*[@class='thumbDownOrange']";
		public static final String Status_Info_Green = "//*[@class='infoBox']//*[@class='thumbUpGreen']";
		public static final String Status_Info_Red = "//*[@class='infoBox']//*[@class='thumbDownRed']";
		public static final String Status_Note = "//*[@class='infoBox']//*[@id='diagStatusText']";
		public static final String SETTINGS_link = "//*[@id='diagStatusText']/a";

		public static final String Message_Info_Green = "The matching between the devices installed on your plant and the plant inserted into the portal has been verified. It is now possible to manage the plant with this configuration. Go to SETTINGS to manage the plant.";
		public static final String Message_Info_Yellow = "The testing of the matching between the devices installed on your plant and the plant inserted into the portal is in progress. Please wait for some minutes for the end of the procedure.";
		public static final String Message_Info_Red = "Some errors have been found. Please verify that the configuration of the devices with error is correct and that they are correctly cabled and working. Then repeat the diagnostic procedure.";

		public static final String GREEN_MAIN_BULLET = "//*[@class='mainContent']//*[@class='infoBox']/table/tbody/tr/td[1]/input[@class='thumbUpGreen']";
		public static final String GREEN_GPRS_BULLET = "//*[@id='external_panels_content']/div[1]//*[@id='device_diagnostics_result']/input[@class='thumbUpGreen']";
		public static final String GREEN_GATE_BULLET = "//*[@id='external_panels_content']/div[2]//*[@id='device_diagnostics_result']/input[@class='thumbUpGreen']";
		public static final String GREEN_CONTROL_UNIT_BULLET = "//*[@id='external_panels_content']/div[3]//*[@id='device_diagnostics_result']/input[@class='thumbUpGreen']";
		public static final String YELLOW_MAIN_BULLET = "//*[@class='mainContent']//*[@class='infoBox']/table/tbody/tr/td[1]/input[@class='thumbDownOrange']";
		public static final String RED_MAIN_BULLET = "//*[@class='mainContent']//*[@class='infoBox']/table/tbody/tr/td[1]/input[@class='thumbDownRed']";
		public static final String RED_GPRS_BULLET = "//*[@id='external_panels_content']/div[1]//*[@id='device_diagnostics_result']/input[@class='thumbDownRed']";
		
		public static final String NAME_DEVICE_GPRS = "//*[@id='external_panels_content']/div[1]//span[@id='device_title']";
		public static final String NAME_DEVICE_GATE = "//*[@id='external_panels_content']/div[2]//span[@id='device_title']";
		public static final String NAME_DEVICE_CONTROL_UNIT = "//*[@id='external_panels_content']/div[3]//span[@id='device_title']";

		// GPRS block
		public static final String ICON_REINIT_GPRS = "//*[@id='external_panels_content']/div[1]//*[@id='device_diagnostics_actions']/input[@id='device_diagnostics_resend']";
		public static final String POPUP_REINIT_GPRS_CONFIRM = "//*[@id='confirm_reinit_gw']//button[@id='confirm_resend_click_ok']";
		public static final String POPUP_REINIT_GPRS_CLOSE = "//*[@class='loading']//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//*[@class='ui-dialog-buttonset']/button";

		// DDN Block
		public static final String ICON_REFRESH_DDN = "//*[@id='external_panels_content']/div[2]//*[@id='device_diagnostics_actions']/input[@id='device_diagnostics_resend']";
		public static final String POPUP_REFRESH_DDN_CONFIRM = "//*[@id='confirm_resend']//button[@id='confirm_resend_click_ok']";
		public static final String POPUP_REFRESH_DDN_CLOSE = "//*[@class='loading']//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//*[@class='ui-dialog-buttonset']/button";
		public static final String ICON_REINIT_DDN = "//*[@id='external_panels_content']/div[2]//*[@id='device_diagnostics_actions']/input[@id='device_diagnostics_reinit']";
		public static final String POPUP_REINIT_DDN_CONFIRM = "//*[@id='confirm_reinit']//*[@id='reinitForm']/button[@id='confirm_reinit_click_ok']";
		public static final String POPUP_REINIT_DDN_CLOSE = "//*[@id='confirm_reinit']//*[@class='closeDialogX']";

		// Control Unit Block
		public static final String ICON_REFRESH_AC = "//*[@id='external_panels_content']/div[3]//*[@id='device_diagnostics_actions']/input[@id='device_diagnostics_resend']";
		public static final String POPUP_REFRESH_AC_CONFIRM = "//*[@id='confirm_resend']//button[@id='confirm_resend_click_ok']";
		public static final String POPUP_REFRESH_AC_CLOSE = "//*[@class='loading']//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//*[@class='ui-dialog-buttonset']/button";
		public static final String ICON_REINIT_AC = "//*[@id='external_panels_content']/div[3]//*[@id='device_diagnostics_actions']/input[@id='device_diagnostics_reinit']";
		public static final String POPUP_REINIT_AC_CONFIRM = "//*[@id='confirm_reinit']//*[@id='reinitForm']/button[@id='confirm_reinit_click_ok']";
		public static final String POPUP_REINIT_AC_CLOSE = "//*[@id='confirm_reinit']//*[@class='closeDialogX']";

		public static final String ICON_REINIT_AC_2 = "//*[@id='external_panels_content']/div[5]//*[@id='device_diagnostics_actions']/input[@id='device_diagnostics_reinit']";
		public static final String ICON_REINIT_CONTROL_UNIT_WITH_GATE_FAMILY = "//*[@id='external_panels_content']/div[3]//*[@id='device_diagnostics_actions']/input[@id='device_diagnostics_reinit']";
		public static final String TAB_SYSTEM_ADDRESSING = "//*[@id='liLiv2_system_addressing']//*[@id='system_addressing']";
		public static final String TAB_SYSTEM_DATA = "//*[@id='system_data']";		
		public static final String ICON_REINIT_CONTROL_UNIT_X = "//*[@id='external_panels_content']/div[NUMBER]//*[@id='device_diagnostics_actions']//*[@id='device_diagnostics_reinit']";
			
		public static final String ICON_REINIT_CENTRAL_1 = "//*[@id='external_panels_content']/div[5]//*[@id='device_diagnostics_actions']/input[@id='device_diagnostics_reinit']";
		public static final String ICON_REINIT_CENTRAL_2 = "//*[@id='external_panels_content']/div[6]//*[@id='device_diagnostics_actions']/input[@id='device_diagnostics_reinit']";
		public static final String ICON_REINIT_CENTRAL_3 = "//*[@id='external_panels_content']/div[7]//*[@id='device_diagnostics_actions']/input[@id='device_diagnostics_reinit']";
		
		//For fixed Plant: test suite "TS_25_Sanity_Test_PRD" only
		public static final String ICON_FRESH_CENTRALUNIT_X = "//*[@id='external_panels_content']/div[NUMBER]//*[@id='device_diagnostics_actions']/input[@id='device_diagnostics_resend']";
		public static final String BOARD_AC_0 = "//*[@id='external_panels_content']/div[4]";
		public static final String BOARD_AC_1 = "//*[@id='external_panels_content']/div[5]";
		public static final String BOARD_AC_2 = "//*[@id='external_panels_content']/div[6]";
		public static final String BULLET_X = "//*[@id='external_panels_content']/div[CENTERUNIT]//*[@id='access_control_units_components_content']/ul[ADDRESS]//*[@id='device_diagnostics_result']/input[@class='COLOR']";
		public static final String ACTION_RESEND_X = "//*[@id='external_panels_content']/div[CENTERUNIT]//*[@id='access_control_units_components_content']/ul[ADDRESS]//*[@id='device_diagnostics_actions']//*[@id='device_diagnostics_resend']";
		public static final String ACTION_REINIT_X = "//*[@id='external_panels_content']/div[CENTERUNIT]//*[@id='access_control_units_components_content']/ul[ADDRESS]//*[@id='device_diagnostics_actions']//*[@id='device_diagnostics_reinit']";
		public static final String MSG_COMMAND_GENERATED = "//*[@id='confirm_reinit']//*[@id='reinitMsg']";
	}

	//Home > Passepartout
	public static final class Passepartout_Tab {
		public static final String BUTTON_Add_New_Passpartout = "//*[@class='mainContent']//button[1]";
		public static final String POPUP_New_Service_Provider = "//*[@id='formModService']";
		public static final String closeDialogX = "//*[@class='closeDialogX']";
		public static final String name_mod = "//*[@id='formModService']//*[@id='name_mod']";
		public static final String note_mod = "//*[@id='formModService']//*[@id='note_mod']";
		public static final String keylock_mod = "//*[@id='formModService']//*[@id='keylock_mod']";
		public static final String expdate_mod = "//*[@id='formModService']//*[@id='expdate_mod']";
		public static final String datepicker_trigger = "//*[@id='formModService']//*[@class='ui-datepicker-trigger']";
		public static final String datepicker_Next = "//*[@id='ui-datepicker-div']//*[@title='Next>']";
		public static final String datepicker_selectDay = "//*[@class='ui-datepicker-calendar']/tbody/tr[3]/td[2]";
		public static final String BUTTON_Cancel = "//*[@id='formModService']//*[@class='thinBtn round right closeDialog']";
		public static final String BUTTON_Save = "//*[@id='formModService']//*[@class='thinBtn round left']";
		public static final String successMessage = "//*[@id='formModService']//*[@id='successMessage']";
		public static final String BUTTON_Add_Badge = "//*[@id='formModService']//button[@id='addBadgeBtn']";
		public static final String POPUP_badgeReadingPop = "//*[@id='badgeReadingPop']";
		public static final String POPUP_btErrorDialog = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons'][NUMBER]//*[@id='btErrorDialog']";
		public static final String BUTTON_closeErrorDialog = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons'][NUMBER]//*[@class='ui-dialog-buttonset']/button"; //close 2 times
		public static final String badgeID = "//*[@id='badgeReadingPop']//*[@id='badgeID']";
		public static final String description = "//*[@id='badgeReadingPop']//*[@id='description']";
		public static final String color = "//*[@id='badgeReadingPop']//*[@class='color']";
		public static final String colorItem = "//*[@id='badgeReadingPop']//*[@class='colors']/div[colorItem]";
		public static final String retry = "//*[@id='badgeReadingPop']//*[@class='retry']";
		public static final String okBtn = "//*[@id='badgeReadingPop']//*[@id='okBtn']";
		public static final String BUTTON_closeDialogX = "//*[@id='badgeReadingPop']//*[@class='closeDialogX']";
		public static final String BUTTON_RemoveBadge = "//*[@id='formModService']//table[@id='tableBadge']//*[@id='actionButtons']/div[1]/input";
		public static final String POPUP_DelBadge = "//*[@id='formUserDelBadge']";
		public static final String BUTTON_DelBadge_Cancel = "//*[@id='formUserDelBadge']//*[@class='thinBtn round left closeDialog']";
		public static final String BUTTON_DelBadge_okBtn = "//*[@id='formUserDelBadge']//*[@class='thinBtn round right']";
		public static final String BUTTON_DelBadge_closeDialogX = "//*[@id='formUserDelBadge']//*[@class='closeDialogX]";
		public static final String BUTTON_RewriteBadge = "//*[@id='formModService']//table[@id='tableBadge']//*[@id='actionButtons']/div[2]/input";
		public static final String BUTTON_SubstituteBadge = "//*[@id='formModService']//table[@id='tableBadge']//*[@id='actionButtons']/div[3]/input";
		public static final String BUTTON_closeDialog = "//*[@id='formModService']//button[@class='thinBtn round right closeDialog']";

		public static final String next_servicesTable_pager = "//div[@class='mainContent']//td[@id='next_servicesTable_pager']";
		public static final String ui_pg_input = "//div[@class='mainContent']//input[@class='ui-pg-input']";
		public static final String BUTTON_Plant_Association = "//*[@class='mainContent']//button[2]";
		public static final String Plant_Association_SERVICE_SEARCH = "//*[@class='mainContent']//*[@class='colProviders']//input[@id='gs_name']";
		public static final String Plant_Association_SERVICE_FIRST = "//*[@class='mainContent']//*[@class='colProviders']//table[@id='providersGrid']//tr[2]//td[2]";
		public static final String Plant_Association_PLANT_SEARCH = "//*[@class='mainContent']//*[@class='colPlants']//input[@id='gs_name']";
		public static final String Plant_Association_PLANT_SELECT = "//*[@class='mainContent']//*[@class='colPlants']//table[@id='plantsGrid']//tr[2]//td[1]/input";
		public static final String Plant_Association_PLANT_FIRST = "//*[@class='mainContent']//*[@class='colPlants']//table[@id='plantsGrid']//tr[2]//td[3]";
		public static final String Plant_Association_SUCCESS_MESSAGE = "//*[@class='mainContent']/div[@class='confirmMsg']";
		public static final String BUTTON_Plant_Association_BACK = "//*[@class='mainContent']/button[1]";
		public static final String BUTTON_Plant_Association_APPLY = "//*[@class='mainContent']/button[2]";
		public static final String POPUP_UNSAVED_DATA = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@id='btErrorDialog']";
		public static final String BUTTON_UNSAVED_DATA_CLOSE = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@class='ui-dialog-buttonset']/button[2]";

		public static final String Search_By_Badge_ID = "//*[@id='badgeSearch']";
		public static final String BUTTON_badgeSearch = "//*[@id='btnSearchBadge']";
		public static final String BUTTON_badgeInline = "//*[@id='btnSeachBadgeInline']";

		public static final String servicesName = "//*[@id='servicesTable']//*[@role='row'][rowOrder]//*[@role='gridcell'][1]";
		public static final String keylockInline = "//*[@id='servicesTable']//*[@role='row'][rowOrder]//*[@role='gridcell'][2]//input";
		public static final String BadgeNumberInline = "//*[@id='servicesTable']//*[@role='row'][rowOrder]//*[@role='gridcell'][3]";
		public static final String expdateInline = "//*[@id='servicesTable']//*[@role='row'][rowOrder]//*[@role='gridcell'][4]//input";

		public static final String editSaveInlineBtn = "//*[@id='servicesTable']//*[@role='row'][rowOrder]//input[@class='editSaveInlineBtn']";
		public static final String SaveInlineBtn = "//*[@id='servicesTable']//*[@role='row'][rowOrder]//input[@class='editSaveInlineBtn save']";
		public static final String clearInlineBtn = "//*[@id='servicesTable']//*[@role='row'][rowOrder]//input[@class='clearInlineBtn']";
		public static final String POPUP_Provider_Successfully_Updated = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@class='ui-dialog-buttonset']";
		public static final String deleteRow = "//*[@id='servicesTable']//*[@role='row'][rowOrder]//input[@class='deleteRow']";
		public static final String POPUP_DELETE_PASSEPARTOUT_closeDialogX = "//*[@id='formDelSevice']//*[@class='closeDialogX']";
		public static final String POPUP_DELETE_PASSEPARTOUT_Cancel = "//*[@id='formDelSevice']//*[@class='thinBtn round left closeDialog']";
		public static final String POPUP_DELETE_PASSEPARTOUT_OK = "//*[@id='formDelSevice']//*[@class='thinBtn round right']";
		public static final String modInlineBtn = "//*[@id='servicesTable']//*[@role='row'][rowOrder]//input[@class='modInlineBtn']";
		public static final String POPUP_Modify_Service_Provider = "//*[@id='formModService']";

		public static final String BUTTON_PLANT_ASSOCIATION = "//*[@class='mainContent']/button[@class='thickBtn round'][2]";
		public static final String CHECKBOX_ASSIGN_SITE = "//*[@class='ui-jqgrid-bdiv']//table[@id='plantsGrid']/tbody/tr[2]/td[1]/input";
		public static final String BUTTON_APPLY = "//*[@class='oneColumnContent']//*[@class='mainContent']/button[@class='thickBtn round'][2]";
	
		public static final String TABLE_COL_SERVICE_NAME = "//*[@id='servicesTable']/tbody/tr[2]/td[1]";
		public static final String TABLE_COL_KEYLOCK = "//*[@id='servicesTable']/tbody/tr[2]/td[2]";
		public static final String TABLE_COL_BADGES = "//*[@id='servicesTable']/tbody/tr[2]/td[3]";
		public static final String TABLE_COL_DATE = "//*[@id='servicesTable']/tbody/tr[2]/td[4]";
		public static final String TABLE_ICON_CONFIG = "//*[@id='servicesTable']/tbody/tr[2]/td[6]//*[@class='editSaveInlineBtn']";
		public static final String TABLE_ICON_DELETE = "//*[@id='servicesTable']/tbody/tr[2]/td[6]//*[@class='deleteRow']";
		public static final String TABLE_ICON_DETAIL = "//*[@id='servicesTable']/tbody/tr[2]/td[6]//*[@class='modInlineBtn']";
		public static final String TABLE_ICON_SAVE = "//*[@id='servicesTable']/tbody/tr[2]/td[6]//*[@class='editSaveInlineBtn save']";
		public static final String TABLE_INPUT_SERVICE_NAME = "//*[@id='servicesTable']/tbody/tr[2]/td[1]/input";
		public static final String TABLE_INPUT_KEYLOCK = "//*[@id='servicesTable']/tbody/tr[2]/td[2]/input";
		public static final String LABEL_SUCCESSFUL_ASSOCIATION = "//*[@class='mainContent']/div[@id='retMsg']";
		public static final String TABLE_INPUT_COL_DATE = "//*[@id='servicesTable']/tbody/tr[2]/td[4]/input";
		
		public static final String POPUP_ERROR = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@id='btErrorDialog']";
		public static final String POPUP_ERROR_CLOSE = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@class='ui-dialog-buttonset']/button";
		
		public static final String TABLE_ID_PASSPARTOUT = "servicesTable";
		public static final String MESSAGE_POPUP_ERROR = "//*[@id='infocnt']";
		public static final String BUTTON_CLOSE_POPUP_ERROR = "//*[@id='closedialog']";
	
		public static final String MSG_ERROR_KEYCODE = "//*[@id='info_dialog']//*[@id='info_id']//*[@id='infocnt']";
		public static final String BUTTON_ERROR_CLOSE = "//*[@id='info_dialog']//*[@id='info_id']//*[@id='closedialog']";
	
		public static final String BUTTON_CONFIRM_DELETE_PPT = "//*[@id='formDelSevice']//button[@class='thinBtn round right']";
	}

	public static final class Project_Management {
		public static final String Apartments_TAB = "//*[@id='apartments']";
		public static final String Gates_TAB = "//*[@id='gates']";
		public static final String Settings_TAB = "//*[@id='settings']";
		public static final String Profiles_TAB = "//*[@id='profiles']";
		public static final String Access_Profiles_TAB = "//*[@id='access_profile']";
		public static final String Services_TAB = "//*[@id='ppt']";
		public static final String Vigik_TAB = "//*[@id='vigik']";
	}
	

	//Home > My Project > Setting
	public static final class Settings_Tab {
		public static final String LI_SETTING = "//*[@class='active'][2]";
		public static final String APARTMENT = "//*[@id='liLiv2_apartments']";
		public static final String GATES = "//*[@id='liLiv2_gates']";
		public static final String SETTINGS = "//*[@id='liLiv2_settings']";
		public static final String PROFILES = "//*[@id='liLiv2_profiles']";
		public static final String ACCESS_PROFILES = "//*[@id='liLiv2_access_profile']";
		public static final String SERVICES = "//*[@id='liLiv2_ppt']";
		public static final String VIGIK = "//*[@id='liLiv2_vigik']";

		public static final String SELECT_Badges = "//select[@id='selectBadge']";
		public static final String SELECT_Radio_badge = "//select[@id='selectRadioBadge']";
		public static final String Badge_list = "//*[@class='contBadgeSelect']//*[@class='badgeBox']";
		public static final String BUTTON_Add_Radio_group = "//button[@class='thinBtn round']";
		public static final String RADIO_Radio_Yes = "//*[@id='radio-01'][@name='radioRadioUi']";
		public static final String RADIO_Radio_No = "//*[@id='radio-02'][@name='radioRadioUi']";
		public static final String RADIO_Keylock_Yes = "//*[@id='radio-01'][@name='radioKeylockUi']";
		public static final String RADIO_Keylock_No = "//*[@id='radio-02'][@name='radioKeylockUi']";
		public static final String SELECT_Min_Len_Keylock = "//select[@id='selectMinNumLenCodeLock']";
		public static final String SELECT_Max_Len_Keylock = "//select[@id='selectMaxNumLenCodeLock']";
		public static final String RADIO_Vigik_Yes = "//*[@id='radio-01'][@name='radioVigikUi']";
		public static final String RADIO_Vigik_No = "//*[@id='radio-02'][@name='radioVigikUi']";
		public static final String RADIO_Direct_call_Yes = "//*[@id='radio-01'][@name='radioDC']";
		public static final String RADIO_Direct_call_No = "//*[@id='radio-02'][@name='radioDC']";
		public static final String RADIO_Time_bands_Yes = "//*[@id='radio-01'][@name='radioTimeboard']";
		public static final String RADIO_Time_bands_No = "//*[@id='radio-02'][@name='radioTimeboard']";

		public static final String POPUP_ADD_RADIO_GROUP = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all']";
		public static final String INPUT_Radio_Group = "//input[@id='nameRadioGroup']";
		public static final String CHECKBOX_Default = "//input[@id='checkboxDefault']";
		public static final String BUTTON_Cancel = "//button[@class='thinBtn round left closeDialog']";
		public static final String BUTTON_Save = "//button[@class='thinBtn round right']";

		public static final String SELECT_Button_Right = "//select[@id='selGateButt1Row" + "NUMBER" + "']";
		public static final String SELECT_Button_Left = "//select[@id='selGateButt2Row" + "NUMBER" + "']";

		public static final String TIME_BANDS_YES = "//*[@name='radioTimeboard'][@id='radio-01']";
		public static final String TIME_BANDS_NO = "//*[@name='radioTimeboard'][@id='radio-02']";
		public static final String CONFIRM_SETTING = "//*[@class='thinBtn round fright']";
		public static final String MSG_Success = "//*[@id='retMsg']";

		public static final String Export_Plant = "//*[@class='uThinBtn'][1]";
		public static final String POPUP_Export_Plant = "//*[@id='exportPop']";
		public static final String SELECT_driveID_Export_Plant = "//*[@id='exportPop']//*[@class='FBR-btns'][1]//*[@id='driveID']";
		public static final String Export_Plant_Export = "//*[@id='exportPop']//*[@class='FBR-btns'][1]//*[@class='thinBtn round ok']";
		public static final String Export_Plant_Cancel = "//*[@id='exportPop']//*[@class='FBR-btns'][2]//*[@class='thinBtn round ok'][1]";
		public static final String Export_Plant_OK = "//*[@id='exportPop']//*[@class='FBR-btns'][2]//*[@class='thinBtn round ok'][2]";
		public static final String Import_Vigik = "//*[@class='uThinBtn'][2]";
		public static final String POPUP_Import_Vigik = "//*[@id='importPop']";
		public static final String SELECT_driveID_Import_Vigik = "//*[@id='importPop']//*[@class='FBR-btns'][1]//*[@id='importDriveID']";
		public static final String Import_Vigik_Import = "//*[@id='importPop']//*[@class='FBR-btns'][1]//*[@class='thinBtn round ok']";
		public static final String Import_Vigik_Cancel = "//*[@id='importPop']//*[@class='FBR-btns'][2]//*[@class='thinBtn round ok'][1]";
		public static final String Import_Vigik_OK = "//*[@id='importPop']//*[@class='FBR-btns'][2]//*[@class='thinBtn round ok'][2]";
		public static final String Popup_Error = "//*[@id='btErrorDialog']";
		public static final String BUTTON_CONFIRM_SETTINGS_HUNG = "//*[@id='mainData']/button[@class='thinBtn round fright']";
		
		public static final String TABLE_RADIO_GROUP = "//*[@id='mainData']//*[@class='tableBox']";
		public static final String LABEL_KEYLOCK = "//*[@id='mainData']//*[@class='contChoices']/label[2]";
		public static final String LABEL_KEYLOCK_MIN_LENGTH = "//*[@id='mainData']//*[@class='contChoices']/label[3]";
		public static final String LABEL_KEYLOCK_MAX_LENGTH = "//*[@id='mainData']//*[@class='contChoices']/label[4]";
		
		public static final String TAB_APARTMENTS = "//*[@id='liLiv2_apartments']//*[@id='apartments']";
		public static final String TAB_GATES = "//*[@id='liLiv2_gates']//*[@id='gates']";
	}
	

	//HomeMy > Projects > Plant_Name > Gates
	public static final class Gates_Setting_Tab {
		public static final String By_Gates_Tab = "//*[@id='ui-id-9']";
		public static final String By_Apartments_Tab = "//*[@id='ui-id-10']";
		public static final String By_Gate_view = "//*[@id='byGates']";
		public static final String By_Apartments_view = "//*[@id='byApartment']";
		public static final String By_DDN = "//*[@id='ui-id-2']";
		public static final String CheckBox_Building = "//*[@id='tableALLBuildings']/tbody/tr[2]/td[1]//*[@class='cbox']";
		public static final String CheckBox_Gates = "//*[@id='tableAllGatesInv']/tbody/tr[2]/td[1]//*[@class='cbox']";
		public static final String Apply_Button = "//*[contains(@onclick,'gateMan.applyEdit();')]";

		public static final String Gate_Name = "//*[@id='tableAllGates']/tbody/tr[2]/td[2]";
		public static final String Building_Name = "//*[@id='tableALLBuildingsInv']/tbody/tr[2]/td[2]";

		public static final String MSG_Success = "//*[@id='retMsgAss']";

		public static final String TAB_BY_APARTMENT = "//*[@id='ui-id-12']";
		public static final String CHECKBOX_ALL_GATE_IN_TAB_BY_APARTMENT = "//*[@id='tableAllGatesInv_cb']//*[@id='jqgh_tableAllGatesInv_cb']/input[@id='cb_tableAllGatesInv']";
		
		
		public static final String TAB_BYGATE_TAB_ALL = "//*[@id='byGates']//*[@id='ui-id-1']";
		public static final String TAB_BYGATE_TAB_DDN = "//*[@id='byGates']//*[@id='ui-id-2']";
		public static final String TAB_BYGATE_TAB_ALL_2 = "//*[@id='byGates']//*[@id='ui-id-3']";
		public static final String TAB_BYGATE_TAB_BUILDING = "//*[@id='byGates']//*[@id='ui-id-4']";
		
		
		public static final String TAB_BYGATE_TAB_ALL_GATE_COLUMN = "//*[@id='tableAllGates']/tbody/tr[2]/td[2]";
		public static final String TAB_BYGATE_TAB_ALL_FEATURE_COLUMN = "//*[@id='tableAllGates']/tbody/tr[2]/td[3]";
		
		public static final String TAB_BYGATE_TAB_ALL_BUILDINGS_COLUMN_BUILDING = "//*[@id='byGates']//*[@id='tableALLBuildings']/tbody/tr[2]/td[3]";
		public static final String TAB_BYGATE_TAB_ALL_BUILDINGS_COLUMN_APARTMENT = "//*[@id='byGates']//*[@id='tableALLBuildings']/tbody/tr[2]/td[4]";
		public static final String TAB_BYGATE_TAB_ALL_BUILDINGS_COLUMN_FAMILY = "//*[@id='byGates']//*[@id='tableALLBuildings']/tbody/tr[2]/td[5]";
		
		public static final String TAB_BYAPARMENT_INNERTAB_BUILDING = "//*[@id='byApartment']//*[@id='ui-id-8']";
		public static final String TAB_BYAPARMENT_INNERTAB_ALL_1 = "//*[@id='byApartment']//*[@id='ui-id-7']";
		public static final String TAB_BYAPARMENT_INNERTAB_DDN = "//*[@id='byApartment']//*[@id='ui-id-6']";
		public static final String TAB_BYAPARMENT_INNERTAB_ALL_2 = "//*[@id='byApartment']//*[@id='ui-id-5']";
		
		
		public static final String TAB_BYAPARMENT_TAB_ALL_BUILDING_COLUMN = "//*[@id='byApartment']//*[@id='tableALLBuildingsInv']/tbody/tr[2]/td[2]";
		public static final String TAB_BYAPARMENT_TAB_ALL_APARTMENT_COLUMN = "//*[@id='byApartment']//*[@id='tableALLBuildingsInv']/tbody/tr[2]/td[3]";
		public static final String TAB_BYAPARMENT_TAB_ALL_FAMILY_COLUMN = "//*[@id='byApartment']//*[@id='tableALLBuildingsInv']/tbody/tr[2]/td[4]";
		
		public static final String TAB_BYAPARTMENT_TAB_ALL_GATE_COLUMN = "//*[@id='tableAllGatesInv']/tbody/tr[2]/td[3]";
		
		public static final String TAB_STATUS = "//*[@id='main_navigation']//*[@id='liLiv1_status']/a[@id='status']";
		public static final String TAB_APARTMENTS= "//*[@id='apartments']";
		public static final String CHECKBOX_BUILDING_X = "//*[@id='tableALLBuildings']/tbody/tr[rowNumber]/td[1]//*[@class='cbox']";		
		public static final String CHECKBOX_GATE_X = "//*[@id='tableAllGatesInv']/tbody/tr[rowNumber]/td[1]";
		public static final String FAMILY_X = "//*[@id='byApartment']//*[@id='tableALLBuildingsInv']/tbody/tr[rowNumber]";		
		public static final String TAB_BY_APARTMENTS = "//*[@id='bigTabsGateApartment']//*[@class='ui-state-default ui-corner-top']";
		
		public static final String CHECKBOX_ASSIGN_ALL_BUILDINGS = "//*[@id='jqgh_tableALLBuildings_cb']//input[@id='cb_tableALLBuildings']";
		public static final String BUTTON_APPLY = "//*[@class='mainContent']//button[@class='thickBtn round refreshStatus']";
		public static final String TAB_ACCESS_PROFILE = "//*[@id='liLiv2_access_profile']//*[@id='access_profile']";
	
		public static final String TABLE_BYGATE_GATE_X = "//*[@id='tableAllGates']/tbody/tr[rowOrder]/td[2]";
		public static final String CHECKBOX_ASSIGN_APT_101 = "//*[@id='tableALLBuildings']/tbody/tr[2]/td[1]/input";
		public static final String CHECKBOX_ASSIGN_APT_102 = "//*[@id='tableALLBuildings']/tbody/tr[3]/td[1]/input";
		public static final String CHECKBOX_ASSIGN_APT_201 = "//*[@id='tableALLBuildings']/tbody/tr[4]/td[1]/input";
		public static final String CHECKBOX_ASSIGN_APT_202 = "//*[@id='tableALLBuildings']/tbody/tr[5]/td[1]/input";
	
		public static final String TAB_VIGIK = "//*[@id='liLiv2_vigik']//*[@id='vigik']";
		
		public static final String TAB_BY_GATE = "//*[@id='ui-id-11']";		
		public static final String TAB_BYGATE_TAB_ALL_GATE_ROW_X = "//table[@id='tableAllGates']/tbody/tr[rowOrder]";
		public static final String CHECKBOX_ALL_FAMILY = "//*[@id='jqgh_tableALLBuildings_cb']";		
		public static final String CHECKBOX_GATE_NAME_X = "//*[@id='tableAllGatesInv']/tbody/tr[rowNumber]/td[3]";
	
		public static final String TABLE_ALL_GATES_ROW_X = "//*[@id='tableAllGates']/tbody/tr[NUMBER]/td[2]";
	}

	//HomeMy > Projects > Plant_Name > Apartments
	public static final class Aparments_Tab {
		public static final String LI_APARMENTS = "//*[@class='active'][2]";
		public static final String Building_Plus = "//tr[rowOrder]//*[@class='ui-icon ui-icon-plus']";
		public static final String new_member_name = "//*[@class='mygrid ui-jqgrid-btable']//tr[rowOrder]/td[2]//tbody/tr[2]/td[8]";
		public static final String new_member_subName = "//*[@class='mygrid ui-jqgrid-btable']//tr[rowOrder]/td[2]//tbody/tr[2]/td[9]";
		public static final String new_member_keyboardCode = "//*[@class='mygrid ui-jqgrid-btable']//tr[rowOrder]/td[2]//tbody/tr[2]/td[10]";
		public static final String new_member_directCall = "//*[@class='mygrid ui-jqgrid-btable']//tr[rowOrder]/td[2]//tbody/tr[2]/td[11]";
		public static final String Verify_Show_Apartment = "//*[@class='ui-icon ui-icon-carat-1-sw']";
		public static final String BADGE_Search = "//*[@class='searchBar']//input[@id='badgeSearch']";
		public static final String BADGE_Search_btn = "//*[@class='searchBar']//input[@id='btnSearchBadge']";
		public static final String BADGE_Search_POPUP = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@id='btErrorDialog']";
		public static final String BADGE_Search_btn_close = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@class='ui-dialog-buttonset']/button";
		public static final String btnSeachBadgeInline = "//*[@class='searchBar']//input[@id='btnSeachBadgeInline']";
		public static final String BADGE_Search_information = "//div[@id='btErrorDialog']";
		public static final String Button_Close = "//*[@class='ui-dialog-buttonset']";
		
		public static final String POPUP_NO_BADGE_TO_INSERT = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']/div[@id='btErrorDialog']";
		public static final String BUTTON_CLOSE_POPUP_NO_BADGE_TO_INSERT = "//*[@class='ui-dialog-buttonset']/button";

		public static final String TAB_Building = "//*[@id='ui-id-" + "NUMBER" + "']";
		public static final String All_Building_Tab = "//*[@id='tabs-All']";
		public static final String Building_Tabs = "//*[@aria-labelledby='ui-id-\"+ \"NUMBER\" +\"']";
		public static final String BUTTON_Export_Excel = "//button[@id='btnExport']";
		public static final String BUTTON_Import_Excel = "//button[@id='btnImport']";
		public static final String POPUP_Import_Excel = "//*[@id='importExcel']";
		public static final String Input_POPUP_Import_Excel = "//*[@id='importExcel']//input[@id='upload_csv']";
		public static final String Close_POPUP_Import_Excel = "//*[@id='importExcel']//button[1]";
		public static final String BUTTON_IMPORT_POPUP_Import_Excel = "//*[@id='importExcel']//button[2]";
		public static final String Success_Mgs_IMPORT = "//*[@class='confirmMsg' and 'File elaborated']";

		public static final String BUTTON_Programming_Site_Badge = "//*[@id='impExpButtonsAll']//button[@id='psb_btn']";
		public static final String BUTTON_Add_New_Family = "//button[@id='btnAddNewFamily']";
		public static final String Family_NAME = "//input[@id='name']";
		public static final String Family_Building = "//select[@id='buildings']";
		public static final String Family_KeyCode = "//input[@id='keycode']";
		public static final String Family_Directcall = "//input[@id='dirCall']";
		public static final String Family_Start = "//input[@id='badgeStart']";
		public static final String Family_End = "//input[@id='badgeEnd']";
		public static final String Family_Apartment = "//select[@id='apartment']";
		public static final String Success_Mgs = "//*[@id='retMsg']";

		public static final String INPUT_FAMILY = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr[rowOrder]/td[8]/input";
		public static final String INPUT_NAME = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr[rowOrder]/td[9]/input";
		public static final String INPUT_SURNAME = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr[rowOrder]/td[10]/input";
		public static final String INPUT_KEYBOARD_CODE = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr[rowOrder]/td[11]/input";
		public static final String INPUT_DIRECT_CALL = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr[rowOrder]/td[12]/input";
		public static final String OUTPUT_All_badge = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr[rowOrder]/td[13]";
		public static final String OUTPUT_All_badgeradio = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr[rowOrder]/td[14]";

		public static final String TABLE_BUILDING_ALL_COLUMN_BUILDING = "//*[@id='tabs-All']//*[@class='ui-jqgrid-bdiv']//table[@id='All']/tbody/tr[rowOrder]/td[4]";
		public static final String TABLE_BUILDING_ALL_COLUMN_APARTMENT = "//*[@id='tabs-All']//*[@class='ui-jqgrid-bdiv']//table[@id='All']/tbody/tr[rowOrder]/td[7]";
		public static final String TABLE_BUILDING_ALL_COLUMN_FAMILY = "//*[@id='tabs-All']//*[@class='ui-jqgrid-bdiv']//table[@id='All']/tbody/tr[rowOrder]/td[8]";
		public static final String TABLE_BUILDING_ALL_COLUMN_NAME = "//*[@id='tabs-All']//*[@class='ui-jqgrid-bdiv']//table[@id='All']/tbody/tr[rowOrder]/td[9]";
		public static final String TABLE_BUILDING_ALL_COLUMN_SURNAME = "//*[@id='tabs-All']//*[@class='ui-jqgrid-bdiv']//table[@id='All']/tbody/tr[rowOrder]/td[10]";
		public static final String TABLE_BUILDING_ALL_COLUMN_KEYBOARD_CODE = "//*[@id='tabs-All']//*[@class='ui-jqgrid-bdiv']//table[@id='All']/tbody/tr[rowOrder]/td[11]";
		public static final String TABLE_BUILDING_ALL_COLUMN_DIRECT_CALL = "//*[@id='tabs-All']//*[@class='ui-jqgrid-bdiv']//table[@id='All']/tbody/tr[rowOrder]/td[12]";
		public static final String TABLE_BUILDING_ALL_COLUMN_BADGE = "//*[@id='tabs-All']//*[@class='ui-jqgrid-bdiv']//table[@id='All']/tbody/tr[rowOrder]/td[13]";
		public static final String TABLE_BUILDING_ALL_COLUMN_RADIO_BADGE = "//*[@id='tabs-All']//*[@class='ui-jqgrid-bdiv']//table[@id='All']/tbody/tr[rowOrder]/td[14]";

		public static final String ICON_SAVE_FAMILY = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr[rowOrder]/td[15]//*[@class='editMemberInlineBtn']";
		public static final String ICON_Confirm = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr[rowOrder]/td[15]//*[@class='editMemberInlineBtn save']";
		public static final String ICON_Not_Confirm = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr[rowOrder]/td[15]//*[@class='clearInlineBtn']";
		public static final String ICON_Edit_family = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr[rowOrder]/td[15]//*[@class='editFamilyInlineBtn']";

		public static final String BUTTON_Edit_family = "//*[@class='ui-jqgrid-bdiv']//tbody/tr[rowOrder]/td[15]/input[3]";
		public static final String ICON_Badge_family = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr[rowOrder]/td[15]//*[@class='badgeInlineBtn']";
		public static final String POPUP_fastBADGE = "//*[@id='fastBadgeReadingPop']";
		public static final String POPUP_fastBADGEcolor = "//*[@id='fastBadgeReadingPop']//*[@class='color']";
		public static final String POPUP_fastBADGEcolorItems = "//*[@id='fastBadgeReadingPop']//*[@class='colors']/div[NUMBER]";		
		public static final String TYPING = "//td//input[@id='setTyping']";
		public static final String BADGE_READER = "//td//input[@id='setReading']";
		public static final String SERIAL_NUMBER = "//td//input[@id='badgeID']";
		public static final String POPUP_BADGE_OK = "//*[@id='fastBadgeReadingPop']//*[@class='d-cnt FBR']//*[@class='FBR-btns']//button[@class='ok']";
		public static final String Close_Popup = "//*[@id='fastBadgeReadingPop']//*[@class='d-cnt FBR']//*[@class='closeDialogX']";

		// page Family in Apartments tab (after click on "ICON_Edit_family")
		public static final String INPUT_Direct_Call = "//*[@id='dirCall']"; //Tung
		public static final String ERROR_MESSAGE_Direct_Call = "//*[@id='mainData']//*[@class='error']"; //Tung
		
		public static final String BUTTON_Family_Delete = "//*[@id='btnDelete']";
		public static final String POPUP_Delete_Family = "//*[@id='popupDelete']";
		public static final String BUTTON_Ok_Delete_Family = "//*[@id='popupDelete']//button[@class='thinBtn round right']";

		public static final String BUTTON_Edit_Badge = "//*[@id='badge" + "NUMBER" + "']//input[@class='badgeInlineBtn']";
		public static final String BUTTON_Add_Badge = "//button[@id='btnAddBadge']";
		public static final String POPUP_Badge_Reading = "//*[@id='badgeReadingPop']";
		public static final String IMPUT_setTyping = "//*[@id='badgeReadingPop']//*[@class='d-cnt FBR']//*[@class='applet']//input[@id='setTyping']";
		public static final String IMPUT_Serial_Number = "//*[@id='badgeReadingPop']//*[@class='d-cnt FBR']//*[@class='applet']//input[@id='badgeID']";
		public static final String SELECT_Radio = "//*[@id='badgeReadingPop']//*[@class='d-cnt FBR']//*[@class='applet']//select[@id='isRadio']"; //Tung
		public static final String BUTTON_Color = "//button[@class='color']";
		public static final String BUTTON_Ok = "//*[@id='badgeReadingPop']//*[@class='d-cnt FBR']//*[@class='FBR-btns']//button[@class='ok']";
		public static final String BUTTON_Color_Item = "//*[@class='colors']//*[@class='colorItem'][" + "NUMBER" + "]";
		public static final String POPUP_Badge_Error = "//*[@id='btErrorDialog']";
		public static final String POPUP_Badge_Error_Close = "//*[@class='ui-dialog-buttonset']/button";
		public static final String POPUP_Badge_closeDialogX = "//*[@id='badgeReadingPop']//*[@class='closeDialogX']";
		public static final String ROW_Badge = "//*[@id='badge" + "NUMBER" + "']";
		public static final String Grup_Radio = "//*[@id='selbadge" + "NUMBER" + "']";  //Tung
		public static final String ICON_Delete_family_badge = "//*[@id='badge" + "NUMBER" + "']//*[@class='delInlineBtn']";
		public static final String DROPBOX_COLOR = "//*[@id='fastBadgeReadingPop']//*[@class='FBR-table']/tbody/tr/td[5]/button";
		//public static final String DROPBOX_COLOR_ITEMS = "//*[@class='colors']//*[@class='colorItem']";
		public static final String DROPBOX_COLOR_ITEMS = "//*[@class='colors']";
		public static final String ICON_DELETE_BADGE_ROW_2 = "//*[@id='badgeTable']/tbody/tr[2]/td[6]//*[@class='delInlineBtn']";
		public static final String ICON_EDIT_BADGE_ROW_2 = "//*[@id='badgeTable']/tbody/tr[2]/td[6]//*[@class='badgeInlineBtn']";
		public static final String TABLE_COL_SERIALS_ROW_2 = "//*[@id='badgeTable']/tbody/tr[2]/td[3]";		
		
		public static final String ICON_BADGE_FAMILY_ROW_2 = "//*[@id='accessTabs']//*[@id='tabs-All']//*[@id='All']/tbody/tr[2]/td[15]//*[@class='badgeInlineBtn']";
		
		public static final String BUTTON_Add_new_member = "//button[@id='btnAddNewMember']";
		public static final String POPUP_Add_New_Member = "//*[@id='addMember']";
		public static final String INPUT_Name = "//input[@id='name_mod']";
		public static final String INPUT_Surname = "//input[@id='surname_mod']";
		public static final String INPUT_Telephone = "//input[@id='phone_mod']";
		public static final String INPUT_Mobile = "//input[@id='mobile_mod']";
		public static final String INPUT_Email = "//input[@id='email_mod']";
		public static final String BUTTON_Save_Member = "//*[@id='addMember']//button[@class='thinBtn round right']";
		public static final String BUTTON_Cancel_Member = "//*[@id='addMember']//button[@class='thinBtn round left closeDialog']";
		public static final String ROW_Member = "//*[@id='member" + "NUMBER" + "']";
		public static final String ICON_Delete_family_member = "//*[@id='member" + "NUMBER" + "']//*[@class='delInlineBtn']";

		public static final String BUTTON_Save = "//button[@class='thinBtn round fright']";
		public static final String BUTTON_Cancel = "//button[@class='thinBtn round']";

		public static final String MSG_Success = "//*[@id='retMsg']";
		public static final String Second_Aparment = "//*[@id='gview_All']/*[@class='ui-jqgrid-bdiv']/div/*[@id='All']/tbody/tr[3]";

		public static final String ICON_EDIT_FAMILY = "//*[@id='tabs-All']//table[@id='All']/tbody/tr[rowOrder]/td[15]/input[@class='editFamilyInlineBtn']";
		public static final String ICON_DELETE_BADGE = "//*[@id='gbox_badgeTable']//table[@id='badgeTable']/tbody/tr[2]/td[6]/input[@class='delInlineBtn']";
		public static final String ITEM_CONNECTION_24H = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-header-6']";
		public static final String LABEL_CONNECTION_24H = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-panel-6']//label";
		
		public static final String TAB_APARTMENT = "//*[@class='menu']//*[@class='plant_navigation']//*[@id='liLiv2_apartments']//*[@id='apartments']";
		public static final String TAB_GATES = "//*[@class='menu']//*[@class='plant_navigation']//*[@id='liLiv2_gates']//*[@id='gates']";
		public static final String TAB_SETTINGS = "//*[@class='menu']//*[@class='plant_navigation']//*[@id='liLiv2_settings']//*[@id='settings']";
		public static final String TAB_PROFILES = "//*[@class='menu']//*[@class='plant_navigation']//*[@id='liLiv2_profiles']//*[@id='profiles']";
		public static final String TAB_ACCESS_PROFILES = "//*[@class='menu']//*[@class='plant_navigation']//*[@id='liLiv2_access_profile']//*[@id='access_profile']";
		public static final String TAB_SERVICES = "//*[@class='menu']//*[@class='plant_navigation']//*[@id='liLiv2_ppt']//*[@id='ppt']";
		public static final String TAB_VIGIK = "//*[@class='menu']//*[@class='plant_navigation']//*[@id='liLiv2_vigik']//*[@id='vigik']";
		
		public static final String TEXTAREA_MESSAGE_DDN = "//*[@id='DDN']";
		public static final String TABLE_BUILDING_ALL_COLUMN_FAMILY_1 = "//*[@id='tabs-All']//*[@class='ui-jqgrid-bdiv']//table[@id='All']/tbody/tr/td[8]";
		public static final String TABLE_BUILDING_ALL_COLUMN_NAME_1 = "//*[@id='tabs-All']//*[@class='ui-jqgrid-bdiv']//table[@id='All']/tbody/tr/td[9]";
		public static final String TABLE_BUILDING_ALL_COLUMN_SURNAME_1 = "//*[@id='tabs-All']//*[@class='ui-jqgrid-bdiv']//table[@id='All']/tbody/tr/td[10]";
		public static final String ICON_SAVE_FAMILY_CONFIRM = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr/td[15]//*[@class='editMemberInlineBtn save']";
		public static final String ICON_EDIT_MEMBER = "//*[@id='memberTable']/tbody/tr/td[7]//*[@class='editSaveInlineBtn']";
		
		public static final String BUTTON_EXPORT_LIST = "//*[@id='accessTabs']//*[@id='tabs-All']//button[@id='btnExport']";
		public static final String BUTTON_IMPORT_LIST = "//*[@id='accessTabs']//*[@id='tabs-All']//button[@id='btnImport']";
		
		public static final String INPUT_FAMINLY = "//*[@id='tabs-All']//*[@id='All']/tbody/tr[2]/td[8]/input";
		public static final String INPUT_MEMBER_NAME = "//*[@id='tabs-All']//*[@id='All']/tbody/tr[2]/td[9]/input";
		public static final String INPUT_MEMBER_SURNAME = "//*[@id='tabs-All']//*[@id='All']/tbody/tr[2]/td[10]/input";
		
		public static final String CELL_FAMINLY = "//*[@id='tabs-All']//*[@id='All']/tbody/tr[2]/td[8]";
		public static final String CELL_MEMBER_NAME = "//*[@id='tabs-All']//*[@id='All']/tbody/tr[2]/td[9]";
		public static final String CELL_MEMBER_SURNAME = "//*[@id='tabs-All']//*[@id='All']/tbody/tr[2]/td[10]";
		public static final String TAB_SYSTEM_ADDRESSING = "//*[@id='system_addressing']";
		
		public static final String TABLE_ALL_BUILDING_CELL_X = "//*[@id='accessTabs']//*[@id='All']/tbody/tr[rowOrder]/td[columnOrder]";
		public static final String TABLE_ALL_BUILDING_BADGEFAMILY_X = "//*[@id='accessTabs']//*[@id='All']/tbody/tr[rowOrder]/td[15]/input[@class='badgeInlineBtn']";
		public static final String POPUP_INPUT_SERIAL_NUMBER = "//*[@id='fastBadgeReadingPop']//*[@class='FBR-table']/tbody/tr/td[3]/input[@id='badgeID']";
		public static final String POPUP_BUTTON_OK = "//*[@id='fastBadgeReadingPop']//*[@class='FBR-btns']/button[@class='ok']";
		public static final String POPUP_BUTTON_CLOSE = "//*[@id='fastBadgeReadingPop']//*[@class='d-cnt FBR']//*[@class='closeDialogX']";
	
		public static final String CLOSE_DIALOG_X = "//*[@class='d-cnt FBR']//*[@class='closeDialogX']";
		public static final String KEYBOARD_CODE_X = "//*[@class='mygrid ui-jqgrid-btable']/tbody/tr[rowOrder]/td[11]";
	
		public static final String ICON_BADGE_FAMILY_X = "//*[@id='gview_All']//table[@id='All']/tbody/tr[rowOrder]/td[15]/input[@class='badgeInlineBtn']";
		public static final String INPUT_BADGE_SERIAL = "//*[@id='fastBadgeReadingPop']//input[@id='badgeID']";
		public static final String BUTTON_BADGE_OK = "//*[@id='fastBadgeReadingPop']//button[@class='ok']";
		public static final String BUTTON_CLOSE_X = "//*[@id='fastBadgeReadingPop']//*[@class='d-cnt FBR']//a[@class='closeDialogX']";
	}

	//Home > My Projects > Project_Name > Profiles
	public static final class Profiles {
		public static final String TAB_By_Time_Bands = "//*[@class='ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all']//li[1]";
		public static final String TAB_By_Gates = "//*[@class='ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all']//li[2]";

		public static final String Title_TimeBands_Group = "//*[@id='jqgh_gridgroupsGridPTP_desc']";
		public static final String Title_Time_Bands = "//*[@id='jqgh_gridtimebandsPTP_timeband']";
		public static final String Title_Gate = "//*[@id='jqgh_gridgatesInvPTP_nome']";

		public static final String BUTTON_New_Group = "//*[@id='byTimebands']//*[@class='thickBtn round']";
		public static final String BUTTON_New_Time_Band = "//button[@id='newTimebandButton']";
		public static final String BUTTON_Apply = "//*[@class='thickBtn round refreshStatus']";

		public static final String POPUP_Update_Group = "//*[@id='popupUpdateGroup']";
		public static final String INPUT_Profile_Name = "//*[@id='idProfiloUpdateGroup']";
		public static final String BUTTON_OK = "//*[@id='newGroupButton']";

		public static final String POPUP_NEW_TIME_BAND = "//*[@id='newProfilePop']"; //*
		public static final String INPUT_Time_Band_Name = "//*[@id='nameTimeBand']";
		public static final String SELECT_From_Hour = "//*[@id='from_hour']";
		public static final String SELECT_From_Minute = "//*[@id='from_minute']";
		public static final String SELECT_To_Hour = "//*[@id='to_hour']";
		public static final String SELECT_To_Minute = "//*[@id='to_minute']";
		public static final String BUTTON_Cancel = "//*[@id='newProfilePop']//*[@class='d-cnt']//*[@class='d-btns-red']//button[@class='thinBtn round left closeDialog']";
		public static final String BUTTON_Save = "//*[@id='newProfilePop']//*[@class='d-cnt']//*[@class='d-btns-red']//button[@class='thinBtn round right']";

		public static final String ICON_Delete_Time_Band = "//*[@id='gridtimebandsPTP']//tr[2]//*[@class='deleteRow']";
		public static final String ICON_Display = "//*[@id='gridtimebandsPTP']//tr[2]//*[@class='modInlineBtn']";

		public static final String POPUP_DELETE_PROFILE = "//*[@id='popupDelete']";
		public static final String BUTTON_DELETE_PROFILE_OK = "//*[@id='popupDelete']//*[@id='deleteForm']//*[@class='d-btns']//button[@class='thinBtn round right']";

		public static final String POPUP_EDIT_TIME_BAND = "//*[@id='editProfilePop']";
		public static final String INPUT_Time_Band_Name_Mod = "//*[@id='nameTimeBandMod']";
		public static final String SELECT_From_Mod_Hour = "//*[@id='from_mod_hour']";
		public static final String SELECT_From_Mod_Minute = "//*[@id='from_mod_minute']";
		public static final String SELECT_To_Mod_Hour = "//*[@id='to_mod_hour']";
		public static final String SELECT_To_Mod_Minute = "//*[@id='to_mod_minute']";
		public static final String BUTTON_Cancel_Mod = "//*[@id='formEditProfile']//*[@class='d-cnt']//*[@class='d-btns-red']//button[@class='thinBtn round left closeDialog']";
		public static final String BUTTON_Save_Mod = "//*[@id='formEditProfile']//*[@class='d-cnt']//*[@class='d-btns-red']//button[@class='thinBtn round right']";

		public static final String Time_Band_Row = "//table[@id='gridtimebandsPTP']//tr[2]";

		public static final String CHECKBOX_Choose_Gate_ALL = "//*[@id='cb_gridgatesPTP']";

		public static final String MSG_Success = "//*[@id='retMsgAss'][@class='confirmMsg']";

		public static final String Gate_Name_Colunm = "//table[@id='gridgatesInvPTP']/tbody/tr[2]/td[2]";

		////lmh
		public static final String LI_PROFILES = "//*[@class='active'][2]";
		public static final String BUTTON_NEW_GROUP = "//*[@id='byTimebands']//*[@class='thickBtn round'][1]";
		public static final String BUTTON_NEW_TIMEBAND = "//*[@id='byTimebands']//*[@class='thickBtn round'][2]";
		public static final String BUTTON_APPLY = "//*[@id='byTimebands']/button[@class='thickBtn round refreshStatus']";

		// pop-up 'Update Group Name'
		public static final String POPUP_UPDATE_GROUP_NAME = "//*[@id='popupUpdateGroup']//*[@id='updateForm']/h3";
		public static final String INPUT_GROUP_NAME = "//*[@id='updateForm']//*[@id='idProfiloUpdateGroup']";
		public static final String BUTTON_CREATE_NEW_GROUP = "//*[@id='updateForm']//*[@id='newGroupButton']";
		public static final String BUTTON_CANCEL_NEW_GROUP = "//*[@id='updateForm']//*[@class='thinBtn round left closeDialog']";

		// pop-up 'New Time Band'
		public static final String POPUP_NEW_TIMEBAND = "//*[@id='newProfilePop']//*[@id='formNewProfile']";
		public static final String POPUP_NEW_TIMEBAND_TITLE = POPUP_NEW_TIMEBAND + "/h3[@class='newTitle']";
		public static final String INPUT_TIMEBAND_NAME = POPUP_NEW_TIMEBAND + "//*[@id='nameTimeBand']";
		public static final String DROPDOWNLIST_TIMEFROM_HOUR = POPUP_NEW_TIMEBAND + "//*[@id='from_hour']";
		public static final String DROPDOWNLIST_TIMEFROM_MINUTE = POPUP_NEW_TIMEBAND + "//*[@id='from_minute']";
		public static final String DROPDOWNLIST_TIMETO_HOUR = POPUP_NEW_TIMEBAND + "//*[@id='to_hour']";
		public static final String DROPDOWNLIST_TIMETO_MINUTE = POPUP_NEW_TIMEBAND + "//*[@id='to_minute']";
		public static final String BUTTON_SAVE = "//*[@id='saveProfileNew']";

		public static final String TAB_ACCESS_PROFILES = "//*[@class='menu']//*[@class='plant_navigation']//*[@id='liLiv2_access_profile']//*[@id='access_profile']";
		public static final String ICON_DELETE_GROUP_X = "//table[@id='gridgroupsGridPTP']/tbody/tr[rowNumber]/td[3]//*[@class='deleteRow']";
		public static final String BUTTON_OK_POPUP_DELETE = "//*[@id='okDeleteGroupButton']";
		public static final String TXTAREA_ERROR_GATE = "//textarea[@id='txtAreaGate']";
		public static final String TXTAREA_ERROR_FAMILY = "//textarea[@id='txtAreaFamil']";
		public static final String PROFILE_NAME_GROUP_X = "//table[@id='gridgroupsGridPTP']/tbody/tr[rowNumber]/td[2]";
	
		public static final String CHECKBOX_ALL_GATES = "//*[@id='jqgh_gridgatesPTP_cb']/input[@id='cb_gridgatesPTP']";
		public static final String TAB_APARTMENTS = "//*[@id='liLiv2_apartments']//*[@id='apartments']";
		
	}

	//HomeMy > Projects > Plant_Name > Access Profile
	public static final class Access_Profile_Tab {

		public static final String LI_ACCESS_PROFILES = "//*[@class='active'][2]";
		public static final String TAB_ALL_BUILDING = "//*[@id='tabsBuilding']//*[@id='ui-id-" + "NUMBER" + "']";
		public static final String BUTTON_SET_PROFILE = "//*[@class='mainContent']//*[@id='buttons']//*[@class='thickBtn round']";
		//public static final String BUTTON_SET_PROFILE = "//*[@class='info']//*[@class='content']//*[@class='threeColumnsContent']//*[@class='mainContent']//*[@class='mainContent']//*[@id='buttons']/button[@id='idsetprofile']";
		public static final String TABLE_BUILDINGS = "//*[@id='tableBuilding_ALL']";
		public static final String ICON_SETTING = "//*[@id='allBuilding']/div[@id='gbox_tableBuilding_ALL']//*[@id='tableBuilding_ALL']//input[@class='editSaveInlineBtn']";
		public static final String DROPDOWNLIST_SELECT_PROFILE = "//*[@id='tabsBuilding']//*[@id='allBuilding']//*[@id='tableBuilding_ALL']/tbody//select[1]";
		public static final String BUTTON_ACTIONS_SAVE = "//*[@id='tabsBuilding']//*[@id='allBuilding']//*[@id='tableBuilding_ALL']//input[@class='editSaveInlineBtn save']";
		public static final String TABLE_PROFILE_ALL_COLUMN_2 = "//*[@id='profilePop']//*[@id='tableAllProfile']/tbody/tr[2]/td[4]";

		// pop-up 'Set Profile'
		public static final String POPUP_SET_PROFILE = "//*[@id='profilePop']";
		public static final String POPUP_SET_PROFILE_TITLE = POPUP_SET_PROFILE + "/h3";
		public static final String ICON_EDIT_PROFILE = POPUP_SET_PROFILE
				+ "//*[@id='tableAllProfile']//*[@class='editSaveInlineBtn']";
		public static final String DROPDOWNLIST_TIMEBAND_GROUP = "//*[@id='profilePop']//*[@id='tableAllProfile']//select";
		public static final String ICON_SAVE_PROFILE = "//*[@id='profilePop']//*[@id='tableAllProfile']//*[@class='editSaveInlineBtn save']";
		public static final String POPUP_SET_PROFILE_CLOSE = POPUP_SET_PROFILE + "/h3/a[@class='closeDialogX']";

		// pop-up Confirm Adjustment
		public static final String BUTTON_CLOSE_CONFIRM_POPUP = "//*[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//*[@class='ui-dialog-buttonset']/button";
		public static final String BUTTON_CLOSE_CONFIRM_NONE_POPUP = "//*[@class='loading']//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']//*[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//*[@class='ui-dialog-buttonset']/button";
		public static final String CONTENT_CONFIRM_POPUP = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons'][4]//*[@id='btErrorDialog']";

		// Tab "All Buildings"
		public static final String TABLE_BUILDING_ALL_COLUMN_ID = "//*[@id='tableBuilding_ALL']/tbody/tr[2]/td[1]"; //Building Name
		public static final String TABLE_BUILDING_ALL_COLUMN_1 = "//*[@id='tableBuilding_ALL']/tbody/tr[2]/td[3]"; //Building Name
		public static final String TABLE_BUILDING_ALL_COLUMN_2 = "//*[@id='tableBuilding_ALL']/tbody/tr[2]/td[4]"; //Apartment Name
		public static final String TABLE_BUILDING_ALL_COLUMN_3 = "//*[@id='tableBuilding_ALL']/tbody/tr[2]/td[5]"; //Family Name
		public static final String TABLE_BUILDING_ALL_COLUMN_4 = "//*[@id='tableBuilding_ALL']/tbody/tr[2]/td[6]"; //Group-Time-Band Name
		public static final String TABLE_BUILDING_ALL_ICON_SAVE = "//*[@id='tableBuilding_ALL']/tbody/tr[2]/td[8]//*[@class='editSaveInlineBtn save']";
		public static final String TABLE_BUILDING_ALL_ICON_LOCK = "//*[@id='tableBuilding_ALL']/tbody/tr[2]/td[7]//*[@class='editable']/button[1]";

		// Tab (building tab) besides tab "All Buildings"
		public static final String TABLE_BUILDING_COLUMN_1 = "//*[@aria-labelledby='ui-id-NUMBER']//*[@class='ui-jqgrid-btable']/tbody/tr[2]/td[3]";
		//public static final String TABLE_BUILDING_COLUMN_3 = "//*[@aria-labelledby='ui-id-NUMBER']//*[@class='ui-jqgrid-btable']/tbody/tr[2]/td[5]";
		public static final String TABLE_BUILDING_COLUMN_3 = "//*[@class='ui-jqgrid-bdiv']//tbody/tr[2]/td[6]";
		
		public static final String ICON_EDIT_X = "//*[@id='tableBuilding_ALL']/tbody/tr[NUMBER]/td[8]/input[@class='editSaveInlineBtn']";
		public static final String ICON_SAVE_X = "//*[@id='tableBuilding_ALL']/tbody/tr[NUMBER]/td[8]/input[@class='editSaveInlineBtn save']";
		public static final String ICON_DELETE_X = "//*[@id='tableBuilding_ALL']/tbody/tr[NUMBER]/td[8]/input[@class='clearInlineBtn']";
		public static final String ICON_LOCK_X = "//*[@id='tableBuilding_ALL']/tbody/tr[NUMBER]/td[7]/span[@class='editable']/button";
		public static final String TAB_STATUS = "//*[@id='liLiv1_status']//*[@id='status']";
		
		public static final String ICON_SETTING_X = "//*[@id='tableBuilding_ALL']/tbody/tr[NUMBER]/td[8]";
		
		public static final String TABLE_BUILDING_ALL_APARTMENT_X = "//*[@id='allBuilding']//table[@id='tableBuilding_ALL']/tbody/tr[rowOrder]/td[4]";
		public static final String TABLE_BUILDING_ALL_COLUMN_X = "//*[@id='allBuilding']//table[@id='tableBuilding_ALL']/tbody/tr[rowOrder]/td[1]";
		public static final String TABLE_BUILDING_ALL_GROUP_X = "//*[@id='allBuilding']//table[@id='tableBuilding_ALL']/tbody/tr[rowOrder]/td[6]";
		
		public static final String TAB_BUILDING_X = "//*[@id='ui-id-tabOrder']";
		
		public static final String TAB_BUILDING_APARTMENT_X = "//*[@id='build_tabOrder']//table[@id='table_build_tabOrder']/tbody/tr[2]/td[3]";
		public static final String TAB_BUILDING_APARTMENT_X_2 = "//*[@id='build_tabOrder']//table[@id='table_build_tabOrder']/tbody/tr[3]/td[3]";
		public static final String TAB_PROFILES = "//*[@id='liLiv2_profiles']//*[@id='profiles']";
		public static final String TAB_APARTMENTS = "";
	
		public static final String ICON_EDIT_BUILDING_X = "//*[@id='tableAllProfile']/tbody/tr[rowOrder]/td[5]/input[@class='editSaveInlineBtn']";
		public static final String ICON_SAVE_BUILDING_X = "//*[@id='tableAllProfile']/tbody/tr[rowOrder]/td[5]/input[@class='editSaveInlineBtn save']";
		public static final String ICON_DROPBOX_BUILDING_X = "//*[@id='tableAllProfile']/tbody/tr[rowOrder]/td[4]/select";
		public static final String BUTTON_CLOSE_BUILDING_X = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons'][rowOrder]/div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']/div[@class='ui-dialog-buttonset']/button";
	
		public static final String ICON_SETTING_BUILDING_X = "//*[@id='tableBuilding_ALL']/tbody/tr[rowOrder]/td[8]/input[@class='editSaveInlineBtn']";
		public static final String DROPBOX_BUILDING_X = "//*[@id='tableBuilding_ALL']/tbody/tr[rowOrder]/td[6]/select";
		public static final String ICON_SAVE_1_BUILDING_X = "//*[@id='tableBuilding_ALL']/tbody/tr[rowOrder]/td[8]/input[@class='editSaveInlineBtn save']";
		public static final String ICON_LOCK_1_BUILDING_X = "//*[@id='tableBuilding_ALL']/tbody/tr[rowOrder]/td[7]//*[@class='editable']/button";
		
		public static final String TAB_MAIN_STATUS = "//*[@id='main_navigation']//*[@id='liLiv1_status']//*[@id='status']";
	
		public static final String TABLE_BUILDING_ALL_BUILDING_X = "//*[@id='tableBuilding_ALL']/tbody/tr[NUMBER]/td[3]"; //Building Name
		public static final String TABLE_BUILDING_ALL_FAMILY_X = "//*[@id='tableBuilding_ALL']/tbody/tr[NUMBER]/td[5]"; //Family Name

	}
	

	//Home > My Projects > Project_Name > Vigik
	public static final class Vigik {
		public static final String LI_Vigik = "//*[@class='active'][2]";
		public static final String MSG_Success = "//*[@id='retMsgAss'][@class='confirmMsg']";

		//Gate TAB
		public static final String TAB_By_Gate = "//*[@class='ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all']//li[1]";
		public static final String Title_Gate = "//*[@id='jqgh_gatesTable_nome']";
		public static final String Gate_Name_Colunm = "//table[@id='gatesTable']/tbody/tr[2]/td[2]";
		public static final String Service_Row_TabGate = "//table[@id='servicesTable']//tr[" + "NUMBER" + "]";
		public static final String ICON_View_Gate = "//table[@id='servicesTable']//tr[" + "NUMBER" + "]//*[@class='modInlineBtn']";
		public static final String BUTTON_Apply_Gate = "//button[@id='applyBtn']";
		public static final String POPUP_MODIFY_VIGIK_PROFILE_Gate = "//*[@id='modVigikPop']";
		public static final String INPUT_Profile_is_Name = "//input[@id='nameMod_0']";
		public static final String SELECT_Inherit_profile = "//select[@id='vigikProfilesSelectMod']";
		public static final String INPUT_From_0 = "//input[@id='fromMod_0']";
		public static final String INPUT_To_0 = "//input[@id='toMod_0']";
		public static final String INPUT_From_1 = "//input[@id='fromMod_1']";
		public static final String INPUT_To_1 = "//input[@id='toMod_1']";
		public static final String INPUT_From_2 = "//input[@id='fromMod_2']";
		public static final String INPUT_To_2 = "//input[@id='toMod_2']";
		public static final String BUTTON_Cancel = "//button[@class='thinBtn round left closeDialog']";
		public static final String BUTTON_Save = "//button[@class='thinBtn round right']";
		public static final String CheckBox_Service_TabGate = "//*[@id='servicesTable_cb']/*[@id='jqgh_servicesTable_cb']//input";
		public static final String Column_CheckBox_Of_ServiceTable_TabGate = "//table[@id='servicesTable']/tbody/tr[" + "NUMBER" + "]/td[1]"; //Tung
		
		//Service TAB
		public static final String TAB_By_Service = "//*[@class='ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all']//li[2]";
		public static final String Service_Row = "//table[@id='servicesTableInv']/tbody/tr";
		public static final String Service_Row_TabService = "//table[@id='servicesTableInv']//tr[" + "NUMBER" + "]";
		public static final String Gate_Row_TabService = "//table[@id='gatesTableInv']//tr[2]";
		public static final String ICON_View_Service = "//table[@id='servicesTableInv']//tr[" + "NUMBER" + "]//*[@class='modInlineBtn']";
		public static final String BUTTON_Apply_Service = "//button[@id='applyBtnInv']";
		public static final String CHECKBOX_GATE_TabService = "//table[@id='gatesTableInv']//tr[" + "NUMBER"
				+ "]//td[1]//input";
		public static final String VIGIK_PROFILE_NAME_ROW_1 = "//*[@id='servicesTable']/tbody/tr[2]/td[4]";
		
		public static final String TABLE_GATE_ROW_X = "//*[@id='gatesTable']/tbody/tr[rowOrder]/td[2]";
		public static final String TAB_BYSERVICE = "//*[@id='ui-id-2']";
		public static final String TABLE_SERVICE_ROW_X = "//*[@id='servicesTable']/tbody/tr[rowOrder]/td[1]/input";
		
		public static final String CHECKBOX_ALL_SERVICE = "//*[@id='servicesTable_cb']/*[@id='jqgh_servicesTable_cb']//input";
		public static final String GATE_TABLE_ROW_X = "//table[@id='gatesTable']/tbody/tr[NUMBER]";
	}

	public static final class Plant_User {
		public static final String BUTTON_Invite_New_User = "//button[@id='btnInviteNewUser']";
		public static final String Column = "//table[@id='siteUsersMgm']/tbody/tr[2]/td[" + "NUMBER" + "]";

		public static final String POPUP_NEW_USER_INVITATION = "//*[@id='inviteFormNewUser']";
		public static final String INPUT_Email = "//input[@id='newUsr-email']";
		public static final String BUTTON_Users_Address_Book = "//*[@id='inviteFormNewUser']//*[@class='d-cnt']//*[@class='twoColForm']//*[@class='alt']//button[@class='uThinBtn openAddressBook']";
		public static final String Users_Address_Book_Row = "//table[@id='addressBook']/tbody/tr";
		public static final String Email_Colum = "//table[@id='addressBook']/tbody/tr[" + "NUMBER" + "]/td[4]";
		public static final String RADIO_Owner = "//*[@name='idRuoloEu'][@id='idRuoloEu_0']";
		public static final String RADIO_Installer = "//*[@name='idRuoloEu'][@id='idRuoloEu_1']";
		public static final String RADIO_Manager = "//*[@name='idRuoloEu'][@id='idRuoloEu_2']";
		public static final String BUTTON_Cancel = "//*[@id='inviteFormNewUser']//*[@class='d-btns']//button[@class='thinBtn round left']";
		public static final String BUTTON_Send = "//*[@id='inviteFormNewUser']//*[@class='d-btns']//button[@class='thinBtn round right']";

		public static final String SITE_USERS_MANAGEMENT_Row_0 = "//table[@id='siteUsersMgm']/tbody/tr";
		public static final String SITE_USERS_MANAGEMENT_Row = "//table[@id='siteUsersMgm']/tbody/tr[" + "NUMBER" + "]";
		public static final String ICON_Delete = "/*[@class='delInlineBtn']";
		public static final String ICON_Edit = "/*[@class='editSaveInlineBtn']";

		public static final String RADIO_Owner_Mod = "//*[@name='idRuoloEu'][@id='roleRadioMod_0']";
		public static final String RADIO_Installer_Mod = "//*[@name='idRuoloEu'][@id='roleRadioMod_1']";
		public static final String RADIO_Manager_Mod = "//*[@name='idRuoloEu'][@id='roleRadioMod_2']";
		public static final String BUTTON_Cancel_Mod = "//*[@id='inviteFormModUser']//*[@class='d-btns']//button[@class='thinBtn round left']";
		public static final String BUTTON_Send_Mod = "//*[@id='inviteFormModUser']//*[@class='d-btns']//button[@class='thinBtn round right']";

		public static final String MSG_Success = "//*[@id='msgArea']//*[@class='confirmMsg']";
	}

	public static final class Services_Tab {
		public static final String Service_tab = "//*[@class='active']";

		public static final String Button_Service_Provider = "//*[@id='ui-id-1']";
		public static final String Button_By_Gate = "//*[@id='ui-id-2']";
		public static final String Service_Provider_View = "//*[@id='byServiceProvider']";
		public static final String By_Gate_View = "//*[@id='applyBtnInv']";
		public static final String Add_Service = "//*[contains(@onclick,'serv.addService()')]";
		public static final String Service_Apply_Button = "//*[@id='applyBtn']";
		public static final String Gate_Apply_Button = "//*[@id='applyBtnInv']";
		public static final String Popup_Add_Service = "//*[@id='formAddService']";
		public static final String Service_Name = "//*[@id='name_new']";
		public static final String Service_Description = "//*[@id='note_new']";
		public static final String Badge_Expiration_Date = "//*[@id='expdate_new']";
		public static final String Add_Badge = "//*[contains(@onclick,'serv.popupBadgeNew();')]";
		public static final String Popup_Add_Badge = "//*[@id='badgeReadingPop']";
		public static final String Input_BadgeID = "//*[@id='badgeReadingPop']//div[@class='d-cnt FBR']//div[@class='applet']//*[@id='badgeID']";
		public static final String BUTTON_Color = "//button[@class='color']";
		public static final String BUTTON_Color_Item = "//*[@class='colorItem'][" + "NUMBER" + "]";
		public static final String Button_Ok = "//*[@id='badgeReadingPop']//*[@class='d-cnt FBR']//*[@class='FBR-btns']//button[@class='ok']";
		public static final String Button_Cancel = "//*[@id='formAddService']//*[@class='d-btns']//*[@class='thinBtn round left closeDialog']";
		public static final String Button_Save = "//*[@id='formAddService']//*[@class='d-btns']//*[@class='thinBtn round right']";
		public static final String New_Service = "//*[@id='servicesTable']/tbody/tr[2]/td[2]";
		public static final String Expire_Date = "//*[@id='servicesTable']/tbody/tr[2]/td[4]";
		public static final String TimeBands = "//*[@id='servicesTable']/tbody/tr[2]/td[5]";
		public static final String Edit_Service = "//*[@id='servicesTable']/tbody/tr[2]/td[6]//*[@class='editSaveInlineBtn']";
		public static final String Delete_Service = "//*[@id='servicesTable']/tbody/tr[2]/td[6]//*[@class='deleteRow']";
		public static final String Detail_Service = "//*[@id='servicesTable']/tbody/tr[2]/td[6]//*[@class='modInlineBtn']";
		public static final String Select_Service = "//*[@id='servicesTable']/tbody/tr[2]";
		public static final String CheckBox_Gate = "//*[@id='gatesTable']/tbody/tr[2]/td[1]//*[@class='cbox']";
		public static final String Select_Gate = "//*[@id='gatesTableInv']/tbody/tr[2]";
		public static final String CheckBox_Service = "//*[@id='servicesTableInv']/tbody/tr[2]/td[1]//*[@class='cbox']";

		public static final String Popup_Detail_Service = "//*[@id='formModService']";
		public static final String Modify_Description = "//*[@id='note_mod']";
		public static final String Modify_Badge_Expiration_Date = "//*[@id='expdate_mod']";
		public static final String Modify_Service_Name = "//*[@id='name_mod']";
		public static final String Delete_Badge = "//*[@id='formModService']//table[@id='tableBadge']/tbody/tr/td[3]/input[@class='delInlineBtn']";
		public static final String Modify_Service_Cancel = "//*[@id='formModService']//*[@class='d-btns']//*[@class='thinBtn round left closeDialog']";
		public static final String Modify_Service_Ok = "//*[@id='formModService']//*[@class='d-btns']//*[@class='thinBtn round right']";
		public static final String Badge = "//*[@class='staticTable']/tbody/tr[1]/td[1]";

		public static final String Associate_TimeSlots_Save = "//*[@class='editSaveInlineBtn save']";
		public static final String Associate_TimeSlots_Cancel = "//*[@class='clearInlineBtn']";
		public static final String Select_TimeSlots = "//select[@class='editable']";

		public static final String Popup_Delete_Service = "//*[@id='popupDelete']";
		public static final String Delete_OK = "//*[@id='deleteForm']//*[@class='d-btns']//*[@class='thinBtn round right']";

		public static final String Name_Gate = "//*[@id='gatesTable']/tbody/tr[2]/td[3]";
		public static final String Name_Service = "//*[@id='servicesTableInv']/tbody/tr[2]/td[3]";

		public static final String MSG_Success = "//*[@id='retMsgAss']";
		
		public static final String BY_SERVICE_TABLE_SERVICE_NAME = "//*[@id='servicesTable_nome']//*[@id='jqgh_servicesTable_nome']";
		public static final String BY_SERVICE_TABLE_SERVICE_LOCK = "//*[@id='servicesTable_codeLock']//*[@id='jqgh_servicesTable_codeLock']";
		public static final String BY_SERVICE_TABLE_SERVICE_DATE = "//*[@id='servicesTable_endDate']//*[@id='jqgh_servicesTable_endDate']";
		public static final String BY_SERVICE_TABLE_SERVICE_PROF = "//*[@id='servicesTable_profile']//*[@id='jqgh_servicesTable_profile']";
		public static final String BY_SERVICE_TABLE_SERVICE_ACTS = "//*[@id='servicesTable_actions']//*[@id='jqgh_servicesTable_actions']";
		public static final String BY_SERVICE_TABLE_LEFT = "//*[@id='byServiceProvider']//*[@id='gbox_servicesTable']//table[@class='ui-pg-table']/tbody/tr/td[@id='servicesTable_pager_left']";
		public static final String BY_SERVICE_TABLE_RIGHT = "//*[@id='byServiceProvider']//*[@id='gbox_servicesTable']//table[@class='ui-pg-table']/tbody/tr/td[@id='servicesTable_pager_right']";
		
		public static final String BY_GATE_TABLE_SERVICE_NAME = "//*[@id='servicesTableInv_nome']//*[@id='jqgh_servicesTableInv_nome']";
		public static final String BY_GATE_TABLE_SERVICE_LOCK = "//*[@id='servicesTableInv_codeLock']//*[@id='jqgh_servicesTableInv_codeLock']";
		public static final String BY_GATE_TABLE_SERVICE_DATE = "//*[@id='servicesTableInv_endDate']//*[@id='jqgh_servicesTableInv_endDate']";
		public static final String BY_GATE_TABLE_SERVICE_PROF = "//*[@id='servicesTableInv_profile']//*[@id='jqgh_servicesTableInv_profile']";
		public static final String BY_GATE_TABLE_SERVICE_ACTS = "//*[@id='servicesTableInv_actions']//*[@id='jqgh_servicesTableInv_actions']";
		public static final String BY_GATE_TABLE_LEFT = "//*[@id='byGate']//*[@id='gbox_servicesTableInv']//table[@class='ui-pg-table']/tbody/tr/td[@id='servicesTableInv_pager_left']";
		
		public static final String BY_GATE_TABLE_GATE_NAME = "//*[@id='gatesTableInv_nome']//*[@id='jqgh_gatesTableInv_nome']";
		public static final String BY_GATE_TABLE_GATE_TYPE = "//*[@id='gatesTableInv_type']//*[@id='jqgh_gatesTableInv_type']";
		public static final String BY_GATE_TABLE_GATE_FEAT = "//*[@id='gatesTableInv_features']//*[@id='jqgh_gatesTableInv_features']";
		public static final String BY_GATE_TABLE_1st_GATE = "//*[@id='byGate']//table[@id='gatesTableInv']/tbody/tr[2]/td[2]";
		
		public static final String TAB_ACCESS_PROFILE = "//*[@class='plant_menu']//*[@class='plant_navigation']//*[@id='liLiv2_access_profile']//*[@id='access_profile']";
		public static final String TAB_PROFILES = "//*[@class='menu']//*[@class='plant_navigation']//*[@id='liLiv2_profiles']//*[@id='profiles']";
		
		public static final String BUTTON_ADD_SERVICE = "//*[@id='byServiceProvider']/button[@class='thickBtn round']";
		public static final String ICON_SAVE_SERVICE = "//*[@id='servicesTable']/tbody/tr[2]/td[6]/input[@class='editSaveInlineBtn save']";
		public static final String CHECKBOX_GATE_X = "//*[@id='gatesTable']/tbody/tr[rowOrder]/td[1]//*[@class='cbox']";
		public static final String CHECKBOX_GATE_NAME_X = "//*[@id='gatesTable']/tbody/tr[rowOrder]/td[3]";
	}

	//Sanity test
	public static final class Sanity_Test {
		public static final String Show_Plants = "//*[@id='endUsersSiteTable']//tbody/tr[1]";
	}

	public static final class Invitations {
		public static final String Invitations_Row = "//table[@id='invitations']/tbody/tr";
		public static final String Invitations_Actions_Column = "//table[@id='invitations']/tbody/tr[" + "NUMBER"
				+ "]/td[7]";
		public static final String Invitations_Rule_Column = "//table[@id='invitations']/tbody/tr[" + "NUMBER"
				+ "]/td[6]";

		public static final String ICON_Accept = "/*[@class='acceptInvInlineBtn']";
		public static final String ICON_Deny = "/*[@class='denyInvInlineBtn']";

		public static final String POPUP_Accept = "//*[@id='invitationAcceptPop']";
		public static final String BUTTON_Cancel = "//button[@id='cancelInvInformativeBtn']";
		public static final String BUTTON_Accept = "//button[@id='acceptInvInformativeBtn']";

		public static final String BUTTON_Close = "//*[@class='ui-dialog-buttonset']//button";
	}

	public static final class Status_Tab {
		public static final String LI_CONNECTION_STATUS = "//*[@class='active'][2]";
		public static final String LAST_DATA_SENT = "//table[@id='genericGrid']/tbody/tr[rowOrder]/td[5]";
		public static final String BUTTON_Gateway_Synchronization = "//table[@id='genericGrid']/tbody/tr[rowOrder]/td[8]/input";
		public static final String GREEN_CMD_EXECUTED_BULLET = "//*[@id='gview_genericGrid']//table[@id='genericGrid']/tbody/tr[2]/td[8]/center/input[@class='thumbUpGreen']";
		public static final String RED_CMD_EXECUTED_BULLET = "//*[@id='gview_genericGrid']//table[@id='genericGrid']/tbody/tr[2]/td[8]/center/input[@class='thumbDownRed']";
		public static final String TABLE_COMMAND_LIST_COL_COMMAND = "//*[@id='gbox_genericGrid']//table[@id='genericGrid']/tbody/tr[2]/td[5]";
		public static final String TABLE_COMMAND_LIST_COL_IDACK = "//*[@id='gbox_genericGrid']//table[@id='genericGrid']/tbody/tr[2]/td[6]";
		public static final String TABLE_COMMAND_LIST_COL_EXECUTED = "//*[@id='gbox_genericGrid']//table[@id='genericGrid']/tbody/tr[2]/td[7]";
		public static final String TABLE_COMMAND_LIST_COL_STATUS_ORANGE = "//*[@id='gbox_genericGrid']//*[@id='gview_genericGrid']//table[@id='genericGrid']/tbody/tr[2]/td[8]//input[@class='thumbDownOrange']";
		public static final String TABLE_COMMAND_LIST_COL_TIMESTAMP = "//*[@id='gview_genericGrid']//table[@id='genericGrid']/tbody/tr[2]/td[4]";
		public static final String TABLE_COMMAND_LIST_CMD_CONTENT = "//*[@id='genericGrid']//*/tr[2]/td[1]/cmd";
		public static final String TABLE_COMMAND_LIST_COL_COMMAND_VAR = "//*[@id='gbox_genericGrid']//table[@id='genericGrid']/tbody/tr[NUMBER]/td[5]";
		public static final String TABLE_COMMAND_LIST_COL_TIMESTAMP_VAR = "//*[@id='gview_genericGrid']//table[@id='genericGrid']/tbody/tr[NUMBER]/td[4]";

		public static final String TABLE_CONNECTION_STATUS = "//table[@id='genericGrid']/tbody/tr";
		public static final String CMD_DSC = "//table[@id='genericGrid']/tbody/tr[rowOrder]/td[1]/cmd[@dsc='Add/Upd MemberGroup Badge List to a single Access Control Unit' and @type='Upd']";
		public static final String CELL_TIMESTAMP = "//table[@id='genericGrid']/tbody/tr[rowOrder]/td[4]";
		public static final String CELL_COMMAND = "//table[@id='genericGrid']/tbody/tr[rowOrder]/td[5]";
		public static final String CELL_ID_ACK = "//table[@id='genericGrid']/tbody/tr[rowOrder]/td[6]";
		public static final String CELL_EXECUTED = "//table[@id='genericGrid']/tbody/tr[rowOrder]/td[7]";
		public static final String CELL_STATUS = "//table[@id='genericGrid']/tbody/tr[rowOrder]/td[8]";
		public static final String CELL_ACTIONS = "//table[@id='genericGrid']/tbody/tr[rowOrder]/td[9]";
		public static final String PROJECT_MANAGEMENT = "//*[@id='project_management']";
		

		public static final String TABLE_COMMAND_LIST_COL_COMMAND_1 = "//*[@id='gbox_genericGrid']//table[@id='genericGrid']/tbody/tr[3]/td[5]";
		public static final String TABLE_COMMAND_LIST_COL_TIMESTAMP_1 = "//*[@id='gview_genericGrid']//table[@id='genericGrid']/tbody/tr[3]/td[4]";
	
		public static final String TAB_MGT = "//*[@id='liLiv2_project_management']//*[@id='project_management']";
		public static final String TABLE_COMMAND_LIST_COL_COMMAND_X = "//*[@id='gbox_genericGrid']//table[@id='genericGrid']/tbody/tr[rowOrder]/td[5]";
				
		public static final String TABLE_COMMANDS_ID = "genericGrid";
		public static final String TABLE_COMMANDS_DESCRIPTION = "//table[@id='genericGrid']/tbody/tr[rowOrder]/td[1]";
		
		public static final String BUTTON_NEXT_PAGE = "//*[@id='gridpager_center']/table[@class='ui-pg-table']/tbody/tr/td[@id='next_gridpager']/span";
	}

	public static final class Plant_Status_Panel {
		
		public static final String STATE_COMPLETED = "//*[@class='complete']";
		public static final String STATE_INCOMPLETED = "//*[@class='incomplete']";
		public static final String ICON_PLUS = "//*[@class='ui-icon ui-icon-plus']";
		
		public static final String PLANT_STATUS_SITEINFO = "//*[@id='plantStatusComponent']/h3[1]";
		public static final String PLANT_STATUS_INSTALLATIONTYPE = "//*[@id='plantStatusComponent']/h3[2]";
		public static final String PLANT_STATUS_STRUCTUREINFO = "//*[@id='plantStatusComponent']/h3[3]";
		public static final String PLANT_STATUS_GATES = "//*[@id='plantStatusComponent']/h3[4]";
		public static final String PLANT_STATUS_SYSTEMDATA = "//*[@id='plantStatusComponent']/h3[5]";
		public static final String PLANT_STATUS_VALIDATION = "//*[@id='plantStatusComponent']/h3[6]";
		
		public static final String STATUS_GENERAL_INFO = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-header-0']";
		public static final String STATUS_SITE_COMPLETED = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-header-1']";
		public static final String STATUS_LAST_COMMAND_SENT = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-header-2']";
		public static final String STATUS_UPDATE_IN_QUEUE = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-header-3']";
		public static final String STATUS_GATEWAY_CONN = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-header-4']";
		public static final String STATUS_LAST_COMMAND_ACK = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-header-5']";
		public static final String STATUS_CONNECTION_24H = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-header-6']";
		
		public static final String STATUS_GENERAL_INFO_PANEL = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-panel-0']";
		public static final String STATUS_SITE_COMPLETED_PANEL = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-panel-1']";
		public static final String STATUS_LAST_COMMAND_SENT_PANEL = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-panel-2']";
		public static final String STATUS_UPDATE_IN_QUEUE_PANEL = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-panel-3']";
		public static final String STATUS_GATEWAY_CONN_PANEL = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-panel-4']";
		public static final String STATUS_LAST_COMMAND_ACK_PANEL = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-panel-5']";
		public static final String STATUS_CONNECTION_24H_PANEL = "//*[@id='plantStatusComponent']//*[@id='ui-accordion-plantStatusComponent-panel-6']";
	}
	
	public static final class Connection_Status {
		
	public static final String TAB_PROJECT_MANAG = "//*[@class='menu']//*[@class='plant_navigation']//*[@id='liLiv2_project_management']//*[@id='project_management']";
	public static final String TABLE_ROW_X_TIMESTAMP = "//table[@id='genericGrid']//tr[@id='NUMBER']//td[4]";
	public static final String TABLE_ROW_X_COMMAND = "//table[@id='genericGrid']//tr[@id='NUMBER']//td[5]";
	public static final String TABLE_ROW_X_ID_ACK = "//table[@id='genericGrid']//tr[@id='NUMBER']//td[6]";
	public static final String TABLE_ROW_X_EXECUTED = "//table[@id='genericGrid']//tr[@id='NUMBER']//td[7]";
	public static final String TABLE_ROW_X_STATUS_GREEN = "//table[@id='genericGrid']//tr[@id='NUMBER']//td[8]//input[@class='thumbUpGreen']";
	public static final String TABLE_ROW_X_STATUS_YELLOW = "//table[@id='genericGrid']//tr[@id='NUMBER']//td[8]//input[@class='thumbDownOrange']";
	public static final String TABLE_ROW_X_STATUS_RED = "//table[@id='genericGrid']//tr[@id='NUMBER']//td[8]//input[@class='thumbDownRed']";
			
			
	}
	
}
