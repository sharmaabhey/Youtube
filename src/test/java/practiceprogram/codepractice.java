package practiceprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class codepractice {
	WebDriver driver;
	
	
@BeforeTest	
public void launchapp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");

	
	
}
@Test
public void searching() {
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("boat avante");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}


}
