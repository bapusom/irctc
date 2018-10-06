package Driver;

/*
 * This is the main driver class that reads the input excel. Its implemented using Apache POI.
 * 
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

import Keywords.Execute_TestCases;
import Keywords.Objects;

public class MainDriver {

	
	public WebDriver d;
	public static LinkedHashMap<String, String> domesticTestcase = new LinkedHashMap<>();
	public static LinkedHashMap<String, String> ltcTestcase = new LinkedHashMap<>();
	public static LinkedHashMap<String, String> internationalTestcase = new LinkedHashMap<>();
	

	// if file doesnt exists, then create it

	public static Properties prop;

	

	public void checkExcelDatas(String sheetName) throws Exception, IOException {

		String actual;

		prop = Objects.get_objects();

		// reading data from excel sheet

		FileInputStream src = new FileInputStream(new File(
				prop.getProperty("filename") + "\\Input\\TestData1.xlsx"));
		Workbook wb = WorkbookFactory.create(src);
		Sheet ws = wb.getSheet(sheetName);
		int rows = ws.getLastRowNum();

		// Checking the Test cases to be executed from excel

		for (int i = 1; i <= rows; i++) {

			Row row = ws.getRow(i);

			actual = row.getCell(2).getStringCellValue();

			if (actual.equalsIgnoreCase("Y")
					&& row.getCell(1).getStringCellValue().contains("DM")) {

				domesticTestcase.put(row.getCell(1).getStringCellValue(),
						"Executed");

			} else if (actual.equalsIgnoreCase("Y")
					&& row.getCell(1).getStringCellValue().contains("LTC")) {

				ltcTestcase.put(row.getCell(1).getStringCellValue(), "Executed");

			} else {
				
				internationalTestcase.put(row.getCell(1).getStringCellValue(), "Executed");
				
			}

		}

	}

	public void writeLogs(String log) throws IOException {

		// true = append file
		FileWriter fileWritter = new FileWriter(Execute_TestCases.getLogFile(),
				true);
		BufferedWriter bufferWritter = new BufferedWriter(fileWritter);

		bufferWritter.write(log);
		bufferWritter.newLine();
		bufferWritter.close();

	}

}
