package youtube_home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_page {
	
	
	WebDriver driver;
	
	
	
	
	public Home_page(WebDriver driver) {
		this.driver= driver;
				
	}
	
//	public void choose_type(String type) {
//		WebElement ele = driver.findElement(By.xpath("//input[@id='search']"));
//		String str = ele.getAttribute("aria-label");
//		System.out.println(str);
//		if(str.equals(type)) {
//			ele.click();
//			
//			
//		}
//			
//	}
	
	
	public void click_on_showmore() {
		driver.findElement(By.xpath("//yt-formatted-string[text()='Show more']")).click();
	}
	
	public void taking_list(String video_types) {
		List<WebElement>  type = driver.findElements(By.xpath("(//ytd-guide-section-renderer[@class='style-scope ytd-guide-renderer'])[1]//child::yt-formatted-string"));
		for (WebElement ele :type) {
			String str = ele.getText();
			System.out.println(str);
			if(str.equals(video_types)) {
				ele.click();
				
				
			}
			
		}
		
	}
	
	
	public void selecting_explore(String explore) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Low Budget']")));
		List<WebElement> ele = driver.findElements(By.xpath("//a[@id='destination-content-root']"));
		for(int i=0; i<ele.size();i++) {
			WebElement web = ele.get(i);
			String str =ele.get(i).getText();
			System.out.println(str);
			if(str.equals(explore)) {
				web.click();
				Thread.sleep(3000);
				
				break;
				
			}
		}
		
	}
	
	
	public void open_playlist() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//span[text()='Charts']"));
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
	
		js.executeScript("arguments[0].scrollIntoView();", ele);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(ele));
		driver.findElement(By.xpath("//a[text()='Top 100 Music Videos India']")).click();
		Thread.sleep(2000);
		

	
	} 

}
//a[text()='Top 100 Music Videos India']
//(//ytd-guide-section-renderer[@class='style-scope ytd-guide-renderer'])[1]//child::yt-formatted-string