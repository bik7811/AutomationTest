package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.TestBase;

public class XlUtil extends TestBase {
	String path;
	XSSFWorkbook workBook;
	
	public XlUtil(String path) throws IOException {
		this.path = path;
		
		try {
			FileInputStream fis = new FileInputStream(path);
			workBook = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getData(int SheetIndex, int row, int column) {
		String data = workBook.getSheetAt(SheetIndex).getRow(row).getCell(column).getStringCellValue();
		return data;
	}

}
