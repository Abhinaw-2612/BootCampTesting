package com.LocatorTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TagNameDemo {
	WebDriver driver;
	String URL = "https://www.hollandandbarrett.com/";
	
	
	@BeforeTest
	public void setup() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	@Test
	public void TestMethod() throws Exception {
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Vitamins & Supplements')]")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement el:links) {
			System.out.println(el.isDisplayed());
			System.out.println(el.isEnabled());
			System.out.println(el.getAttribute("href"));
		}
		WebElement el = links.get(3);
		String expectedUrl = el.getAttribute("href");
		System.out.println("expected url"+expectedUrl);
		el.click();
		
		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url"+currentUrl);
		
		if(expectedUrl.equals(currentUrl)) {
			System.out.println("Test is Passed");
			
		}else {
			System.out.println("Test Failed");
		}
		
		
	}
	@AfterTest
	public void EndTest() {
		driver.quit();
	}

}
