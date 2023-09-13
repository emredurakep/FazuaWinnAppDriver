package org.serviceToolBox.basic.firmwareUpdate;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.serviceToolBox.utilitites.BrowserUtils;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Ride60BundleOnlineUpdate {

    WindowsDriver driver;

    @Test
    public void ride60BundleUpdate() throws MalformedURLException {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "C:\\TestCompleteFazua\\abc.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);
        } catch (Exception e) {

            DesiredCapabilities desktopCapabilities = new DesiredCapabilities();
            desktopCapabilities.setCapability("app", "Root");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), desktopCapabilities);
        }

        WebElement OEM = driver.findElement(By.name("OEM"));
        OEM.click();
        BrowserUtils.sleep(2);

        WebElement firmwareUpdate = driver.findElement(By.name("FIRMWARE UPDATE"));
        firmwareUpdate.click();

        BrowserUtils.sleep(1);

        String currentWindowHandle = driver.getWindowHandle();
        System.out.println("Current Windowhandle:" + currentWindowHandle);

        WebElement ride60BundleUpdate = driver.findElement(By.name("RIDE 60 BUNDLE UPDATE"));
        ride60BundleUpdate.click();

        BrowserUtils.sleep(2);
        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(By.name("Online (recommended)"))).perform();


        /*

        BrowserUtils.sleep(1);
        actions.doubleClick(driver.findElement(By.name("START"))).perform();

         */

















    }









}
