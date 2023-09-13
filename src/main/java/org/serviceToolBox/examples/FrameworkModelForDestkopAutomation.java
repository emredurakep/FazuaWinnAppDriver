package org.serviceToolBox.examples;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;


public class FrameworkModelForDestkopAutomation {

    private static WindowsDriver fazua = null;


    public static String getDate() {
        LocalDate date =  LocalDate.now();
        System.out.println(date.toString());
        return date.toString();

    }


    @BeforeMethod
    public static void SetUp() {

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "C:\\TestCompleteFazua\\abc.exe");
            capabilities.setCapability("platformName", "Windows");
            // There is and also device name but it is not necessary
            fazua = new WindowsDriver(new URL("http://127.0.0.1:4723/"), capabilities);
            fazua.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }



    @Test
    public void Test1() throws InterruptedException, MalformedURLException {
        System.out.println("Hello World");
    }









}
