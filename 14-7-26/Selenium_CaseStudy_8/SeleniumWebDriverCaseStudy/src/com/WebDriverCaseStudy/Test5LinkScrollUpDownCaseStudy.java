package com.WebDriverCaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test5LinkScrollUpDownCaseStudy {
	WebDriver driver;
	String URL = "https://www.shopclues.com/";
	String URL1 = "https://www.amazon.in/";
	String URL2 = "https://www.flipkart.com/";
	String URL3 = "https://www.spicejet.com/";
	String URL4 = "https://www.irctc.co.in/nget/train-search";

	@Test(priority = 0)
	public void WebSite1Test() throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to(URL);

		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[normalize-space()='ShopClues Surety Program']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		((JavascriptExecutor) driver).executeScript("scroll(0,-6000)");
	}

	@Test(priority = 1)

	public void WebSite2Test() throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to(URL1);

		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[normalize-space()='Amazon Pay on Merchants']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		((JavascriptExecutor) driver).executeScript("scroll(0,-6000)");
	}

	@Test(priority = 2)

	public void WebSite3Test() throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to(URL2);

		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@aria-label='FAQ']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		((JavascriptExecutor) driver).executeScript("scroll(0,-6000)");
	}

	@Test(priority = 3)

	public void WebSite4Test() throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to(URL3);

		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-1ddef8g']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		((JavascriptExecutor) driver).executeScript("scroll(0,-6000)");
	}

	@Test(priority = 4)

	public void WebSite5Test() throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to(URL4);

		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='footer_headings'][normalize-space()='Advertise with us']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		((JavascriptExecutor) driver).executeScript("scroll(0,-6000)");
	}

}