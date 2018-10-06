package Keywords;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Driver.MainDriver;

public class Execute_TestCases {

	private static File logFile;

	public static File getLogFile() {
		return logFile;
	}
	
	private List<String> getExcelsheetlist(String sheetName)
			throws  Exception {
		


		String actual;
		List<String> sheetlist;
		Properties prop = Objects.get_objects();

		// reading datas from excel sheet
		sheetlist = new ArrayList<String>();

		FileInputStream src = new FileInputStream(new File(
				prop.getProperty("filename") + "\\Input\\TestData1.xlsx"));
		Workbook wb = WorkbookFactory.create(src);
		Sheet ws = wb.getSheet(sheetName);
		int rows = ws.getLastRowNum();

		for (int i = 1; i <= rows; i++) {

			Row row = ws.getRow(i);

			actual = row.getCell(2).getStringCellValue();

			if (actual.equalsIgnoreCase("Y")) {
				sheetlist.add(row.getCell(1).getStringCellValue());
			}

		}
		return sheetlist;

	
		
		
	}
	
	public static void setLogFile(File logFile) {
		Execute_TestCases.logFile = logFile;
	}

	private static void createLogFile() throws IOException {

		Date date = new Date(System.currentTimeMillis());

		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH.mm.ss a");

		File file = new File("src\\Logs\\debuglog " + df.format(date));

		if (file.exists()) {
			file.delete();
			file.createNewFile();
		}
  
		setLogFile(file);
	}

	public static void main(String[] args) {

		// no paramater
		Class noparams[] = {};

		try {

			Execute_TestCases execute_TestCases = new Execute_TestCases();

			createLogFile();
			
			List<String> sheetlist = execute_TestCases.getExcelsheetlist("Modules");
			
			MainDriver mainDriver = new MainDriver();
			
			for (Iterator iterator = sheetlist.iterator(); iterator.hasNext();) {
				
				String booking = (String) iterator.next();
				switch (booking) {
				case "Domestic":
					execute_TestCases.executeDMtestcase(mainDriver);
					break;
				case "LTC":
					execute_TestCases.executeLTCtestcase(mainDriver);
					break;
				case "International":
					execute_TestCases.executeInternationaltestcase(mainDriver);
					break;

				default:
					break;
				}
				
			}
	
			

		} catch (Exception e) {

			e.getStackTrace();
		}

	}

	private void executeLTCtestcase(MainDriver mainDriver) throws IOException, Exception {
		
		mainDriver.checkExcelDatas("LTC");
		System.out.println("Total LTC_TC whose status is Y is "
				+ MainDriver.ltcTestcase.size());
		Class LtcClass = Class.forName("Keywords.LTC_Flight");
		executeTestCase(MainDriver.ltcTestcase, LtcClass);

		
	}
	
	private void executeInternationaltestcase(MainDriver mainDriver) throws IOException, Exception {
		
		mainDriver.checkExcelDatas("International");
		System.out.println("Total International_TC whose status is Y is "
				+ MainDriver.internationalTestcase.size());
		Class InternationalClass = Class.forName("Keywords.International_Flight");
		executeTestCase(MainDriver.internationalTestcase, InternationalClass);

		
	}
	

	private  void executeDMtestcase(MainDriver mainDriver) throws IOException, Exception {
	
		mainDriver.checkExcelDatas("Domestic");
		System.out.println("Total Domestic_TC whose status is Y is "
				+ MainDriver.domesticTestcase.size());

		Class domesticClass = Class.forName("Keywords.Domestic_Flight");
		executeTestCase(MainDriver.domesticTestcase, domesticClass);

	}

	private static void executeTestCase(HashMap<String, String> testCaseMap,
			Class cl) throws InstantiationException, IllegalAccessException,
			NoSuchMethodException, SecurityException, IllegalArgumentException,
			InvocationTargetException {

		Class noparams[] = {};
		Object obj = cl.newInstance();

		for (Map.Entry<String, String> entry : testCaseMap.entrySet()) {

			System.out.println(entry.getKey() + "/" + entry.getValue());

			Method method1 = cl.getDeclaredMethod(entry.getKey(), noparams);

			method1.invoke(obj, null);

		}

	}

}
