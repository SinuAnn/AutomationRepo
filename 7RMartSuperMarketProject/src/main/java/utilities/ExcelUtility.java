package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constant;

public class ExcelUtility {

	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;

	public static String getStringData(int a, int b, String sheet) throws IOException {
		f = new FileInputStream(Constant.TESTDATAFILE);
		// data.
		w = new XSSFWorkbook(f);// to access or modify the data.
		sh = w.getSheet(sheet);
		XSSFRow r = sh.getRow(a);// get the row value from sheet
		XSSFCell c = r.getCell(b);// get cell from sheet
		return c.getStringCellValue();// to retrive a string value from a cell
	}

	public static String getIntegerData(int a, int b, String sheet) throws IOException {
		f = new FileInputStream(Constant.TESTDATAFILE);

		w = new XSSFWorkbook(f);
		sh = w.getSheet(sheet);
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int x = (int) c.getNumericCellValue();// type casting
		return String.valueOf(x);
	}
}
