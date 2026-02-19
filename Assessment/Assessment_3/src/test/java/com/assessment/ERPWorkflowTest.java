package com.assessment;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.assessment.base.Base;
import com.assessment.page.EmployeePage;
import com.assessment.page.Login_Page;
import com.assessment.util.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class ERPWorkflowTest extends Base {
	ExtentReports report;
    ExtentTest test;

    @Test
    public void endToEndERPWorkflow() throws InterruptedException {

    	 report = ExtentManager.getReport();
         test = report.createTest("ERPNext End-to-End Test");

        // Login
        Login_Page login = new Login_Page(driver);
        login.login("pranav@yopmail.com","PRA@12345");
   
        test.pass("Login successful");
        
        EmployeePage emp = new EmployeePage(driver);
        emp.createEmployee();
        test.pass("Employee created successfully");


        
    }
}
