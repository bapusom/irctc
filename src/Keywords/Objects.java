package Keywords;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Objects {
	
	public static Properties prop;
	
	//public static void main(String[] args) throws IOException {
		

	
	public static Properties get_objects() throws IOException {
		
		 prop = new Properties();
		
		FileInputStream f = new FileInputStream("src\\Input\\or.properties");
		
		prop.load(f);
		
		return prop;
		
		
		//System.out.println(prop.getProperty("SignIn_link"));
		
		
		

	}

}
