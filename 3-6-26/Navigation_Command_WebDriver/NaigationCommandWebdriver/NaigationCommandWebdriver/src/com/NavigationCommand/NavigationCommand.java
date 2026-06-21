package com.NavigationCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommand {
//	@Test(priority=0)
//	public void NavigationToMethod() {
//		WebDriver driver = new ChromeDriver();
//		
//		
//		driver.navigate().to("https://www.demo-opencart.com/index.php?route=account/login&language=en-gb");
//		driver.manage().window().maximize();
//		String title = driver.getTitle();
//		System.out.println(title);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		
//	}
	
	public void NavigateBack() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev");
		
		driver.manage().window().maximize();
		String seleniumUrl = driver.getCurrentUrl();
		System.out.println(seleniumUrl);
		String seleniumTitle = driver.getTitle();
		System.out.println(seleniumTitle);
		driver.navigate().to("https://www.demo-opencart.com/index.php?route=account/login&language=en-gb");
		String openCartUrl = driver.getCurrentUrl();
		System.out.println(openCartUrl);
		String openCartTitle = driver.getTitle();
		System.out.println(openCartTitle);
		driver.navigate().back();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		
	}
	
	public void RefreshMethod() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev");
		
		driver.manage().window().maximize();
		String seleniumUrl = driver.getCurrentUrl();
		System.out.println(seleniumUrl);
		String seleniumTitle = driver.getTitle();
		System.out.println(seleniumTitle);
		driver.navigate().to("https://www.demo-opencart.com/index.php?route=account/login&language=en-gb");
		String openCartUrl = driver.getCurrentUrl();
		System.out.println(openCartUrl);
		String openCartTitle = driver.getTitle();
		System.out.println(openCartTitle);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
	}
	
	public void ForwardMethod() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev");
		
		driver.manage().window().maximize();
		String seleniumUrl = driver.getCurrentUrl();
		System.out.println(seleniumUrl);
		String seleniumTitle = driver.getTitle();
		System.out.println(seleniumTitle);
		driver.navigate().to("https://www.demo-opencart.com/index.php?route=account/login&language=en-gb");
		String openCartUrl = driver.getCurrentUrl();
		System.out.println(openCartUrl);
		String openCartTitle = driver.getTitle();
		System.out.println(openCartTitle);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}
	@Test(priority=0)
	public void QuiteMethod() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev");
		
		driver.manage().window().maximize();
		String seleniumUrl = driver.getCurrentUrl();
		System.out.println(seleniumUrl);
		String seleniumTitle = driver.getTitle();
		System.out.println(seleniumTitle);
		driver.navigate().to("https://www.demo-opencart.com/index.php?route=account/login&language=en-gb");
		String openCartUrl = driver.getCurrentUrl();
		System.out.println(openCartUrl);
		String openCartTitle = driver.getTitle();
		System.out.println(openCartTitle);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.quit();
		
	}
	@Test(priority=1)
	public void CloseMethod() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev");
		
		driver.manage().window().maximize();
		String seleniumUrl = driver.getCurrentUrl();
		System.out.println(seleniumUrl);
		String seleniumTitle = driver.getTitle();
		System.out.println(seleniumTitle);
		driver.navigate().to("https://www.demo-opencart.com/index.php?route=account/login&language=en-gb");
		String openCartUrl = driver.getCurrentUrl();
		System.out.println(openCartUrl);
		String openCartTitle = driver.getTitle();
		System.out.println(openCartTitle);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.close();
		
	}
	

}
