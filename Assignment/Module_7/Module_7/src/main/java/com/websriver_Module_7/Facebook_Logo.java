package com.websriver_Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Logo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); 
		
		driver.manage().window().maximize();
		
		 WebElement fbLogo = driver.findElement(
	                By.xpath("//img[contains(@class,'fb_logo')]"));
		System.out.println(fbLogo.getAccessibleName());
		 
	  driver.quit();

	}

}
