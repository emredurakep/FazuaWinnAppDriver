package org.serviceToolBox.basic.configuration;

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

public class ConfigurationData2 {

    WindowsDriver driver;

    @Test
    public void test1() throws MalformedURLException {

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

        Actions actions = new Actions(driver);

        WebElement wheelCircumference = driver.findElement(By.name("Wheel Circumference OEM (mm)"));
        actions.moveToElement(wheelCircumference).click();
        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.TAB).perform();
        BrowserUtils.sleep(2);
        actions.sendKeys("2496").perform();
        actions.sendKeys(Keys.TAB).perform();
        BrowserUtils.sleep(2);
        actions.sendKeys("2496").perform();
        actions.sendKeys(Keys.TAB).perform();
        BrowserUtils.sleep(2);
        actions.sendKeys("5").perform();
        actions.sendKeys(Keys.TAB).perform();
        BrowserUtils.sleep(2);
        actions.sendKeys("25").perform();
        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.TAB).perform();
        BrowserUtils.sleep(2);
        actions.sendKeys("25").perform();
        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.TAB).perform();
        BrowserUtils.sleep(2);
        actions.sendKeys("5").perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.TAB).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.ENTER).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.TAB).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.ENTER).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.TAB).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.ENTER).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.TAB).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.ENTER).perform();

















    }














}
