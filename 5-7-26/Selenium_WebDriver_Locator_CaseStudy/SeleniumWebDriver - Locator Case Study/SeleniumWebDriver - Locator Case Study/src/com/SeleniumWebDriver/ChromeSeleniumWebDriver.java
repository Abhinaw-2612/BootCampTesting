package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeSeleniumWebDriver {
	WebDriver driver;
	String Url = "https://www.login.hiox.com/login?referrer=easycalculation.com";
	
	@BeforeTest
	public void BeforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		
	}
	@Test
	
	public void TestMethod() {
		driver.findElement(By.id("log_email")).sendKeys("6392537076");;
		driver.findElement(By.id("log_password")).sendKeys("Devansh@808");
		driver.findElement(By.xpath("//input[@name='log_submit']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
//		if(title.contains("")) {
//			System.out.println("Login Test Passed");
//		}else {
//			System.out.println("Login Test Failed");
//		}
		
		
	}
	
	
	

}
