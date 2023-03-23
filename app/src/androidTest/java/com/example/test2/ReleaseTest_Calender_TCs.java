package com.example.test2;

import androidx.test.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiSelector;

import android.media.metrics.Event;
import android.util.Log;

import org.junit.Before;
import org.junit.Test;

public class ReleaseTest_Calender_TCs {
    private static final String TAG = "ReleaseTest_Calender_TCs";
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
    public void Calender_TCs() throws Exception {

        //TC to Add and Delete Event
        for (i = 1; i <= dv.Mtbf_Alarms; i++) {
            System.out.println("Start TC - Add Calender Event in Loop" + i + "____________");
            //Add_Event();
            System.out.println("Start TC - Delete Calender Event in Loop" + i + "____________");
            //Delete_Event();
        }
    }



   /* public void Add_Event() {
        try {
            uf.gotoHomeScreen();
            uf.ufMenu_srch_App("Calendar");

            System.out.println("Click on Add Tab");
            UiObject tab_add = new UiObject(new UiSelector().className(dv.AOSP_13_APP_IMAGE_BUTTON_CN).description("Create new event and more"));
            tab_add.click();
            Thread.sleep(2000);

            System.out.println("Set the timer to 30 sec");
            UiObject select_event = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_VIEW_CN).text("Event"));
            select_event.click();
            UiObject add_title = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_BUTTON_CN).text("0"));
            add_title.setText("New ")

            System.out.println("Start 30 sec Timer");
            UiObject start_timer = new UiObject(new UiSelector().resourceId(dv.AOSP_13_ALARM_Add_alarm_RID));
            start_timer.click();
            System.out.println("Timer started for 30 sec --- wait for 30 sec for timer to expire");
            Thread.sleep(30000);
            UiObject stop_timer = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_BUTTON_CN).description("Stop"));
            stop_timer.click();
            Thread.sleep(2000);
            System.out.println("Stop the Timer");

            //Clenup - Delete the exiting timer
            UiObject delete_timer = new UiObject(new UiSelector().className(dv.AOSP_13_APP_IMAGE_BUTTON_CN).description("Delete"));
            delete_timer.click();
            System.out.println("Cleanup - Delete the Timer");
            Thread.sleep(2000);

            System.out.println("Timer_Add_Delete Pass in Loop" + i + "____________");
            uf.gotoHomeScreen();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Timer_Add_Delete Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }

    }*/


}
