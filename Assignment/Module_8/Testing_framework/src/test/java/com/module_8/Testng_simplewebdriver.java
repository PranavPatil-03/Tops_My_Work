package com.module_8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_simplewebdriver {
	WebDriver driver;

	@BeforeMethod
	public void open_Browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void open_Website() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	}

	@AfterMethod
	public void close_Browser() {
		driver.close();
	}
}
