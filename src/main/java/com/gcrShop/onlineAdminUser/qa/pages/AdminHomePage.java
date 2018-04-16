package com.gcrShop.onlineAdminUser.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gcrShop.qa.base.TestBase;

public class AdminHomePage extends TestBase{
	
	@FindBy(linkText="Online Catalog")
	WebElement onlineCatalogLink;
	
	@FindBy(xpath="//a[contains(text(),'Categories/Products')]")
	WebElement categoriesOrProductsLink;
	
	@FindBy(xpath="//a[contains(text(),'Manufacturers')]")
	WebElement manufacturersLink;
	
	@FindBy(xpath="//a[contains(text(),'Reviews')]")
	WebElement reviewsLink;
	
	
	@FindBy(xpath="//h3/a[text()='Customers']")
	WebElement customers1stLink;
	
	@FindBy(xpath="//li/a[text()='Customers']")
	WebElement customers2ndLink;
	
	@FindBy(xpath="//li/a[text()='Orders']")
	WebElement ordersLink;
	
	
	@FindBy(xpath="//h3/a[text()='Localization']")
	WebElement localizationLink;
	
	@FindBy(xpath="//li/a[text()='Currencies']")
	WebElement currenciesLink;
	
	@FindBy(xpath="//li/a[text()='Orders Status']")
	WebElement ordersStatusLink;
	
	
	@FindBy(xpath="//h3/a[text()='Reports']")
	WebElement reportsLink;
	
	@FindBy(xpath="//li/a[text()='Products Viewed']")
	WebElement productsViewedLink;
	
	@FindBy(xpath="//li/a[text()='Products Purchased']")
	WebElement productsPurchasedLink;
	
	@FindBy(xpath="//li/a[text()='Customer Orders-Total']")
	WebElement customerOrdersTotalLink;
	
	Actions action;
	
	
	
	public AdminHomePage() {
		
		PageFactory.initElements(driver, this);
		//super();
	}
	
	public AdminHomePage onlineCatalogLink() {
		
		
		
		onlineCatalogLink.click();
		return new AdminHomePage();
		
	}
	
	public AdminHomePage categoriesOrProductsLink() {
		
		action = new Actions(driver);
				
		action.moveToElement(onlineCatalogLink).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		//what for the clickable element to appear otherwise, element not visible error
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Categories/Products')]")));
		//categoriesOrProductsLink.c
		categoriesOrProductsLink.click();
		return new AdminHomePage();
			
		}
	
	/*public AdminHomePage manufacturersLink() {
		
		manufacturersLink.click();
		return new AdminHomePage();
		
	}
	
	public AdminHomePage reviewsLink() {
			
		reviewsLink.click();
		return new AdminHomePage();
			
	}
	
	public AdminHomePage customers1stLink() {
		
		customers1stLink.click();
		
		return new AdminHomePage();
	}
	
	public AdminHomePage customers2ndLink() {
			
			customers2ndLink.click();
			return new AdminHomePage();
				
		}
	
	
	public AdminHomePage ordersLink() {
		
		ordersLink.click();
		return new AdminHomePage();
			
	}
	
	public AdminHomePage localizationLink() {
			
		localizationLink.click();
		return new AdminHomePage();
				
	}
	
	public AdminHomePage currenciesLink() {
		
		currenciesLink.click();
		return new AdminHomePage();
				
	}
	
	public AdminHomePage ordersStatusLink() {
			
			ordersStatusLink.click();
			return new AdminHomePage();
					
		}
	
	public AdminHomePage reportsLink() {
		
		reportsLink.click();
		return new AdminHomePage();
				
	}
	
	public AdminHomePage productsViewedLink() {
			
		productsViewedLink.click();
		return new AdminHomePage();
					
		}
	
	public AdminHomePage productsPurchasedLink() {
		
		productsPurchasedLink.click();
		return new AdminHomePage();
					
		}
	
	public AdminHomePage customerOrdersTotalLink() {
		
		customerOrdersTotalLink.click();
		return new AdminHomePage();
					
	}
		*/
	
}
