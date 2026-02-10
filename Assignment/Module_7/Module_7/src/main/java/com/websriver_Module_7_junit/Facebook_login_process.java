package com.websriver_Module_7_junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_process {
	WebDriver driver;
	
	@Before
	public void Browser_setup() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
	}
	
	@Test
	public void faceboot_test() throws InterruptedException {
		
		 driver.findElement(By.id("email")).sendKeys("testuser@gmail.com");
Thread.sleep(2000);
  
   driver.findElement(By.id("pass")).sendKeys("testpassword");

   Thread.sleep(2000);
   driver.findElement(By.name("login")).click();

   Thread.sleep(3000); 


   String actual_Title = driver.getTitle();
   String expected_Title = "Facebook";

   Assert.assertTrue(actual_Title.contains(expected_Title));
		
	}
	
	@After
	public void close_Browser() {
		driver.close();
	}

}
