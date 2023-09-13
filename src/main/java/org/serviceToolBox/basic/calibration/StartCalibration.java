package org.serviceToolBox.basic.calibration;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.serviceToolBox.utilitites.BrowserUtils;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class StartCalibration {

  WindowsDriver driver;

    @Test
    public void calibration() throws MalformedURLException {


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

        WebElement calibration = driver.findElement(By.name("CALIBRATION"));
        calibration.click();

        BrowserUtils.sleep(2);

        WebElement start = driver.findElement(By.name("START"));
        start.click();

        BrowserUtils.sleep(2);


        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();









    }



}
