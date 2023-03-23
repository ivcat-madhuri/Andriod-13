package com.example.test2;

import android.app.PendingIntent;
import android.content.Intent;
import android.icu.util.Calendar;
import android.util.Log;

import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiSelector;
import androidx.test.platform.app.InstrumentationRegistry;

//import java.util.Calendar;
import android.app.AlarmManager;
import android.widget.TimePicker;

import android.content.Context;
import android.content.Intent;

import java.util.Date;


public class Utility_Functions {

        private static final String TAG = "Utility_Functions";
        private static UiDevice mUiDevice;
        private static Device_Veriables dv;

    public Utility_Functions(UiDevice mUiDevice) {
        dv = new Device_Veriables(mUiDevice);
    }



    public static void ufMenu_srch_App(String AppName) throws Exception {
        try {
            //Swipe up to Menu page
            mUiDevice.swipe(500,1900,500, 500, 2 );

            //Click on search option
            UiObject search_App = new UiObject(new UiSelector().resourceId(dv.AOSP_13_APP_SEARCH_OPTION_RID));
            search_App.longClick();
            Thread.sleep(1000);
           // UiObject search_Input = new UiObject(new UiSelector().text("Search apps, web and more"));
            search_App.legacySetText(AppName);
            Thread.sleep(1000);

            //Click on Appname
            UiObject click_on_App = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_VIEW_CN).text(AppName));
            click_on_App.click();
            Thread.sleep(2000);
            System.out.println("************************* " + AppName + " Application found **************************");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("************************* " + AppName + " Application not found **********************");
        }
    }

    public void Alarams_Added()   {
        try {
            //Click on Alarm tab
            UiObject tab_Alarm = new UiObject(new UiSelector().resourceId(dv.AOSP_13_CLOCK_Alarm_tab_RID));
            tab_Alarm.click();
            Thread.sleep(2000);
            System.out.println("Clicked on Alarm Tab");

            //Select add alarm
            UiObject Alaram_Add_Button = new UiObject(new UiSelector().resourceId(dv.AOSP_13_ALARM_Add_alarm_RID));
            Alaram_Add_Button.click();
            Thread.sleep(1000);

            //Change the alarm time in Device_Veriables
            /*UiObject select_Time = new UiObject(new UiSelector().descriptionContains(dv.Alaram_time));
            select_Time.click();
            Thread.sleep(1000);*/

            Date now = new Date();
            int hour_ = now.getHours();
            int min_ = now.getMinutes();
            System.out.println("Current Clock time " + hour_ + " : " + min_ + "_____");
            //if
            if (hour_ > 12) {
                hour_ = (hour_ - 12);
                System.out.println("Current Clock time " + hour_ + " : " + min_ + "_____");
            }
            min_ = min_+2;
            //String hr= String.valueOf(hour_);
            //String min= String.valueOf(min_);
            System.out.println("Setting Alarm time to " + hour_ + " : " + min_ + "_____");
            UiObject text_input = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_BUTTON_CN).description("Switch to text input mode for the time input."));
            text_input.click();
            Thread.sleep(2000);
            UiObject Hour_input = new UiObject(new UiSelector().resourceId(dv.AOSP_13_ALARM_Hour_Input_text_RID));
            Hour_input.click();
            Thread.sleep(2000);
            Hour_input.setText(String.valueOf(hour_));
            Thread.sleep(2000);
            UiObject Min_input = new UiObject(new UiSelector().resourceId(dv.AOSP_13_ALARM_Min_Input_text_RID));
            Min_input.click();
            Thread.sleep(5000);
            Min_input.setText((String.valueOf(min_));
            Thread.sleep(2000);

            //Click on OK
            UiObject Click_Ok = new UiObject(new UiSelector().resourceId(dv.AOSP_13_ALARM_Select_OK_RID));
            Click_Ok.click();
            Thread.sleep(1000);
            System.out.println("Alarams_Added PASS ________");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }


    }
    public void Alarams_Deleted()   {
        try {
            //Click on Alarm tab //cancelAll()
            UiObject tab_Alarm = new UiObject(new UiSelector().resourceId(dv.AOSP_13_CLOCK_Alarm_tab_RID));
            tab_Alarm.click();
            Thread.sleep(2000);
            System.out.println("Clicked on Alarm Tab");

            UiObject arrow = new UiObject(new UiSelector().className(dv.AOSP_13_APP_IMAGE_VIEW_CN).description("Expand alarm"));
            if(arrow != null)
            {
                UiObject Alaram_Extend_Button = new UiObject(new UiSelector().resourceId(dv.AOSP_13_ALARM_Select_Dropdown_RID));
                Alaram_Extend_Button.click();
                Thread.sleep(2000);
            }

            UiObject Delete_Alaram = new UiObject(new UiSelector().resourceId(dv.AOSP_13_ALARM_Delete_RID));
            Delete_Alaram.click();
            Thread.sleep(2000);
            System.out.println("Alarams_Deleted PASS ________");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }

    public void gotoHomeScreen()   {
        try {
            mUiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
            if (null == mUiDevice) {
                Log.e(TAG, "can't find the UiDevice");
                return;
            }
            mUiDevice.pressBack();
            mUiDevice.pressBack();
            mUiDevice.pressBack();
            mUiDevice.pressHome();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }

}
