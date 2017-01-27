package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public String[][] ReadExcel() throws IOException{
		File file = new File(System.getProperty("user.dir")+"/src/data/LoginData.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet("Login");
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][colCount];
		for(int i=1;i<=rowCount;i++){
			for(int j=0;j<colCount;j++){
				data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		workbook.close();
		return data;
	}

}
