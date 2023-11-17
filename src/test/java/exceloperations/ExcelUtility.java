package exceloperations;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	String filepath;
	Sheet sh;

	public ExcelUtility(){
		
		filepath = System.getProperty("user.dir") + "//src//test//resources//TestData.xlsx";
		File testDataFile = new File(filepath);
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(testDataFile);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sh = wb.getSheetAt(0);
	}
	
	public HashMap<String, String> getTestDataInMap(int rowNum) throws EncryptedDocumentException, IOException {
		
		
		HashMap<String, String> hm = new HashMap<>();
		
		for(int i = 0; i < sh.getRow(0).getLastCellNum(); i++) {
			sh.getRow(rowNum).getCell(i).setCellType(CellType.STRING);
			hm.put(sh.getRow(0).getCell(i).toString(), sh.getRow(rowNum).getCell(i).toString());
		}
		return hm;
	}
	
	public int getRowCount() {
		return sh.getLastRowNum();
		
	}
	public int getColCount() {
		return sh.getRow(0).getLastCellNum();
	}


}
