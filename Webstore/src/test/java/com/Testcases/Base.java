package com.Testcases;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static ExtentSparkReporter sparkReporter;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeTest
	public void beforeTestMethod() {
		sparkReporter = new ExtentSparkReporter("D:\\Selenium Examples\\DemoWebShop\\ExtentReports\\BaseReport "+System.currentTimeMillis()+".html");
		sparkReporter.config().setEncoding("utf-8");
		sparkReporter.config().setDocumentTitle("Automation Report For Shop App (Task-1");
		sparkReporter.config().setReportName("Automation Test Results");
		sparkReporter.config().setTheme(Theme.STANDARD);
		report = new ExtentReports();
		report.attachReporter(sparkReporter);
		report.setSystemInfo("Automation Tester", "Ushasri");			
	}

	@BeforeMethod
	//@Parameters(value= {"browserName"})
	public void beforeMethodMethod( Method testMethod) {
		test = report.createTest(testMethod.getName());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//setupDriver(browserName);
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

	}
	
	@AfterMethod
	public void afterMethodMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			String methodName = result.getMethod().getMethodName();
			String logText = "Test Case: " + methodName + " Passed";
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			test.log(Status.PASS,m);
			
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			String methodName = result.getMethod().getMethodName();
			String logText = "Test Case: " + methodName + " Failed";
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
			test.log(Status.PASS,m);
			
		}
		driver.quit();

	}
	@AfterTest
	public void afterTestMethod() {
		report.flush();
	}
	
	private void setupDriver(String browserName) {

		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		if(browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}	
		
	}


}
