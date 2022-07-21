package Onlineticket;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testpage extends Basetest {
	
	HashMap<String,String> umap = new HashMap<String,String>();
	
	
	
	
	
	@Test
	
	public void gettr() throws Exception {
		HashMap<String,String> umap = new HashMap<String,String>();
		umap.put("from", "pune,india");
		umap.put("to", "Delhi,india");
		umap.put("from2", "mumbai");
		umap.put("to2", "bangkok");
		umap.put("setdate", "30");
		umap.put("mobilenumber", "1234567890");
		umap.put("email", "xyz@gmail.com");
		
		
	
		
		//homepage
		Homepage home = new Homepage(driver);
		home.starting();
		home.from(umap.get("from"));
		home.to(umap.get("to"));
		home.Setdate(umap.get("setdate"));
		home.search();
		
		
		//bookingpage
		Bookingpage booking = new Bookingpage(driver);
		booking.cancelalert();
		booking.nonstop();
		booking.viewpriceandbook();
		
		
		
		//lastpage or submition page
		Submitionpage submit = new Submitionpage(driver);
		submit.promocode();
		Thread.sleep(2000);
		submit.securetrip();
		Thread.sleep(2000);
		submit.scroll();
		Thread.sleep(2000);
		submit.mobilenumber(umap.get("mobilenumber"));
		Thread.sleep(2000);
		submit.email(umap.get("email"));
		Thread.sleep(5000);
		
		
		
	}
	
	
	/*public String getdestination(String choose) {
		String str = gettrip().get(choose);
		return str;*/
	
	
	
	/*@BeforeTest
	public void launchapp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
	}*/
	
	/*@Test
	public void main() throws Exception {
		Homepage home = new Homepage(driver);
		home.starting();
		home.from(getdestination("from"));
		home.to(getdestination("to"));
		home.Setdate();
		home.search();
		
		
		Bookingpage booking = new Bookingpage(driver);
		booking.cancelalert();
		booking.nonstop();
		booking.viewpriceandbook();
		
		Submitionpage submit = new Submitionpage(driver);
		submit.promocode();
		Thread.sleep(2000);
		submit.securetrip();
		Thread.sleep(2000);
		submit.scroll();
		Thread.sleep(2000);
		submit.mobilenumber(getdestination("mobilenumber"));
		Thread.sleep(2000);
		submit.email(getdestination("email"));
		Thread.sleep(5000);*/
	}
	
	
	
	/*@AfterTest
	
	public void closeapp() {
		driver.quit();
	}*/


