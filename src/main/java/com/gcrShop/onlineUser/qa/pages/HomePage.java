package com.gcrShop.onlineUser.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gcrShop.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement myAccountLink;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	WebElement continueLink;
	
	
	MyAccountPage myAccountPage;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage myAccountLink() {
		myAccountLink.click();
		return new HomePage();
	}
	
	public MyAccountPage  continueLink() {
		continueLink.click();
		return new MyAccountPage();
	}
	
	
	
	
}
