package org.serviceToolBox.pages;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverBasePage {




    static {
        WindowsDriver driver;
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "C:\\TestCompleteFazua\\abc.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);
            // WebElement restore = driver.findElement(By.name("Restore"));
            //  restore.click();

        } catch (Exception e) {
            // Here I am inserting the appto the root to handle solution.
            DesiredCapabilities desktopCapabilities = new DesiredCapabilities();
            desktopCapabilities.setCapability("app", "Root");
            try {
                driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), desktopCapabilities);
            } catch (MalformedURLException ex) {
                throw new RuntimeException(ex);
            }
        }

        // All code above is about creating a remote windows driver in the given ip.
        // Driver is running in the given IP adress.

        try {
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }




}
