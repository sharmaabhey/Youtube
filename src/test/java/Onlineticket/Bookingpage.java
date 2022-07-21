package Onlineticket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bookingpage {
	
	WebDriver driver;
	
	
	public Bookingpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	
	public void cancelalert() {
		driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
	}
	
	public void nonstop() throws Exception {
		driver.findElement(By.xpath("//span[text()='Non Stop']")).click();
		Thread.sleep(2000);
	}
	
	public void  viewpriceandbook() throws Exception {
		driver.findElement(By.xpath("//span[text()='View Prices']")).click();
		String oldwin = driver.getWindowHandle();  
		
		driver.findElement(By.xpath("//button[text()='Book Now']")).click();
		Thread.sleep(2000);
		for (String currwin: driver.getWindowHandles()) {
			if (oldwin != currwin) {
				driver.switchTo().window(currwin);
				
			}
		}
		
	}

}
