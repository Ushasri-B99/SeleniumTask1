package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPageObjects {
	WebDriver driver;
	public ThankYouPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//div[@class='section order-completed']/ul/li[1]") WebElement OrderNumber;
	@FindBy(xpath="//div[@class='section order-completed']/ul/li[2]/a") WebElement OrderDetailsLink;
	@FindBy(xpath="//input[@class='button-2 order-completed-continue-button']") WebElement ThankyouContinueBtn;	
	
	public String GetOrderNumber() {
		 return OrderNumber.getText();
	}
	
		
	public void ClickonOrderDetailsLink() {
		 OrderDetailsLink.click();
	}
	
	
	public void ClickonThankyouContinueBtn() {
		 ThankyouContinueBtn.click();
	}
}
