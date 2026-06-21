//Write a program suing selenium websdriver perform operation on using actionsalso count and print number of link presen tin download page
package com.ActionWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverAction {
	int linkCount;
	List<WebElement> list;
	WebDriver driver;
	
	@Test
	public void TestDemo() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.easycalculation.com/");
		
		WebElement ele = driver.findElement(By.xpath("//a[@href='#']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(int i = 0; i<=list.size()-1;i++) {
			System.out.println(list.get(i).getText());
		}
		Thread.sleep(6000);
		
		WebElement ele2 = driver.findElement(By.xpath("//a[normalize-space()='Download']"));
		ele2.click();
		
		
		System.out.println(driver.getCurrentUrl());
		
		
		
	
	
		
		
	}

}
