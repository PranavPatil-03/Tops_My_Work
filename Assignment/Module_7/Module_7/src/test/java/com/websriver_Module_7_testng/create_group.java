package com.websriver_Module_7_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class  create_group {
	 WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test(groups = {"smoke"})
	    public void openFacebookTest() {
	        driver.get("https://www.facebook.com/");
	        Assert.assertTrue(driver.getTitle().contains("Facebook"));
	    }

	    @Test(groups = {"regression"})
	    public void openGoogleTest() {
	        driver.get("https://www.google.com/");
	        Assert.assertTrue(driver.getTitle().contains("Google"));
	    }

	    @Test(groups = {"smoke", "regression"})
	    public void openGmailTest() {
	        driver.get("https://accounts.google.com/");
	        Assert.assertTrue(driver.getTitle().contains("Google"));
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
 
  }

