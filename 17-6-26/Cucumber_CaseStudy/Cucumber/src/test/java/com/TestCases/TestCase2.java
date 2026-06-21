package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class TestCase2 {
	WebDriver  driver;
	String URL  = "https://practicetestautomation.com/practice-test-login/";

@Given("User navigates to the login page")
public void user_navigates_to_the_login_page() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(URL);
}

@When("User enters invalid username {string}")
public void user_enters_invalid_username(String string) {
	driver.findElement(By.id("username")).sendKeys("studentttt");
}

@When("User enters valid password {string}")
public void user_enters_valid_password(String string) {
	driver.findElement(By.id("password")).sendKeys("Password123");
}

@When("User clicks the login button")
public void user_clicks_the_login_button() {
	driver.findElement(By.xpath("//button[@id='submit']")).click();
    
}

@Then("Invalid username error message should be displayed")
public void invalid_username_error_message_should_be_displayed() {
	String title = driver.getTitle();
	System.out.println("The title  is :" +title);
}

@Then("Error message should be {string}")
public void error_message_should_be(String string) {
    driver.quit();
}




}
