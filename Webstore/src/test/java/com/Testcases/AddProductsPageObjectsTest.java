package com.Testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.ObjectRepository.AddProductsPageObjects;
import com.ObjectRepository.HomePageObjects;

public class AddProductsPageObjectsTest{
	WebDriver driver;
	
	public AddProductsPageObjectsTest(WebDriver driver) {
		this.driver = driver;
	}		
	//@Test
	public void addProductTest() throws Exception {	
		
		System.out.println("addProductTest Entered Successfully");		
		HomePageObjects homeObj = new HomePageObjects(driver);						
		AddProductsPageObjects addProductObj = new AddProductsPageObjects(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;		 		
		homeObj.ClickonBooks();		
		//get the height of the webpage and scroll to the end
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");		
		addProductObj.clickOnBookProduct();		
		homeObj.ClickonComputers();		
		addProductObj.clickOnComputerClick();	
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		addProductObj.clickOnDesktopCategory();		
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");		
		addProductObj.clickOnComputerProduct();
				
		homeObj.ClickonElectronics();
		addProductObj.clickOnPhonesCat();
		addProductObj.clickOnElectronicsProduct();
		
		homeObj.ClickonApparelShoes();
		addProductObj.clickOnApparelShoesCat();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		addProductObj.clickOnApparelProduct();
				
		homeObj.ClickonDigitalDownloads();
		addProductObj.clickOnDigitalDownloadProduct();
				
		homeObj.ClickonJewelry();
		addProductObj.clickOnjewelryProduct();		
	}
	
}
