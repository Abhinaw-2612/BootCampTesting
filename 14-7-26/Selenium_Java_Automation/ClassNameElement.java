package com.LocatorTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassNameElement {
	WebDriver driver;
	String URL = "https://www.hollandandbarrett.com/";
	
	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		
	}
	
	@Test
	public void TestMethod() throws Exception{
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		driver.navigate().to("https://www.hollandandbarrett.com/shop/vitamins-supplements/vitamins/");
		driver.findElement(By.className("NavCategoryItem-module_categoryImageWrapper__jzLpN")).click();
		
		String title = "Multivitamins";
		System.out.println(title);
		
		WebElement currentTitle = driver.findElement(By.className("PLPTitleWidget-module_title__RpLG8"));
		String title1 = currentTitle.getText();
		
		if(title.equals(title1)) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Titile is worong");
		}
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
	}
	
	@AfterTest
	public void EndTest() {
		driver.quit();
	}

}
