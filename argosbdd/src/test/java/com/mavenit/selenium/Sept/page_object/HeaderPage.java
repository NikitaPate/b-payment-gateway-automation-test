package com.mavenit.selenium.Sept.page_object;

import com.mavenit.selenium.Sept.driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage extends DriverHelper {

    public void doSearch(String searchTerm) {


        WebElement element = driver.findElement(By.cssSelector("#searchTerm"));
        element.sendKeys(searchTerm);
        element.sendKeys(Keys.ENTER);
//        sleep(3000);
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.
                        textToBePresentInElementLocated(By.cssSelector(".font-condensed.search-title__term"), searchTerm));
    }


    public String getCurrentPageURL(){
       return driver.getCurrentUrl();
    }


    public void goToLoginPage(){
        driver.findElement(By.linkText("SIGN IN / JOIN")).click();
    }
}
