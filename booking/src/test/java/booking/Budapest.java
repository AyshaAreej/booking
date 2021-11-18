package booking;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Budapest {
	
	@Test
	public void login() throws InterruptedException{
		
		

	        //Creating instance of Chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aysha Areej\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
	        //Step#2- Launching URL
	        driver.get("https://www.booking.com/");
	       
	        driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[2]/button/span/div")).click();
	        
	        driver.findElement(By.xpath("//*[@id=\"language-selection\"]/div/div/div/div/div/div[2]/div/div[2]/div/div/div[1]/ul/li[2]")).click();
	        
	        driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[6]/a")).click();
	        
	        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//*[@id=\"b2theme_landing_indexPage\"]/header/nav/div[2]/div[6]/a")).click();
	    	Thread.sleep(3000);
	     
	        WebElement username=driver.findElement(By.xpath("//*[@id=\"username\"]"));
	    	username.sendKeys("ayshaareej71@gmail.com");
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]")).click();
	        Thread.sleep(3000);
	    	WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
	    	password.sendKeys("Ff16falcon");
	    	driver.findElement(By.xpath("///*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button")).click();
	        
	    	driver.findElement(By.xpath("/html/body/div")).click();
	        
	        
	        
	     
		}
}
	