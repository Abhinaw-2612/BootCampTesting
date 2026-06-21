package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.HlperFunction;
import com.PracticeAutomationPage.LoginPracticeAutomation;

public class ExternalTest {
	@Test
	public void validateUser() {
		WebDriver driver = HlperFunction.Helper("chrome", "https://practicetestautomation.com/practice-test-login/");
		LoginPracticeAutomation login = PageFactory.initElements(driver, LoginPracticeAutomation.class);
		login.LoginPratice("student", "Password123");
	}

}
