package com.WebDriverCaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//count number of radio buttons and print
import com.Utility.Helper;



public class RadioButtonCaseStudy {
	String URL = "https://www.spicejet.com/";
	@Test
	public void TestRadioButton() {
		WebDriver driver = Helper.startBrowser("GC");

		driver.navigate().to(URL);
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-k8qxaj r-glunga r-bnwqim']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-glunga']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[1]/div[1]/div[1]/div[1]//*[name()='svg']")).click();
		
	}

}