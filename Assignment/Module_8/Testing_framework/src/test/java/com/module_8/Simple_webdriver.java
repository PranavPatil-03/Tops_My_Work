package com.module_8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simple_webdriver {

  @Test
  public void openBrowser() throws InterruptedException {
     
      WebDriver driver = new ChromeDriver();

     
      driver.manage().window().maximize();

      
      driver.get("https://www.google.com");

    
      Thread.sleep(3000);

     
      driver.quit();
  }
}
