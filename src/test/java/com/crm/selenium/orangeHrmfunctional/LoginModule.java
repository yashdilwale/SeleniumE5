package com.crm.selenium.orangeHrmfunctional;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Base.Base;
import com.crm.FileUtility.ReadFromExcel;
import com.crm.selenium.PomStructureLogIn.Login;


@Listeners(com.crm.listeners.listener.class)
public class LoginModule extends Base {
	@Test
	public void tc_001() {
		Login log = new Login(driver);
		boolean output = log.getwebUsername().isEnabled();
		assertTrue(output,"username is disabled And Defect is found");
	}
	@Test
	public void tc_002() throws EncryptedDocumentException, IOException {
		String wrongUser = ReadFromExcel.readExcel(1, 1,"login");
		String wrongPass = ReadFromExcel.readExcel(1, 2,"login");
		Login log=new Login(driver);
		log.getUsername(wrongUser);
		log.getPass(wrongPass);
		log.getSubmit();
		List<WebElement> errorBox = driver.findElements(By.xpath("//div[contains(@class,'oxd-alert-content--error')]"));
		System.out.println(errorBox.isEmpty());
		assertFalse(errorBox.isEmpty(),"login is successfull defect is found");
		
	}

}
