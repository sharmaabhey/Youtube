package Onlineticket;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Submitionpage {
	
	
	WebDriver driver;
	By mob = By.xpath("//input[@placeholder='Mobile No']");
	By mail = By.xpath("//input[@placeholder='Email']");
	
	
	public Submitionpage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void promocode() {
		driver.findElement(By.xpath("//span[text()='MMTSUPER']")).click();
	}
	
	public void securetrip() {
		driver.findElement(By.xpath("//b[text()='Yes, Secure my trip. ']")).click();
	}
	 public void scroll() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  
			
			WebElement web = driver.findElement(By.xpath("//input[@placeholder='Mobile No']"));
			
			js.executeScript("arguments[0].scrollIntoView();", web);
	 }
	 
	 public void  mobilenumber(String mobilenumber) {
		 driver.findElement(mob).sendKeys(mobilenumber);
	 }
	 
	 public void email(String email) {
		 driver.findElement(mail).sendKeys(email);
	 }

}
