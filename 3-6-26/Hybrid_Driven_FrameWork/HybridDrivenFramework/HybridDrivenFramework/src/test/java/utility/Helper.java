package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Helper {
	
	static WebDriver driver;
	
	
	@SuppressWarnings("deprecation")
	public static void capturedScreenShot(WebDriver driver) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./ScreenShot/EasyCalculation" + getCurrentDate() + ".png"));
			System.out.println("Captured Screenshot - on Failure");
			
		}catch(Exception e) {
			System.out.println("The error occured in helper function"+e.getMessage());
		}
		
		
	}
	
	public static String getCurrentDate() {
		DateFormat customFormate = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return customFormate.format(currentDate);
	}

}
