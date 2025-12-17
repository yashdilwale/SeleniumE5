package com.crm.selenium.PomStructureLogIn;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeaveOrangeHrm {
	
	private String urlLeave = "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList";
	
	//sidemenu
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement SearchSidemenu ;
	
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pIMSidemenu ;
	
    @FindBy(xpath = "//span[text()='Leave']")
    private   WebElement leaveSideMenu ;
    
    @FindBy(xpath = "//span[text()='Time']")
    private  WebElement timeSideideMenu ;
    
    @FindBy(xpath = "//span[text()='Recruitment']")
    private WebElement recruitmentSideMenu ;
    
    @FindBy(xpath = "//span[text()='My Info']")
    private WebElement myinfoSidemenu ;
    
    @FindBy(xpath = "//span[text()='Performance']")
    private WebElement performancesidemenu ;
    
    @FindBy(xpath = "//span[text()='Dashboard']")
    private WebElement dashboardSidemenu ;
    
    @FindBy(xpath = "//span[text()='Directory']")
    private WebElement directorySidemenu ;
    
    @FindBy(xpath = "//span[text()='Maintenance']")
    private WebElement maintainancesidemenu ;
    
    @FindBy(xpath = "//span[text()='Claim']")
    private   WebElement claimsidemenu ;
    
    @FindBy(xpath = "//span[text()='Buzz']")
    private   WebElement buzzsidemenu ;
    
    @FindBy(xpath = "(//button[@type='button'])[1]")
    private    WebElement closeSideMenu ;
    
    @FindBy(xpath = "//span[text()='Admin']")
    private	WebElement adminSidemenu ;
    
    @FindBy(xpath = "//button[@fdprocessedid='0ok3t']")
    private    WebElement upgradeButton ;
    
    @FindBy(xpath = "//p[contains(text(),'m user')]")
    private   WebElement myuser;
    
    //leave elements
	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[1]")
	private WebElement from;

	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[2]")
	private WebElement to;
	
	@FindBy(xpath = "(//div[text()='-- Select --'])[1]")
	private	WebElement showLeaveWithstatusLeave ;
	
	@FindBy(xpath = "(//div[text()='-- Select --'])[2]")
	private	WebElement leaveTypeLeave ;
	
	@FindBy(xpath = "(//div[text()='-- Select --'])[3]")
	private	WebElement subUnitLeave ;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private	WebElement checkBoxOnOffLeave ;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private	WebElement allRecordOfLeave ;
	
	@FindBy(xpath = "//input[@fdprocessedid='ihhulm']")
	private	WebElement employeenameLeave ;
	
	@FindBy(xpath = "//a[contains(text(),'Apply')]")
	private	WebElement apply_Leave_Nav ;
	
	@FindBy(xpath = "//a[contains(text(),'My Leave')]")
	private	WebElement my_leave_navBar_Leave ;
	
	@FindBy(xpath = "//span[contains(text(),'Entitlements ')]")
	private	WebElement entittlements_Leave ;
	
	@FindBy(xpath = "//span[contains(text(),'Configure ')]")
	private	WebElement configure_navBAr_Leave ;
	
	@FindBy(xpath = "//a[contains(text(),'Assign Leave')]")
	private	WebElement assignLeave_navBar;
	
	@FindBy(xpath = "//a[contains(text(),'Leave List')]")
	private	WebElement leaveList_navBar ;
	
	public static void main(String[] args) {
		String s1 = new String("");
	}
	
	
	
	
	
	
	
	public LeaveOrangeHrm(WebDriver driver) {
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

	public void getFrom(String data) {
		from.sendKeys(data);
	}

	public void getTo(String data) {
		to.sendKeys(data);
	}

	public void getShowLeaveWithstatusLeave(int i) {
		Select op = new Select(showLeaveWithstatusLeave);
		op.selectByIndex(i);
	}
	public void getLeaveTypeLeave(int i) {
		Select op = new Select(leaveTypeLeave);
		op.selectByIndex(i);
	}
	public void getSubUnitLeave(int i) {
		Select op = new Select(subUnitLeave);
		op.selectByIndex(i);
	}	

	public void getCheckBoxOnOffLeave() {
		assertTrue(checkBoxOnOffLeave.isDisplayed());
		checkBoxOnOffLeave.click();
	}
	public void getAllRecordOfLeave() {
		allRecordOfLeave.click();
	}
    public void getEmployeenameLeave(String data) {
		employeenameLeave.sendKeys(data);
	}
	public void getApply_Leave_Nav() {
		apply_Leave_Nav.click();
	}
	public void getMy_leave_navBar_Leave() {
		my_leave_navBar_Leave.click();
	}
	public void getEntittlements_Leave(String value) {
		Select op = new Select(entittlements_Leave);
		op.selectByValue(value);
	}

	public void getConfigure_navBAr_Leave(String value) {
		Select op = new Select(configure_navBAr_Leave);
		op.selectByValue(value);
	}

	public void getAssignLeave_navBar() {
		assignLeave_navBar.click();
	}


	public void getLeaveList_navBar() {
		leaveList_navBar.click();
	}

	public String getUrlLeave() {
		return urlLeave;
	}
	

	
	
	


}
