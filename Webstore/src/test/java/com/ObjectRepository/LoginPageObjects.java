package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DataProvider.ExcelDataProvider;

public class LoginPageObjects {
	WebDriver driver;
	ExcelDataProvider excelprovider = new ExcelDataProvider();
	
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}	
	
	@FindBy(xpath="//input[@class='email']") WebElement LoginEmail;	
	@FindBy(xpath="//input[@class='password']") WebElement LoginPassword;
	@FindBy(xpath="//input[@id='RememberMe']") WebElement RememberMe;
	@FindBy(xpath="//span[@class='forgot-password']//a") WebElement ForgotPassword;	
	@FindBy(xpath="//input[@class='button-1 login-button']") WebElement LogInButton;
	@FindBy(xpath="//input[@class='button-1 register-button']") WebElement LoginRegister;	
	
	public void SetLoginEmail() {
		  LoginEmail.sendKeys(excelprovider.getEmail());
	}
			
	public void SetLoginPassword() {
		  LoginPassword.sendKeys(excelprovider.getPassword());	
	}
			
	public void ClickRememberMe() {
		  RememberMe.click();
	}
		
	public void ClickForgotPassword() {
		  ForgotPassword.click();
	}
			
	public void ClickLogInButton() {
		  LogInButton.click();
	}
		
	public void ClickLoginRegister() {
		  LoginRegister.click();
	}
	
	/*
	@FindBy(xpath="") WebElement ;	
	public void () {
		  ;
	}
	*/
}
