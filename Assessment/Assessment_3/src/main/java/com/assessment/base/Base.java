package com.assessment.base;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;

import com.assessment.util.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {

    protected WebDriver driver;
    protected static ExtentReports extent;
    protected ExtentTest test;
    
    @BeforeSuite
    public void startReport() {
        extent = ExtentManager.getReport();
    }
    
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://erp.erpnext.com");
    }
    
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    
    @AfterSuite
    public void flushReport() {
        extent.flush();
    }
}
