package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class TestCase3 {
	WebDriver  driver;
	String URL  = "https://practicetestautomation.com/practice-test-login/";

@Given("User launches the login application")
public void user_launches_the_login_application() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(URL);
    
}

@When("User enters valid username {string}")
public void user_enters_valid_username(String string) {
	driver.findElement(By.id("username")).sendKeys("student");
}

@When("User enters invalid password {string}")
public void user_enters_invalid_password(String string) {
	driver.findElement(By.id("password")).sendKeys("Password");
}

@When("User presses the submit button")
public void user_presses_the_submit_button() {
	driver.findElement(By.xpath("//button[@id='submit']")).click();
}

@Then("Invalid password error message should be displayed")
public void invalid_password_error_message_should_be_displayed() {
	String title = driver.getTitle();
	System.out.println("The title  is :" +title);
}

@Then("Password error message should be {string}")
public void password_error_message_should_be(String string) {
	 driver.quit();
}




}
