package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	WebDriver driver;
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}

	//xpath="//div[@class='header-links']//a[@class='ico-register']"
	@FindBy(css=" div.header-links > ul > li:nth-child(1) > a.ico-register") WebElement Register;	
	//xpath="//div[@class='header-links']//a[@class='ico-login']"
	@FindBy(css=" div.header-links > ul > li > a.ico-login") WebElement LogIn;		
	@FindBy(css=" div.header-links > ul > li > a.ico-logout") WebElement Logout;	
	//xpath="//div[@class='header-links']//a[@class='ico-cart']"
	@FindBy(css=" div.header-links > ul > li > a.ico-cart") WebElement ShoppingCart;	
	//xpath="//div[@class='header-links']//a[@class='ico-wishlist']"
	@FindBy(css=" div.header-links > ul > li > a.ico-wishlist") WebElement Wishlist;	
	//xpath="//div[@class='search-box']//input[@type='text']"
	@FindBy(css="input.search-box-text") WebElement SearchBox;	
	//xpath="//div[@class='search-box']//input[@type='submit']"
	@FindBy(css="input.search-box-button") WebElement SearchBtn;	
	@FindBy(css="ul.top-menu > li:nth-child(1) > a") WebElement Books;	
	@FindBy(css="ul.top-menu > li:nth-child(2) > a") WebElement Computers;	
	@FindBy(css="ul.top-menu > li:nth-child(3) > a") WebElement Electronics;	
	@FindBy(css="ul.top-menu > li:nth-child(4) > a") WebElement ApparelShoes;	
	@FindBy(css="ul.top-menu > li:nth-child(5) > a") WebElement DigitalDownloads;	
	@FindBy(css="ul.top-menu > li:nth-child(6) > a") WebElement Jewelry;	
	@FindBy(css="ul.top-menu > li:nth-child(7) > a") WebElement GiftCard;	

	public void ClickonRegister() {
		Register.click();
	}
	
	public void ClickonLogIn() {
		LogIn.click();
	}
	public void ClickonLogout() {
		Logout.click();
	}
	public void ClickonShoppingCart() {
		ShoppingCart.click();
	}

	public void ClickonWishlist() {
		Wishlist.click();
	}

	public void ClickonSearchBox() {
		SearchBox.click();
	}
	public void ClickonSearchBtn() {
		SearchBtn.click();
	}
	public void ClickonBooks() {
		Books.click();
	}
	public void ClickonComputers() {
		Computers.click();
	}

	public void ClickonElectronics() {
		Electronics.click();
	}
	public void ClickonApparelShoes() {
		ApparelShoes.click();
	}

	public void ClickonDigitalDownloads() {
		DigitalDownloads.click();
	}

	public void ClickonJewelry() {
		Jewelry.click();
	}

	public void ClickonGiftCard() {
		GiftCard.click();
	}


}
