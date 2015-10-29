package com.florianf.gwtcordovashowcase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.List;

/**
 * Created by florian on 29.10.15.
 */
public class AndroidWebViewTest {
    private AppiumDriver<WebElement> driver;

    @Before
    public void setUp() throws Exception {
        // set up appium
        File classpathRoot = new File(System.getProperty("user.dir"));
        File app = new File(classpathRoot, "app/platforms/android/build/outputs/apk/android-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
//        capabilities.setCapability("automationName", "Selendroid");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.florianf.gwtcordova");
        capabilities.setCapability("appActivity", ".MainActivity");
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void webView() throws InterruptedException {
        List<WebElement> buttonSample = driver.findElements(By.className("button-sample"));
    }
}
