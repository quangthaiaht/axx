package it.bt.com.definitions;

public class DefinedPopUpElements {

	public static final class Popup_Session_Already_Opened {
		public static final String BUTTON_CONTINUE = "//*[@id='doppiaLoginForm']//*[@class='thinBtn round'][2]";
	}

	public static final class Popup_New_Software_Download {
		public static final String BUTTON_CLOSED = "//*[@id='popupNewSwDownload']//*[@class='d-btns']//*[@class='thinBtn round right closeDialog']";
		//public static final String BUTTON_CLOSED = "//*[@id='doppiaLoginForm']//*[@class='thinBtn round'][2]";
	}
	
	public static final class Popup_Waring{
		public static final String POPUP_WARNING_PAGE_CONTAINS_UNSAVED_DATA = "//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']";
		public static final String BUTTON_STAY_ON_PAGE = "//*[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//*[@class='ui-dialog-buttonset']//*[@type='button'][1]";
		public static final String BUTTON_LEAVE_WITHOUTH_SAVE = "//*[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//*[@class='ui-dialog-buttonset']//*[@type='button'][2]";
	}
}
