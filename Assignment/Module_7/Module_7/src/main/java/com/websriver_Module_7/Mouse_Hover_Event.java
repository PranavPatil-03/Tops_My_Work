package com.websriver_Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Event {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//a[normalize-space()='Widgets']"));
		
		Thread.sleep(2000);
		
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(ele).perform();
		
		Thread.sleep(2000);
		
		
        WebElement ele1=driver.findElement(By.xpath("//a[normalize-space()='AutoComplete']"));
		
		Thread.sleep(2000);
		
		Actions a2 = new Actions(driver);
		
		a2.moveToElement(ele1).perform();

        driver.quit();
	}

}
