package org.serviceToolBox.pages;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.serviceToolBox.utilitites.Driver;

public class Basic {

    // Page Object Model
        public Basic() {
                PageFactory.initElements(Driver.getDriver(), this);
        }


        @FindBy (name = "BASIC")
        public WebElement basic;

        @FindBy (name = "PRODUCT INFORMATION" )
        public WebElement productInformation;

        @FindBy (name = "LIVE DATA")
        public WebElement liveData;

        @FindBy (name = "CALIBRATION")
        public WebElement calibration;

        @FindBy (name = "FIRMWARE UPDATE")
        public WebElement firmwareUpdate;

        @FindBy (name = "CONFIGURATION")
        public WebElement configuration;


        // methods for this page (java)















}
