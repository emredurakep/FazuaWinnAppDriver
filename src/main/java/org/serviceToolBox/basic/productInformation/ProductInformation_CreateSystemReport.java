package org.serviceToolBox.basic.productInformation;

import com.beust.ah.A;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.serviceToolBox.utilitites.BrowserUtils;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ProductInformation_CreateSystemReport {

    WindowsDriver driver;

    @Test
    public void CreateSystemReport() throws MalformedURLException {


        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "C:\\TestCompleteFazua\\abc.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), caps);
        } catch (Exception e) {

            DesiredCapabilities desktopCapabilities = new DesiredCapabilities();
            desktopCapabilities.setCapability("app", "Root");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), desktopCapabilities);

        }

        WebElement basic= driver.findElement(By.name("BASIC"));
        basic.click();

        BrowserUtils.sleep(2);

        WebElement productInformation = driver.findElement(By.name("PRODUCT INFORMATION"));
        productInformation.click();

        BrowserUtils.sleep(2);

        WebElement createSystemReport = driver.findElement(By.name("Create System Report"));
        createSystemReport.click();
        BrowserUtils.sleep(8);

      Actions actions = new Actions(driver);
      actions.sendKeys(Keys.ENTER).perform();




















    }


}
