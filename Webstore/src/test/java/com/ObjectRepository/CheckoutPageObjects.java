package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DataProvider.ExcelDataProvider;

public class CheckoutPageObjects {
	WebDriver driver;
	ExcelDataProvider excelprovider = new ExcelDataProvider();
	public CheckoutPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	// Billing Address Objects
	
	@FindBy(xpath="//select[@id='billing-address-select']") WebElement SelectBillingAddress;	//Auto filled no need
	@FindBy(xpath="//input[@id='BillingNewAddress_FirstName']") WebElement FirstName;
	@FindBy(xpath="//input[@id='BillingNewAddress_LastName']") WebElement Lastname;	//Auto filled no need
	@FindBy(xpath="//input[@id='BillingNewAddress_Email']") WebElement Email;	//Auto filled no need
	@FindBy(xpath="//input[@id='BillingNewAddress_Company']") WebElement Company;	//Optional
	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']") WebElement CountryDropdown;	//Dropdown
	@FindAll({@FindBy(tagName="option")}) List<WebElement> Countries;	//Dropdown
	@FindBy(xpath="//input[@id='BillingNewAddress_StateProvinceId']") WebElement State;	//Auto filled no need
	@FindBy(xpath="//input[@id='BillingNewAddress_City']") WebElement City;	
	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']") WebElement Address1;	
	@FindBy(xpath="//input[@id='BillingNewAddress_Address2']") WebElement Address2;	//Optional
	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']") WebElement Zipcode;	
	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']") WebElement PhoneNo;	
	@FindBy(xpath="//input[@id='BillingNewAddress_FaxNumber']") WebElement FaxNo;	//Optional
	@FindBy(xpath="//div[@id='billing-buttons-container']//input") WebElement BillingContinueBtn;	
	@FindBy(xpath="//select[@id='shipping-address-select']") WebElement SelectAddress;	//Auto filled no need
	@FindBy(xpath="//div[@class='section pickup-in-store']//input[@id='PickUpInStore']") WebElement InStoreCheckbox;	//Checkbox
	@FindBy(xpath="//div[@id='shipping-buttons-container']//a") WebElement ShippingBackBtn;	
	@FindBy(xpath="//div[@id='shipping-buttons-container']//input") WebElement ShippingContinueBtn;	
	@FindBy(xpath="//div[@class='method-name']//input[@id='shippingoption_0']") WebElement ShipMethod;	//Radio
	@FindBy(xpath="//div[@id='shipping-method-buttons-container']//a") WebElement ShippingMethodBackBtn;	
	@FindBy(xpath="//div[@id='shipping-method-buttons-container']//input") WebElement ShippingMethodContinueBtn;	
	@FindBy(xpath="//input[@id='paymentmethod_2']") WebElement SelectPayMode;	
	@FindBy(xpath="//div[@id='payment-method-buttons-container']//a") WebElement PaymentMethodBackBtn;	
	@FindBy(xpath="//div[@id='payment-method-buttons-container']//input") WebElement PaymentMethodContinueBtn;	
	@FindBy(xpath="//select[@id='CreditCardType']") WebElement SelectCardType;	//Dropdown
	@FindBy(xpath="//input[@id='CardholderName']") WebElement CardHolderName;	
	@FindBy(xpath="//input[@id='CardNumber']") WebElement CardNumber;	
	@FindBy(xpath="//select[@id='ExpireMonth']") WebElement ExpireMonth;	//Dropdown
	@FindBy(xpath="//select[@id='ExpireYear']") WebElement ExpireYear;	//Dropdown
	@FindBy(xpath="//input[@id='CardCode']") WebElement CardCode;	
	@FindBy(xpath="//div[@id='payment-info-buttons-container']//a") WebElement PayInfoBackBtn;	
	@FindBy(xpath="//div[@id='payment-info-buttons-container']//input") WebElement PayInfoContinueBtn;	
	@FindBy(xpath="//div[@id='confirm-order-buttons-container']//a") WebElement ConfirmBackBtn;	
	@FindBy(xpath="//div[@id='confirm-order-buttons-container']//input") WebElement ConfirmContinueBtn;	
	
	
	public WebElement SelectBillingAddress() {
		 return SelectBillingAddress;
	}
	/*
		//Auto filled no need
	public WebElement FirstName() {
		 FirstName;
	}	
	public WebElement Lastname() {//Auto filled no need
		 Lastname;
	}	
	public WebElement Email() {//Auto filled no need
		 Email;
	}	
	public WebElement Company() { //Optional
		 Company;
	}
	*/
	public WebElement CountryDropdown() {
		return CountryDropdown;
	}	
	// Countries List
	public List<WebElement> Countries() {
		return Countries;
	}
	public WebElement State() { //Auto filled no need
		return State;
	}
	public void setCity() {
		 City.sendKeys(excelprovider.getCity());
	}
	public void setAddress1() {
		 Address1.sendKeys(excelprovider.getAddress1());
	}
	public void setAddress2() {
		
	}
	public void setZipcode() {
		 Zipcode.sendKeys(excelprovider.getZipcode());
	}
	public void setPhoneNo() {
		 PhoneNo.sendKeys(excelprovider.getPhoneNo());
	}
	public WebElement setFaxNo() {
		return FaxNo;
	}
	public void clickonBillingContinueBtn() {
		 BillingContinueBtn.click();
	}	
	//Shipping Address WebElements
	
	public void SelectAddress() {
		 
	}	
	public void clickonInStoreCheckbox() {
		 InStoreCheckbox.click();
	}
	public void clickOnShippingBackBtn() {
		 ShippingBackBtn.click();
	}
	public void clickOnShippingContinue() {
		 ShippingContinueBtn.click();
	}
	
	//Shipping Method WebElements

	public void clickOnShipMethod() {
		 ShipMethod.click();
	}
	public void clickOnShippingMethodBackBtn() {
		 ShippingMethodBackBtn.click();
	}
	public void clickOnShippingMethodContinueBtn() {
		 ShippingMethodContinueBtn.click();
	}
	
	//Payment Method WebElements
	
	public void clickOnSelectPayMode() {
		 SelectPayMode.click();
	}
	public void clickOnPaymentMethodBackBtn() {
		 PaymentMethodBackBtn.click();
	}
	public void clickOnPaymentMethodContinueBtn() {
		 PaymentMethodContinueBtn.click();
	}
	
	//Payment Information WebElements
	
	public WebElement SelectCardType() {
		return SelectCardType;
	}
	public void setCardHolderName() {
		 CardHolderName.sendKeys(excelprovider.getCardHolderName());
	}
	public void setCardNumber() {
		 CardNumber.sendKeys(excelprovider.getCardNo());
	}
	public WebElement ExpireMonth() {
		return ExpireMonth;
	}
	public WebElement ExpireYear() {
		return ExpireYear;
	}
	public void setCardCode() {
		 CardCode.sendKeys(excelprovider.getCardcode());
	}
	public void clickOnPayInfoBackBtn() {
		 PayInfoBackBtn.click();
	}
	public void clickOnPayInfoContinueBtn() {
		 PayInfoContinueBtn.click();
	}
	
	//ConfirmOrder WebElements
	
	public void clickOnConfirmBackBtn() {
		 ConfirmBackBtn.click();
	}
	public void clickOnConfirmContinueBtn() {
		 ConfirmContinueBtn.click();
	}
	/*
	@FindBy(xpath="") WebElement ;	
	public void () {
		 ;
	}
	*/
	
	
}
