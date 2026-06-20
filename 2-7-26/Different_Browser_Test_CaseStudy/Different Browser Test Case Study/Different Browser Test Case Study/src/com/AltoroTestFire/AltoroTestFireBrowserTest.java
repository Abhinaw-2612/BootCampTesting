package com.AltoroTestFire;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AltoroTestFireBrowserTest {

	@Test(priority = 0)
	public void AltoroTestFireChromeBrowserTest() {
		WebDriver driver = new ChromeDriver();
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
	public void AltoroTestFireEdgeBrowserTest() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.demo-opencart.com/index.php?route=account/login&language=en-gb");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	@Test(priority = 2)
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

}
