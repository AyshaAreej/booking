package booking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class language {

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
			city.sendKeys("Budapest, Pest, Hungary");
			city.click();
			
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"frm\"]/div/div[1]/div/div[1]/ul[1]/li[1]")).click();
		        
		        
		        WebElement date=driver.findElement(By.className("bui-calendar__date"));
		    	String dateval="2021-11-30";
		    	
		    	SelectDatebyJS(driver,date, dateval);
		    	driver.findElement(By.xpath("//*[@id=\"frm\"]/div/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[5]/td[3]/span/span")).click();
		    	
		    	
		    	
		    	WebElement date2=driver.findElement(By.className("bui-calendar__date"));
		    	String dateval2="2021-12-02";
		    	date2.click();
		    	
		    	
		    	
		    	SelectDatebyJS2(driver,date2, dateval2);
		    	driver.findElement(By.xpath("//*[@id=\"frm\"]/div/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[1]/td[5]/span/span")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]")).click();
		 
		 Actions act = new Actions(driver);

		//Double click on element
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[1]/div/div[2]/button[2]/span")); 
		act.doubleClick(ele).perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[4]/div/div[2]/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"searchboxInc\"]/div[1]/div/div/div[1]/div[5]/div[5]/label/div")).click();
		

		
}
	
	
	public static void SelectDatebyJS(WebDriver driver, WebElement element,String dateval) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
		}
	public static void SelectDatebyJS2(WebDriver driver, WebElement element,String dateval2) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval2+"');",element);}
}