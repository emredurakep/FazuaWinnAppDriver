package org.serviceToolBox.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.serviceToolBox.utilitites.Driver;

public class Advanced {

    public Advanced() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name = "ADVANCED")
    public WebElement advanced;

    @FindBy (name = "OEM")
    public WebElement oem;

    @FindBy (name = "DIAGNOSIS")
    public WebElement diagnosis;

    @FindBy (name = "OEM PRE-CHECK")
    public WebElement oemPreCheck;

    @FindBy (name = "OEM EOL")
    public WebElement oemEol;

    @FindBy (name = "COMMAND")
    public WebElement command;




















}
