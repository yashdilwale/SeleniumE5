package com.crm.listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.Base.Base;

public class listener extends Base implements ITestListener {

	public static ExtentSparkReporter spark=null;
	public static ExtentReports report=null;
	public static ExtentTest test=null;
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String name = result.getMethod().getMethodName();
		Reporter.log(name+"is onTestStart",true);
//		ITestListener.super.onTestStart(result);
		 test = report.createTest(name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String name = result.getMethod().getMethodName();
		test.log(Status.PASS,name+" is pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String date = LocalDate.now().toString().replace(';', '-');
		String name = result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File fs = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("./src/test/resources/Screenshot"+name+date+".png");
		try {
			FileHandler.copy(fs, to);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		String from = ts.getScreenshotAs(OutputType.BASE64);
//		test.addScreenCaptureFromBase64String(from);
//		test.log(Status.FAIL,name+" is fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
		String name = result.getMethod().getMethodName();
		test.log(Status.SKIP,name+" is skip");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
//		ITestListener.super.onStart(context);
		Reporter.log("onStart",true);
		//ExtentSparkReporter
		spark=new ExtentSparkReporter(".\\src\\test\\resources\\Reports\\LoginModule.html");
		//configure
		spark.config().setDocumentTitle("OrangeHRM");
		spark.config().setReportName("Manikandan");
		spark.config().setTheme(Theme.DARK);
		//ExtentReport
		report=new ExtentReports();
		//set system configuration
		report.setSystemInfo("System Brand","Lenovo");
		report.setSystemInfo("OS","windows-11");
		report.setSystemInfo("Browser","Chrome-111");
		//attach spark to report
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
		Reporter.log("onFinish",true);
		report.flush();
	}

}
