package org.serviceToolBox.examples;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.serviceToolBox.utilitites.BrowserUtils;

import java.net.MalformedURLException;
import java.net.URL;

public class NotePadTest1 {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

         /*
        Scenario for Notepad:
        1) Open Notepad
        2) Click File
        3) Click New Tab
         */

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
        WindowsDriver driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);

        WebElement file = driver.findElement(By.name("File"));
        file.click();
        Thread.sleep(2000);
        WebElement newTab = driver.findElement(By.name("New tab"));
        newTab.click();






    }






}
