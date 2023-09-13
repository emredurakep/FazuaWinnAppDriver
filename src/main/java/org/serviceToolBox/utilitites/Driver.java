package org.serviceToolBox.utilitites;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {



    private Driver() {

        // rivate constructor for driver
    }


    public static WindowsDriver driver;

    public static WindowsDriver getDriver() {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "C:\\TestCompleteFazua\\abc.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);

        } catch (Exception e) {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "root");

            try {
                driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);
            } catch (MalformedURLException ex) {
                ex.printStackTrace();
            }

        }
        return driver;
    }

    public static void closeDriver() {

        if (driver!=null) {
            driver.quit();
            driver=null;
        }

    }










}
