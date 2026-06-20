package com.FireFoxBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxBrowserTest {
	@Test(priority = 0)
	public void AltoroTestFireFireFoxBrowserTest() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demo-opencart.com/index.php?route=account/login&language=en-gb");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	@Test(priority = 1)
	public void BingBrowserFirefoxTest() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	@Test(priority = 2)
	public void ChaseFireFoxBrowserTest() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.chase.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	@Test(priority = 3)
	public void DemoBlazeFirefoxBrowserTest() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	@Test(priority = 4)
	public void FreeCrmFireFoxBrowserTest() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	@Test(priority = 5)
	public void OpenCartFireFoxBrowserTest() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demo-opencart.com/index.php?route=account/login&language=en-gb");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	@Test(priority = 6)
	public void OrangeHrmFireFoxTest() {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	@Test(priority = 7)
	public void PracticeAutomationFirefoxBrowserTest() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	@Test(priority = 8)
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
