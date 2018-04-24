package com.gcrShop.onlineUser.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

import com.gcrShop.qa.base.TestBase;

public class MyAccountPage extends TestBase{
	

	
	//@FindBy(name="gender")
	@FindBy(xpath="//td//input[@value='f']")
	WebElement genderRad;
	
	@FindBy(name="firstname")
	WebElement firstName;
	
	@FindBy(name="lastname")
	WebElement lastName;
	
	@FindBy(name="dob")
	WebElement dOB;

	@FindBy(name="email_address")
	WebElement emailAddress;
	
	@FindBy(name="street_address")
	WebElement streetAddress;
	
	@FindBy(name="postcode")
	WebElement postcode;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="telephone")
	WebElement telephone;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmation")
	WebElement confirmation;
	
	@FindBy(id="tdb4")
	WebElement tdb4Btn;
	
	
	
	HomePage homePage;
	
	
	
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	public MyAccountPage customerRegistration(String fName, String lName, String dOfb, String eAdds, String stAdds, String ptcode, String aCity, String cState, String cotry, String tphone, String pwd, String confirm) {
			
		genderRad.click();
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		dOB.sendKeys(dOfb);
		emailAddress.sendKeys(eAdds);
		streetAddress.sendKeys(stAdds);
		postcode.sendKeys(ptcode);
		city.sendKeys(aCity);
		state.sendKeys(cState);
		//country select
		
		Select countryDropDown=new Select(driver.findElement(By.name("country")));
		countryDropDown.selectByVisibleText(cotry);
		
		
		
		telephone.sendKeys(tphone);
		password.sendKeys(pwd);
		
		confirmation.sendKeys(confirm);
		
		tdb4Btn.click();
		
		 AssertJUnit.assertEquals("Your Account Has Been Created!", driver.findElement(By.tagName("h1")).getText());
		 
		
			return new MyAccountPage();
	}
		

}
