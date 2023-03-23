package com.example.test2;

import androidx.test.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiSelector;
import android.util.Log;

import org.junit.Before;
import org.junit.Test;

/*Test ID: MTBF Adding_Alarms_And_Deleting
 Description: Adding 3 Alarms and Deleting
    Test Steps:
          1. Back to idle.
          2. Enter clock app.
          3. Click Alarm button.
          4. Click Create New Alarm.
          5. Set Alarm times.
          6. Click ok Button.
          7. Repeating the TC 2 Times
          8. Deleting the Alarm
         */

public class ReleaseTest_Clock_Alarm_TCs {
    private static final String TAG = "Adding Deleting Alarms";
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
    public void Clock_TCs() throws Exception {

        //TC to Add and Delete alarm
        for (i = 1; i <= dv.Mtbf_Alarms; i++) {
            System.out.println("Start TC - Add Alarm in Loop" + i + "____________");
            Alaram_Add();
            System.out.println("Start TC - Delete Alarm in Loop" + i + "____________");
            Alaram_Delete();
        }

        //TC to Add and Delete a new timer
        for (i = 1; i <= dv.Mtbf_Alarms; i++) {
            System.out.println("Start TC - Timer_Add_Delete in Loop" + i + "____________");
            Timer_Add_Delete();
        }

        //TC to Start and Stop Stopwatch
        for (i = 1; i <= dv.Mtbf_Alarms; i++) {
            System.out.println("Start TC - Stopwatch_Start_Stop in Loop" + i + "____________");
            Stopwatch_Start_Stop();
        }
    }

    public void Alaram_Add() {
        try {
            uf.gotoHomeScreen();

            //Search for Clock
            uf.ufMenu_srch_App("Clock");
            Thread.sleep(2000);

            uf.Alarams_Added();
            uf.gotoHomeScreen();
            System.out.println("Add Alarm Pass in Loop" + i + "____________");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Add Alarm Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }

    }

    public void Alaram_Delete()  {

        try {
            uf.gotoHomeScreen();
            //Search for Clock
            uf.ufMenu_srch_App("Clock");

            uf.Alarams_Deleted();
            uf.gotoHomeScreen();
            System.out.println("Delete Alarm Pass in Loop" + i + "____________");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Delete Alarm Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }

    }

    public void Timer_Add_Delete() {
        try {
            uf.gotoHomeScreen();
            uf.ufMenu_srch_App("Clock");

            System.out.println("Click on Timer Tab");
            UiObject tab_Timer = new UiObject(new UiSelector().resourceId(dv.AOSP_13_CLOCK_Timer_tab_RID));
            tab_Timer.click();
            Thread.sleep(2000);

            System.out.println("Set the timer to 30 sec");
            UiObject set_time1 = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_BUTTON_CN).text("3"));
            set_time1.click();
            UiObject set_time2 = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_BUTTON_CN).text("0"));
            set_time2.click();

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

    }

    public void Stopwatch_Start_Stop() {
        try {
            uf.gotoHomeScreen();
            uf.ufMenu_srch_App("Clock");

            System.out.println("Click on Stopwatch Tab");
            UiObject tab_Stopwatch = new UiObject(new UiSelector().resourceId(dv.AOSP_13_CLOCK_Stopwatch_tab_RID));
            tab_Stopwatch.click();
            Thread.sleep(2000);

            System.out.println("Start the Stopwatch");
            UiObject start_stopwatch = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_BUTTON_CN).description("Start"));
            start_stopwatch.click();
            System.out.println("Pause the Stopwatch");
            UiObject pause_stopwatch = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_BUTTON_CN).description("Pause"));
            pause_stopwatch.click();

            System.out.println("Start the Stopwatch again");
            UiObject start_stopwatch1 = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_BUTTON_CN).description("Start"));
            start_stopwatch1.click();
            System.out.println("Pause the Stopwatch again");
            UiObject pause_stopwatch1 = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_BUTTON_CN).description("Pause"));
            pause_stopwatch1.click();

            //Clenup - Delete the stopwatch timer
            UiObject delete_timer = new UiObject(new UiSelector().className(dv.AOSP_13_APP_IMAGE_BUTTON_CN).description("Reset"));
            delete_timer.click();
            System.out.println("Cleanup - Reset the Stopwatch");
            Thread.sleep(2000);

            System.out.println("Stopwatch_Start_Stop Pass in Loop" + i + "____________");
            uf.gotoHomeScreen();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Stopwatch_Start_Stop Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }

    }
}
