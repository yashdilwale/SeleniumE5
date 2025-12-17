package com.crm.selenium.PomStructureLogIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(name = "username")
  private WebElement username ;
	
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@FindBy(css = "input[type='password']")
	private WebElement pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit ;
	
	@FindBy(xpath = "//p[text() ='Forgot your password? ']")
	private WebElement forget_Pass ;

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void getUsername(String data) {
		username.sendKeys(data);
	}

	

	public void getPass(String data) {
		pass.sendKeys(data);
	}



	public void getSubmit() {
		 submit.click();;
	}

	

	public void getForget_Pass() {
		forget_Pass.click();
	}


}
