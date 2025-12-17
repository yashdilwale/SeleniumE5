package com.crm.selenium.PomStructureLogIn;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class AdminPom {
	
	private String urlAdmin ="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
	
	///Side menu Bar Click
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement SearchSidemenu ;
	
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pIMSidemenu ;
	
    @FindBy(xpath = "//span[text()='Leave']")
    private  WebElement leaveSideMenu ;
    
    @FindBy(xpath = "//span[text()='Time']")
    private WebElement timeSideideMenu ;
    
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
    private  WebElement maintainancesidemenu ;
    
    @FindBy(xpath = "//span[text()='Claim']")
    private WebElement claimsidemenu ;
    
    @FindBy(xpath = "//span[text()='Buzz']")
    private  WebElement buzzsidemenu ;
    
    @FindBy(xpath = "(//button[@type='button'])[1]")
    private  WebElement closeSideMenu ;
    
    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement adminSidemenu ;
    
    @FindBy(xpath = "//button[@fdprocessedid='0ok3t']")
    private  WebElement upgradeButton ;
    
    @FindBy(xpath = "//p[contains(text(),'m user')]")
    private  WebElement myuser;
    
	
	
	//elements IN Admin Page
	@FindBy(xpath = "//input[@fdprocessedid='jpyss8']")
	private WebElement usernameAdmin;
	
	@FindBy(xpath = "(//div[text()='-- Select --'])[1]")
	private WebElement optionUserRoleAdmin ;
	
	@FindBy(xpath = "(//div[text()='-- Select --'])[2]")
	private WebElement statusAdmin ;
	
	@FindBy(xpath = "//button[@fdprocessedid='f4g8z8']")
	private WebElement searchButtonAdmin ;
	
	@FindBy(xpath = "//button[@fdprocessedid='ubngdh']")
	private WebElement resetButtonAdmin ;
	
	@FindBy(xpath = "//button[@fdprocessedid='55ybjk']")
	private	WebElement addadmin ;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement selectAllCheckBoxAdmin ;
	
	@FindBy(xpath = "(//button[@type='button'])[7]")
	private WebElement deleteButtonParticular ;
	
	@FindBy(xpath = "(//button[@type='button'])[8]")
	private WebElement particularEditAdmin ;
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement minimizaeAdminInfo ;
	
	@FindBy(xpath = "//input[@fdprocessedid='ucmsch']")
	private WebElement employeNameAdmin ;
	
	@FindBy(xpath = "//span[text()='Job ']")
	private	WebElement jobAdmin ;
	
	@FindBy(xpath = "//span[text()='Organization ']")
	private	WebElement organizationAdmin ;
	
	@FindBy(xpath = "//span[text()='Qualifications ']")
	private	WebElement qualificationAdmin ;
	
	@FindBy(xpath = "//a[text()='Nationalities']")
	private	WebElement nationalitiesAdmin ;
	
	@FindBy(xpath = "//a[contains(text(),'Corporate Branding')]")
	private	WebElement corporate_BrandingAdmin ;
	
	@FindBy(xpath = "//span[text()='Configuration ']")
	private	WebElement configurationAdmin ;
	
	
	public AdminPom(WebDriver driver) {
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


	public  void  getUsernameAdmin(String data) {
		usernameAdmin.sendKeys(data);
	}


	public  void  getOptionUserRoleAdmin(int i) {
		Select op = new Select(optionUserRoleAdmin);
		op.selectByIndex(i);
		
	}


	public  void  getStatusAdmin(int i) {
		Select op = new Select(statusAdmin);
		op.selectByIndex(i);
	}


	public  void  getSearchButtonAdmin() {
		searchButtonAdmin.click();
	}


	public  void  getResetButtonAdmin() {
		resetButtonAdmin.click();
	}


	public  void  getAddadmin() {
		addadmin.click();
	}


	public  void  getSelectAllCheckBoxAdmin() {
		selectAllCheckBoxAdmin.click();
	}


	public  void  getDeleteButtonParticular() {
		deleteButtonParticular.click();
	}


	public  void  getParticularEditAdmin() {
		particularEditAdmin.click();
	}


	public  void  getMinimizaeAdminInfo() {
		minimizaeAdminInfo.click();
	}


	public  void  getEmployeNameAdmin(String data) {
		employeNameAdmin.sendKeys(data);
	}


	public  void  getJobAdmin(int i) {
		Select op = new Select(jobAdmin);
		op.selectByIndex(i);
	}


	public  void  getOrganizationAdmin(int i) {
		Select op = new Select(organizationAdmin);
		op.selectByIndex(i);
	}


	public  void  getQualificationAdmin(int i) {
		Select op = new Select(qualificationAdmin);
		op.selectByIndex(i);
	}


	public  void  getNationalitiesAdmin() {
		nationalitiesAdmin.click();
	}


	public  void  getCorporate_BrandingAdmin() {
		corporate_BrandingAdmin.click();
	}


	public  void  getConfigurationAdmin(int i) {
		Select op = new Select(configurationAdmin);
		op.selectByIndex(i);
	}


	public String getUrlAdmin() {
		return urlAdmin;
	}
	
	
	
	
	
	
	
	
	
	
	

}
