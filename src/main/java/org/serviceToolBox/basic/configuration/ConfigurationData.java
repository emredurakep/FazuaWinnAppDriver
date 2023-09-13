package org.serviceToolBox.basic.configuration;

import io.appium.java_client.MobileBy;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.serviceToolBox.utilitites.BrowserUtils;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ConfigurationData {

    WindowsDriver driver;

    @Test
    public void ConfigurationDataFillOut() throws MalformedURLException {

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

        WebElement configuration = driver.findElement(By.name("CONFIGURATION"));
        configuration.click();

        BrowserUtils.sleep(5);

     WebElement wheelCircumFerenceOem = driver.findElementByAccessibilityId("JavaFX598");
     wheelCircumFerenceOem.sendKeys("2496" + Keys.ENTER);


 WebElement wheelCircumference = driver.findElementByAccessibilityId("JavaFX604");
 BrowserUtils.sleep(5);
 wheelCircumference.sendKeys("2496" + Keys.ENTER);

    BrowserUtils.sleep(1);

 WebElement wheelCircumferenceMaxAdjustment = driver.findElementByAccessibilityId("JavaFX610");
 wheelCircumferenceMaxAdjustment.sendKeys("5" + Keys.ENTER);

    BrowserUtils.sleep(1);
    WebElement bikeMaxSpeedOEM = driver.findElementByAccessibilityId("JavaFX616");
    bikeMaxSpeedOEM.sendKeys("25" + Keys.ENTER);

    BrowserUtils.sleep(1);
    WebElement bikeMaxSpeed = driver.findElementByAccessibilityId("JavaFX622");
    bikeMaxSpeed.sendKeys("25" +  Keys.ENTER);
    BrowserUtils.sleep(1);

    WebElement maxMotorRPM = driver.findElementByAccessibilityId("JavaFX628");
     maxMotorRPM.sendKeys("10" +  Keys.ENTER);
     BrowserUtils.sleep(1);

     WebElement batteryInstalled = driver.findElementByAccessibilityId("JavaFX634");
    batteryInstalled.click();

  //   BrowserUtils.sleep(1);
  // WebElement iotEnabled = driver.findElementByAccessibilityId("JavaFX658");
  // iotEnabled.click();

     BrowserUtils.sleep(1);
       // WebElement lightInstalled = driver.findElementByAccessibilityId("");
      //  lightInstalled.click();

    // WebElement digitalLockEnabled = driver.findElementByAccessibilityId("JavaFX682");
   // digitalLockEnabled.click();









    }










}
