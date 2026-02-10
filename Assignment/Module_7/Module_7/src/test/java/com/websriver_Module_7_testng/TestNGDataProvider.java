package com.websriver_Module_7_testng;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	 @DataProvider(name = "loginData")
	    public Object[][] getData() {
	        return new Object[][] {
	            {"admin", "admin123"},
	            {"user", "user123"},
	            {"test", "test123"}
	        };
	    }

	
	    @Test(dataProvider = "loginData")
	    public void loginTest(String username, String password) {
	        System.out.println("Username: " + username + " | Password: " + password);
	    }
}
