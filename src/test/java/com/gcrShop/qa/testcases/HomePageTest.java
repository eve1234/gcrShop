package com.gcrShop.qa.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gcrShop.onlineUser.qa.pages.HomePage;
import com.gcrShop.qa.base.TestBase;

public class HomePageTest extends TestBase{
	
	String webs="url2";
	String pageTitle;
	
	HomePage homePage;
	
	public HomePageTest() {
		
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization(webs);
		homePage = new HomePage();
		
		String pageTitle=driver.getTitle();
		AssertJUnit.assertEquals("GCR Shop", driver.getTitle());
	}
	
	@Test
	public void runPage() {
		
	}
	
	@AfterMethod
	public void tearDown() {
		
	}
	
	

}
