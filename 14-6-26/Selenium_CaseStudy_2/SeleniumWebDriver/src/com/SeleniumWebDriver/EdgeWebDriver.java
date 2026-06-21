package com.SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EdgeWebDriver {
	WebDriver driver;
	String URL = "https://www.login.hiox.com/login?referrer=easycalculation.com";
	String URL2 = "https://www.easycalculation.com/date-day/age-calculator.php";

	@BeforeTest
	public void Setup() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void TestMethod() throws Exception {
		driver.get(URL);
		driver.findElement(By.id("log_email")).sendKeys("6392537076");
		driver.findElement(By.id("log_password")).sendKeys("Devansh@808");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		Thread.sleep(1000);
		String title = driver.findElement(By.tagName("body")).getText();

		if (title.toLowerCase().contains("welcome devansh bajpai")) {
			System.out.println("Login Passed");
		} else {
			System.out.println("Login Failed");
		}
		
		Thread.sleep(10000);

		driver.get("https://www.easycalculation.com/date-day/age-calculator.php");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("All  Links : " + links.size());
		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println("All image :" + img.size());

		driver.findElement(By.id("i21")).sendKeys("15");
		driver.findElement(By.id("i22")).sendKeys("11");
		driver.findElement(By.id("i23")).sendKeys("2003");

		driver.findElement(By.xpath("//input[@name='but']")).click();
		Thread.sleep(10000);

		String Age = driver.findElement(By.id("r1")).getAttribute("value");
		System.out.println("The Age in years is :" + Age);
		String AgeDays = driver.findElement(By.id("r4")).getAttribute("value");
		System.out.println("The Age in Days is :" + AgeDays);
		String AgeMonths = driver.findElement(By.id("r3")).getAttribute("value");
		System.out.println("The Age in Months is :" + AgeMonths);
		String AgeYears = driver.findElement(By.id("r2")).getAttribute("value");
		System.out.println("The Age in years is :" + AgeYears);
		Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@onclick='clearall()']")).click();

	}

	@AfterTest
	public void EndTest() {
		driver.quit();
	}

}
