package com.TestNGDemoTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;


public class LaunchDifferentBrowsers {
	
	@Test
	public void EdgeBrowser() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");
//		
////		driver.navigate().back();
////		driver.navigate().forward();
////		driver.navigate().refresh();
////		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
//		driver.navigate().to("https://github.com/SeleniumHQ/selenium");
//		driver.manage().window().minimize();
		driver.close();
		
//		System.clearProperty(ChromeDriverService.CHROME_DRIVER_LOG_LEVEL_PROPERTY);
	  
		

	}
//	@Test
	public void ChromeBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev");
//		driver.manage().window().maximize();

		driver.manage().window().minimize();

	}
//	@Test
	public void FireFoxBrowser() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();

	}

}
