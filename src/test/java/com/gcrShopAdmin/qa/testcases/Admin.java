package com.gcrShopAdmin.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Admin {
	WebDriver driver ;
  @Test(priority=1)
  public void launchBrowser() {
	 //System.setProperty("webDriver.chrome.driver", "/Users/yvonneak/Documents/webDrivers/chromedriver.exe");
  
	 driver =new ChromeDriver();
  
  }
  @Test(priority=2)
  public void closeBrowser(){
	  driver.close();
  }
  
  @Test(priority=2)
  public void launhApplication(){
	  driver.get("http://www.gcrit.com/build3/admin");
  
  Assert.assertEquals("GCR Shop", driver.getTitle());
  }
}
