package com.crm.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	  public  WebDriver driver = null ;
	 
	 
	 @BeforeMethod
	public  void openBrowser(String data ) throws InterruptedException {
		if (data.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(1000);	
		}else if (data.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(1000);	
		}else if (data.equalsIgnoreCase("internetexplorer")) {
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(1000);	
		}	
		
		
		
	}
	
	 
	 @AfterMethod
	public  void close() {
		driver.quit();
	}
	
	
	

}
