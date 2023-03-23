
package com.example.test2;

import androidx.test.uiautomator.UiDevice;

/**
 * Created by Shivaprasad Waradai on 09-10-2017.
 */

public class Device_Veriables {
    /*private UiDevice mUiDevice;
    public Device_Veriables(UiDevice uiDevice) {
        this.mUiDevice = uiDevice;
    }*/

    //Device_Veriables dv = new Device_Veriables();

    //Frontier test cases Loops
    Integer Mtbf_Adding_And_Deleting_Contacts = 50;
    Integer Mtbf_Make_A_Call = 50;
    Integer Mtbf_Send_SMS = 1;
    Integer Mtbf_Call_To_Incoming_Number = 50;
    Integer Mst_Calculator = 50;
    Integer Mst_Camera = 50;
    Integer Mst_Clock = 2;
    Integer Mst_Contacts = 50;
    Integer Mst_File = 50;
    Integer Mst_FMRadio = 50;
    Integer Mst_Gallery = 50;
    Integer Mst_Message = 50;
    Integer Mst_Phone = 50;
    Integer Mtbf_Top_Five_Websites = 50;
    public Integer Mtbf_Alarms = 2;
    int Mst_Music_loop = 50;
    Integer Mtbf_Play_Youtube_Video_Loop = 50;
    Integer Mtbf_Browser_Navigating_To_Webpage_loop = 50;
    int MTBF_MULTI_MEDIA_1_loop = 25;
    int MTBF_MULTI_MEDIA_2_loop = 25;
    int MTBF_MULTI_MEDIA_3_loop = 25;
    int MTBF_MULTI_TASKING_4_loop = 25;
    int MTBF_MULTI_TASKING_5_loop = 25;
    int MTBF_MULTI_TASKING_6_loop = 25;
    int MTBF_TELEPHONY_loop = 25;
    int MTBF_TELEPHONY_2_loop = 25;
    int MTBF_TELEPHONY_4_loop = 25;
    int MTBF_TELEPHONY_5_loop = 25;
    int MTBF_TELEPHONY_6_loop = 25;


    //Frontier ResourcesIDs, ClassNames, Content Descriptions, Text
//**************************************************************************************************
    String DEVICE_MAIN_MENU_resourceId = "com.android.launcher3:id/all_apps_handle";//*[@contentDescription='Apps list']//*[@resource-id='com.android.launcher3:id/all_apps_handle']
    String DEVICE_SEARCH_APP_FROM_MAIN_MENU_resourceId = "com.android.launcher3:id/search_box_input";


    // Messages device variables for Android 13
    String Alaram_time = "12";
    String AOSP_13_CLOCK_Alarm_tab_RID = "com.google.android.deskclock:id/tab_menu_alarm";
    String AOSP_13_CLOCK_Clock_tab_RID = "com.google.android.deskclock:id/tab_menu_clock";
    String AOSP_13_CLOCK_Timer_tab_RID = "com.google.android.deskclock:id/tab_menu_timer";
    String AOSP_13_CLOCK_Stopwatch_tab_RID = "com.google.android.deskclock:id/tab_menu_stopwatch";
    String AOSP_13_CLOCK_Bedtime_tab_RID = "com.google.android.deskclock:id/tab_menu_bedtime";
    String AOSP_13_ALARM_Add_alarm_RID = "com.google.android.deskclock:id/fab";
    String AOSP_13_ALARM_Select_OK_RID = "com.google.android.deskclock:id/material_timepicker_ok_button";
    String AOSP_13_ALARM_Select_Dropdown_RID = "com.google.android.deskclock:id/arrow";
    String AOSP_13_ALARM_Delete_RID = "com.google.android.deskclock:id/delete";
    String AOSP_13_ALARM_Hour_Input_text_RID = "com.google.android.deskclock:id/material_hour_text_input";
    String AOSP_13_ALARM_Min_Input_text_RID = "com.google.android.deskclock:id/material_minute_text_input";

    // Messages device variables for Android 13
    String PHONE_NUMBER = "9591810044";
    String SMS_BODY = "Hello Android testing...";
    String SMS_BODY_LONG = "Hello Android testing...Long SMS...Trying to include special characters !@#$%^&*( Trying to include numbers 111112345555678923456780345678Hello Android testing...Long SMS...Trying to include special characters!@#$%^&*( Trying to include numbers 111112345555678923456780345678Hello Android testing...Long SMS...Trying to include special characters!@#$%^&*( Trying to include numbers 111112345555678923456780345678Hello Android testing...Long SMS...Trying to include special characters!@#$%^&*( Trying to include numbers 111112345555678923456780345678Hello Android testing...Long SMS...Trying to include special characters!@#$%^&*( Trying to include numbers 111112345555678923456780345678Hello Android testing...Long SMS...Trying to include special characters!@#$%^&*( Trying to include numbers 111112345555678923456780345678Hello Android testing...Long SMS...Trying to include special characters!@#$%^&*( Trying to include numbers 111112345555678923456780345678";
    String AOSP_13_APP_SEARCH_OPTION_RID = "com.google.android.apps.nexuslauncher:id/input";
    String AOSP_13_APP_TEXT_VIEW_CN = "android.widget.TextView";
    String AOSP_13_APP_IMAGE_VIEW_CN = "android.widget.ImageView";
    String AOSP_13_APP_TEXT_BUTTON_CN = "android.widget.Button";
    String AOSP_13_APP_IMAGE_BUTTON_CN = "android.widget.ImageButton";
    String AOSP_13_APP_EDIT_TEXT_CN = "android.widget.EditText";
    String AOSP_13_MESSAGES_Start_chat_RID = "com.google.android.apps.messaging:id/start_chat_fab";
    String AOSP_13_MESSAGES_Recipient_phone_nb_RID = "com.google.android.apps.messaging:id/recipient_text_view";
    String AOSP_13_MESSAGES_Compose_message_RID = "com.google.android.apps.messaging:id/compose_message_text";
    String AOSP_13_MESSAGES_SIM_Selection_dropdown_RID = "com.google.android.apps.messaging:id/send_message_button_arrow_drop_down";
    String AOSP_13_MESSAGES_SIM_Selection_RID = "android.widget.LinearLayout";
    String AOSP_13_MESSAGES_Send_message_RID = "com.google.android.apps.messaging:id/send_message_button_icon";

