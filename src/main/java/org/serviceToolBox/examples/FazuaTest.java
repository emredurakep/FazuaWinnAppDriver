package org.serviceToolBox.examples;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FazuaTest {

    // C:\TestCompleteFazua\abc.exe

    public static void main(String[] args) throws MalformedURLException, InterruptedException{

        DesiredCapabilities caps = new DesiredCapabilities();

        try {
            caps.setCapability("app", "C:\\TestCompleteFazua\\abc.exe");
            WindowsDriver driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);
        } catch (Exception e) {
            e.printStackTrace();
        }



       






    }
















}
