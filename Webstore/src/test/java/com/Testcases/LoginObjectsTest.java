package com.Testcases;

import org.openqa.selenium.WebDriver;
import com.ObjectRepository.LoginPageObjects;

public class LoginObjectsTest{
	WebDriver driver;
	
	public LoginObjectsTest(WebDriver driver) {
		this.driver = driver;
	}		
	//@Test
	public void loginTest() throws Exception {
		
		System.out.println("Login Test Entered");
		LoginPageObjects LogInObj = new LoginPageObjects(driver);
		LogInObj.SetLoginEmail();
		LogInObj.SetLoginPassword();
		LogInObj.ClickRememberMe();
		LogInObj.ClickLogInButton();
	
					
	}
	
}
