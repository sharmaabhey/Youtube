package youtube_home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Youtube_search {
	
	WebDriver driver;
	
	
	
	public Youtube_search(WebDriver driver) {
		this.driver= driver;
	}
	
	public void searching_channel(String channel) throws Exception {
		WebElement ele = driver.findElement(By.xpath("//input[@id='search']"));
		ele.click();
		ele.sendKeys(channel);
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);
		WebElement web = driver.findElement(By.xpath("//yt-formatted-string[text()='Small Town Rider']"));

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(web));
		web.click();
		Thread.sleep(4000);
		
	}
	
	
	
	

}
//yt-formatted-string[text()='Small Town Rider']