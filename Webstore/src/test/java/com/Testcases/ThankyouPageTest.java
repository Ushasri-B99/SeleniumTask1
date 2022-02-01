package com.Testcases;

import org.openqa.selenium.WebDriver;
import com.ObjectRepository.ThankYouPageObjects;

public class ThankyouPageTest{
	WebDriver driver;
	
	public ThankyouPageTest(WebDriver driver) {
		this.driver = driver;
	}		
	//@Test
	public String tnqTest() {
		System.out.println("tnqTest Entered");
		
		ThankYouPageObjects tnqObj = new ThankYouPageObjects(driver);
			
		String orderId = tnqObj.GetOrderNumber();		
		tnqObj.ClickonOrderDetailsLink();
		return orderId;
		
	}
	
	
}
