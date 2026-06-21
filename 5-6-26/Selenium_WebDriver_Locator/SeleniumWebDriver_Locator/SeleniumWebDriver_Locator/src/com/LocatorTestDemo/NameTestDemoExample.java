package com.LocatorTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NameTestDemoExample {
	WebDriver driver;
	@Test
	public void IDLocator() {
		driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("username")).sendKeys("student");
		
		driver.findElement(By.name("password")).sendKeys("Password123");
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		if(title1 == "Logged In Successfully | Practice Test Automation") {
			System.out.println("Test Passes");
		}else {
			System.out.println("Test Failed");
			
		}
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	


	

}
