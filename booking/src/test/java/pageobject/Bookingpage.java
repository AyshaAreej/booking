package pageobject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import helpers.UiHelper;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
public class Bookingpage {
	public static void main(String[]args) {}
	
	static WebDriver driver;
	 public static Logger log = Logger.getLogger(String.valueOf(Bookingpage.class));
	 
	 
	 
	 @FindBy(how = How.ID, using = "Where are you going?")
	    public static WebElement first_name;

	  

	    @FindBy(how = How.ID, using = "checkin")
	    public static WebElement check_in;

	    @FindBy(how = How.ID, using = "checkout")
	    public static WebElement check_out;

	   
	    @FindBy(how = How.CSS, using = "table[class='ui-datepicker-calendar']")
	    public static WebElement datepicker_table;

	    @FindBy(how = How.CSS, using = "div[class='ui-datepicker-title']")
	    public static WebElement datepicker_title;

	    @FindBy(how = How.CSS, using = "a[data-handler='prev']")
	    public static WebElement datepicker_previous;

	    @FindBy(how = How.CSS, using = "a[data-handler='next']")
	    public static WebElement datepicker_next;

	    public Bookingpage() throws IOException {
	        super();
	    }
	    /**
	     * @param firstname    The firstname parameter is the text to enter in the firstname textbox while saving booking
	     * @param surename     The surename parameter is the text to enter in the surename textbox while saving booking
	     * @param bookingPrice The bookingprice parameter is the text to enter in the price textbox while saving booking
	     * @param deposit      The deposit parameter is to set value in deposit dropdown while saving booking
	     * @param checkinDate  The firstname parameter is the text to enter in the firstname textbox while saving booking
	     * @param checkoutDate The checkoutDateis a parameter to set date in textbox datepicker while saving booking
	     */
	    public void enterDetails(String Where_are_you_going,   String checkinDate, String checkoutDate) {
	    first_name.sendKeys(Where_are_you_going);
	        checkInDate(checkinDate);
	        checkOutDate(checkoutDate);
	    }
	    
	    
	    /**
	     * @param firstname    The firstname parameter is the text to enter that needs to be verified
	     * @param surename     The surename parameter is the text to enter that needs to be verified
	     * @param bookingPrice The bookingprice parameter is the text to enter that needs to be verified
	     * @param deposit      The deposit parameter is to text to enter that needs to be verified
	     * @param checkinDate  The firstname parameter is the text to enter that needs to be verified
	     * @param checkoutDate The checkoutDateis a parameter is the text to enter that needs to be verified
	     */
	    public void checkDetailsIsDisplayed(String Where_are_you_going,  String checkinDate, String checkoutDate) {
	        clicksavedDetailsAreDisplayed(Where_are_you_going, 1);
	        clicksavedCheckInDateIsDisplayed(checkinDate, 5);
	        clicksavedCheckOutDateIsDisplayed(checkoutDate, 6);
	    }
	    /**
	     * @param textValue Text value ued to verify if the text is displayed.
	     * @param divIndex  This is the value used in the xpath for getting the webelements
	     */
	    public void clicksavedCheckInDateIsDisplayed(String textValue, int divIndex) {
	        datesDisplayed(textValue, divIndex);
	        log.info("CheckIn date is displayed");
	    }

	    /**
	     * @param textValue Text value ued to verify if the text is displayed.
	     * @param divIndex  This is the value used in the xpath for getting the webelements
	     */
	    public void clicksavedCheckOutDateIsDisplayed(String textValue, int divIndex) {
	        datesDisplayed(textValue, divIndex);
	        log.info("CheckOut date is displayed");
	    }
	    /**
	     * This is the helper method for dates
	     *
	     * @param textValue Text value ued to verify if the text is displayed.
	     * @param divIndex  This is the value used in the xpath for getting the webelements
	     */
	    public static void datesDisplayed(String textValue, int divIndex) {
	        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='bookings']/div[@class='row']/div[" + divIndex + "]/p"));
	        for (WebElement eachElement : elements) {
	            String formatDate = eachElement.getText();
	            //split year, month and days from the date using StringBuffer.
	            StringBuffer sBuffer = new StringBuffer(formatDate);
	            String year = sBuffer.substring(2, 4);
	            String mon = sBuffer.substring(5, 7);
	            String dd = sBuffer.substring(8, 10);
	            if (dd.equals(textValue)) {
	                log.info("Date is displayed");
	            }
	        }
	    }

	    /**
	     * @param checkinDate string value used to select the checkinDate form the datepicker
	     */
	    public void checkInDate(String checkinDate) {
	        check_in.click();
	        List<WebElement> columns = datepicker_table.findElements(By.tagName("td"));

	        for (WebElement cell : columns) {

	            if (cell.getText().equals(checkinDate)) {
	                cell.findElement(By.linkText(checkinDate)).click();
	                break;
	            }
	        }
	    }

	    /**
	     * @param checkoutDate string value used to select the checkoutDate form the datepicker
	     */  
	     public void checkOutDate(String checkoutDate) {
	         check_out.click();
	         WebElement date = datepicker_table.findElement(By.xpath("//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()='" + checkoutDate + "']"));
	         date.click();
	     }

	     /**
	      * @param textValue Text value ued to verify if the text is displayed.
	      * @param divIndex  This is the value used in the xpath for getting the webelements
	      */
	     public void clicksavedDetailsAreDisplayed(String textValue, int divIndex) {
	         WebElement element = driver.findElement(By.xpath("//p[text()='" + textValue + "']/ancestor::div[@class='row']"));
	         UiHelper.waitForVisibleElement(element);
	         Assert.assertTrue(element.isDisplayed());
	         List<WebElement> elements = driver.findElements(By.xpath("//div[@id='bookings']/div[@class='row']/div[" + divIndex + "]/p"));
	         for (WebElement eachElement : elements) {
	             Assert.assertTrue(eachElement.isDisplayed());
	         }
	     }

	     /**
	      * This is the method to get the staleElement exception.
	      *
	      * @param divIndex This is the value used in the xpath for getting the webelements
	      * @return
	      */
	     public List<WebElement> retryingListElement(int divIndex) {
	         List<WebElement> elements = null;
	         boolean result = false;
	         int attempts = 0;
	         while (attempts < 2) {
	             try {
	                 elements = driver.findElements(By.xpath("//div[@id='bookings']/div[@class='row']/div[" + divIndex + "]/p"));
	                 result = true;
	                 break;
	             } catch (StaleElementReferenceException e) {
	             }
	             attempts++;
	         }
	         return elements;
	     }
}
