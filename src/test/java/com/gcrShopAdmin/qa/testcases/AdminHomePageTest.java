package com.gcrShopAdmin.qa.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gcrShop.onlineAdminUser.qa.pages.AdminHomePage;
import com.gcrShop.qa.base.TestBase;
import com.gcrShop.qa.util.TestUtil;

public class AdminHomePageTest extends TestBase{
	
	AdminHomePage adminHomePage;
	TestUtil testUtil;
	AdminHomePageTest adminHomePageTest;
	
	
	String webs="url";
	
	public AdminHomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization(webs);
		adminHomePage = new AdminHomePage();
		testUtil = new TestUtil();
		adminHomePage = adminHomePage.login(prop.getProperty("username"), prop.getProperty("password"));
		//loginTest();
		
	}
	
	/*@Test(priority=1)
	public void loginTest() {
		//adminHomePage.login(usName, psswd);
		
		adminHomePage = adminHomePage.login(prop.getProperty("username"), prop.getProperty("password"));
	       	
		
	}*/
	
	@Test(priority=1)
	public void onlineCatalogLinkTest() {
		 AssertJUnit.assertEquals("http://www.gcrit.com/build3/admin/index.php", driver.getCurrentUrl());
		adminHomePage.onlineCatalogLink();
	}
	
	@Test(priority=2)
	public void categoriesOrProductsLinkTest() {
		
		adminHomePage.categoriesOrProductsLink();
	}
	
	@Test(priority=3)
	public void manufacturersLinkTest() {
		
		adminHomePage.manufacturersLink();
	}
	
	@Test(priority=5)
	public void reviewsLinkTest() {
		
		adminHomePage.reviewsLink();
	}
	
	@Test(priority=6)
	public void customers1stLinkTest() {
		
		adminHomePage.customers1stLink();
	}
	
	@Test(priority=7)
	public void customers2ndLinkTest() {
		
		adminHomePage.customers2ndLink();
	}
	
	@Test(priority=8)
	public void ordersLinkTest() {
		
		adminHomePage.ordersLink();
	}
	
	@Test(priority=9)
	public void localizationLinkTest() {
		
		adminHomePage.localizationLink();
	}
	
	@Test(priority=10)
	public void currenciesLinkTest() {
		
		adminHomePage.currenciesLink();
	}
	
	@Test(priority=11)
	public void ordersStatusLinkTest() {
		
		adminHomePage.ordersStatusLink();
	}
	
	@Test(priority=12)
	public void reportsLinkTest() {
		
		adminHomePage.reportsLink();
	}
	
	@Test(priority=13)
	public void productsViewedLinkTest() {
		
		adminHomePage.productsViewedLink();
	}
	
	@Test(priority=14)
	public void productsPurchasedLinkTest() {
		
		adminHomePage.productsPurchasedLink();
	}
	
	@Test(priority=15)
	public void customerOrdersTotalLinkTest() {
		
		adminHomePage.customerOrdersTotalLink();
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
