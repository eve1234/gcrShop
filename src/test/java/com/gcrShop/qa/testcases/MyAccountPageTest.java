package com.gcrShop.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gcrShop.onlineUser.qa.pages.HomePage;
import com.gcrShop.onlineUser.qa.pages.MyAccountPage;
import com.gcrShop.qa.base.TestBase;
import com.gcrShop.qa.util.TestUtil;

public class MyAccountPageTest extends TestBase {
	
	String webs="url2";
	String sheetName = "createAcct";
	TestUtil testUtil;
	Logger log= Logger.getLogger(MyAccountPageTest.class);
	
	MyAccountPage myAccountPage;
	HomePage homePage;
	
	public MyAccountPageTest(){
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization(webs);
		homePage= new HomePage();
		
		
		myAccountPage = new MyAccountPage();
		testUtil = new TestUtil();
		
		Thread.sleep(2000);
		
		homePage.myAccountLink();
		
		homePage.continueLink();
		
		
	}
	
	@DataProvider
	public Object[][] getUserData(){
		Object [][] data = TestUtil.getTestData(sheetName);
		
		return data;
	}
	
	/*@Test(priority=1)
	public void testme() {
		
	}*/
	
	@Test(priority=1, dataProvider="getUserData")
	public void customerRegistrationTest(String fName, String lName, String dOfb, String eAdds, String stAdds, String ptcode, String aCity, String cState, String cotry, String tphone, String pwd, String confirm) {
		 //log.info("************ Performaning data Driven test ******************" );
		
		
		
		myAccountPage.customerRegistration(fName, lName, dOfb, eAdds, stAdds, ptcode, aCity, cState, cotry, tphone, pwd, confirm);
	
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
		
	}

}
