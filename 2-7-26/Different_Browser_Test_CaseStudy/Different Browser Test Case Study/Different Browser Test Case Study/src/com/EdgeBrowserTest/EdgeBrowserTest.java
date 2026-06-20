package com.EdgeBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;



public class EdgeBrowserTest {
	@Test(priority = 0)
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
	@Test(priority = 1)
	public void BingBrowserEdgeTest() {
		WebDriver driver = new EdgeDriver();
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
	@Test(priority = 3)
	public void DemoBlazeEdgeBrowserTest() {
		WebDriver driver = new EdgeDriver();
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
	public void FreeCrmEdgeBrowserTest() {
		WebDriver driver = new EdgeDriver();
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
	public void OpenCartEdgeBrowserTest() {
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
	@Test(priority = 6)
	public void OrangeHrmEdgeTest() {

		WebDriver driver = new EdgeDriver();
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
	public void PracticeAutomationEdgeBrowserTest() {
		WebDriver driver = new EdgeDriver();
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

}
