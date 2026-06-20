package com.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class ExplicitWaitsExample {
	WebDriver driver;
	String URL = "https://www.google.com/";
	@Test
	public void Test() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		driver.findElement(By.name("q")).sendKeys("Selenium automation testing");
		
		WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wb.until(ExpectedConditions.elementToBeClickable(By.name("wrechiul")));
		element.click();
		
	}

}
