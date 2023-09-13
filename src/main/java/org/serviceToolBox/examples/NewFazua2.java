package org.serviceToolBox.examples;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class NewFazua2 {

    // This is the example of handling with "CreatingRemoteSession" Error

    WindowsDriver driver;

    @Test    // This scenario is getting the text of Configuration
    public void newFazuaTest() throws MalformedURLException, InterruptedException {

        // Solution for CreatingRemoteSession Error
        // Test Scenario: 1) Go to the App 2) Click to the restore button

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "C:\\TestCompleteFazua\\abc.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);

        } catch (Exception e) {

            DesiredCapabilities desktopCapabilities = new DesiredCapabilities();
            desktopCapabilities.setCapability("app", "Root");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), desktopCapabilities);
        }



        Thread.sleep(12000);

        try {
            Thread.sleep(5000);
            System.out.println(driver.findElement(By.name("CONFIGURATION")).getText());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }








    }




    @Test   // This is the scenario to go to the Diagnosis from Advanced
    public void Test2() throws InterruptedException, MalformedURLException {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "C:\\TestCompleteFazua\\abc.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);
        } catch (Exception e) {

            DesiredCapabilities desktopCapabilities = new DesiredCapabilities();
            desktopCapabilities.setCapability("app", "Root");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), desktopCapabilities);
        }

        Thread.sleep(3000);

     //   Actions actions = new Actions(driver);

    //  WebDriverWait wait = new WebDriverWait(driver, 10);





        try {
            Thread.sleep(3000);
          // WebElement advanced = driver.findElement(By.name("ADVANCED"));

            WebElement advanced = driver.findElement(By.name("ADVANCED"));
            advanced.click();

            Thread.sleep(3000);

            Actions actions = new Actions(driver);

            WebElement diagnosis = driver.findElement(By.name("DIAGNOSIS"));
            Thread.sleep(3000);
            actions.click(diagnosis).perform();

            //  wait.until(ExpectedConditions.elementToBeClickable(diagnosis));
            Thread.sleep(2000);



            // actions.doubleClick(advanced).perform();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }










    }























}
