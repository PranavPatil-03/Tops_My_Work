package com.websriver_Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		   WebElement dropdown=driver.findElement(By.id("country"));
		   Select s1=new Select(dropdown);
		 for (int i = 0; i < 9; i++) {
			 s1.selectByIndex(i);
			String name= s1.getFirstSelectedOption().getText();
			System.out.println(name);
		}
		   driver.quit();

	}

}
