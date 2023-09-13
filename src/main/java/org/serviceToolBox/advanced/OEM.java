package org.serviceToolBox.advanced;

import com.beust.ah.A;
import io.appium.java_client.MobileBy;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.interactions.Actions;
import org.serviceToolBox.utilitites.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class OEM {


    WindowsDriver driver;


    @Test
    public void Test1() throws MalformedURLException {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "C:\\TestCompleteFazua\\abc.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);
        } catch (Exception e) {

            DesiredCapabilities desktopCapabilities = new DesiredCapabilities();
            desktopCapabilities.setCapability("app", "Root");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), desktopCapabilities);
        }

        BrowserUtils.sleep(3);
        WebElement advanced = driver.findElement(By.name("ADVANCED"));
        advanced.click();

        BrowserUtils.sleep(3);

        WebElement oem = driver.findElement(By.name("OEM"));
        oem.click();
        BrowserUtils.sleep(2);

        Actions actions = new Actions(driver);

      //  WebElement setValues= driver.findElement(By.id("[2A.10F0A26.4,126]"));


        WebElement setValues= driver.findElement(By.xpath("//*[@name='SET VALUES']"));
        setValues.click();



    }


}
