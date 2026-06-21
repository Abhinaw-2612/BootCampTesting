package com.WebDriverCaseStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Utility.Helper;

public class Alert_CaseStudy {
	WebDriver driver;
	String URL = "https://the-internet.herokuapp.com/javascript_alerts";

	@BeforeTest
	public void Setup() {
		driver = Helper.startBrowser("GC");
		driver.manage().window().maximize();
	}

	@Test
	public void TestMethod() {
		driver.navigate().to(URL);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

		Alert el = driver.switchTo().alert();
		String expectedText = el.getText();
		String actualText = "I am a JS Alert";

		if (expectedText.equals(actualText)) {
			System.out.println("The test is correct");
		} else {
			System.out.println("Tthe test is incorrect");
		}

		el.accept();

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Alert alert2 = driver.switchTo().alert();
		String expectedText2 = alert2.getText();
		String actualText2 = "I am a JS Confirm";

		if (expectedText2.equals(actualText2)) {
			System.out.println("The confirm alert is correct");
		} else {
			System.out.println("The alert is incorrect");

		}

		alert2.accept();

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert alert3 = driver.switchTo().alert();
		String text = "Devansh";
		alert3.sendKeys(text);

		alert3.accept();

		String gotText = driver.findElement(By.id("result")).getText();
		if (gotText.contains(text)) {
			System.out.println("The prompt alert is correct");
		} else {
			System.out.println("The prompt alert is incorrect");
		}
	}

	@AfterTest()
	public void EndTest() {
		driver.quit();

	}

}
