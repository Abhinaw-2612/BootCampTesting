package com.library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Resuability {

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        try {
            // Correct casting
            TakesScreenshot ts = (TakesScreenshot) driver;

            File src = ts.getScreenshotAs(OutputType.FILE);

            File dest = new File("./SeleniumWebDriverScreenshot/" + screenshotName + ".png");

            FileUtils.copyFile(src, dest);

            System.out.println("Screenshot captured successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}