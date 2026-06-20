package com.PracticeAutomationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPracticeAutomation {
	WebDriver driver;
	
	public LoginPracticeAutomation(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id = "submit")
	WebElement Submit;
	
	
	public void LoginPratice(String name, String pass) {
		username.sendKeys(name);
		password.sendKeys(pass);
		Submit.click();
	}

}
