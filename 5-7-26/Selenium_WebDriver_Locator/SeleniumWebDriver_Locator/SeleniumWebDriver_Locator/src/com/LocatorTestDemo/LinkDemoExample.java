package com.LocatorTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
// write program using selenium webdriver in holland and barrett
public class LinkDemoExample {
	WebDriver driver;
	String Url = "https://www.hollandandbarrett.com/";
	int Total = 0;
	
	
	@BeforeTest
	public void BeforeTest() {
		driver = new ChromeDriver();
		driver.navigate().to(Url);
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void LinkMethod() throws Exception {
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		driver.findElement(By.linkText("Vitamins & Supplements")).click();
		List <WebElement> link = driver.findElements(By.tagName("a"));
		int linkCount = link.size();
		Total = Total + link.size();
		
		System.out.println(linkCount);
		
		for(int i = 0 ; i<link.size();i++) {
			System.out.println(link.get(i).getText());
		}

		
		
	}
	@AfterTest
	public void AfterTest() {
		driver.quit();
	}

}
