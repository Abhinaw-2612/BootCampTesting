package com.LocatorTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PartialLinkElement {
	WebDriver driver;
	String URL = "https://www.hollandandbarrett.com/";
	
	@BeforeTest()
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void TestMethod() throws Exception {
		driver.get(URL);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Supplements")).click();
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int totatLink = link.size();
		System.out.println(totatLink);
		
		for(int i = 0 ; i < link.size() ; i++) {
			System.out.println(link.get(i).getText());
			String str = link.get(i).getText();
			String st1 = "Vitamins";
			if(str==st1) {
				driver.findElement(By.linkText("Vitamins")).click();
				driver.findElement(By.xpath("//a[contains(@type,'button')])[4]")).click();
				System.out.println("Moved to link");
			}else {
				System.out.println("failed");
			}
		}
		
		
	}
	@AfterTest
	public void AfterSetup() {
		driver.quit();
		
	}

}
