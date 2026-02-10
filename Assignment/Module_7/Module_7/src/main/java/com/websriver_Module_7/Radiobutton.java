package com.websriver_Module_7;


import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
	  List<WebElement> radioButtons = driver.findElements(By.name("radiooptions"));
	  
     for(int i=0;i<2;i++) {
            radioButtons.get(i).click();
    	 
            Thread.sleep(2000);
     }
     Thread.sleep(2000);
     
     driver.quit();
	}
}
