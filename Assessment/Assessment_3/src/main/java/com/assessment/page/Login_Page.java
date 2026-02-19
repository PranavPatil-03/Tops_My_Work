package com.assessment.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    WebDriver driver;
   
	@FindBy(xpath = "//div[@class='mb-4 flex flex-col']//button[1]")
	WebElement continu_password;

    @FindBy(xpath = "//input[@id='frappe-ui-1']")
    WebElement username;

    @FindBy(xpath = "//input[@id='frappe-ui-2']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;

    public Login_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String user, String pass) throws InterruptedException {
    	continu_password.click();
    	Thread.sleep(2000);
        username.sendKeys(user);
        Thread.sleep(2000);
        password.sendKeys(pass);
        Thread.sleep(2000);
        loginBtn.click();
    }
}
