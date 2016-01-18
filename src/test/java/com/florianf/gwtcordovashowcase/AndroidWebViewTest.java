package com.florianf.gwtcordovashowcase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by florian on 29.10.15.
 */
public class AndroidWebViewTest {
    static private AppiumDriver<WebElement> driver;

    @BeforeClass
    public static void setUp() throws Exception {
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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String webContext = "";
        Set<String> contextNames = driver.getContextHandles();
        for (String contextName : contextNames) {
            if (!contextName.equals("NATIVE_APP")) {
                webContext = contextName;
                break;
            }
        }
        driver.context(webContext);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }

    @Ignore
    @Test
    public void webView() throws InterruptedException {
        List<WebElement> buttonSample = driver.findElements(By.className("button-sample"));
    }

    @Test
    public void testDevice() throws Exception {

        Thread.sleep(1000);
//        WebElement mainContainer = driver.findElement(By.id("mainContainer"));
        List<WebElement> device = driver.findElements(By.cssSelector(".paper-item-0"));

        WebElement platformElem = null;
        for (WebElement elem : device) {
            if (elem.getText().contains("Platform")) {
                platformElem = elem;
            }
        }
        Assert.assertNotNull(platformElem);
        Assert.assertEquals("Platform: Android", platformElem.getText());
    }

    @Test
    public void testMenu() throws Exception {
        Thread.sleep(1000);
        List<WebElement> iconButtons = driver.findElements(By.cssSelector(".paper-icon-button-0"));
        WebElement menuButton = iconButtons.get(0);
        menuButton.click();
        Thread.sleep(1000);

    }
}
