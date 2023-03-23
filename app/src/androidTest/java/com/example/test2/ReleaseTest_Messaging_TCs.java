package com.example.test2;

import android.util.Log;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SdkSuppress;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * SMS Release Test cases *
 * RT1026 - MO/MT Messages
 * RT1027 - Send Long SMS with 670 characters
 * RT1028 - Message settings
 */


@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 21)
public class ReleaseTest_Messaging_TCs {

    private static final String TAG = "Send_SMS";
    private UiDevice mUiDevice;
    private Utility_Functions uf;
    private Device_Veriables dv;
    int i;

    @Before
    public void setUp() throws Exception {
        mUiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        if (null == mUiDevice) {
            Log.e(TAG, "can't find the UiDevice");
            return;
        }
        mUiDevice.pressHome();

        uf = new Utility_Functions(mUiDevice);
        dv = new Device_Veriables(mUiDevice);
    }

    @Test
    public void SMS_TC() throws Exception {
        uf.gotoHomeScreen();
        Thread.sleep(2000);

        //Run the RT1026 - MO/MT Messages in loop
        for (int i = 1; i <= dv.Mtbf_Send_SMS; i++) {
            System.out.println("Trying to Send SMS using SIM1 in Loop" + i + "____________");
            sendsms_sim1();
            //System.out.println("Trying to Send SMS using SIM2 in Loop" + i + "____________");
            //sendsms_sim2();
        }

        //Run the RT1027 - Send Long SMS with 670 characters in loop
        for (int i = 1; i <= dv.Mtbf_Send_SMS; i++) {
            System.out.println("Trying to Send Long SMS using SIM1 in Loop" + i + "____________");
            sendlongsms_sim1();
            //System.out.println("Trying to Send Long SMS using SIM2 in Loop" + i + "____________");
            //sendlongsms_sim2();
        }

        //Run the RT1028 - Message settings in loop
        for (int i = 1; i <= dv.Mtbf_Send_SMS; i++) {
            System.out.println("Trying to Change Message settings in Loop" + i + "____________");
            messagesettings();
        }
    }
    public void sendsms_sim1 () throws Exception {
        try {
                //Goto Home
                uf.gotoHomeScreen();

                //Search for Messages App
                uf.ufMenu_srch_App("Messages");

                //select on start chat
                UiObject new_msg = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Start_chat_RID));
                new_msg.click();
                Thread.sleep(2000);

