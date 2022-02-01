package com.Testcases;

import org.openqa.selenium.WebDriver;
import com.ObjectRepository.RegisterPageObject;

public class RegisterObjectTest{
	WebDriver driver;
	
	public RegisterObjectTest(WebDriver driver) {
		this.driver = driver;
	}		
	public void registerTest() {
		System.out.println("registerTest Entererd ");		
		RegisterPageObject RegisterObj = new RegisterPageObject(driver);
		RegisterObj.SetGenderFemale();			
		RegisterObj.SetGenderMale();
		RegisterObj.SetFirstName();
		RegisterObj.SetLastName();
		RegisterObj.SetRegisterEmail();
		RegisterObj.SetRegPassword();
		RegisterObj.SetConfirmPassword();
		RegisterObj.ClickRegisterButton();
		RegisterObj.ClickSuccessContinue();	
	}	
	
}
