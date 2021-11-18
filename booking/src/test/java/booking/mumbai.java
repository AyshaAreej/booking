package booking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class mumbai {
	
	@Test
	public void login() throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aysha Areej\\Downloads\\chromedriver.exe");

		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		driver.get("https://www.booking.com");
		 Thread.sleep(3000);
		
		WebElement city= driver.findElement(By.id("ss"));
		city.sendKeys("Mumbai, Maharashtra, India");
		city.click();
		
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]")).click();
	        
	        
	        WebElement date=driver.findElement(By.className("bui-calendar__date"));
	    	String dateval="2021-11-08";
	    	
	    	SelectDatebyJS(driver,date, dateval);
	    	driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[2]/td[2]")).click();
	    	
	    	
	    	
	    	WebElement date2=driver.findElement(By.className("bui-calendar__date"));
	    	String dateval2="2021-09-13";
	    	date2.click();
	    	
	    	
	    	
	    	SelectDatebyJS2(driver,date2, dateval2);
	    	driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[2]/td[3]/span/span")).click();
	    	
	       
		
	
		 driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).submit();
		 
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"searchboxInc\"]/div[1]/div/div/div[1]/div[5]/div[5]/label/div")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@id=\"searchboxInc\"]/div[1]/div/div/div[1]/div[5]/div[6]/label/div")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@id=\"ajaxsrwrap\"]/div[2]/div/div/div[2]/ul/li[3]/a")).click();
		 Thread.sleep(3000);
		 
		 
	}
		
	public static void SelectDatebyJS(WebDriver driver, WebElement element,String dateval) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
		}
	public static void SelectDatebyJS2(WebDriver driver, WebElement element,String dateval2) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval2+"');",element);}
	
}