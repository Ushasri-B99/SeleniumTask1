package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DataProvider.ExcelDataProvider;

public class RegisterPageObject {
	WebDriver driver;
	ExcelDataProvider excelprovider = new ExcelDataProvider();
	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//input[@id='gender-male']") WebElement GenderMale;	
	@FindBy(xpath="//input[@id='gender-female']") WebElement GenderFemale;	
	@FindBy(xpath="//input[@id='FirstName']") WebElement FirstName;	
	@FindBy(xpath="//input[@id='LastName']") WebElement LastName;	
	@FindBy(xpath="//input[@id='Email']") WebElement RegisterEmail;	
	@FindBy(xpath="//input[@id='Password']") WebElement RegPassword;
	@FindBy(xpath="//input[@id='ConfirmPassword']") WebElement ConfirmPassword;	
	@FindBy(xpath="//input[@id='register-button']") WebElement RegisterButton;	
	@FindBy(xpath="//input[@class='button-1 register-continue-button']") WebElement SuccessContinue;	
	
	public void SetGenderMale() {
		GenderMale.click();
	}
		
	public void SetGenderFemale() {
		 GenderFemale.click();
	}
		
	public void SetFirstName() {
		FirstName.sendKeys(excelprovider.getFirstName());;
	}
		
	public void SetLastName() {
		 LastName.sendKeys(excelprovider.getLastName());
	}
		
	public void SetRegisterEmail() {
		 RegisterEmail.sendKeys(excelprovider.getEmail());
	}
		
	public void SetRegPassword() {
		 RegPassword.sendKeys(excelprovider.getPassword());
	}
		
	public void SetConfirmPassword() {
		 ConfirmPassword.sendKeys(excelprovider.getPassword());
	}
		
	public void ClickRegisterButton() {
		 RegisterButton.click();
	}	
	// css ="input.button-1.register-continue-button"	
	public void ClickSuccessContinue() {
		 SuccessContinue.click();
	}
	
	/*
	@FindBy(xpath="") WebElement ;	
	public void () {
		 ;
	}
	*/
}
