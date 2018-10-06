package Keywords;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;

public class Domestic_Flight extends GenericFuntions {

	public Properties prop;
	
	//SimpleDateFormat df;
	
	//Date date;
	
	Date date = new Date(System.currentTimeMillis());

    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH.mm.ss a ");   

	//File file = new File("src\\Logs\\debuglog "+df.format(date));
	

	public void FRS_DM_Onewaysearch_0001() throws IOException,
			InterruptedException {

		
		prop = Objects.get_objects();

		kw_invoke_browser();
		
		writeLogs("Test Case FRS_DM_Onewaysearch_0001 excuting..");
		
		writeLogs(df.format(date)   +"opening the browser");

		kw_enter_url(prop.getProperty("URL"));

		writeLogs(df.format(date)   +"entering the url");

		kw_synchronize(2000);

		kw_maximize();

		writeLogs(df.format(date)   +"maximizing the window");

		// Sign-In to IRCTC Flight Reservation

		kw_click_link(By.linkText(prop.getProperty("id_SignIn")));

		writeLogs(df.format(date)   +"clicking the Sign-In link");

		// Enter login Username

		kw_enter_text(By.id(prop.getProperty("id_username")), prop.getProperty("username"));

		writeLogs(df.format(date)   +"entering the username");

		kw_synchronize(3000);

		// Enter login password

		kw_enter_text(By.id(prop.getProperty("id_password")), prop.getProperty("password"));

		writeLogs(df.format(date)   +"entering the password");

		kw_synchronize(3000);

		// Click on Sign-In button

		kw_click_button(By.className(prop.getProperty("class_continue")));

		kw_synchronize(3000);

		writeLogs(df.format(date)   +"SignIn successfully");

		// Click on Flight only

		kw_click_link(By.linkText(prop.getProperty("linkText_Flight")));

		writeLogs(df.format(date)   +"click on Flight link");

		kw_synchronize(3000);

		// Click on Domestic Flight only

		kw_click_link(By.linkText(prop.getProperty("linkText_Domestic")));
		
		writeLogs(df.format(date)   +"clicking on Domestic only");
		
		kw_synchronize(3000);

		// Search and click on Bangalore

		kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));

		writeLogs(df.format(date)   +"entering your Source place");

		kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

		// Search and click on Hyderabad

		kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("destination"));

		writeLogs(df.format(date)   +"entering your Destination place");

		kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_HYD")));

		// Detature date

		kw_enter_text(By.id(prop.getProperty("id_Departdate")), prop.getProperty("act_date"));

		// kw_date("20/04/2016", "Depart");

		writeLogs(df.format(date)   +"taking your departure date");

		// Validate default value of Adult drop down
		kw_dropdown_default(By.id(prop.getProperty("id_adult")));
		kw_validate("1", elementval);

		// Validate default value of Children drop down
		kw_dropdown_default(By.id(prop.getProperty("id_child")));
		kw_validate("0", elementval);

		// Validate default value of Infant drop down
		kw_dropdown_default(By.id(prop.getProperty("id_infant")));
		kw_validate("0", elementval);

		// Validate default value of travel class
		kw_dropdown_default(By.id(prop.getProperty("id_traveltype")));
		kw_validate("Economy", elementval);

		// Validate default value of preferred airlines
		kw_dropdown_default(By.name(prop.getProperty("name_preference")));
		kw_validate("All Airlines", elementval);

		writeLogs(df.format(date)   +"entering the respected fields");

		// Click on search button

		kw_click_button(By.className(prop.getProperty("class_search")));

		kw_validate_Title("IRCTC Flight Ticket Booking");
		
		writeLogs(df.format(date)   +"Searching Flight Ticket successfully");
		
		

		kw_close();

	}
	

	public void FRS_DM_Onewaysearch_0002() throws IOException,
			InterruptedException {
		
		writeLogs("Test Case FRS_DM_Onewaysearch_0002 Exceuted..");
		
		prop = Objects.get_objects();

		kw_invoke_browser();

		writeLogs(df.format(date)   +"opening the second browser");

		kw_enter_url(prop.getProperty("URL"));

		writeLogs(df.format(date)   +"entering the url");

		kw_synchronize(2000);

		kw_maximize();

		writeLogs(df.format(date)   +"maximize the second window");

		// Sign-In to IRCTC Flight Reservation

		kw_click_link(By.linkText(prop.getProperty("id_SignIn")));

		// Enter login Username

		kw_enter_text(By.id(prop.getProperty("id_username")), prop.getProperty("username"));

		writeLogs(df.format(date)   +"entering the username");

		kw_synchronize(3000);

		// Enter login password

		kw_enter_text(By.id(prop.getProperty("id_password")), prop.getProperty("password"));

		writeLogs(df.format(date)   +"entering the password");

		kw_synchronize(3000);

		// Click on Sign-In button

		kw_click_button(By.className(prop.getProperty("class_continue")));

		writeLogs(df.format(date)   +"SignIn successfully");

		kw_synchronize(3000);

		// Click on Flight only

		kw_click_link(By.linkText(prop.getProperty("linkText_Flight")));

		writeLogs(df.format(date)   +"clicking on Flight link");

		kw_synchronize(3000);

		// Click on Domestic Flight only

		kw_click_link(By.linkText(prop.getProperty("linkText_Domestic")));

		writeLogs(df.format(date)   +"clicking on Domestic only");

		kw_synchronize(3000);

		// Search and click on Bangalore

		kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));

		writeLogs(df.format(date)   +"entering your Source place");

		kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

		// Search and click on Bhubaneswar

		kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("destination"));

		writeLogs(df.format(date)   +"entering your Destination place");
		
		kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_HYD")));
		
		writeLogs(df.format(date)   +"Enetring Source and Destination successfully");

		// Detature date

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

		// Click on search button

		kw_click_button(By.className(prop.getProperty("class_search")));

		kw_validate_Title("IRCTC Flight Ticket Booking");
		
		writeLogs(df.format(date)   +"Second Test Case executed successfully");

		kw_close();

	}

	public void FRS_DM_Onewaysearch_0003() throws IOException,
			InterruptedException {

		writeLogs("Test Case FRS_DM_Onewaysearch_0003 excuting..");

		prop = Objects.get_objects();

		kw_invoke_browser();

		writeLogs(df.format(date)   +"opening the browser");
		
		kw_enter_url(prop.getProperty("URL"));

		writeLogs(df.format(date)   +"entering the url");

		kw_synchronize(2000);

		kw_maximize();

		writeLogs(df.format(date)   +"maximizing the window");

		// Sign-In to IRCTC Flight Reservation

		kw_click_link(By.linkText(prop.getProperty("id_SignIn")));

		// Enter login Username

		kw_enter_text(By.id(prop.getProperty("id_username")), prop.getProperty("username"));

		writeLogs(df.format(date)   +"entering the username");

		kw_synchronize(3000);

		// Enter login password

		kw_enter_text(By.id(prop.getProperty("id_password")), prop.getProperty("password"));
		
		writeLogs(df.format(date)   +"entering the password");

		kw_synchronize(3000);

		// Click on Sign-In button

		kw_click_button(By.className(prop.getProperty("class_continue")));

		writeLogs(df.format(date)   +"SignIn successfully");

		kw_synchronize(3000);

		// Click on Flight only

		kw_click_link(By.linkText(prop.getProperty("linkText_Flight")));

		writeLogs(df.format(date)   +"click on Flight link");

		kw_synchronize(3000);

		// Click on Domestic Flight only

		kw_click_link(By.linkText(prop.getProperty("linkText_Domestic")));

		writeLogs(df.format(date)   +"clicking on Domestic only");

		kw_synchronize(3000);

		// Search and click on Bangalore

		kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));

		writeLogs(df.format(date)   +"entering your Source place");

		kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

		// Search and click on Hyderabad

		kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("destination"));

		writeLogs(df.format(date)   +"entering your Destination place");

		kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_HYD")));

		// Detature date

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

		// Click on search button

		kw_click_button(By.className(prop.getProperty("class_search")));

		kw_validate_Title("IRCTC Flight Ticket Booking");

		writeLogs(df.format(date)   +"Searching Flight Ticket successfully");

		kw_close();

	}

	public void FRS_DM_Onewaysearch_0004() throws IOException,
			InterruptedException {

	writeLogs("Test Case FRS_DM_Onewaysearch_0004 excuting..");	

		prop = Objects.get_objects();

		kw_invoke_browser();

		writeLogs(df.format(date)   +"opening the browser");

		kw_enter_url(prop.getProperty("URL"));

		writeLogs(df.format(date)   +"entering the url");

		kw_synchronize(2000);

		kw_maximize();

		writeLogs(df.format(date)   +"maximizing the window");

		// Sign-In to IRCTC Flight Reservation

		kw_click_link(By.linkText(prop.getProperty("id_SignIn")));

		writeLogs(df.format(date)   +"SignIn successfully");

		// Enter login Username

		kw_enter_text(By.id(prop.getProperty("id_username")), prop.getProperty("username") );

		writeLogs(df.format(date)   +"entering the username");

		kw_synchronize(3000);

		// Enter login password

		kw_enter_text(By.id(prop.getProperty("id_password")), prop.getProperty("password"));

		writeLogs(df.format(date)   +"entering the password");

		kw_synchronize(3000);

		// Click on Sign-In button

		kw_click_button(By.className(prop.getProperty("class_continue")));

		writeLogs(df.format(date)   +"SignIn successfully");

		kw_synchronize(3000);

		// Click on Flight only

		kw_click_link(By.linkText(prop.getProperty("linkText_Flight")));

		writeLogs(df.format(date)   +"click on Flight link");

		kw_synchronize(3000);

		// Click on Domestic Flight only

		kw_click_link(By.linkText(prop.getProperty("linkText_Domestic")));

		writeLogs(df.format(date)   +"clicking on Domestic only");

		kw_synchronize(3000);

		// Search and click on Bangalore

		kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));

		writeLogs(df.format(date)   +"entering your Source place");

		kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

		// Search and click on Hyderabad

		kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("destination"));

		writeLogs(df.format(date)   +"entering your Destination place");

		kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_HYD")));

		// Detature date

		kw_enter_text(By.id(prop.getProperty("id_Departdate")), prop.getProperty("act_date"));

		writeLogs(df.format(date)   +"taking your departure date");

		kw_dropdown_value(By.id(prop.getProperty("id_adult")), prop.getProperty("no_of_Adults"));

		kw_dropdown_value(By.id(prop.getProperty("id_child")), prop.getProperty("no_of_Childs"));

		kw_dropdown_value(By.id(prop.getProperty("id_infant")), prop.getProperty("no_of_Infants"));

		kw_dropdown_value(By.name(prop.getProperty("id_traveltype")), prop.getProperty("Travel_Type"));

		kw_dropdown_value(By.name(prop.getProperty("name_preference")), prop.getProperty("Flight_Pref"));

		writeLogs(df.format(date)   +"entering the respected fields");

		// Click on search button

		kw_click_button(By.className(prop.getProperty("class_search")));

		try {

			kw_alertPopup();
		} catch (Exception e) {

			System.out.println("hanling the pop up");
		}

		kw_validate_Title("IRCTC Flight Ticket Booking");

		writeLogs(df.format(date)   +"Searching Flight Ticket successfully");

		kw_close();

	}

	public void FRS_DM_Onewaysearch_0005() throws IOException,
			InterruptedException {

		prop = Objects.get_objects();

		writeLogs("Test Case FRS_DM_Onewaysearch_0005 excuting..");
		
		kw_invoke_browser();
		
		writeLogs(df.format(date)   +"opening the browser");

		kw_enter_url(prop.getProperty("URL"));
		
		writeLogs(df.format(date)   +"entering the url");

		kw_synchronize(2000);

		kw_maximize();
		
		writeLogs(df.format(date)   +"maximizing the window");

		// Sign-In to IRCTC Flight Reservation

		kw_click_link(By.linkText(prop.getProperty("id_SignIn")));

		// Enter login Username

		kw_enter_text(By.id(prop.getProperty("id_username")), prop.getProperty("username"));
		
		writeLogs(df.format(date)   +"entering the username");

		kw_synchronize(3000);

		// Enter login password

		kw_enter_text(By.id(prop.getProperty("id_password")), prop.getProperty("password"));
		
		writeLogs(df.format(date)   +"entering the password");

		kw_synchronize(3000);

		// Click on Sign-In button

		kw_click_button(By.className(prop.getProperty("class_continue")));

		kw_synchronize(3000);
		
		writeLogs(df.format(date)   +"SignIn successfully");

		// Click on Flight only

		kw_click_link(By.linkText(prop.getProperty("linkText_Flight")));
		
		writeLogs(df.format(date)   +"click on Flight link");

		kw_synchronize(3000);

		// Click on Domestic Flight only

		kw_click_link(By.linkText(prop.getProperty("linkText_Domestic")));
		
		

		kw_synchronize(3000);

		// Search and click on Bangalore

		kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));
		
		writeLogs(df.format(date)   +"clicking on Domestic only");

		kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

		// Search and click on Hyderabad

		kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("source"));
		
		writeLogs(df.format(date)   +"entering your Source place");

		kw_synchronize(3000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

		// Detature date

		kw_enter_text(By.id(prop.getProperty("id_Departdate")), prop.getProperty("act_date"));
		

		writeLogs(df.format(date)   +"taking your departure date");

		// Click on search button

		kw_click_button(By.className(prop.getProperty("class_search")));

		try {

			kw_alertPopup();
		} catch (Exception e) {

			System.out.println("hanling the pop up");
		}
		
		writeLogs(df.format(date)   +"Pop up handled successfully");

		kw_close();

	}

	public void FRS_DM_Rnd_Trip_srh_0006() throws IOException,
			InterruptedException {
		
		writeLogs("Test Case FRS_DM_Onewaysearch_0006 excuting..");

		prop = Objects.get_objects();

		kw_invoke_browser();
		
		writeLogs(df.format(date)   +"opening the browser");

		kw_enter_url(prop.getProperty("URL"));
		
		writeLogs(df.format(date)   +"entering the url");

		kw_synchronize(2000);

		kw_maximize();
		
		writeLogs(df.format(date)   +"maximizing the window");

		// Sign-In to IRCTC Flight Reservation
		kw_click_link(By.linkText(prop.getProperty("id_SignIn")));

		// Enter login Username
		kw_enter_text(By.id(prop.getProperty("id_username")), prop.getProperty("username"));
		
		writeLogs(df.format(date)   +"entering the username");

		kw_synchronize(3000);

		// Enter login password
		kw_enter_text(By.id(prop.getProperty("id_password")), prop.getProperty("password"));
		
		writeLogs(df.format(date)   +"entering the password");

		kw_synchronize(3000);

		// Click on Sign-In button
		kw_click_button(By.className(prop.getProperty("class_continue")));
		
		writeLogs(df.format(date)   +"SignIn successfully");

		kw_synchronize(3000);

		// Click on Flight only
		kw_click_link(By.linkText(prop.getProperty("linkText_Flight")));
		
		writeLogs(df.format(date)   +"click on Flight link");

		kw_synchronize(3000);

		// Click on Domestic Flight only
		kw_click_link(By.linkText(prop.getProperty("linkText_Domestic")));
		
		writeLogs(df.format(date)   +"clicking on Domestic only");

		kw_synchronize(3000);

		// Select Round Trip option
		kw_click_button(By.xpath(prop.getProperty("xpath_roundtrip")));
		
		writeLogs(df.format(date)   +"click on RoundTrip button");

		// Search and click on Bangalore
		kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));
		
		writeLogs(df.format(date)   +"entering your Source place");

		kw_synchronize(2000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

		// Search and click on Bhubaneswar
		kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("destination"));
		
		writeLogs(df.format(date)   +"entering your Destination place");
		
		kw_synchronize(2000);

		kw_moveToElement(By.linkText(prop.getProperty("linkText_HYD")));

		// Detature date
		// kw_enter_text(By.id(prop.getProperty("id_Departdate")),
		// "20/04/2016");
		
		kw_date(prop.getProperty("act_date"), "Depart");
		
		writeLogs(df.format(date)   +"taking your departure date");

		kw_synchronize(2000);

		// Return date
		kw_date(prop.getProperty("act_retDate"), "Return");
		
		writeLogs(df.format(date)   +"taking the returning date");

		// kw_enter_text(By.id(prop.getProperty("id_Returndate")),
		// "20/05/2016");

		// Validate default value of Adult drop down
		kw_dropdown_default(By.id(prop.getProperty("id_adult")));
		kw_validate("1", elementval);

		// Validate default value of Children drop down
		kw_dropdown_default(By.id(prop.getProperty("id_child")));
		kw_validate("0", elementval);

		// Validate default value of Infant drop down
		kw_dropdown_default(By.id(prop.getProperty("id_infant")));
		kw_validate("0", elementval);

		// Validate default value of travel class
		kw_dropdown_default(By.id(prop.getProperty("id_traveltype")));
		kw_validate("Economy", elementval);

		// Validate default value of preferred airlines
		kw_dropdown_default(By.name(prop.getProperty("name_preference")));
		kw_validate("All Airlines", elementval);
		
		writeLogs(df.format(date)   +"entering the respected fields");

		// Click on search button

		kw_click_button(By.className(prop.getProperty("class_search")));

		kw_validate_Title("IRCTC Flight Ticket Booking");
		
		writeLogs(df.format(date)   +"Searching Flight Ticket successfully");

		kw_close();

	}

	
	 public void FRS_DM_Rnd_Trip_srh_0007() throws IOException, InterruptedException {
	  
		 writeLogs("Test Case FRS_DM_Onewaysearch_0007 excuting..");

			prop = Objects.get_objects();

			kw_invoke_browser();
			
			writeLogs(df.format(date)   +"opening the browser");

			kw_enter_url(prop.getProperty("URL"));
			
			writeLogs(df.format(date)   +"entering the url");

			kw_synchronize(2000);

			kw_maximize();
			
			writeLogs(df.format(date)   +"maximizing the window");

			// Sign-In to IRCTC Flight Reservation
			kw_click_link(By.linkText(prop.getProperty("id_SignIn")));

			// Enter login Username
			kw_enter_text(By.id(prop.getProperty("id_username")), prop.getProperty("username"));
			
			writeLogs(df.format(date)   +"entering the username");

			kw_synchronize(3000);

			// Enter login password
			kw_enter_text(By.id(prop.getProperty("id_password")), prop.getProperty("password"));
			
			writeLogs(df.format(date)   +"entering the password");

			kw_synchronize(3000);

			// Click on Sign-In button
			kw_click_button(By.className(prop.getProperty("class_continue")));
			
			writeLogs(df.format(date)   +"SignIn successfully");

			kw_synchronize(3000);

			// Click on Flight only
			kw_click_link(By.linkText(prop.getProperty("linkText_Flight")));
			
			writeLogs(df.format(date)   +"click on Flight link");

			kw_synchronize(3000);

			// Click on Domestic Flight only
			kw_click_link(By.linkText(prop.getProperty("linkText_Domestic")));
			
			writeLogs(df.format(date)   +"clicking on Domestic only");

			kw_synchronize(3000);

			// Select Round Trip option
			kw_click_button(By.xpath(prop.getProperty("xpath_roundtrip")));
			
			writeLogs(df.format(date)   +"click on RoundTrip button");

			// Search and click on Bangalore
			kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));
			
			writeLogs(df.format(date)   +"entering your Source place");

			kw_synchronize(2000);

			kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

			// Search and click on Bhubaneswar
			kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("destination"));
			
			writeLogs(df.format(date)   +"entering your Destination place");
			
			kw_synchronize(2000);

			kw_moveToElement(By.linkText(prop.getProperty("linkText_HYD")));

			// Detature date
			// kw_enter_text(By.id(prop.getProperty("id_Departdate")),
			// "20/04/2016");
			
			kw_date(prop.getProperty("act_date"), "Depart");
			
			writeLogs(df.format(date)   +"taking your departure date");

			kw_synchronize(2000);

			// Return date
			kw_date(prop.getProperty("act_retDate"), "Return");
			
			writeLogs(df.format(date)   +"taking the returning date");

			// kw_enter_text(By.id(prop.getProperty("id_Returndate")),
			// "20/05/2016");

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


			// Click on search button

			kw_click_button(By.className(prop.getProperty("class_search")));

			kw_validate_Title("IRCTC Flight Ticket Booking");
			
			writeLogs(df.format(date)   +"Searching Flight Ticket successfully");

			kw_close();
	  
	 
	 }
	  
	 public void FRS_DM_Rnd_Trip_srh_0008() throws IOException, InterruptedException {
	 
		 writeLogs("Test Case FRS_DM_Onewaysearch_0008 excuting..");

			prop = Objects.get_objects();

			kw_invoke_browser();
			
			writeLogs(df.format(date)   +"opening the browser");

			kw_enter_url(prop.getProperty("URL"));
			
			writeLogs(df.format(date)   +"entering the url");

			kw_synchronize(2000);

			kw_maximize();
			
			writeLogs(df.format(date)   +"maximizing the window");

			// Sign-In to IRCTC Flight Reservation
			kw_click_link(By.linkText(prop.getProperty("id_SignIn")));

			// Enter login Username
			kw_enter_text(By.id(prop.getProperty("id_username")), prop.getProperty("username"));
			
			writeLogs(df.format(date)   +"entering the username");

			kw_synchronize(3000);

			// Enter login password
			kw_enter_text(By.id(prop.getProperty("id_password")), prop.getProperty("password"));
			
			writeLogs(df.format(date)   +"entering the password");

			kw_synchronize(3000);

			// Click on Sign-In button
			kw_click_button(By.className(prop.getProperty("class_continue")));
			
			writeLogs(df.format(date)   +"SignIn successfully");

			kw_synchronize(3000);

			// Click on Flight only
			kw_click_link(By.linkText(prop.getProperty("linkText_Flight")));
			
			writeLogs(df.format(date)   +"click on Flight link");

			kw_synchronize(3000);

			// Click on Domestic Flight only
			kw_click_link(By.linkText(prop.getProperty("linkText_Domestic")));
			
			writeLogs(df.format(date)   +"clicking on Domestic only");

			kw_synchronize(3000);

			// Select Round Trip option
			kw_click_button(By.xpath(prop.getProperty("xpath_roundtrip")));
			
			writeLogs(df.format(date)   +"click on RoundTrip button");

			// Search and click on Bangalore
			kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));
			
			writeLogs(df.format(date)   +"entering your Source place");

			kw_synchronize(2000);

			kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

			// Search and click on Bhubaneswar
			kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("destination"));
			
			writeLogs(df.format(date)   +"entering your Destination place");
			
			kw_synchronize(2000);

			kw_moveToElement(By.linkText(prop.getProperty("linkText_HYD")));

			// Detature date
			// kw_enter_text(By.id(prop.getProperty("id_Departdate")),
			// "20/04/2016");
			
			kw_date(prop.getProperty("act_date"), "Depart");
			
			writeLogs(df.format(date)   +"taking your departure date");

			kw_synchronize(2000);

			// Return date
			kw_date(prop.getProperty("act_retDate"), "Return");
			
			writeLogs(df.format(date)   +"taking the returning date");

			// kw_enter_text(By.id(prop.getProperty("id_Returndate")),
			// "20/05/2016");

			kw_dropdown_value(By.id(prop.getProperty("id_adult")), prop.getProperty("no_of_Adults"));

			kw_dropdown_value(By.id(prop.getProperty("id_child")), prop.getProperty("no_of_Childs"));

			kw_dropdown_value(By.id(prop.getProperty("id_infant")), prop.getProperty("no_of_Infants"));

			// Validate default value of travel class

			kw_dropdown_default(By.id(prop.getProperty("id_traveltype")));
			kw_validate("Economy", elementval);

			kw_dropdown_value(By.name(prop.getProperty("name_preference")), prop.getProperty("Flight_Pref"));

			writeLogs(df.format(date)   +"entering the respected fields");


			// Click on search button

			kw_click_button(By.className(prop.getProperty("class_search")));

			kw_validate_Title("IRCTC Flight Ticket Booking");
			
			writeLogs(df.format(date)   +"Searching Flight Ticket successfully");

			kw_close();
	  
	  }
	  
	  public void FRS_DM_Rnd_Trip_srh_0009() throws IOException, InterruptedException {
	
			 writeLogs("Test Case FRS_DM_Onewaysearch_0009 excuting..");

				prop = Objects.get_objects();

				kw_invoke_browser();
				
				writeLogs(df.format(date)   +"opening the browser");

				kw_enter_url(prop.getProperty("URL"));
				
				writeLogs(df.format(date)   +"entering the url");

				kw_synchronize(2000);

				kw_maximize();
				
				writeLogs(df.format(date)   +"maximizing the window");

				// Sign-In to IRCTC Flight Reservation
				kw_click_link(By.linkText(prop.getProperty("id_SignIn")));

				// Enter login Username
				kw_enter_text(By.id(prop.getProperty("id_username")), prop.getProperty("username"));
				
				writeLogs(df.format(date)   +"entering the username");

				kw_synchronize(3000);

				// Enter login password
				kw_enter_text(By.id(prop.getProperty("id_password")), prop.getProperty("password"));
				
				writeLogs(df.format(date)   +"entering the password");

				kw_synchronize(3000);

				// Click on Sign-In button
				kw_click_button(By.className(prop.getProperty("class_continue")));
				
				writeLogs(df.format(date)   +"SignIn successfully");

				kw_synchronize(3000);

				// Click on Flight only
				kw_click_link(By.linkText(prop.getProperty("linkText_Flight")));
				
				writeLogs(df.format(date)   +"click on Flight link");

				kw_synchronize(3000);

				// Click on Domestic Flight only
				kw_click_link(By.linkText(prop.getProperty("linkText_Domestic")));
				
				writeLogs(df.format(date)   +"clicking on Domestic only");

				kw_synchronize(3000);

				// Select Round Trip option
				kw_click_button(By.xpath(prop.getProperty("xpath_roundtrip")));
				
				writeLogs(df.format(date)   +"click on RoundTrip button");

				// Search and click on Bangalore
				kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));
				
				writeLogs(df.format(date)   +"entering your Source place");

				kw_synchronize(2000);

				kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

				// Search and click on Bhubaneswar
				kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("destination"));
				
				writeLogs(df.format(date)   +"entering your Destination place");
				
				kw_synchronize(2000);

				kw_moveToElement(By.linkText(prop.getProperty("linkText_HYD")));

				// Detature date
				// kw_enter_text(By.id(prop.getProperty("id_Departdate")),
				// "20/04/2016");
				
				kw_date(prop.getProperty("act_date"), "Depart");
				
				writeLogs(df.format(date)   +"taking your departure date");

				kw_synchronize(2000);

				// Return date
				kw_date(prop.getProperty("act_retDate"), "Return");
				
				writeLogs(df.format(date)   +"taking the returning date");

				// kw_enter_text(By.id(prop.getProperty("id_Returndate")),
				// "20/05/2016");

				kw_dropdown_value(By.id(prop.getProperty("id_adult")), prop.getProperty("no_of_Adults"));

				kw_dropdown_value(By.id(prop.getProperty("id_child")), prop.getProperty("no_of_Childs"));

				kw_dropdown_value(By.id(prop.getProperty("id_infant")), prop.getProperty("no_of_Infants"));

				kw_dropdown_value(By.name(prop.getProperty("id_traveltype")), prop.getProperty("Travel_Type"));

				kw_dropdown_value(By.name(prop.getProperty("name_preference")), prop.getProperty("Flight_Pref"));

				writeLogs(df.format(date)   +"entering the respected fields");


				// Click on search button

				kw_click_button(By.className(prop.getProperty("class_search")));
				
				try {

					kw_alertPopup();
				} catch (Exception e) {

					System.out.println("hanling the pop up");
				}


				kw_validate_Title("IRCTC Flight Ticket Booking");
				
				writeLogs(df.format(date)   +"Searching Flight Ticket successfully");

				kw_close();
	  
	  } 
	  public void FRS_DM_Rnd_Trip_srh_0010() throws IOException, InterruptedException {
	  
			 writeLogs("Test Case FRS_DM_Onewaysearch_0010 excuting..");

				prop = Objects.get_objects();

				kw_invoke_browser();
				
				writeLogs(df.format(date)   +"opening the browser");

				kw_enter_url(prop.getProperty("URL"));
				
				writeLogs(df.format(date)   +"entering the url");

				kw_synchronize(2000);

				kw_maximize();
				
				writeLogs(df.format(date)   +"maximizing the window");

				// Sign-In to IRCTC Flight Reservation
				kw_click_link(By.linkText(prop.getProperty("id_SignIn")));

				// Enter login Username
				kw_enter_text(By.id(prop.getProperty("id_username")), prop.getProperty("username"));
				
				writeLogs(df.format(date)   +"entering the username");

				kw_synchronize(3000);

				// Enter login password
				kw_enter_text(By.id(prop.getProperty("id_password")), prop.getProperty("password"));
				
				writeLogs(df.format(date)   +"entering the password");

				kw_synchronize(3000);

				// Click on Sign-In button
				kw_click_button(By.className(prop.getProperty("class_continue")));
				
				writeLogs(df.format(date)   +"SignIn successfully");

				kw_synchronize(3000);

				// Click on Flight only
				kw_click_link(By.linkText(prop.getProperty("linkText_Flight")));
				
				writeLogs(df.format(date)   +"click on Flight link");

				kw_synchronize(3000);

				// Click on Domestic Flight only
				kw_click_link(By.linkText(prop.getProperty("linkText_Domestic")));
				
				writeLogs(df.format(date)   +"clicking on Domestic only");

				kw_synchronize(3000);

				// Select Round Trip option
				kw_click_button(By.xpath(prop.getProperty("xpath_roundtrip")));
				
				writeLogs(df.format(date)   +"click on RoundTrip button");

				// Search and click on Bangalore
				kw_enter_text(By.id(prop.getProperty("id_origin")), prop.getProperty("source"));
				
				writeLogs(df.format(date)   +"entering your Source place");

				kw_synchronize(2000);

				kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

				// Search and click on Bhubaneswar
				kw_enter_text(By.id(prop.getProperty("id_destination")), prop.getProperty("source"));
				
				writeLogs(df.format(date)   +"entering your Destination place");
				
				kw_synchronize(2000);

				kw_moveToElement(By.linkText(prop.getProperty("linkText_BLR")));

				// Detature date
				// kw_enter_text(By.id(prop.getProperty("id_Departdate")),
				// "20/04/2016");
				
				kw_date(prop.getProperty("act_date"), "Depart");
				
				writeLogs(df.format(date)   +"taking your departure date");

				// Return date
				kw_date(prop.getProperty("act_retDate"), "Return");
				
				writeLogs(df.format(date)   +"taking the returning date");

				// kw_enter_text(By.id(prop.getProperty("id_Returndate")),
				// "20/05/2016");


				// Click on search button

				kw_click_button(By.className(prop.getProperty("class_search")));

				try {

					kw_alertPopup();
				} catch (Exception e) {

					System.out.println("hanling the pop up");
				}
				
				writeLogs(df.format(date)   +"Searching Flight Ticket UnSuccessful");

				kw_close();
	  
	  }
	 

}
