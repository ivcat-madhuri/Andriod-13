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
 * Created by Shivaprasad Waradai on 10-10-2017.
 */

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 21)
public class Mst_Clock  {
    private static final String TAG = "Mst_Clock";
    private UiDevice mUiDevice;
    private Utility_Functions uf;
    private Device_Veriables dv;
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
    public void mst_Operations() throws Exception {
        //Pass the number of iterations in Device variables file
        for(int i=1;i<=dv.Mst_Clock;i++) {
            uf.gotoHomeScreen();
            mst_Clock_test();
            System.out.println("********************** MST_Clock " + i);
        }
    }


    public void mst_Clock_test() throws Exception{
        try{
            uf.ufMenu_srch_App("Clock");
            Thread.sleep(2000);
            uf.gotoHomeScreen();

            //Click on Alarm tab
            uf.ufMenu_srch_App("Clock");
            UiObject tab_Alarm = new UiObject(new UiSelector().resourceId(dv.AOSP_13_CLOCK_Alarm_tab_RID));
            tab_Alarm.click();
            Thread.sleep(2000);
            System.out.println("Clicked on Alarm Tab");
            uf.gotoHomeScreen();

            //Click on Clock tab
            uf.ufMenu_srch_App("Clock");
            UiObject tab_Clock = new UiObject(new UiSelector().resourceId(dv.AOSP_13_CLOCK_Clock_tab_RID));
            tab_Clock.click();
            Thread.sleep(2000);
            System.out.println("Clicked on Clock Tab");
            uf.gotoHomeScreen();

            //Click on Timer tab
            uf.ufMenu_srch_App("Clock");
            UiObject tab_Timer = new UiObject(new UiSelector().resourceId(dv.AOSP_13_CLOCK_Timer_tab_RID));
            tab_Timer.click();
            Thread.sleep(2000);
            System.out.println("Clicked on Timer Tab");
            uf.gotoHomeScreen();

            //Click on Stopwatch tab
            uf.ufMenu_srch_App("Clock");
            UiObject tab_Stopwatch = new UiObject(new UiSelector().resourceId(dv.AOSP_13_CLOCK_Stopwatch_tab_RID));
            tab_Stopwatch.click();
            Thread.sleep(2000);
            System.out.println("Clicked on Stop Watch Tab");
            uf.gotoHomeScreen();

            //Click on Bedtime tab
            uf.ufMenu_srch_App("Clock");
            UiObject tab_Bedtime = new UiObject(new UiSelector().resourceId(dv.AOSP_13_CLOCK_Bedtime_tab_RID));
            tab_Bedtime.click();
            Thread.sleep(2000);
            System.out.println("Clicked on Bedtime Tab");
            uf.gotoHomeScreen();

            uf.ufMenu_srch_App("Clock");
            //Click on Screen saver option
            UiObject tab_More_Opt = new UiObject(new UiSelector().className(dv.AOSP_13_APP_IMAGE_VIEW_CN));
            tab_More_Opt.click();
            Thread.sleep(2000);
            UiObject more_Opt_ScreenSaver = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_VIEW_CN).text("Screen saver"));
            more_Opt_ScreenSaver.click();
            Thread.sleep(2000);
            System.out.println("Clicked on Screen Saver Option");
            mUiDevice.pressBack();

            //Click on Setting option
            tab_More_Opt.click();
            Thread.sleep(2000);
            UiObject more_Opt_Settings = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_VIEW_CN).text("Settings"));
            more_Opt_Settings.click();
            Thread.sleep(2000);
            System.out.println("Clicked on Setting Option");
            mUiDevice.pressBack();

            //Click on Feedback option
            tab_More_Opt.click();
            Thread.sleep(2000);
            UiObject more_Opt_Send_Feedback = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_VIEW_CN).text("Send feedback"));
            more_Opt_Send_Feedback.click();
            Thread.sleep(2000);
            System.out.println("Clicked on Send Feedback Option");
            mUiDevice.pressBack();
            Thread.sleep(2000);

            //Click on Help option
            tab_More_Opt.click();
            Thread.sleep(2000);
            UiObject more_Opt_Help = new UiObject(new UiSelector().className(dv.AOSP_13_APP_TEXT_VIEW_CN).text("Help"));
            more_Opt_Help.click();
            Thread.sleep(5000);
            System.out.println("Clicked on Help Option");
            uf.gotoHomeScreen();
            System.out.println("********************** mst_Clock PASSED ********************");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("********************** mst_Clock FAILED ********************");
        }



    }

}
