package org.serviceToolBox.stepDefinitions;

import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.serviceToolBox.utilitites.BrowserUtils;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class LiveData {

    WindowsDriver driver;

    @Given("Service ToolBox is connected to the bike")
    public void service_tool_box_is_connected_to_the_bike() {

    }
    @When("I open STB and click Live Data")
    public void i_open_stb_and_click_live_data() throws MalformedURLException {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "C:\\TestCompleteFazua\\abc.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);
        } catch (Exception e) {
            DesiredCapabilities desktopCapabilities = new DesiredCapabilities();
            desktopCapabilities.setCapability("app", "Root");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), desktopCapabilities);
        }

        WebElement OEM = driver.findElement(By.name("OEM"));
        OEM.click();
        BrowserUtils.sleep(2);

        WebElement basic= driver.findElement(By.name("BASIC"));
        basic.click();
        BrowserUtils.sleep(2);

        WebElement liveData = driver.findElement(By.name("LIVE DATA"));
        liveData.click();

        BrowserUtils.sleep(2);
    }
    @When("I click play button on top rigth corner")
    public void i_click_play_button_on_top_rigth_corner() {

        WebElement play = driver.findElementByAccessibilityId("JavaFX558");
        play.click();
        BrowserUtils.sleep(2);


    }
    @Then("Verify that second click is impossible and button is not clickable")
    public void verify_that_second_click_is_impossible_and_button_is_not_clickable() {
        WebElement play = driver.findElementByAccessibilityId("JavaFX558");
        Assert.assertTrue(!play.isEnabled());  // This is verifying play button is clickable normally must not be clickable second time

    }




















}
