package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        
    }

    @FindBy(name="name")
    WebElement displayName;

    @FindBy(name="email")
    WebElement email;

    @FindBy(name="password")
    WebElement password;

    @FindBy(name="confirm_pass")
    WebElement confirmPassword;
    
    @FindBy(id = "xreg_cnt")
    WebElement dropdownBox;
    
    @FindBy(name="mobile")
    WebElement phoneNumber;

    @FindBy(id="xreg_submit")
    WebElement signUpBtn;

    public void registerUser(String name,
                             String mail,
                             String pass,
                             String confirmPass,
                            
                             String dropSelect, String phNumber) {

        displayName.clear();
        displayName.sendKeys(name);

        email.clear();
        email.sendKeys(mail);

        password.clear();
        password.sendKeys(pass);
        
        

        confirmPassword.clear();
        confirmPassword.sendKeys(confirmPass);
        
        
        Select country_list = new Select(dropdownBox);
        country_list.selectByContainsVisibleText(dropSelect);
        
        phoneNumber.clear();
        phoneNumber.sendKeys(phNumber);
        
        
    }
}