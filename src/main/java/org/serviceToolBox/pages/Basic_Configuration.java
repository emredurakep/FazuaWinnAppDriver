package org.serviceToolBox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.serviceToolBox.utilitites.Driver;

public class Basic_Configuration {
    public Basic_Configuration () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name = "Wheel Circumference OEM (mm)")
    public WebElement WheelCircumferenceOEM;

    @FindBy (name = "Wheel Circumference (mm)")
    public WebElement WheelCircumference;

    @FindBy (name = "Bike Max Speed OEM (km/h)")
    public WebElement bikeMaxSpeedOEM;

    @FindBy (name = "Bike Max Speed (km/h)")
    public WebElement bikeMaxSpeed;












}
