package GitBash_CSVFileReading;

import java.io.IOException;

import BaseMethods.BaseClasseMethods;

public class GITBash_FileReading extends BaseClasseMethods{
	
	public static void main(String[] args) throws IOException {
		
		BaseClasseMethods ReadExcel = new BaseClasseMethods();
		
		ReadExcel.excelFilereading(0, 0, 1);
		ReadExcel.excelFilereading(1, 0, 1);
		ReadExcel.excelFilereading(2, 0, 1);
		ReadExcel.excelFilereading(3, 0, 1);
		
		
	}

}
