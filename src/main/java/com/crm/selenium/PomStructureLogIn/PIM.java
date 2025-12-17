package com.crm.selenium.PomStructureLogIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PIM {
	
	
	private String urlPIM = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
	
	
	public String getUrlPIM() {
		return urlPIM;
	}


	//sidemenu
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement SearchSidemenu ;
	
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pIMSidemenu ;
	
    @FindBy(xpath = "//span[text()='Leave']")
    private WebElement leaveSideMenu ;
    
    @FindBy(xpath = "//span[text()='Time']")
    private   WebElement timeSideideMenu ;
    
    @FindBy(xpath = "//span[text()='Recruitment']")
    private    WebElement recruitmentSideMenu ;
    
    @FindBy(xpath = "//span[text()='My Info']")
    private    WebElement myinfoSidemenu ;
    
    @FindBy(xpath = "//span[text()='Performance']")
    private   WebElement performancesidemenu ;
    
    @FindBy(xpath = "//span[text()='Dashboard']")
    private    WebElement dashboardSidemenu ;
    
    @FindBy(xpath = "//span[text()='Directory']")
    private   WebElement directorySidemenu ;
    
    @FindBy(xpath = "//span[text()='Maintenance']")
    private    WebElement maintainancesidemenu ;
    
    @FindBy(xpath = "//span[text()='Claim']")
    private    WebElement claimsidemenu ;
    
    @FindBy(xpath = "//span[text()='Buzz']")
    private    WebElement buzzsidemenu ;
    
    @FindBy(xpath = "(//button[@type='button'])[1]")
    private    WebElement closeSideMenu ;
    
    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement adminSidemenu ;
    
    @FindBy(xpath = "//button[@fdprocessedid='0ok3t']")
    private   WebElement upgradeButton ;
    
    @FindBy(xpath = "//p[contains(text(),'m user')]")
    private   WebElement myuser;
    
    //elementsInIt
    @FindBy(xpath = "//input[@fdprocessedid='95vqvq']")
    private   WebElement employeenamePIM ;
    
    @FindBy(xpath = "//input[@fdprocessedid='d2a8xw5']")
    private    WebElement employeeIdPIM ;
    
    @FindBy(xpath = "(//div[text()='-- Select --'])[1]")
    private   WebElement employeeStatusPIM ;
    
    @FindBy(xpath = "(//div[text()='-- Select --'])[2]")
    private   WebElement jobTittlePIM ;
    
    @FindBy(xpath = "(//div[text()='-- Select --'])[3]")
    private    WebElement subUnitPIM ;
    
    @FindBy(xpath = "//div[contains(text(),'Current Employees Only')]")
    private   WebElement includePIM ;
    
    @FindBy(xpath = "//input[@fdprocessedid='9medoe']")
    private   WebElement supervisorNamePIM ;
    
    @FindBy(xpath = "//button[@type='submit']")
    private   WebElement searchPIM ;
    
    @FindBy(xpath = "//button[@type='reset']")
    private   WebElement resetPIM ;
    
    @FindBy(xpath = "//button[@fdprocessedid='kkbtnx']")
    private    WebElement addPIM ;
    
    @FindBy(xpath = "(//input[@type=\"checkbox\"])[1]")
    private   WebElement checkboxPIMAllSelect ;
    
    
	public PIM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

	public void getSearchSidemenu(String data) {
		SearchSidemenu.sendKeys(data);
	}


	public void getpIMSidemenu() {
		pIMSidemenu.click();
	}


	public void getLeaveSideMenu() {
		leaveSideMenu.click();
	}


	public void getTimeSideideMenu() {
		timeSideideMenu.click();
		
	}


	public  void  getRecruitmentSideMenu() {
		recruitmentSideMenu.click();
		
	}


	public void  getMyinfoSidemenu() {
		myinfoSidemenu.click();;
	}


	public void getPerformancesidemenu() {
		performancesidemenu.click();
	}


	public void getDashboardSidemenu() {
		dashboardSidemenu.click();
	}


	public void getDirectorySidemenu() {
		directorySidemenu.click();
	}


	public void getMaintainancesidemenu() {
		maintainancesidemenu.click();
	}


	public  void  getClaimsidemenu() {
		claimsidemenu.click();
	}


	public  void  getBuzzsidemenu() {
		buzzsidemenu.click();
	}


	public void getCloseSideMenu() {
		closeSideMenu.click();
	}


	public void getAdminSidemenu() {
		adminSidemenu.click();
	}


	public void getUpgradeButton() {
		upgradeButton.click();
	}


	public void getMyuser() {
		myuser.click();
	}


	

	public void getEmployeenamePIM(String data) {
		employeenamePIM.sendKeys(data);
	}


	public void getEmployeeIdPIM(String data) {
		employeeIdPIM.sendKeys(data);
		
	}


	public void getEmployeeStatusPIM(String value) {
		Select op = new Select(employeeStatusPIM);
		op.selectByValue(value);
	}


	public void getJobTittlePIM(String value) {
		Select op = new Select(jobTittlePIM);
		op.selectByValue(value);
	}


	public void getSubUnitPIM(String value) {
		Select op = new Select(subUnitPIM);
		op.selectByValue(value);
	}


	public void getIncludePIM(String value) {
		Select op = new Select(includePIM);
		op.selectByValue(value);
	}


	public void getSupervisorNamePIM(String data) {
		supervisorNamePIM.sendKeys(data);
	}


	public void getSearchPIM() {
		searchPIM.click();
	}


	public void getResetPIM() {
		resetPIM.click();
	}


	public void getAddPIM() {
		addPIM.click();
	}


	public void getCheckboxPIMAllSelect() {
		checkboxPIMAllSelect.click();
	}
	
	
	

	
	
	
	


}
