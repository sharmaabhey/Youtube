package Onlineticket;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	WebDriver driver;
	By fromcity = By.xpath("//label[@for='fromCity']");
	By st =By.xpath("//span[@class='langCardClose']");
	By fromc = By.xpath("//input[@placeholder='From']");
	By too = By.xpath("//input[@placeholder='To']");
	By date = By.xpath("//label[@for='departure']");
	By searching =By.xpath("//a[text()='Search']");
	

	
	public Homepage (WebDriver driver) { //this webdriver will help us to perform activities on the webpages
		this.driver= driver;
	}
	
	public void starting() {
		driver.findElement(fromcity).click();
		
		driver.findElement(st).click();
		
	}
	
	public void from(String from) throws Exception {
		WebElement bgb = driver.findElement(fromc);
		bgb.click();
		//Thread.sleep(2000);
		bgb.sendKeys(from);
		Thread.sleep(3000);
		bgb.sendKeys(Keys.ARROW_DOWN);
		bgb.sendKeys(Keys.ENTER);
	}
	
	public void to(String to) throws Exception {
		WebElement be = driver.findElement(too);
		be.click();
		be.sendKeys(to);
		Thread.sleep(3000);
		be.sendKeys(Keys.ARROW_DOWN);
		be.sendKeys(Keys.ENTER);
	}

	
	public void Setdate(String s) throws Exception {
		//WebElement date = driver.findElement(date);
		//date.click();
		Thread.sleep(3000);
		String xpath = "(//div[@class='DayPicker-wrapper']//div[@class='DayPicker-Months'])//div[@class='DayPicker-Body']//following::p[text()='"+s+"'][2]";
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(3000);
		
	}
	
	public void search() {
		driver.findElement(searching).click();
	}
}
