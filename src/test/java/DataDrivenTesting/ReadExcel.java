package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	     
		FileInputStream fis=new FileInputStream("C:\\Users\\SWEETY\\OneDrive\\Desktop\\SeleniumTestCase\\Login.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Sheet");
		
		 String email = sheet.getRow(0).getCell(0).toString();
		 String password = sheet.getRow(0).getCell(1).toString();
		 
		 System.out.println(email);
		 System.out.println(password);
	}

}
