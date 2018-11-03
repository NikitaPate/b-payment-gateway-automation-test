package com.mavenit.selenium.Sept.driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class DriverHelper {

    public static WebDriver driver;

    private String browser = System.getProperty("brows");

    public void openBrowser() {
        switch (browser) {
            case "chrome":
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
            case "ie":
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;

            default:
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
        }
    }

    public void closeBrowser() {
        driver.quit();
    }


    public void navigateTo(String url){
        driver.get(url);
    }

    public void maxBrowser(){
        driver.manage().window().maximize();
    }

    public void applyImpWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public void sleep(int ms) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void handleCookeis(){
        driver.findElement(By.linkText("GOT IT")).click();
    }
}
