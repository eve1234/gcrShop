package com.gcrShopAdmin.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gcrShop.onlineAdminUser.qa.pages.AdminHomePage;
import com.gcrShop.qa.base.TestBase;
import com.gcrShop.qa.util.TestUtil;

public class AdminHomeTest extends TestBase{
	
	AdminHomePage adminHomePage;
	TestUtil testUtil;
	
	
	String webs="url";
	
	public AdminHomeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization(webs);
		adminHomePage = new AdminHomePage();
		testUtil = new TestUtil();
		
		
		
	}
	
	@Test(priority=1)
	public void onlineCatalogLinkTest() {
		
		adminHomePage.onlineCatalogLink();
	}
	
	@Test(priority=2)
	public void categoriesOrProductsLinkTest() {
		
		adminHomePage.categoriesOrProductsLink();
	}
/*	
	@Test(priority=3)
	public void manufacturersLinkTest() {
		
		adminHomePage.manufacturersLink();
	}
	
	@Test(priority=4)
	public void reviewsLinkTest() {
		
		adminHomePage.reviewsLink();
	}
	
	@Test(priority=5)
	public void customers1stLinkTest() {
		
		adminHomePage.customers1stLink();
	}
	
	@Test(priority=6)
	public void customers2ndLinkTest() {
		
		adminHomePage.customers2ndLink();
	}
	
	@Test(priority=7)
	public void ordersLinkTest() {
		
		adminHomePage.ordersLink();
	}
	
	@Test(priority=8)
	public void localizationLinkTest() {
		
		adminHomePage.localizationLink();
	}
	
	@Test(priority=9)
	public void currenciesLinkTest() {
		
		adminHomePage.currenciesLink();
	}
	
	@Test(priority=10)
	public void ordersStatusLinkTest() {
		
		adminHomePage.ordersStatusLink();
	}
	
	@Test(priority=11)
	public void reportsLinkTest() {
		
		adminHomePage.reportsLink();
	}
	
	@Test(priority=12)
	public void productsViewedLinkTest() {
		
		adminHomePage.productsViewedLink();
	}
	
	@Test(priority=13)
	public void productsPurchasedLinkTest() {
		
		adminHomePage.productsPurchasedLink();
	}
	
	@Test(priority=14)
	public void customerOrdersTotalLinkTest() {
		
		adminHomePage.customerOrdersTotalLink();
	}
	*/
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
