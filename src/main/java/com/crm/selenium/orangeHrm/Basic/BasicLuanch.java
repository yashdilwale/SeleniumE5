package com.crm.selenium.orangeHrm.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicLuanch {
	
	
	@Test
	public void name() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=OBkP1M3hy4w&list=RDbPswTNOAOnU&index=5");
		Thread.sleep(4000);
		driver.close();
	}

}
