package com.WebDriverScreenshot;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class WebDriverScreenShotTest  {
	WebDriver driver;
	String URL ="https://mvnrepository.com/artifact/au.com.bytecode/opencsv/2.4";
	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
	}
	@Test
	public void TestMethod() throws Exception {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./SeleniumWebDriverScreenshot/ScreenShot/homepage.png"));
		
		
	}

}
