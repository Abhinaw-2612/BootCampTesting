package com.WebDriverCaseStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Helper;

public class RadioButtonCaseStudy2 {
	WebDriver driver;
	String URL ="https://www.spicejet.com/";
	@BeforeTest
	public void Setup() {
		driver = Helper.startBrowser("GC");
		driver.manage().window().maximize();
		driver.navigate().to(URL);
	}
	@Test
	public void TestMethod() {
		List<WebElement> allCount = driver.findElements(By.cssSelector(".css-1dbjc4n.r-7o8qx1"));
		System.out.println("The total radio button are" +allCount.size());
	}

}
