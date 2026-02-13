package com.module_8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Simple_Junit {
	WebDriver driver;

    @BeforeEach
    public void open_Browser() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void open_Website() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(3000);
    }

    @AfterEach
    public void close_Browser() {
        driver.quit();
    }
}
