package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductsPageObjects {
	WebDriver driver;
	public AddProductsPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(css="div.page-body > div.product-grid > div:nth-child(1) > div > div.details > div.add-info > div.buttons > input") WebElement BookProduct;	
	@FindBy(css=" div.page-body > div.sub-category-grid > div:nth-child(1) > div > h2 > a") WebElement ComputerClick;	
	@FindBy(css=" div.product-grid > div:nth-child(1) > div > div.details > div.add-info > div.buttons > input[type='button']") WebElement DesktopClick;	
	@FindBy(css="#add-to-cart-button-72") WebElement ComputerProduct;	
	@FindBy(xpath ="//img[@alt='Picture for category Cell phones']") WebElement PhonesClick;	
	@FindBy(css=" div.page-body > div.product-grid > div:nth-child(1) > div > div.details > div.add-info > div.buttons > input") WebElement ElectronicsProduct;	
	@FindBy(css=" div.page-body > div.product-grid > div:nth-child(1) > div > div.details > div.add-info > div.buttons > input") WebElement ApparelClick;	
	@FindBy(xpath="//*[@class='button-1 add-to-cart-button'][@id='add-to-cart-button-5'][@type='button']") WebElement ApparelProduct;	////*[@class='button-1 add-to-cart-button']			"//input[@id='add-to-cart-button-5']"
	@FindBy(css=" div.page-body > div.product-grid > div:nth-child(2) > div > div.details > div.add-info > div.buttons > input") WebElement DigitalDownloadProduct;	
	@FindBy(css=" div.page-body > div.product-grid > div:nth-child(2) > div > div.details > div.add-info > div.buttons > input") WebElement jewelryProduct;	
	@FindBy(xpath="") WebElement GiftCardProduct;	
	
	public void clickOnBookProduct() {
		 BookProduct.click();
	}		
	public void clickOnComputerClick() {
		 ComputerClick.click();
	}	
	public void clickOnDesktopCategory() {
		 DesktopClick.click();
	}	
	public void clickOnComputerProduct() {
		 ComputerProduct.click();
	}
	public void clickOnPhonesCat() {
		 PhonesClick.click();
	}	
	public void clickOnElectronicsProduct() {
		 ElectronicsProduct.click();
	}		
	public void clickOnApparelShoesCat() {
		 ApparelClick.click();
	}	
	public void clickOnApparelProduct() {
		 ApparelProduct.click();
	}	
	public void clickOnDigitalDownloadProduct() {
		 DigitalDownloadProduct.click();
	}	
	public void clickOnjewelryProduct() {
		 jewelryProduct.click();
	}
	public void clickOnGiftCardProduct() {
		 GiftCardProduct.click();
	}
}
