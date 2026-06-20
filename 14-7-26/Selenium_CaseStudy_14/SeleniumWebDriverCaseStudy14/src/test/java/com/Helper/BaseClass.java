package com.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {

    public static WebDriver driver;

    String URL = "https://www.login.hiox.com/register?referrer=easycalculation.com";
    @BeforeTest
    @Parameters("browserName")
 
    public void setup(String browserName) {

        if(browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        else if(browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(URL);
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}