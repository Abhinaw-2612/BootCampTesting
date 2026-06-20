package com.ProfileBrightest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginProfileBrightestPage {
	WebDriver driver;
	
	public LoginProfileBrightestPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(name="login")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//button[normalize-space()='Sign In']")
	WebElement Signin;
	
	
	
	public void LoginProfile(String email , String pass) {
		this.email.sendKeys(email);
		password.sendKeys(pass);
		Signin.click();
		
		
		
	}

}
