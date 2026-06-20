package com.TestAutomationPraticeBlogSpot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestAutomationPraticeBrowserTest {
	@Test(priority = 0)
	public void TestAutomationPraticeChromeBrowserTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	@Test(priority = 1)
	public void TestAutomationPraticeEdgeBrowserTest() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	@Test(priority = 2)
	public void TestAutomationPraticeFireFoxBrowserTest() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

}
