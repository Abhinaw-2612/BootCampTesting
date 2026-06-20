package com.Framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver = driver;
		
		
		
	}
	
	@FindBy(id ="log_email")
	WebElement email;
	
	@FindBy(id = "log_password")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='log_submit']")
	WebElement login;
	
	
	public void LoginEasyCalculation(String email, String pass) {
		this.email.sendKeys(email);
		password.sendKeys(pass);
		login.click();
	}
	
	

}
