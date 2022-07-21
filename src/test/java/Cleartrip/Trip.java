package Cleartrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trip {
	WebDriver driver;
	
	@BeforeTest
	public void launchapp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		
		
	}
	
	
	@Test
	public void randompopup() {
		driver.findElement(By.xpath("//div[@class=' px-1 py-1 hover:bg-neutral-0 flex flex-middle nmx-1']")).click();
	}

}
