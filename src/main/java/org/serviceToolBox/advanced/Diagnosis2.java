package org.serviceToolBox.advanced;

import org.serviceToolBox.utilitites.BrowserUtils;
import org.serviceToolBox.utilitites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Diagnosis2 {



    @Test
    public void Test () {


        Actions actions = new Actions(Driver.getDriver());

        try {

            BrowserUtils.sleep(3);
            WebElement basic = Driver.getDriver().findElement(By.name("BASIC"));
            actions.doubleClick(basic);

            BrowserUtils.sleep(2);

            WebElement advanced = Driver.driver.findElement(By.name("ADVANCED"));
            actions.doubleClick(advanced);

        } catch (Exception e) {
            e.printStackTrace();
        }













    }



}
