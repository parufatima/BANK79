package com.UtilityBank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseBank {
	
	public static Properties bankprop;
	public static WebDriver driver;
	
	public BaseBank() {
		
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\ConfigBank\\bankConfig.properties");
			
			bankprop = new Properties();
			bankprop.load(fls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	public void initBankBrowser() {
		
		 String BankBrowserset = bankprop.getProperty("Browser1");
		 if(BankBrowserset.equals("Chrome")) {
				
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\DriverBank\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestData.ImplicitlyWait));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestData.pageLoad));
				
	}
		 else if(BankBrowserset.equals("FireFox")) {
				
			}
	}
		 public static void lunchURL(String URL) {
				driver.get(bankprop.getProperty("URL"));
				
			}
	
	
	}

