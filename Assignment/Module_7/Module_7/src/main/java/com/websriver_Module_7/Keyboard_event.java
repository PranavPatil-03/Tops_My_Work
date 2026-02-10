package com.websriver_Module_7;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_event {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		Actions a1=new Actions(driver);
		
		a1.moveToElement(fname).click()
		.keyDown(fname,Keys.SHIFT)
		.sendKeys("Pranav")
		.keyUp(fname,Keys.SHIFT);

         a1.perform();
		
         Thread.sleep(2000);
         
         WebElement lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
 		
 		Actions a2=new Actions(driver);
 		
 		a2.moveToElement(lname).click()
 		.keyDown(lname,Keys.SHIFT)
 		.sendKeys("Patil")
 		.keyUp(lname,Keys.SHIFT);

          a2.perform();
          Thread.sleep(2000);
         
         driver.quit();
		
	}

}
