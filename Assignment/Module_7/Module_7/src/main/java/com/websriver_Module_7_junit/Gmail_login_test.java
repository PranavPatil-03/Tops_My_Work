package com.websriver_Module_7_junit;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_login_test {

	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void setUp() {

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

		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
