package com.Synchronization;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;;

public class SynchrozationTest {
	WebDriver driver;
	
	String URL ="https://www.easemytrip.com/";
	@Test
	public void Test() {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Map<String,Object> prf = new HashMap<>();
		prf.put("profile.default_content_setting_values.geolocation",2);
		prf.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("prf", prf);
		
		
		
		driver.findElement(By.id("FromSector_show")).sendKeys("Delhi",Keys.ENTER);
		driver.findElement(By.id("Editbox13_show")).click();
		driver.findElement(By.xpath("//body[1]/form[1]/div[3]/div[3]/div[2]/div[5]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[2]/div[1]")).click();
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.xpath("//li[@id='frth_2_23/06/2026']")).click();
		driver.findElement(By.xpath("//input[@class='srchBtnSe']")).click();
		
		
	}

}
