package com.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.HelperFunction;
import com.ProfileBrightest.LoginProfileBrightestPage;

public class ExternalLoginPage {
	
	@Test
	public void ValidateUser() {
		WebDriver driver = HelperFunction.Helper("chrome", "https://profile.brightest.org/accounts/login/");
		LoginProfileBrightestPage login = PageFactory.initElements(driver, LoginProfileBrightestPage.class);
		login.LoginProfile("devanshbajpai07@gmail.com", "Devansh@808");
	}

}
