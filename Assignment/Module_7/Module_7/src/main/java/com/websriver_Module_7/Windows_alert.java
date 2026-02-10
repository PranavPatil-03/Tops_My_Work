package com.websriver_Module_7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
	    Alert a1=driver.switchTo().alert();
	    System.out.println(a1.getText());
	    a1.accept();
	    Thread.sleep(2000);
       driver.quit();


	}

}
