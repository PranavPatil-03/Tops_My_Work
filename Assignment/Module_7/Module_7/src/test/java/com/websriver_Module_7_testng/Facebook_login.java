package com.websriver_Module_7_testng;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_login {
	
	 WebDriver driver;

	@BeforeMethod
    public void setUp() {
      
        driver = new ChromeDriver();
        driver.manage().window().maximize();

       
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void testFacebookLogin() throws InterruptedException {

        
        driver.findElement(By.id("email")).sendKeys("testuser@gmail.com");
        Thread.sleep(3000); 
       
        driver.findElement(By.id("pass")).sendKeys("testpassword");
        Thread.sleep(3000); 
       
        driver.findElement(By.name("login")).click();

        Thread.sleep(3000); 

        
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Facebook"));
    }

    @AfterMethod
    public void tearDown() {
       driver.close();
    }
}
