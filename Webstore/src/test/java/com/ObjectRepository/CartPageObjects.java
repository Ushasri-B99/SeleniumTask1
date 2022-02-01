package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageObjects {
	WebDriver driver;
	public CartPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(css="form > table > tbody > tr:nth-child(1) > td.remove-from-cart > input[type=checkbox]") WebElement RemoveItem;	
	@FindBy(xpath="//div[@class='common-buttons']//input[@name='updatecart']") WebElement UpdateCart;	
	@FindBy(xpath="//input[@id='termsofservice']") WebElement IagreeCheckbox;	
	@FindBy(xpath="//button[@id='checkout']") WebElement CheckoutButton;	
	@FindBy(xpath="//form/table/tbody/tr[4]/td[5]/input") WebElement Quantity;	
	
	public void clickOnRemoveItem() {
		 RemoveItem.click();
	}	
	public void clickOnUpdateCart() {
		 UpdateCart.click();
		 }	
	public void clickOnIagreeCheckbox() {
		 IagreeCheckbox.click();
	}	
	public void clickOnCheckoutButton() {
		 CheckoutButton.click();
	}
	public void setQuantity() {
		 Quantity.sendKeys("2");
	}
	
}
