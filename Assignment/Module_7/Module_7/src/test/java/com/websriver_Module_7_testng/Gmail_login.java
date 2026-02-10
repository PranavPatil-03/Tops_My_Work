package com.websriver_Module_7_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail_login {
  
	  WebDriver driver;
	    WebDriverWait wait;

	    @BeforeTest
	    public void set_Up() {
	     
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        
	        driver.get("https://accounts.google.com/");
	    }

	    @Test
	    public void testGmailLogin() throws InterruptedException {

	      
	        driver.findElement(By.id("identifierId")).sendKeys("testuser@gmail.com");

	      Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[text()='Next']")).click();

	       
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));

	      
	        driver.findElement(By.name("Passwd")).sendKeys("testpassword");

	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[text()='Next']")).click();

	        
	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertTrue(currentUrl.contains("google"));
	    }

	    @AfterTest
	    public void close_tab() {
	     
	        driver.quit();
	    }
}