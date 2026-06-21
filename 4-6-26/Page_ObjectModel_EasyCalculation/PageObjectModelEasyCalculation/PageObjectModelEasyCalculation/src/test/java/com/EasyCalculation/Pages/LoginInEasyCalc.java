package com.EasyCalculation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginInEasyCalc {
	WebDriver driver;
	
	public LoginInEasyCalc(WebDriver driver) {
		this.driver = driver;
		}
	
	@FindBy(id ="log_email")
	WebElement email;
	
	@FindBy(id = "log_password")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='log_submit']")
	WebElement loginbtn;
	
	public void login_EasyCal(String name, String pass) throws Exception {
		email.sendKeys(name);
		password.sendKeys(pass);
		Thread.sleep(10000);
		loginbtn.click();
	}
	

}
