package com.websriver_Module_7_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebook_Login_multiple_parameter {
	WebDriver driver;

	@BeforeMethod
	public void open_Browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Test(dataProvider = "loginData")
	public void testFacebookLogin(String username, String password) throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();

		Thread.sleep(3000); 

		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Facebook"));
	}

	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {
		return new Object[][] { { "testuser1@gmail.com", "password1" }, { "testuser2@gmail.com", "password2" },
				{ "testuser3@gmail.com", "password3" } };
	}

	@AfterMethod
	public void close_tab() {
		driver.quit();
	}
}
