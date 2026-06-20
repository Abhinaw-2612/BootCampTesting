package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	WebDriver driver;
	public static WebDriver BrowserOptions(WebDriver driver, String Browser, String URL) {
		if(Browser.equalsIgnoreCase("GC") || Browser.equalsIgnoreCase("Google Chrome") || Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("ED") || Browser.equalsIgnoreCase("Microsoft Edge") || Browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}else if(Browser.equalsIgnoreCase("FD") || Browser.equalsIgnoreCase("Fire Fox") || Browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else {
			System.out.println("It is invalid");
		}
		
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		return driver;
	}
	
	public static void EndBrowser(WebDriver driver) {
		driver.quit();
	}

}
