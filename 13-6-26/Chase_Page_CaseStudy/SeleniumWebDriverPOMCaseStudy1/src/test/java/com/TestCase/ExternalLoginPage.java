package com.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ChasePage.LoginChasePage;
import com.Helper.HelperFunction;




public class ExternalLoginPage {
	
	@Test
	public void ValidateUser() {
		WebDriver driver = HelperFunction.HelperOptions("chrome", "https://www.chase.com/");
		LoginChasePage login = PageFactory.initElements(driver, LoginChasePage.class);
		login.LoginChase("devanshbajpai07@gmail.com", "Devansh34");
		
	}

}
