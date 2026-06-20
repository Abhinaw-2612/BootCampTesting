package com.CaseStudy3;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;



public class FireFoxCaseStudy3 {
	WebDriver driver;
	String Url = "https://www.easycalculation.com/";
	@BeforeTest
	public void Setup() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void TestMethod() {
		driver.get(Url);
		driver.findElement(By.xpath("//span[normalize-space()='Calculators']")).click();
		WebElement links = driver.findElement(By.tagName("a"));
		System.out.println("Count Link" +links.getSize());
		
	}
	@AfterTest
	public void EndTest() {
		driver.close();
	}

}
