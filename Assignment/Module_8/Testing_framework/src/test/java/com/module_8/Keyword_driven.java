package com.module_8;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Keyword_driven {

	@DataProvider(name = "Pranav")
	public Object[][] input() throws InvalidFormatException, IOException {
		Object[][] data = null;
		// 1.to open file path
		String filepath = "C:\\Users\\patil\\Downloads\\DataDriven_Demo.xlsx";
		// 2.to make file
		File file = new File(filepath);
		// 3.to open a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		// 4.to open a sheet
		Sheet sheet = workbook.getSheet("Sheet5");
		// 5.to evaluate no of rows
		int n_row = sheet.getPhysicalNumberOfRows();
		System.out.println("no of row :" + n_row);
		data = new Object[n_row][];
		// 6.to select a row
		for (int i = 0; i < data.length; i++) {
			Row total_row = sheet.getRow(i);
			// 6.to evaluate no of col in each row
			int n_col = total_row.getPhysicalNumberOfCells();
			System.out.println("no of col :" + n_col);
			data[i] = new Object[n_col];
			for (int j = 0; j < data[i].length; j++) {
				Cell cell = total_row.getCell(j);
				// to convert a data type into string
				cell.setCellType(CellType.STRING);
				data[i][j] = cell.getStringCellValue();
			}
		}

		return data;
	}

	WebDriver driver;

	@Test(dataProvider = "Pranav")
	public void test(String keyword) throws InterruptedException {

		if (keyword.equals("open browser")) {

			driver = new ChromeDriver();

			driver.manage().window().maximize();
		}

		else if (keyword.equals("enter url")) {

			driver.get("https://demo.automationtesting.in");
			Thread.sleep(2000);
		} else if (keyword.equals("click signin")) {

			driver.findElement(By.xpath("//button[@id='btn1']")).click();
			Thread.sleep(2000);
		}

		else if (keyword.equals("enter email")) {
			driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("standard_user");
			Thread.sleep(2000);

		}

		else if (keyword.equals("enter password")) {
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
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