    String AOSP_13_MESSAGES_Option_dropdown_CN = "android.widget.LinearLayout";



//Frontier   ResourcesIDs

//*************************************************************************************************************************ANILs STARTS
//Frontier   ResourcesIDs 26_10_17


    //Contact Saving ResourcesIDs,ClassNames
    //String CREATE_CONTACT_resourceId="com.google.android.contacts:id/floating_action_button";//*[@resource-id='com.google.android.contacts:id/floating_action_button']
    String CREATE_CONTACTS_resourceId = "com.android.contacts:id/floating_action_button";
    String SAVE_OPTION_resourceId = "com.android.contacts:id/editor_menu_save_button";
    String DATA_ENTERING_classId = "android.widget.EditText";
    String SAVING_NUMBER = "7996000036";
    String INCOMING_NUMBER = "+91 79960 00034";

    // Setting ResourcesIDs,ClassNames
    String NETWORK_AND_INTERNET_OPTION_className = "android.widget.TextView";
    String SELECTING_NETWORK_OPTION_resourceId = "android:id/text1";
    String CLEAR_ALL_resourceId = "com.android.systemui:id/button";


    //Contact searching ResourceIDs
    String SEARCH_OPTION_IN_CONTACTS_resourceId = "com.google.android.contacts:id/menu_search";
    String SEARCH_NUMBER_resourceId = "com.google.android.contacts:id/search_view";//*[@resource-id='com.google.android.contacts:id/search_view']
    String SELECT_NUMBER_resourceId = "com.google.android.contacts:id/cliv_name_textview";//*[@resource-id='com.google.android.contacts:id/cliv_name_textview']
    String CALLING_BUTTON_resourceId = "com.android.contacts:id/icon";
    String CALL_END_BUTTON_resourceId = "com.google.android.dialer:id/incall_end_call";
    String DELETING_OPTION_resourceId = "android:id/title";
    String SELECT_DELETE_resourceId = "android:id/button1";


    //Browser ResourceIDs,
    String CONTINUE_AND_GOT_IT_resourceId = "com.android.chrome:id/positive_button";

    //Youtube ResourceIDs,ClassName
    String OPENING_GOOGLE_PAGE_resourceId = "com.android.chrome:id/search_box";


    //********************************************************************************************************************************ANILs END
//SETTINGS ResourcesIDs, ClassNames, Content Descriptions, Text
    String SETTINGS_MENU_className = "android.widget.LinearLayout";
    String SETTINGS_MENU_resourceId = "com.android.settings:id/dashboard_tile";


//PHOTOS ResourcesIDs, ClassNames, Content Descriptions, Text

    String PHOTO_NAVIGATION_DRAWER_LIST_TITEL_resourceId = "com.google.android.apps.photos:id/title";

    //**************************************************************************************************
//Shiva
    //Frontier
    //Build Number - 000C_0_14A
    //FM Radio**
    String FM_power_btn = "Power";//*[@contentDescription='Power']
    String FM_more_options = "More options";//*[@contentDescription='More options']
    String FM_mo_Scan = "Scan";//*[@text='Scan']
    String FM_mo_Settings = "Settings";//*[@text='Settings']
    String FM_mo_Speaker = "Speaker on";//*[@text='Speaker on']
    String FM_mo_Record = "Record";//*[@text='Record']
    String FM_mo_About = "About";//*[@text='About']
    String FM_mo_list_classname = "android.widget.LinearLayout";//*[@class='android.widget.LinearLayout']
    String FM_star_check_box = "com.evenwell.fmradio:id/CheckboxStar";//*[@resource-id='com.evenwell.fmradio:id/CheckboxStar']
    String FM_drop_down_list = "android.widget.Spinner";//*[@class='android.widget.Spinner']
    String FM_ddl_FMRadio = "FM Radio";//*[@text='FM Radio']
    String FM_ddl_Fav = "Favorite List";//*[@text='Favorite List']
    String FM_ddl_RecFiles = "Recorded Files";//*[@text='Recorded Files'];

    public Device_Veriables(UiDevice mUiDevice) {

    }
//E1M ResourcesIDs, ClassNames, Content Descriptions, Text
}
