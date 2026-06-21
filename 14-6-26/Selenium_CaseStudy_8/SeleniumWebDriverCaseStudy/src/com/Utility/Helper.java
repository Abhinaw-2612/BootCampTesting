package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Helper {
	
	public static WebDriver startBrowser(String Browser) {
		WebDriver driver = null;
		
		if(Browser.equalsIgnoreCase("GC") || Browser.equalsIgnoreCase("Google Chrome") ||  Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		
		if(Browser.equalsIgnoreCase("ED") || Browser.equalsIgnoreCase("Microsoft Edge") ||  Browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			
		}
		
		return driver;
		
		
		
	}
	
	 public static void endBrowser(WebDriver driver) {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
