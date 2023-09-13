package org.serviceToolBox.examples;

import io.appium.java_client.windows.WindowsDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.serviceToolBox.utilitites.BrowserUtils;

import java.net.MalformedURLException;
import java.net.URL;

public class xpathExample {

    WindowsDriver driver;
    @Test
    public void xpathTest() throws MalformedURLException {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "C:\\TestCompleteFazua\\abc.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);
        } catch (Exception e) {

            DesiredCapabilities desktopCapabilities = new DesiredCapabilities();
            desktopCapabilities.setCapability("app", "Root");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), desktopCapabilities);
        }

        BrowserUtils.sleep(2);
        Actions actions = new Actions(driver);

        WebElement oem = driver.findElement(By.xpath(".//*[@Name='OEM']"));


        actions.doubleClick(oem).perform();









    }






}
