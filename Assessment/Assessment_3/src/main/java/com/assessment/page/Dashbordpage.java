package com.assessment.page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashbordpage {

	 WebDriver driver;
	    WebDriverWait wait;

	    @FindBy(xpath = "//span[text()='HR']")
	    WebElement hrModule;

	    @FindBy(xpath = "//a[@title='Employee']")
	    WebElement employeeMenu;

	    @FindBy(xpath = "//span[text()='Buying']")
	    WebElement buyingModule;

	    @FindBy(xpath = "//a[@title='Purchase Order']")
	    WebElement purchaseOrderMenu;

	    public Dashbordpage(WebDriver driver) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        PageFactory.initElements(driver, this);
	    }

	    public void goToEmployee() {
	        wait.until(ExpectedConditions.elementToBeClickable(hrModule)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(employeeMenu)).click();
	    }

	    public void goToPurchaseOrder() {
	        wait.until(ExpectedConditions.elementToBeClickable(buyingModule)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(purchaseOrderMenu)).click();
	    }


}
