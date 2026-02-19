package com.assessment.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderpage {
	 WebDriver driver;

	    @FindBy(xpath = "//a[contains(text(),'Purchase Order')]")
	    WebElement poModule;

	    @FindBy(xpath = "//button[contains(text(),'New')]")
	    WebElement newPO;

	    @FindBy(name = "supplier")
	    WebElement supplier;

	    @FindBy(name = "item_code")
	    WebElement item;

	    @FindBy(name = "qty")
	    WebElement quantity;

	    @FindBy(xpath = "//button[contains(text(),'Submit')]")
	    WebElement submitBtn;

	    public PurchaseOrderpage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void createPO() {
	        poModule.click();
	        newPO.click();
	        supplier.sendKeys("Test Supplier");
	        item.sendKeys("Item 001");
	        quantity.sendKeys("10");
	        submitBtn.click();
	    }
}
