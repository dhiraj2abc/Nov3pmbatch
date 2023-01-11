package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteDataIntoExcell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/ExcelData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		
		workbook.getSheet("Sheet1").getRow(0).createCell(3).setCellValue("name");
		workbook.getSheet("Sheet1").getRow(0).createCell(4).setCellValue("name");
		
		FileOutputStream fos = new FileOutputStream("./testData/excelData.xlsx");
		workbook.write(fos);
		


	}

}
