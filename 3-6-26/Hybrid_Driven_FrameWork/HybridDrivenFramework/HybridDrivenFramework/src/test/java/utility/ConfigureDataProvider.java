package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigureDataProvider {
	Properties pro;
	String filePath = "C:\\SeleniumJavaProgram\\HybridDrivenFramework\\Confirguration\\configure.properties";
	
	public ConfigureDataProvider(){
		try {
			FileInputStream file = new FileInputStream(filePath);
			pro = new Properties();
			pro.load(file);
			
		}catch(Exception e) {
			System.out.println("Some error occured" +e.getMessage());
		}
		
	}
	
	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	
	public String getAppUrl() {
		return pro.getProperty("URL");
	}

}
