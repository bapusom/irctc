package Keywords;

/*
 * This class consists of the keywords that is further arranged in the respective module classes
 * to obtain the functionality.
 */

/*
 * kw_synchronize()
 * kw_invoke_browser()
 * kw_close()
 * kw_maximize()
 * kw_enter_url(String url)
 * kw_enter_text(By locator, String text)
 * kw_click_button(By locator)
 * kw_click_link(By locator)
 * kw_get_Title()
 * kw_moveToElement(By locator)
 * kw_dropdown(By locator,int value)
 * kw_dropdown_default(By locator)
 * kw_validate(String expected, String actual)
 * kw_validate_Title(String exp_Title)
 * kw_verify_FromTo(By locator)
 * kw_verify_ToFrom(By locator)
 * kw_alertPopup()
 * kw_date(String date)
 */

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import Driver.MainDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


public class GenericFuntions extends MainDriver  {
	

	static WebDriver d;
	
	public static Properties config;
	
	static String elementval;
	
	static String  origin="Bangalore,BLR";   //declaration of origin 
	static String  destination="Hyderabad,HYD"; //declaration of destination


    
	
	//wait for 3secs,page to be loaded 
	public static void kw_synchronize(int value) throws InterruptedException{
		
	    Thread.sleep(value);
	}
	
	
	//opening in different browsers
	
	public static WebDriver kw_invoke_browser() throws IOException{
		
		try{
		config = new Properties();
		FileInputStream f = new FileInputStream("src\\Input\\or.properties");
		config.load(f);
		
		String browser = config.getProperty("Browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src\\Input\\chromedriver.exe");
			d=new ChromeDriver();
		}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			d = new FirefoxDriver();
		}
		
		if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "src\\Input\\IEDriverServer.exe");
			d = new InternetExplorerDriver();
		}
		
		
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		return d;
	}
	
	
	
	//close the Current browser
    public static void kw_close(){
    d.close();
    }
	
	
	
	//maximize the window
	public static void kw_maximize(){
		
	d.manage().window().maximize();
	}
	
	
	//entering the URL
	public static void kw_enter_url(String url){
	try{
	d.get(url);
	}catch(Exception e){
		
		System.out.println(e.getMessage());
	}
	}
		
	
	//entering the text value
	public static void kw_enter_text(By locator, String text){
	
	WebElement element = d.findElement(locator);
	element.sendKeys(text);
	
	}
	
	
	//click a button
	public static void kw_click_button(By locator){
	d.findElement(locator).click();
		}
	
		
	//click a link
	public static void kw_click_link(By locator){
			
	WebElement element = d.findElement(locator);
	element.click();
	}

	
	
	
	//move to an element
	public static void kw_moveToElement(By locator){
		
	Actions action = new Actions(d);
		
	WebElement element = d.findElement(locator);
		
	action.moveToElement(element).click().build().perform();
		
	}

	
	
	//using dropdown,select the elements
	public static void kw_dropdown_value(By locator,String value){
		
	WebElement element=d.findElement(locator);
		
	Select se=new Select(element);
		
	se.selectByValue(value);
		
	}
	
	
	//using dropdown,get the dafault contents
    public static void kw_dropdown_default(By locator){
           
    WebElement element=d.findElement(locator);              
    Select se=new Select(element);                      
    WebElement elementsel = se.getFirstSelectedOption();
    elementval = elementsel.getText();              
           
    }


	
	//validate the strings
	public static void kw_validate(String expected, String actual){
	
	boolean booleanValue = expected.equals(actual);
	    
	    if(booleanValue==false){
	    	
	    	System.out.println("expected string "+expected+" NOT MATCHING actual string "+actual);
	    }
	    
	    else{
	    	
	    	System.out.println("expected string "+expected+" MATCHING actual string "+actual);
	    }
		
		
	
	}
	
	
	
	//Validating the Page_Titles
	
	public static void kw_validate_Title(String exp_Title){
		
	String actualTitle = d.getTitle();
	
	if(exp_Title.equals(actualTitle)){
		
		System.out.println("Test Case Pass");
	}
	
	else{
		
		System.out.println("Test Case fail");
	}
		
	}
	
	
	public static void kw_verify_FromTo(By locator)
    {
    WebElement element = d.findElement(locator);
    String strng = element.getText();
    String Actualvalue=origin+" To "+destination;
    System.out.println(Actualvalue);
    if(Actualvalue.equals(origin +" To " +destination))
    { System.out.println("Pass:: Flights are shown only given origin and destination.. ");
       }
    else 
    {
       System.out.println("fail:: Flights are shown different places... ");
              }
              
       }
    
       
    //To verify the origin and destination cities.   --Bhaskar
  public static void kw_verify_ToFrom(By locator)
    {
       
       
     WebElement element = d.findElement(locator);
    String strng = element.getText();
    System.out.println(strng);
    String Actualvalue=destination+" To "+origin;
    if(Actualvalue.equals(destination +" To " +origin))
    { System.out.println("Pass:: Flights are shown only given destination and origin.. ");
       }
    else 
    {
       System.out.println("fail:: Flights are shown different places... ");
       }
    }

	
	
	//handling the pop-up window
	public static void kw_alertPopup(){
		
	Alert alert = d.switchTo().alert();
		
	String popupText = alert.getText();
		
	System.out.println(popupText);
	
	alert.accept();
	
		
		
	}
	
	
	
	
    // Select date from Calender using Firefox,Chrome
	
	public static void kw_date(String date,String TripType) throws InterruptedException{
        
	       String[] a = date.split("/");
	       String day = a[0];
	       String[] months  = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	       int x = Integer.parseInt(a[1]);
	       String month = months[x-1];
	       String year = a[2];
	       
	       switch(TripType){
	       case "Depart":
	       d.findElement(By.xpath("//*[@id='where']/div[4]/img")).click();
	       break;
	       case "Return":
	       d.findElement(By.xpath("//*[@id='lastwhenId']/img")).click();
	       break;
	       }
	       //Xpath of year in Left Calender
	       
	       
	       String Cal_Year = d.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
	       //loop navigate until the required year reached        
	       while(!Cal_Year.equals(year))
	       {             
	         //XPath of arrow in Right Calender
	         d.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();     
	         //XPath of Year on left Calender
	         String Cal_Year1 = d.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
	         Cal_Year = Cal_Year1;
	       }
	       
	       
	       //Xpath of month in Left Calender
	         String Cal_Month = d.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
	       
	        //loop navigate until the required year reached
	           while(!Cal_Month.equals(month))
	              {                                 
	                //XPath of arrow in Right Calender                                 
	                d.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();                                       
	                String Cal_Month1 = d.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
	                //XPath of Month on left Calender
	                Cal_Month = Cal_Month1;                
	              }
	       
	              
	              WebElement datewidget=d.findElement(By.id("ui-datepicker-div"));
	        List<WebElement>columns=datewidget.findElements(By.tagName("td"));
	        for(WebElement cell : columns)
	       {
	               if(cell.getText().equals(day))
	               {
	                     cell.findElement(By.linkText(day)).click();
	                     break;
	               }
	        } 
	       

	       }      


}

