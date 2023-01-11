package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TOFetchIntAndBoolenDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/excelData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("sheet1");
		double intvalue =sheet.getRow(2).getCell(0).getNumericCellValue();
		
		boolean booleanvalue = sheet.getRow(2).getCell(1).getBooleanCellValue();
		System.out.println(intvalue);
		System.out.println(booleanvalue);
		


	}

}
