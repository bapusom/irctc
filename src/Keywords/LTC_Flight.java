package Keywords;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

public class LTC_Flight extends GenericFuntions{
	
	//public static void main(String[] args) throws InterruptedException, IOException {
		
	Date date = new Date(System.currentTimeMillis());

    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH.mm.ss a ");  
    
	
	public void FRS_LTC_One_Way_Search_0001() throws InterruptedException, IOException
    {
    
    prop = Objects.get_objects();
    
    kw_invoke_browser();
    
    writeLogs("Test Case FRS_LTC_Onewaysearch_0001 excuting..");
    
    writeLogs(df.format(date)   +"opening the browser");
    
    kw_maximize();
    
    writeLogs(df.format(date)   +"maximizing the window");
    
    kw_synchronize(3000);
    
    kw_enter_url(prop.getProperty("URL"));
    
    writeLogs(df.format(date)   +"entering the url");
    
    kw_click_link(By.linkText(prop.getProperty("linkText_LTC")));
    
    writeLogs(df.format(date)   +"click on LTC link");
    
    kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));
    
    writeLogs(df.format(date)   +"entering your Source place");

	kw_synchronize(3000);

	kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

    kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("destination"));
    
    writeLogs(df.format(date)   +"entering your Destination place");
    
    kw_synchronize(3000);

	kw_moveToElement(By.linkText(prop.getProperty("linkText_HYD")));
	
	kw_enter_text(By.id(prop.getProperty("id_Departdate")), prop.getProperty("act_date"));
	
	writeLogs(df.format(date)   +"taking your departure date");
    
    kw_click_button(By.className(prop.getProperty("class_search")));
    
    String expText = prop.getProperty("expText");
    
    String actText = d.findElement(By.xpath(prop.getProperty("xpath_actText"))).getText();
    
    kw_validate(expText,actText);
    
    //kw_verify_FromTo(By.id(prop.getProperty("id_RundTrip_origin_destination")));
    
    writeLogs(df.format(date)   +"Searching Flight Ticket successfully");
    
    kw_close();
    
}
	
	public void FRS_LTC_One_Way_Search_0002() throws InterruptedException, IOException
    {
		prop = Objects.get_objects();
		    
		writeLogs("Test Case FRS_LTC_Onewaysearch_0001 excuting..");
		
		kw_invoke_browser();
		    
		writeLogs(df.format(date)   +"opening the browser");
		    
		kw_maximize();
		    
		writeLogs(df.format(date)   +"maximizing the window");
		    
		kw_synchronize(3000);
		    
	    kw_enter_url(prop.getProperty("URL"));
		    
	    writeLogs(df.format(date)   +"entering the url");
	    
	    kw_click_link(By.linkText(prop.getProperty("linkText_LTC")));
		    
	    writeLogs(df.format(date)   +"click on LTC link");
		    
	    kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));
		    
	    writeLogs(df.format(date)   +"entering your Source place");

		kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

		kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("destination"));
		    
		writeLogs(df.format(date)   +"entering your Destination place");
		    
	    kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_HYD")));
			
		kw_enter_text(By.id(prop.getProperty("id_Departdate")), prop.getProperty("act_date"));
			
		writeLogs(df.format(date)   +"taking your departure date");
        
       	kw_dropdown_value(By.id(prop.getProperty("id_adult")), prop.getProperty("no_of_Adults"));

		kw_dropdown_value(By.id(prop.getProperty("id_child")), prop.getProperty("no_of_Childs"));

		kw_dropdown_value(By.id(prop.getProperty("id_infant")), prop.getProperty("no_of_Infants"));

		// Validate default value of travel class

		kw_dropdown_default(By.id(prop.getProperty("id_traveltype")));
		kw_validate("Economy", elementval);

		// Validate default value of preferred airlines

		kw_dropdown_default(By.name(prop.getProperty("name_preference")));
		kw_validate("All Airlines", elementval);

		writeLogs(df.format(date)   +"entering the respected fields");
		
		kw_click_button(By.className(prop.getProperty("class_search")));
		
		String expText = prop.getProperty("expText");
	    
	    String actText = d.findElement(By.xpath(prop.getProperty("xpath_actText"))).getText();
	    
	    kw_validate(expText,actText);
	    
	    //kw_verify_FromTo(By.id(prop.getProperty("id_RundTrip_origin_destination")));
	    
	    writeLogs(df.format(date)   +"Searching Flight Ticket successfully");
	    
	    kw_close();
           
    }
	
	
	
	public void FRS_LTC_One_Way_Search_0003() throws InterruptedException, IOException
    {
		prop = Objects.get_objects();
		    
		writeLogs("Test Case FRS_DM_Onewaysearch_0001 excuting..");
		
		kw_invoke_browser();
		    
		writeLogs(df.format(date)   +"opening the browser");
		    
		kw_maximize();
		    
		writeLogs(df.format(date)   +"maximizing the window");
		    
		kw_synchronize(3000);
		    
	    kw_enter_url(prop.getProperty("URL"));
		    
	    writeLogs(df.format(date)   +"entering the url");
	    
	    kw_click_link(By.linkText(prop.getProperty("linkText_LTC")));
		    
	    writeLogs(df.format(date)   +"click on LTC link");
		    
	    kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));
		    
	    writeLogs(df.format(date)   +"entering your Source place");

		kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

		kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("destination"));
		    
		writeLogs(df.format(date)   +"entering your Destination place");
		    
	    kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_HYD")));
			
		kw_enter_text(By.id(prop.getProperty("id_Departdate")), prop.getProperty("act_date"));
			
		writeLogs(df.format(date)   +"taking your departure date");
        
		kw_dropdown_value(By.id(prop.getProperty("id_adult")), prop.getProperty("no_of_Adults"));

		kw_dropdown_value(By.id(prop.getProperty("id_child")), prop.getProperty("no_of_Childs"));

		kw_dropdown_value(By.id(prop.getProperty("id_infant")), prop.getProperty("no_of_Infants"));

		// Validate default value of travel class

		kw_dropdown_default(By.id(prop.getProperty("id_traveltype")));
		kw_validate("Economy", elementval);

		kw_dropdown_value(By.name(prop.getProperty("name_preference")), prop.getProperty("Flight_Pref"));

		writeLogs(df.format(date)   +"entering the respected fields");
		kw_click_button(By.className(prop.getProperty("class_search")));
		
		String expText = prop.getProperty("expText");
	    
	    String actText = d.findElement(By.xpath(prop.getProperty("xpath_actText"))).getText();
	    
	    kw_validate(expText,actText);
	    
	    //kw_verify_FromTo(By.id(prop.getProperty("id_RundTrip_origin_destination")));
	    
	    writeLogs(df.format(date)   +"Searching Flight Ticket successfully");
	    
	    kw_close();
           
    }
	
	
	
	public void FRS_LTC_One_Way_Search_0004() throws InterruptedException, IOException
    {
		prop = Objects.get_objects();
		    
		writeLogs("Test Case FRS_DM_Onewaysearch_0001 excuting..");
		
		kw_invoke_browser();
		    
		writeLogs(df.format(date)   +"opening the browser");
		    
		kw_maximize();
		    
		writeLogs(df.format(date)   +"maximizing the window");
		    
		kw_synchronize(3000);
		    
	    kw_enter_url(prop.getProperty("URL"));
		    
	    writeLogs(df.format(date)   +"entering the url");
	    
	    kw_click_link(By.linkText(prop.getProperty("linkText_LTC")));
		    
	    writeLogs(df.format(date)   +"click on LTC link");
		    
	    kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));
		    
	    writeLogs(df.format(date)   +"entering your Source place");

		kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

		kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("source"));
		    
		writeLogs(df.format(date)   +"entering your Destination place");
		    
	    kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));
			
		kw_enter_text(By.id(prop.getProperty("id_Departdate")), prop.getProperty("act_date"));
			
		writeLogs(df.format(date)   +"taking your departure date");
        
		kw_click_button(By.className(prop.getProperty("class_search")));
		
		try {

			kw_alertPopup();
		} catch (Exception e) {

			System.out.println("hanling the pop up");
		}
		
		writeLogs(df.format(date)   +"Pop up handled successfully");

		kw_close();
	    
	    kw_close();
           
    }
	
	
	
	
	
	


}

