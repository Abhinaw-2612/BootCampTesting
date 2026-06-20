package com.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Helper.BaseClass;
import com.Helper.ExcelUtils;
import com.pages.RegisterPage;

public class RegisterTest extends BaseClass {

    @DataProvider(name="RegisterData")
    public Object[][] getData() throws Exception {

        return ExcelUtils.getExcelData();
    }

    @Test(dataProvider="RegisterData")
    public void registerTest(String displayName,
                             String email,
                             String password,
                             String confirmPassword,String dropdownBox,String phoneNmber) throws Exception{
    	

        RegisterPage page = PageFactory.initElements(driver , RegisterPage.class);
        Thread.sleep(10000);
        
        

        page.registerUser(
                displayName,
                email,
                password,
                confirmPassword,dropdownBox,phoneNmber);

        System.out.println("User Registered Successfully");
    }
}