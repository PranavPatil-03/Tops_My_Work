package com.websriver_Module_7_junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class FacebookLoginParameterizedTest {

	 WebDriver driver;

	    
	    String username;
	    String password;

	   
	    public FacebookLoginParameterizedTest(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }

	   
	    @Parameters
	    public static Collection<Object[]> testData() {
	        return Arrays.asList(new Object[][] {
	            {"testuser1@gmail.com", "password1"},
	            {"testuser2@gmail.com", "password2"},
	            {"testuser3@gmail.com", "password3"}
	        });
	    }

	    @Before
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	    }

	    @Test
	    public void testFacebookLogin() throws InterruptedException {

	        driver.findElement(By.id("email")).sendKeys(username);
	        Thread.sleep(2000); 
	        driver.findElement(By.id("pass")).sendKeys(password);
	        Thread.sleep(2000); 
	        driver.findElement(By.name("login")).click();

	        Thread.sleep(3000); 
	       
	        String title = driver.getTitle();
	        Assert.assertTrue(title.contains("Facebook"));
	    }

	    @After
	    public void closeBroweser() {
	        driver.close();
	    }
}
