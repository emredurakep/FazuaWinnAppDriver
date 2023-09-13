package org.serviceToolBox.basic.productInformation;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.serviceToolBox.utilitites.BrowserUtils;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class UpdateNew {

    WindowsDriver driver;


    @Test
    public void test() throws MalformedURLException {


        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "C:\\TestCompleteFazua\\abc.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);
        } catch (Exception e) {

            DesiredCapabilities desktopCapabilities = new DesiredCapabilities();
            desktopCapabilities.setCapability("app", "Root");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), desktopCapabilities);

        }

        WebElement basic= driver.findElement(By.name("BASIC"));
        basic.click();

        BrowserUtils.sleep(2);

        WebElement productInformation = driver.findElement(By.name("PRODUCT INFORMATION"));
        productInformation.click();

        BrowserUtils.sleep(6);

        WebElement updateNow = driver.findElement(By.name("Update Now"));
        BrowserUtils.sleep(3);
        System.out.println(updateNow.getText()); // Update Now


    }


}
