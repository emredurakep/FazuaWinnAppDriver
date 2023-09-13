package org.serviceToolBox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.serviceToolBox.utilitites.Driver;

public class Basic_ProductInfo {
    public Basic_ProductInfo() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "Create System Report")   //JavaFX130
    public WebElement createSystemReport;

    //JavaFX130  --> Create System Report

    //JavaFX126 -->  Create a report with all the information about your drive system and export it as a pdf file.

    //JavaFX241 -->  MotorSerialNumber






}
