package com.websriver_Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Self_gmail {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
    driver.get("https://accounts.google.com/signup");
    driver.manage().window().maximize();
    driver.findElement(By.id("firstName")).sendKeys("Pranav");
    Thread.sleep(3000);
    driver.findElement(By.id("lastName")).sendKeys("Patil");
    Thread.sleep(3000);
    driver.findElement(By.className("VfPpkd-vQzf8d")).click();
    Thread.sleep(3000);
    
        WebElement dropdown=driver.findElement(By.className("VfPpkd-aPP78e"));
	   Select s1=new Select(dropdown);
	 
		 s1.selectByVisibleText("May");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("day")).sendKeys("7");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("year")).sendKeys("2000");
		 Thread.sleep(3000);
		
		 WebElement dropdown1=driver.findElement(By.xpath("//div[@aria-label='Month']"));
		   Select s2=new Select(dropdown1);
		 
			// s2.selectByVisibleText("Male").click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.className("VfPpkd-vQzf8d")).click();
			 Thread.sleep(2000);
    
	 
    driver.findElement(By.id("username")).sendKeys("pranav.patil12345");
    Thread.sleep(3000);
    driver.findElement(By.name("Passwd")).sendKeys("Test@12345");
    Thread.sleep(3000);
    driver.findElement(By.name("ConfirmPasswd")).sendKeys("Test@12345");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    

    Thread.sleep(5000);
driver.quit();


	}
}

