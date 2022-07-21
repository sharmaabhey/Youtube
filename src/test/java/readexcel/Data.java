package readexcel ;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data {
	 WebDriver driver;



	

	

	
	public static void main(String[] args) throws IOException{

		FileInputStream fis = new FileInputStream("C:\\Users\\ABHAY SHARMA\\Documents\\TEAM - SANDEEP GUND.xlsx");

		HSSFWorkbook workbook = new HSSFWorkbook(fis);

		HSSFSheet sheet = workbook.getSheet("sample");

		int rowCount = sheet.getLastRowNum();

		int coulumnCount = sheet.getRow(0).getLastCellNum();
	}
}
