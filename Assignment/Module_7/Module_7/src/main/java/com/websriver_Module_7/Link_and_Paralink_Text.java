package com.websriver_Module_7;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Link_and_Paralink_Text {

	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://para.testar.org/parabank/index.html");
	   
	   driver.manage().window().maximize();
	   
	   Thread.sleep(2000);
	   driver.findElement(By.partialLinkText("About Us")).click();
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.linkText("Register")).click();
	   
	   Thread.sleep(2000);
	   
	   driver.quit();

	}

}
