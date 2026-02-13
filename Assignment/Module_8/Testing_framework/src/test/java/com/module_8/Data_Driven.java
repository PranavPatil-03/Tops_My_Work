package com.module_8;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Data_Driven {

	public String[][] input() throws InvalidFormatException, IOException {
		String[][] data = null;
		// 1.to open file path
		String filepath = "C:\\Users\\patil\\Downloads\\DataDriven_Demo.xlsx";
		// 2.to make file
		File file = new File(filepath);
		// 3.to open a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		// 4.to open a sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		// 5.to evaluate no of rows
		int nrow = sheet.getPhysicalNumberOfRows();
		System.out.println("no of row :" + nrow);
		data = new String[nrow - 1][];
		// 6.to select a row
		for (int i = 0; i < data.length; i++) {
			Row row = sheet.getRow(i);
			// 6.to evaluate no of col in each row
			int ncol = row.getPhysicalNumberOfCells();
			System.out.println("no of col :" + ncol);
			data[i] = new String[ncol];
			for (int j = 0; j < data[i].length; j++) {
				Cell cell = row.getCell(j);
				// to convert a data type into string
				cell.setCellType(CellType.STRING);
				data[i][j] = cell.getStringCellValue();
			}
		}

		return data;
	}

	@Test
	public void test() throws InterruptedException, InvalidFormatException, IOException {

		String[][] data = input();
		
		int passCount = 0;
		int failCount = 0;

		for (int i = 0; i < data.length; i++) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/SignIn.html");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys(data[i][0]);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data[i][1]);
			Thread.sleep(2000);
			driver.findElement(By.id("enterbtn")).click();
			Thread.sleep(2000);
			
			 try {
	               
	                driver.findElement(By.id("Index"));
	                System.out.println("TEST CASE " + (i + 1) + " : PASS");
	                
	                passCount++;
	            } catch (Exception e) {
	            	WebElement errorMsg = driver.findElement(By.id("errormsg"));
	                System.out.println("TEST CASE " + (i + 1) + " : FAIL : - " +" "+errorMsg.getText());
	                failCount++;
	            }

	            driver.quit();
	        }

	        System.out.println("=================================");
	        System.out.println("TOTAL TEST CASES : " + data.length);
	        System.out.println("PASSED : " + passCount);
	        System.out.println("FAILED : " + failCount);
	        System.out.println("=================================");
	    }

}


