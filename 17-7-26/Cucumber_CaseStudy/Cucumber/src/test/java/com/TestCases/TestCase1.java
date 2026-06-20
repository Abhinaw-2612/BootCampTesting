package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class TestCase1 {
	WebDriver  driver;
	String URL  = "https://practicetestautomation.com/practice-test-login/";

@Given("User opens the login page")
public void user_opens_the_login_page() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(URL);
    
}

@When("User enters username {string}")
public void user_enters_username(String string) {
	driver.findElement(By.id("username")).sendKeys("student");

}
    

@When("User enters password {string}")
public void user_enters_password(String string) {
	driver.findElement(By.id("password")).sendKeys("Password123");
   
}

@When("User clicks on Submit button")
public void user_clicks_on_submit_button() {
	driver.findElement(By.xpath("//button[@id='submit']")).click();
    
}

@Then("User should be redirected to the success page")
public void user_should_be_redirected_to_the_success_page() {
	String title = driver.getTitle();
	System.out.println("The title  is :" +title);
    
}

@Then("URL should contain {string}")
public void url_should_contain(String string) {
    String url = driver.getCurrentUrl();
    System.out.println("Current url :" +url);
}

@Then("Success message should contain {string}")
public void success_message_should_contain(String string) {
	String title = driver.getTitle();
	System.out.println("The title  is :" +title);
    
}

@Then("Log out button should be displayed")
public void log_out_button_should_be_displayed() {
   driver.quit();
}




}
