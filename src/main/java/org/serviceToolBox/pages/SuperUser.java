package org.serviceToolBox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.serviceToolBox.utilitites.Driver;

public class SuperUser {


    public SuperUser() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy (name = "SUPERUSER")
        public WebElement superUser;







}
