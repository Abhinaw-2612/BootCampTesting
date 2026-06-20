package com.MultipleFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MultipleFrame {
	String URL ="file:///D:/OneDrive%20-%20Coforge%20Limited/Documents/index.html";
	@Test
	public void Frames() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		Thread.sleep(5000);
		int totalframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("The total frame is: " +totalframes);
		
		driver.switchTo().frame("easycalculation");
		driver.navigate().to("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.findElement(By.id("log_email")).sendKeys("6392537076");
		driver.findElement(By.id("log_password")).sendKeys("Devansh@808");
		Thread.sleep(10000);
		
		driver.findElement(By.name("log_submit")).click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("The title is:" +title);
		
		
		
		driver.navigate().to(URL);
		Thread.sleep(5000);
		driver.switchTo().frame("praticeautomation");
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		String Title1= driver.getTitle();
		System.out.println("Selenium title"+Title1);
		
		
		driver.navigate().to(URL);
		Thread.sleep(5000);
		driver.switchTo().frame("selenium");
		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[normalize-space()='Documentation']hihihijij")).click();
		
		String Title = driver.getTitle();
		System.out.println("Selenium title"+Title);
		Thread.sleep(5000);
		
		
		driver.quit();
	}

}