                //Input the Recipient phone number
                UiObject phone_no = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Recipient_phone_nb_RID));
                phone_no.setText(dv.PHONE_NUMBER);
                Thread.sleep(2000);
                mUiDevice.pressEnter();
                Thread.sleep(2000);

                //Currently working on emulator, hence cannot select SIM
                /*UiObject sim_list = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_SIM_Selection_dropdown_RID));
                sim_list.click();
                Thread.sleep(2000);
                UiObject sim_slct1 = new UiObject(new UiSelector().className(dv.AOSP_13_MESSAGES_SIM_Selection_RID).index(1));
                sim_slct1.longClick();
                Thread.sleep(2000);*/

                //Select SMS body
                UiObject text_box = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Compose_message_RID));
                text_box.legacySetText(dv.SMS_BODY);
                Thread.sleep(2000);

                //Click on send button
                UiObject send = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Send_message_RID));
                send.click();
                Thread.sleep(2000);
                uf.gotoHomeScreen();

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("__________sending message Failed in loop " + i + "____________");
                uf.gotoHomeScreen();
            };
        }

    public void sendsms_sim2 () throws Exception {
        try {
            //Goto Home
            uf.gotoHomeScreen();

            //Search for Messages App
            uf.ufMenu_srch_App("Messages");

            //select on start chat
            UiObject new_msg = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Start_chat_RID));
            new_msg.click();
            Thread.sleep(2000);

            //Input the Recipient phone number
            UiObject phone_no = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Recipient_phone_nb_RID));
            phone_no.setText(dv.PHONE_NUMBER);
            Thread.sleep(2000);
            mUiDevice.pressEnter();
            Thread.sleep(2000);


            /*UiObject sim_list = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_SIM_Selection_dropdown_RID));
            sim_list.click();
            Thread.sleep(2000);
            UiObject sim_slct2 = new UiObject(new UiSelector().className(dv.AOSP_13_MESSAGES_SIM_Selection_RID).index(0));
            sim_slct2.longClick();
            Thread.sleep(2000);*/

            //Select SMS body
            UiObject text_box = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Compose_message_RID));
            text_box.legacySetText(dv.SMS_BODY);
            Thread.sleep(2000);

            //Click on send button
            UiObject send = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Send_message_RID));
            send.click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("__________sending message Failed in loop " + i + "____________");
            uf.gotoHomeScreen();
        };
    }

    public void sendlongsms_sim1 () throws Exception {
        try {
            //Goto Home
            uf.gotoHomeScreen();

            //Search for Messages App
            uf.ufMenu_srch_App("Messages");

            //select on start chat
            UiObject new_msg = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Start_chat_RID));
            new_msg.click();
            Thread.sleep(2000);

            //Input the Recipient phone number
            UiObject phone_no = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Recipient_phone_nb_RID));
            phone_no.setText(dv.PHONE_NUMBER);
            Thread.sleep(2000);
            mUiDevice.pressEnter();
            Thread.sleep(2000);

            //Currently working on emulator, hence cannot select SIM
            /*UiObject sim_list = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_SIM_Selection_dropdown_RID));
            sim_list.click();
            Thread.sleep(2000);
            UiObject sim_slct1 = new UiObject(new UiSelector().className(dv.AOSP_13_MESSAGES_SIM_Selection_RID).index(1));
            sim_slct1.longClick();
            Thread.sleep(2000);*/

            //Select SMS body and send long SMS
            UiObject text_box = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Compose_message_RID));
            text_box.legacySetText(dv.SMS_BODY_LONG);
            Thread.sleep(2000);

            //Click on send button
            UiObject send = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Send_message_RID));
            send.click();
            Thread.sleep(2000);
            uf.gotoHomeScreen();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("__________sending message Failed in loop " + i + "____________");
            uf.gotoHomeScreen();
        };
    }

    public void sendlongsms_sim2 () throws Exception {
        try {
            //Goto Home
            uf.gotoHomeScreen();

            //Search for Messages App
            uf.ufMenu_srch_App("Messages");

            //select on start chat
            UiObject new_msg = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Start_chat_RID));
            new_msg.click();
            Thread.sleep(2000);

            //Input the Recipient phone number
            UiObject phone_no = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Recipient_phone_nb_RID));
            phone_no.setText(dv.PHONE_NUMBER);
            Thread.sleep(2000);
            mUiDevice.pressEnter();
            Thread.sleep(2000);

            //Currently working on emulator, hence cannot select SIM
            /*UiObject sim_list = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_SIM_Selection_dropdown_RID));
            sim_list.click();
            Thread.sleep(2000);
            UiObject sim_slct1 = new UiObject(new UiSelector().className(dv.AOSP_13_MESSAGES_SIM_Selection_RID).index(0));
            sim_slct1.longClick();
            Thread.sleep(2000);*/

            //Select SMS body and send long SMS
            UiObject text_box = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Compose_message_RID));
            text_box.legacySetText(dv.SMS_BODY_LONG);
            Thread.sleep(2000);

            //Click on send button
            UiObject send = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Send_message_RID));
            send.click();
            Thread.sleep(2000);
            uf.gotoHomeScreen();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("__________sending message Failed in loop " + i + "____________");
            uf.gotoHomeScreen();
        };
    }

    public void sendsms_verify () throws Exception {
        try {
            //Goto Home
            uf.gotoHomeScreen();

            //Search for Messages App
            uf.ufMenu_srch_App("Messages");

            //select on start chat
            UiObject new_msg = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Start_chat_RID));
            new_msg.click();
            Thread.sleep(2000);

            //Input the Recipient phone number
            UiObject phone_no = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Recipient_phone_nb_RID));
            phone_no.setText(dv.PHONE_NUMBER);
            Thread.sleep(2000);
            mUiDevice.pressEnter();
            Thread.sleep(2000);

            //Currently working on emulator, hence cannot select SIM
                /*UiObject sim_list = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_SIM_Selection_dropdown_RID));
                sim_list.click();
                Thread.sleep(2000);
                UiObject sim_slct1 = new UiObject(new UiSelector().className(dv.AOSP_13_MESSAGES_SIM_Selection_RID).index(1));
                sim_slct1.longClick();
                Thread.sleep(2000);*/

            //Select SMS body
            UiObject text_box = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Compose_message_RID));
            text_box.legacySetText(dv.SMS_BODY);
            Thread.sleep(2000);

            //Click on send button
            UiObject send = new UiObject(new UiSelector().resourceId(dv.AOSP_13_MESSAGES_Send_message_RID));
            send.click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("__________sending message Failed in loop " + i + "____________");
            uf.gotoHomeScreen();
        };
    }
    public void messagesettings () throws Exception {
        try {
            //Goto Home
            uf.gotoHomeScreen();

            //Search for Messages App
            uf.ufMenu_srch_App("Messages");

            //Click on More options
            UiObject tab_More_Opt = new UiObject(new UiSelector().className(dv.AOSP_13_APP_IMAGE_VIEW_CN));
            tab_More_Opt.click();
            Thread.sleep(2000);

            //select on Settings chat
            UiObject tab_Settings_Opt = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_VIEW_CN).text("Settings"));
            tab_Settings_Opt.click();
            Thread.sleep(2000);

            //Swipe up and click on Advanced
            mUiDevice.swipe(500,1900,500, 500, 2 );
            Thread.sleep(2000);
            UiObject click_on_Advanced = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_VIEW_CN).text("Advanced"));
            click_on_Advanced.click();
            Thread.sleep(2000);

            //Click on SMS delivery reports
            UiObject click_on_report = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_VIEW_CN).text("Get SMS delivery reports"));
            click_on_report.click();
            Thread.sleep(2000);
            //Check if delivery report is turned ON
            if(click_on_report.isEnabled() == true)
            {
                System.out.println("Delivery report turned on in Loop : " + i );
            }
            else
            {
                //e.printStackTrace();
                System.out.println("__________Message settings Failed in loop " + i + "____________");
            }

            //Verify if SMS delivery report is ON
            sendsms_verify();
            Thread.sleep(5000);
            UiObject Delivery_status = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_VIEW_CN).text("Now • Delivered"));
            if(Delivery_status.getText().contains("Now • Delivered"))
            {
                System.out.println("Delivery report displayed as Delivered in Loop : " + i );
            }
            else
            {
                //e.printStackTrace();
                System.out.println("__________Message settings Failed in loop " + i + "____________");
            }

            mUiDevice.pressBack();
            Thread.sleep(2000);
            mUiDevice.pressBack();
            Thread.sleep(2000);

            //Change the message settings back to default
            //Click on More options
            tab_More_Opt.click();
            Thread.sleep(2000);
            //select on Settings chat
            tab_Settings_Opt.click();
            Thread.sleep(2000);
            //select on Advanced tab
            mUiDevice.swipe(500,1900,500, 500, 2 );
            Thread.sleep(2000);
            click_on_Advanced.click();
            Thread.sleep(2000);
            //Click on SMS delivery reports
            click_on_report.click();
            Thread.sleep(10000);
            uf.gotoHomeScreen();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("__________sending message Failed in loop " + i + "____________");
            uf.gotoHomeScreen();
        };
    }
}
