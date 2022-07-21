package tubetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class you  {
WebDriver driver;

@BeforeTest
public void launchapp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	
}
	
	


@Test
public void videos() throws Exception  {
driver.findElement(By.xpath("//input[@id='search']")).sendKeys("shammi");
Thread.sleep(3000);





	
	
}

@AfterTest
public void closeapp() {
	driver.close();
	
}

}

	


