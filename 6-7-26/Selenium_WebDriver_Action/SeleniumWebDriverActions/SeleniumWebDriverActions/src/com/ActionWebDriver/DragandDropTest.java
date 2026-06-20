package com.ActionWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDropTest {
	WebDriver driver;
	String URL ="https://jqueryui.com/droppable/";
	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void TestMethod() {
		driver.navigate().to(URL);
		
		
		driver.switchTo().frame(0);
		
		Actions a = new Actions(driver);
		
		a.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
//		String text = drop.getText();
//		
//		if(text.contains("dropped")){
//			System.out.println("Drag and drop is possible");
//			
//		}else {
//			System.out.println("Drag and drop not possible");
//		}
	}

}
