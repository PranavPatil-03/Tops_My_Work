package com.module_8;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hybrid_drivan {
	@DataProvider(name = "Pranav")
	public Object[][] input() throws InvalidFormatException, IOException   {
		Object[][] data = null;
		// 1.to open file path
		String filepath = "C:\\Users\\patil\\Downloads\\DataDriven_Demo.xlsx";
		// 2.to make file
		File file = new File(filepath);
		// 3.to open a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		// 4.to open a sheet
		Sheet sheet = workbook.getSheet("Sheet3");
		// 5.to evaluate no of rows
		int nrow = sheet.getPhysicalNumberOfRows();
		System.out.println("no of row :" + nrow);
		data = new Object[nrow][];
		// 6.to select a row
		for (int i = 0; i < data.length; i++) {
			Row row = sheet.getRow(i);
			// 6.to evaluate no of col in each row
			int ncol = row.getPhysicalNumberOfCells();
			System.out.println("no of col :" + ncol);
			data[i] = new Object[ncol];
			for (int j = 0; j < data[i].length; j++) {
				Cell cell = row.getCell(j);
				// to convert a data type into string
				cell.setCellType(CellType.STRING);
				data[i][j] = cell.getStringCellValue();
			}
		}

		return data;
	}

	WebDriver driver;

	@Test(dataProvider = "Pranav")
	public void test(String keyword,String data) throws InterruptedException {

		if (keyword.equals("open browser")) {

			driver = new ChromeDriver();

			driver.manage().window().maximize();
		}

		else if (keyword.equals("enter url")) {

			driver.get(data);
			Thread.sleep(2000);
		} else if (keyword.equals("click signin")) {

			driver.findElement(By.xpath("//button[@id='btn1']")).click();
			Thread.sleep(2000);
		}

		else if (keyword.equals("enter email")) {
			driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys(data);
			Thread.sleep(2000);

		}

		else if (keyword.equals("enter password")) {
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data);
			Thread.sleep(2000);
		}

		else if (keyword.equals("click login")) {
			driver.findElement(By.id("enterbtn")).click();
			Thread.sleep(2000);

		}

		else if (keyword.equals("close browser")) {
			driver.close();
		}
	}

}
