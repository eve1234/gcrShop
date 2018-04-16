package com.gcrShopAdmin.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Admin {
	
	WebDriver driver ;
	  @BeforeMethod
	  public void launchBrowser() {
		  //System.setProperty("webDriver.chrome.driver", "/Users/yvonneak/Documents/webDrivers/chromedriver.exe");
	  
		 driver =new ChromeDriver();
	  
	  }
	  
	  
	  @Test(priority=1)
	  public void launhApplication(){
		  driver.get("http://www.gcrit.com/build3/admin");
	  
	  AssertJUnit.assertEquals("GCR Shop", driver.getTitle());
	  }
	  
	  @Test(priority=2)
	  public void verifyElements(){
		  driver.get("http://www.gcrit.com/build3/admin");
		  AssertJUnit.assertEquals(true, driver.findElement(By.name("username")).isDisplayed());
		  AssertJUnit.assertEquals(true, driver.findElement(By.name("password")).isDisplayed());
		  AssertJUnit.assertEquals(true, driver.findElement(By.id("tdb1")).isDisplayed());
	  }
	  
	  @Test(priority=3)
	  public void redirection(){
		  driver.get("http://www.gcrit.com/build3/admin");
		  driver.findElement(By.linkText("Online Catalog")).click();
		  String url=driver.getCurrentUrl();
		  AssertJUnit.assertEquals("http://www.gcrit.com/build3/", url);
	  }
	  
	  @Test(priority=4)
	  public void adminLogin(){
		  driver.get("http://www.gcrit.com/build3/admin");
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("password")).sendKeys("admin@123");
		  driver.findElement(By.id("tdb1")).click();
		  AssertJUnit.assertEquals("http://www.gcrit.com/build3/admin/index.php", driver.getCurrentUrl());
	  }
	  
	  @AfterMethod
	  public void closeBrowser(){
		  driver.close();
	  }

}
