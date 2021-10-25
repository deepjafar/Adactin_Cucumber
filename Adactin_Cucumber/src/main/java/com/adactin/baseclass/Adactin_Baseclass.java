package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Adactin_Baseclass {
	
public static WebDriver driver;
	
	public static WebDriver getBrowser(String browser) {
		
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\91999\\eclipse-workspace\\Selenium_Concepts\\Drivers\\chromedriver.exe");
				
				driver=new ChromeDriver();

				
			}else if (browser.equalsIgnoreCase("edge")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\91999\\eclipse-workspace\\Selenium_Concepts\\Drivers\\msedgedriver.exe");
				
				driver=new EdgeDriver();
				
			}else {
				
				System.out.println("Invalid browser");
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		driver.manage().window().maximize();
		return driver;

		
		}
	
	public static void getUrl(String Url) {
		
		try {
			driver.get(Url);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
		


}
