package com.websriver_Module_7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));

		Thread.sleep(2000);

		Actions a1 = new Actions(driver);

		a1.moveToElement(ele).perform();

		Thread.sleep(2000);

	     driver.findElement(By.xpath("//a[normalize-space()='Alerts']")).click();

		Thread.sleep(2000);
		
		 
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

        // Switch to alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText()); 
        alert.accept(); 
        
        Thread.sleep(2000);
        
        
        driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(2000);
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(2000);
        //alert1.dismiss(); 
         alert1.accept();

        
        Thread.sleep(2000);
        
        
        driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        
        Thread.sleep(2000);
        
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert3.sendKeys("Pranav");
        Thread.sleep(2000);
        alert3.accept();
        
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
