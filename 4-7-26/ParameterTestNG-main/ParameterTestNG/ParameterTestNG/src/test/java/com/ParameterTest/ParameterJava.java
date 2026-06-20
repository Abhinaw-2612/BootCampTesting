package com.ParameterTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;








public class ParameterJava {
	WebDriver driver;
	String URL = "https://www.login.hiox.com/login?referrer=easycalculation.com";
	@Parameters("browserName")
	@BeforeTest
	public void Setup(String browserName) {
		System.out.println("The browser name is: " +browserName);
		if(browserName.equalsIgnoreCase("chrome") || browserName.equalsIgnoreCase("Google Chrome") || browserName.equalsIgnoreCase("GC")) {
			
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("edge") || browserName.equalsIgnoreCase("Micrsoft Edge") || browserName.equalsIgnoreCase("ED")) {
			
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox") || browserName.equalsIgnoreCase("Fire Fox") || browserName.equalsIgnoreCase("FF")) {
			
			driver = new ChromeDriver();
		}else {
			System.out.println("Invalid browserName");
		}
		
	}
	
	
	
	@Test
	public void Test() {
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
	
	
	

}
