package com.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HlperFunction {
	static WebDriver driver;
	
	public static WebDriver Helper(String browserName, String URL) {
		if(browserName.equalsIgnoreCase("Google Chrome") || browserName.equalsIgnoreCase("GC") || browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("Microsoft Edge") || browserName.equalsIgnoreCase("ED") || browserName.equalsIgnoreCase("Edge")) {
			
			driver = new EdgeDriver();
		}else if(browserName.equalsIgnoreCase("Microsoft Edge") || browserName.equalsIgnoreCase("ED") || browserName.equalsIgnoreCase("Edge")) {
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		return driver;
	}

}
