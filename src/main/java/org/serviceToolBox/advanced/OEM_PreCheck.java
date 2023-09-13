package org.serviceToolBox.advanced;

import io.appium.java_client.windows.WindowsDriver;
import org.serviceToolBox.utilitites.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class OEM_PreCheck {

    WindowsDriver driver;

    @Test
    public void ScenarioOEMPreCheck() throws MalformedURLException {

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

        actions.click(driver.findElement(By.name("ADVANCED"))).perform();
        BrowserUtils.sleep(2);

        actions.doubleClick(driver.findElement(By.name("OEM PRE-CHECK"))).perform();

    }

}
