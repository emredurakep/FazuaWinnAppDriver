package org.serviceToolBox.superuser;

import io.appium.java_client.MobileBy;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.serviceToolBox.utilitites.BrowserUtils;
import org.testng.annotations.Test;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class BasicConfigurations {

    WindowsDriver driver;

    @Test
    public void BasicConfiguration() throws MalformedURLException {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "C:\\TestCompleteFazua\\abc.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);
        } catch (Exception e) {

            DesiredCapabilities desktopCapabilities = new DesiredCapabilities();
            desktopCapabilities.setCapability("app", "Root");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), desktopCapabilities);
        }

        Actions actions = new Actions(driver);

        actions.doubleClick(driver.findElement(By.name("ADVANCED"))).perform();
        BrowserUtils.sleep(3);

        actions.doubleClick(driver.findElement(By.name("SUPERUSER"))).perform();
        BrowserUtils.sleep(3);


        actions.click(driver.findElement(By.name("BASIC"))).perform();
        BrowserUtils.sleep(3);


        actions.click(driver.findElementByName("CALIBRATION")).perform();

        BrowserUtils.sleep(2);

        WebElement configuration = driver.findElement(By.name("CONFIGURATION"));
        configuration.click();

        BrowserUtils.sleep(2);










    }




}
