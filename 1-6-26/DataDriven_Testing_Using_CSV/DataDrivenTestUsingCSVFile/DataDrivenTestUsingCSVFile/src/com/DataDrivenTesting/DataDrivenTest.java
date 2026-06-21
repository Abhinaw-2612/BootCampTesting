package com.DataDrivenTesting;

import java.io.FileReader;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class DataDrivenTest {
	WebDriver driver;
	String URL = "https://only-testing-blog.blogspot.com/2014/05/form.html";
	String filePath = "C:\\CSVFile\\work.csv";
	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		
		
		
		
		
		
	}
	@Test
	public void TestMethod() throws Exception {
		CSVReader read = new CSVReader(new FileReader(filePath));
		String[] CSVCell;
		while((CSVCell= read.readNext()) != null) {
			String FName = CSVCell[0];
			String LName = CSVCell[1];
			String EMail = CSVCell[2];
			String PNo = CSVCell[3];
			String Company = CSVCell[4];
			
			driver.findElement(By.name("FirstName")).sendKeys(FName);
			driver.findElement(By.name("LastName")).sendKeys(LName);
			driver.findElement(By.name("EmailID")).sendKeys(EMail);
			driver.findElement(By.name("MobNo")).sendKeys(PNo);
			driver.findElement(By.name("Company")).sendKeys(Company);
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
			Thread.sleep(10000);
			
			Alert al = driver.switchTo().alert();
			al.accept();
			
	
			
			
			
		}
		read.close();
		
	}
	@AfterTest
	public void EndTest() {
		driver.quit();
		
	}

}
