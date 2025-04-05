package dataDrivenTesting;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.devtools.v129.filesystem.model.File;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

//s1: Create FileInputStream object
		FileInputStream fis = new FileInputStream("./Testdata/TestScriptData.xlsx");
		
	//s2: Create respective file type object
		Workbook wb = WorkbookFactory.create(fis);
		
	//s3: call read methods
	String	url =wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		String	email = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(email);
		
	}

}

