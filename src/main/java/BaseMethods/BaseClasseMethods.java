package BaseMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClasseMethods {
	
public void excelFilereading(int row, int coloumn, int coloumn2) throws IOException {
		
		File src = new File("C:\\Users\\UD20461958\\OneDrive - Wipro\\GITBash_FileRead.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheetAt = wb.getSheetAt(0);
		
		XSSFRow row2 = sheetAt.getRow(row);
		XSSFCell cell = row2.getCell(coloumn);
		XSSFCell cell2 = row2.getCell(coloumn2);
		
		System.out.println(cell + "----->" +cell2);

	}

}
