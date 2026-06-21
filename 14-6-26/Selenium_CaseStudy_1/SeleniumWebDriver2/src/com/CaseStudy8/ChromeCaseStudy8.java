package com.CaseStudy8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;
import org.testng.annotations.DataProvider;


public class ChromeCaseStudy8 {
	WebDriver driver;
	String URL = "https://demo.opencart.com/en-gb?route=account/login";
	
	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();

	    driver.manage().window().maximize();
	    driver.navigate().to(URL);
	}
	
	
	
	@DataProvider(name="LoginData")
	public Object[][] LoginData(){
		return new Object[][] {
			{"devanshbajpai99@gmail.com" , "23434234"},
			{"bajpai08@gmail.com","23412313"}
		};
	}
	@Test(dataProvider="LoginData")
	public void Test(String email, String password) {
		driver.findElement(By.id("input-email")).sendKeys(email, Keys.ENTER);
		driver.findElement(By.id("input-password")).sendKeys(password, Keys.ENTER);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	

}
