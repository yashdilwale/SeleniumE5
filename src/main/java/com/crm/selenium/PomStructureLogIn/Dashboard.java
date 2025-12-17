package com.crm.selenium.PomStructureLogIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	private String urlDashboardString ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	//sidemenu 
	
	public String getUrlDashboardString() {
		return urlDashboardString;
	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement SearchSidemenu ;
	
	@FindBy(xpath = "//span[text()='PIM']")
	private	WebElement pIMSidemenu ;
	
    @FindBy(xpath = "//span[text()='Leave']")
    private   WebElement leaveSideMenu ;
    
    @FindBy(xpath = "//span[text()='Time']")
    private   WebElement timeSideideMenu ;
    
    @FindBy(xpath = "//span[text()='Recruitment']")
    private  WebElement recruitmentSideMenu ;
    
    @FindBy(xpath = "//span[text()='My Info']")
    private  WebElement myinfoSidemenu ;
    
    @FindBy(xpath = "//span[text()='Performance']")
    private  WebElement performancesidemenu ;
    
    @FindBy(xpath = "//span[text()='Dashboard']")
    private  WebElement dashboardSidemenu ;
    
    @FindBy(xpath = "//span[text()='Directory']")
    private  WebElement directorySidemenu ;
    
    @FindBy(xpath = "//span[text()='Maintenance']")
    private    WebElement maintainancesidemenu ;
    
    @FindBy(xpath = "//span[text()='Claim']")
    private   WebElement claimsidemenu ;
    
    @FindBy(xpath = "//span[text()='Buzz']")
    private  WebElement buzzsidemenu ;
    
    @FindBy(xpath = "(//button[@type='button'])[1]")
    private    WebElement closeSideMenu ;
    
    @FindBy(xpath = "//span[text()='Admin']")
    private	WebElement adminSidemenu ;
    
    @FindBy(xpath = "//button[@fdprocessedid='0ok3t']")
    private    WebElement upgradeButton ;
    
    @FindBy(xpath = "//p[contains(text(),'m user')]")
    private   WebElement myuser;
    
    //elements in dashboard
	@FindBy(xpath = "//p[text()='Assign Leave']")
	private WebElement assign_leave;

	@FindBy(xpath = "//p[text()='Leave List']")
	private WebElement leave_list;
	
	@FindBy(xpath = "//p[text()='Timesheets']")
	private WebElement timesheets;
	
	@FindBy(xpath = "//p[text()='Apply Leave']")
	private WebElement apply_leave;

	@FindBy(xpath = "//p[text()='My Leave']")
	private WebElement my_leave;
	
	@FindBy(xpath = "//p[text()='My Timesheet']")
	private WebElement my_timesheet;
	
	
	public Dashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
	
	public void getUpgradeButton() {
		upgradeButton.click();
	}


	public void getMyuser() {
		myuser.click();
	}



	public void getCloseSideMenu() {
		closeSideMenu.click();
	}


	public void getAdminSidemenu() {
		adminSidemenu.click();
	}


	public void getAssign_leave() {
		assign_leave.click();
	}

	public void getLeave_list() {
		leave_list.click();
	}

	public void getTimesheets() {
		timesheets.click();
	}

	public void getApply_leave() {
		apply_leave.click();
		
	}

	public void getMy_leave() {
		my_leave.click();
		
	}

	public void getMy_timesheet() {
		my_timesheet.click();
		
	}
	
	

}
