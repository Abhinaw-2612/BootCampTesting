//Program using selenium webdriver count number of items from list box in test automation pratice and print items  and list item in dropdown box  use TestNG fromaeowrk
package com.SeleniumWebDriverDropBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropBoxElement {
	WebDriver driver;
	String URL = "https://testautomationpractice.blogspot.com/";
			
	@BeforeTest		
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void TestMethod() throws Exception {
		driver.get(URL);
		WebElement country_code = driver.findElement(By.id("country"));
		Select country_list = new Select(country_code);
		country_list.selectByIndex(3);
		Thread.sleep(10000);
		country_list.selectByContainsVisibleText("India");
		Thread.sleep(10000);
		
		
		WebElement options = country_list.getFirstSelectedOption();
		String countryIndex = options.getText();
		System.out.println(countryIndex);
		
		
		List<WebElement> allList = country_list.getOptions();
		System.out.println("The total number of list" +allList.size());
		for(WebElement e: allList) {
			String name = e.getText();
			System.out.println("The Country " +name+ "list : " +name);
			
		}		
		
		
		
	}
//	@AfterTest
//	public void EndTest() {
//		
//	}

}
