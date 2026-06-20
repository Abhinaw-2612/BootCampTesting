package com.WebDriverCaseStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Link_and_Image_CaseStudy {
	WebDriver driver;
	String URL = "https://www.nopcommerce.com/en";
	String URL2 = "//span[normalize-space()='Training']";

	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void TestMethod() {
		driver.navigate().to(URL);
		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Support & services']"));
		Actions act = new Actions(driver);
		
		act.moveToElement(element).build().perform();
		
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Training']")).click();
		

		try {
		    Thread.sleep(50000); // Complete verification manually
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		System.out.println("The total links are : " + allLinks.size());
		
		List<WebElement> allImage = driver.findElements(By.tagName("img"));
		System.out.println("The total images are : " + allImage.size());
		
	}
		
	 

	@AfterTest
	public void EndTest() {
		driver.quit();
		}
}


