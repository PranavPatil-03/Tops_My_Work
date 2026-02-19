package com.assessment.page;

import java.time.LocalDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {
	  WebDriver driver;

	    @FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Employee']")
	    WebElement employeeModule;

	    @FindBy(xpath = "//button[contains(text(),'New')]")
	    WebElement newEmployee;

	    @FindBy(name = "first_name")
	    WebElement firstName;

	    @FindBy(name = "last_name")
	    WebElement lastName;

	    @FindBy(name = "date_of_joining")
	    WebElement doj;

	    @FindBy(name = "department")
	    WebElement department;

	    @FindBy(xpath = "//button[contains(text(),'Save')]")
	    WebElement saveBtn;

	    public EmployeePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void createEmployee() {
	        employeeModule.click();
	        newEmployee.click();
	        firstName.sendKeys("John");
	        lastName.sendKeys("Doe");
	        doj.sendKeys(LocalDate.now().toString());
	        department.sendKeys("IT");
	        saveBtn.click();
	    }

}
