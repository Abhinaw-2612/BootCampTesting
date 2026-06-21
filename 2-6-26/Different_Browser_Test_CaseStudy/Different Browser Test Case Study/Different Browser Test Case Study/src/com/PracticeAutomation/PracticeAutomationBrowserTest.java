package com.PracticeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class PracticeAutomationBrowserTest {
	
	public void PracticeAutomationChromeBrowserTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		

	}

//	@Test(priority = 1)
//	public void PracticeAutomationEdgeBrowserTest() {
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//		driver.manage().window().maximize();
//		String title = driver.getTitle();
//		System.out.println(title);
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//
//	}
//
//	@Test(priority = 2)
//	public void PracticeAutomationFirefoxBrowserTest() {
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//		driver.manage().window().maximize();
//		String title = driver.getTitle();
//		System.out.println(title);
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);

	

}
