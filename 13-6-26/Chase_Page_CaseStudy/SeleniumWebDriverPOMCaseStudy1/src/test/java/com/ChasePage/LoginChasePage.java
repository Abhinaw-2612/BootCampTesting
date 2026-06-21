package com.ChasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginChasePage {
	WebDriver driver;
	
	public LoginChasePage(WebDriver driver) {
		this.driver = driver;
		
		
	}
	
	@FindBy(id="userId-text-input-field")
	WebElement userName;
	
	@FindBy(id="password-text-input-field")
	WebElement password;
	
	@FindBy(id="signin-button")
	WebElement Signin;
	
	
	public void LoginChase(String name , String pass) {
		userName.sendKeys(name);
		password.sendKeys(pass);
		Signin.click();
	}

}
