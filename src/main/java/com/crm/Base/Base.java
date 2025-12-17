package com.crm.Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.FileUtility.ReadFile;

public class Base {
	  public  WebDriver driver = null ;
	 
	 
	 @BeforeMethod
	public  void openBrowser() throws InterruptedException, IOException {
//		if (data.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://demowebshop.tricentis.com/");
//			Thread.sleep(1000);	
//		}else if (data.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://demowebshop.tricentis.com/");
//			Thread.sleep(1000);	
//		}else if (data.equalsIgnoreCase("internetexplorer")) {
//			driver = new InternetExplorerDriver();
//			driver.manage().window().maximize();
//			driver.get("https://demowebshop.tricentis.com/");
//			Thread.sleep(1000);	
//		}	
		 String browser=ReadFile.propertiesFile("browser");
			String url=ReadFile.propertiesFile("url");
			if(browser.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
			 }
			else if (browser.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}
			else {
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);
		
		
	}
	
	 
	 @AfterMethod
	public  void close() {
		driver.quit();
	}
	
	
	

}
