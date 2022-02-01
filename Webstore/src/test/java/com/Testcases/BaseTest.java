package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ObjectRepository.HomePageObjects;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import testReports.ExtentReportNG;

//@Listeners(testReports.Listeners.class)
public class BaseTest {
	 public ExtentReports extentReport = ExtentReportNG.getReportObject();
	 public static  ExtentTest test;
	 public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	
	}
	
	@Test
	public void webApp() throws Exception {

		HomePageObjects homeObj = new HomePageObjects(driver);
		RegisterObjectTest registerObj = new RegisterObjectTest(driver);
		LoginObjectsTest loginObj = new LoginObjectsTest(driver);
		AddProductsPageObjectsTest addProductObj = new AddProductsPageObjectsTest(driver);
		CartPageObjectsTest  cartObj = new CartPageObjectsTest(driver);
		CheckoutObjectsTest checkoutObj = new CheckoutObjectsTest(driver);
		ThankyouPageTest tnqObj = new ThankyouPageTest(driver);		

		homeObj.ClickonRegister();	
		registerObj.registerTest();
		//test.log(Status.FAIL,test.addScreenCaptureFromPath(capture(driver))+ "Registeration Failed");
		test.log(Status.PASS, "Registration Successfull");
		
		homeObj.ClickonLogout();
		//test.log(Status.FAIL,test.addScreenCaptureFromPath(capture(driver))+ "Logout Failed");
		test.log(Status.PASS, "logout Successfull");
		
		homeObj.ClickonLogIn();
		//test.log(Status.FAIL,test.addScreenCaptureFromPath(capture(driver))+ "LogIn Failed");
		test.log(Status.PASS, "login clicked");		
		
		loginObj.loginTest();
		//test.log(Status.FAIL,test.addScreenCaptureFromPath(capture(driver))+ "Login Test Failed");
		test.log(Status.PASS, "login Successfull");			
		
		addProductObj.addProductTest();
		//test.log(Status.FAIL,test.addScreenCaptureFromPath(capture(driver))+ "Add Product Test Failed");
		test.log(Status.PASS, "Products added Successfull");
		
		homeObj.ClickonShoppingCart();
		//test.log(Status.FAIL,test.addScreenCaptureFromPath(capture(driver))+ "ShoppingCart Test Failed");
		test.log(Status.PASS, "ShoppingCart clicked ");
		
		cartObj.cartTest();
		
		checkoutObj.checkoutTest();
		//test.log(Status.FAIL,test.addScreenCaptureFromPath(capture(driver))+ "checkout Failed");
		test.log(Status.PASS, "checkout Successfull");
		
		String orderId = tnqObj.tnqTest();
		//test.log(Status.FAIL,test.addScreenCaptureFromPath(capture(driver))+ "ThankYou Test Failed");
		test.log(Status.PASS, orderId);
		//test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ orderId);
		
		
	}
	
	//@AfterTest
	public void teardown() {
		//report.flush();
		driver.quit();
	}
}
