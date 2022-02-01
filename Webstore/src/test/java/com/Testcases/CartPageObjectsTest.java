package com.Testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.ObjectRepository.CartPageObjects;

public class CartPageObjectsTest{
	WebDriver driver;
	
	public CartPageObjectsTest(WebDriver driver) {
		this.driver = driver;
	}		
	public void cartTest() throws Exception {
		System.out.println("cartTest Entered Successfully");
		CartPageObjects cartObj = new CartPageObjects(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//cartObj.clickOnRemoveItem();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//cartObj.clickOnUpdateCart();
		cartObj.setQuantity();
		cartObj.clickOnIagreeCheckbox();
		cartObj.clickOnCheckoutButton();		
	}
		
}
