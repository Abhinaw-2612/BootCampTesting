package com.LocatorTestDemo;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGMethod {
	WebDriver driver;
	String url = "https://practicetestautomation.com/practice-test-login/";
	
	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void LocatorsTest() {
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("username")).sendKeys("student");
		
		driver.findElement(By.name("password")).sendKeys("Password123");
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		if(title1.equals("Logged In Successfully | Practice Test Automation")) {
			System.out.println("Test Passes");
		}else {
			System.out.println("Test Failed");
			
		}
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		List<WebElement> img=driver.findElements(By.tagName("img"));
	
		System.out.println(img.size());
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}

}
