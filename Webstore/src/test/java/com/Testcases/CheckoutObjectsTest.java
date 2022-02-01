package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.ObjectRepository.CheckoutPageObjects;

public class CheckoutObjectsTest{
	WebDriver driver;
	
	public CheckoutObjectsTest(WebDriver driver) {
		this.driver = driver;
	}		
	//@Test
	public void checkoutTest() throws Exception {
		System.out.println("Checkout Test Entered");
		CheckoutPageObjects checkoutObj = new CheckoutPageObjects(driver);
		
		// 1.Billing
		
		/*
		checkoutObj.CountryDropdown().sendKeys("ind");
		for(WebElement country: checkoutObj.Countries()) {
			   if(country.getText().equalsIgnoreCase("india")) {
			    country.click();
			    break;
			   } 
		}*/
		
		/*
		Select selectBillAdd = new Select(checkoutObj.SelectBillingAddress());  
		selectBillAdd.selectByVisibleText("New Address");
		*/
		Select selectCountry = new Select(checkoutObj.CountryDropdown());  
		selectCountry.selectByVisibleText("India");						
		checkoutObj.setCity();		
		checkoutObj.setAddress1();				
		checkoutObj.setZipcode();	
		checkoutObj.setPhoneNo();		
		checkoutObj.clickonBillingContinueBtn();
		
		// 2.  ShippingContinue		
		checkoutObj.clickOnShippingContinue();

		// 3. 	ShippingMethod		
		checkoutObj.clickOnShipMethod();	
		checkoutObj.clickOnShippingMethodContinueBtn();
		
		//4. 	Payment Mode 		
		checkoutObj.clickOnSelectPayMode();		
		checkoutObj.clickOnPaymentMethodContinueBtn();
		
		// 5.Payment Details		
		Select selectCardType= new Select(checkoutObj.SelectCardType());  
		selectCardType.selectByVisibleText("Visa");						
		checkoutObj.setCardHolderName();
		checkoutObj.setCardNumber();	
		Select selectExpireMonth = new Select(checkoutObj.ExpireMonth());  
		selectExpireMonth.selectByVisibleText("05");		
		Select selectExpireYear = new Select(checkoutObj.ExpireYear());  
		selectExpireYear.selectByVisibleText("2025");		
		checkoutObj.setCardCode();	
		checkoutObj.clickOnPayInfoContinueBtn();
		
		//6. 	Confirm Order		
		checkoutObj.clickOnConfirmContinueBtn();
			
	}
	
}
