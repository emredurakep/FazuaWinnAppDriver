package org.serviceToolBox.examples;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class NewFazua {


    // This is the example of handling with "CreatingRemoteSession" Error

    WindowsDriver driver;

    @Test
    public void newFazuaTest() throws MalformedURLException, InterruptedException {

    // Solution for CreatingRemoteSession Error
        // Test Scenario: 1) Go to the App 2) Click to the restore button

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
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), desktopCapabilities);
        }

        // All code above is about creating a remote windows driver in the given ip.
        // Driver is running in the given IP adress.

        Thread.sleep(3000);


        // Here I am going to the element itself.
        try {
            Thread.sleep(5000);
            driver.findElement(By.name("Restore")).click();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
















}
