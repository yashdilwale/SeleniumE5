package com.crm.selenium.PomStructureLogIn;

import java.nio.channels.SelectableChannel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TimeOrangeHRM {
	
	private String urlTime = "https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet";
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private	WebElement SearchSidemenu ;
	
	@FindBy(xpath = "//span[text()='PIM']")
	private	WebElement pIMSidemenu ;
	
    @FindBy(xpath = "//span[text()='Leave']")
    private  WebElement leaveSideMenu ;
    
    @FindBy(xpath = "//span[text()='Time']")
    private   WebElement timeSideideMenu ;
    
    @FindBy(xpath = "//span[text()='Recruitment']")
    private   WebElement recruitmentSideMenu ;
    
    @FindBy(xpath = "//span[text()='My Info']")
    private   WebElement myinfoSidemenu ;
    
    @FindBy(xpath = "//span[text()='Performance']")
    private   WebElement performancesidemenu ;
    
    @FindBy(xpath = "//span[text()='Dashboard']")
    private   WebElement dashboardSidemenu ;
    
    @FindBy(xpath = "//span[text()='Directory']")
    private   WebElement directorySidemenu ;
    
    @FindBy(xpath = "//span[text()='Maintenance']")
    private   WebElement maintainancesidemenu ;
    
    @FindBy(xpath = "//span[text()='Claim']")
    private WebElement claimsidemenu ;
    
    @FindBy(xpath = "//span[text()='Buzz']")
    private   WebElement buzzsidemenu ;
    
    @FindBy(xpath = "(//button[@type='button'])[1]")
    private  WebElement closeSideMenu ;
    
    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement adminSidemenu ;
    
    @FindBy(xpath = "//button[@fdprocessedid='0ok3t']")
    private   WebElement upgradeButton ;
    
    @FindBy(xpath = "//p[contains(text(),'m user')]")
    private   WebElement myuser;
    
    //elements in time
    @FindBy(xpath = "//span[text()='Timesheets ']")
    private    WebElement timesheetsInTime ;
    
    @FindBy(xpath = "//span[text()='Attendance ']")
    private   WebElement attendanceTime ;
    
    @FindBy(xpath = "//span[text()='Reports ']")
    private   WebElement reportsTime ;
    @FindBy(xpath = "//span[contains(text(),'Project Info ')]")
    private    WebElement projectInfoTime ;
    
    @FindBy(xpath = "//input[@fdprocessedid='d3ddu7']")
    private   WebElement employeenameTime ;
    
    @FindBy(xpath = "//button[@type='submit']")
    private   WebElement viewTime ;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    private   WebElement firstrecordTime ;
    
    //contructor
	public TimeOrangeHRM(WebDriver driver) {
		super();
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

	public void getTimesheetsInTime(String value) {
		Select op = new Select(timesheetsInTime);
		op.selectByValue(value);
	}

	public void getAttendanceTime(String value) {
		Select op = new Select(attendanceTime);
		op.selectByValue(value);
	}

	public void getReportsTime(String value) {
		Select op = new Select(reportsTime);
		op.selectByValue(value);
	}

	public void getProjectInfoTime(String value) {
		Select op = new Select(projectInfoTime);
		op.selectByValue(value);
	}

	public void getEmployeenameTime(String data) {
		employeenameTime.sendKeys(data);
	}

	public void getViewTime() {
		viewTime.click();
	}

	public void getFirstrecordTime() {
		firstrecordTime.click();
	}

	public String getUrlTime() {
		return urlTime;
	}
	



    
  

}
