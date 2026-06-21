package com.ScreenShotDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.library.Resuability;

public class ScreenShotDemoText {
	
	WebDriver driver;
	String URL ="https://mvnrepository.com/artifact/au.com.bytecode/opencsv/2.4";
	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
	}
	@Test
	public void TestMethod() {
		Resuability.captureScreenshot(driver, "A launch application");
		driver.findElement(By.xpath("//a[normalize-space()='Dependencies (1)']")).click();
		Resuability.captureScreenshot(driver, "Opened the depenencies");
	}
	
	@AfterTest
	public void EndTest() {
		driver.quit();
	}

}
