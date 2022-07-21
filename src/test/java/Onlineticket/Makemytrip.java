package Onlineticket;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytrip {
	public static WebDriver driver;
	HashMap<String,String>  umap= new HashMap<String,String>();
	
	
	@BeforeTest
	public void launchapp() throws Exception{
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ABHAY SHARMA\\Downloads\\chromedriver.exe" );		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		
		
	}
	
	public HashMap<String,String> gettrip(HashMap umap){
		//HashMap<String,String> umap = new HashMap<String,String>();
		umap.put("from", "pune,india");
		umap.put("to", "Delhi,india");
		umap.put("from2", "mumbai");
		umap.put("to2", "bangkok");
		umap.put("setdate", "30");
		return umap;
	}
	
	
	/*public String getdestination(String choose) {
		String str = gettrip().get(choose);
		return str;
	}*/
	@Test
	public void main() throws Exception {
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).click();
		//driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
		//String from = gettrip().get("from");
		WebElement bgb = driver.findElement(By.xpath("//input[@placeholder='From']"));
		bgb.click();
		//Thread.sleep(2000);
		bgb.sendKeys(umap.get("from"));
		Thread.sleep(3000);
		bgb.sendKeys(Keys.ARROW_DOWN);
		bgb.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement be = driver.findElement(By.xpath("//input[@placeholder='To']"));
		be.click();
		be.sendKeys(umap.get("to"));
		Thread.sleep(3000);
		be.sendKeys(Keys.ARROW_DOWN);
		be.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//p[text()='Delhi, India']")).click();
		//Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//p[text()='27']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		//first page ends here
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Non Stop']")).click();
		
		Thread.sleep(2000);
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		 * 
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='23:55']"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(2000);*/
		driver.findElement(By.xpath("//span[text()='View Prices']")).click();
		String oldwin = driver.getWindowHandle();  
		
		driver.findElement(By.xpath("//button[text()='Book Now']")).click();
		Thread.sleep(2000);
		for (String currwin: driver.getWindowHandles()) {
			if (oldwin != currwin) {
				driver.switchTo().window(currwin);
				
			}
		}
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='MMTSUPER']")).click();
		driver.findElement(By.xpath("//b[text()='Yes, Secure my trip. ']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement web = driver.findElement(By.xpath("//input[@placeholder='Mobile No']"));
		
		js.executeScript("arguments[0].scrollIntoView();", web);
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile No']")).sendKeys("8395862936");
	}
	
	
	
	/*@AfterTest
	
	public void closeapp() {
		driver.close();*/
		
	}


