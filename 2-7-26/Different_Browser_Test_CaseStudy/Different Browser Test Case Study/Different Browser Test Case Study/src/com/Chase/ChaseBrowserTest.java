package com.Chase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChaseBrowserTest {
	@Test(priority = 0)
	public void ChaseChromeBrowserTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.chase.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	@Test(priority = 0)
	public void ChaseEdgeBrowserTest() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.chase.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	@Test(priority = 0)
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

}
