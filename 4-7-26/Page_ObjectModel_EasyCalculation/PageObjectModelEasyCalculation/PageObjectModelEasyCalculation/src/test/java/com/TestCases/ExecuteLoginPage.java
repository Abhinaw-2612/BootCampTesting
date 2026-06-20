package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.EasyCalculation.Pages.LoginInEasyCalc;
import com.Helper.BrowserFactory;

public class ExecuteLoginPage {
	@Test
	public void ValidateUser() throws Exception {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://www.login.hiox.com/login?referrer=easycalculation.com");
		LoginInEasyCalc loginPageEasyCal = PageFactory.initElements(driver, LoginInEasyCalc.class);
		loginPageEasyCal.login_EasyCal("6392537076", "Devansh@808");
		
	}

}
