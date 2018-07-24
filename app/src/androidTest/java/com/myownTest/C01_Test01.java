package com.myownTest;

import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)

public class C01_Test01 {
    @Test
    public void test_01(){
        UiDevice.getInstance(InstrumentationRegistry.getInstrumentation()).pressHome();
    }
    @Test
    public  void test_02(){
        UiDevice.getInstance(InstrumentationRegistry.getInstrumentation()).pressMenu();
    }
}
