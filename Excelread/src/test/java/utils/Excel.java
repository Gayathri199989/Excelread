package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static void main(String[] args) {
		getRowCount();
	}
	
	public static void getRowCount() {
		/*
		 * String pro = System.getProperty("user.dir"); System.out.println(pro);
		 */
		try {
		String excelPath = "./data/TestData.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
		XSSFSheet sheet = workbook.getSheet("LoginId");
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No.of rows:"+rowCount);
		
	}catch(Exception exp) {
		System.out.println(exp.getCause());
		System.out.println(exp.getMessage());
		exp.printStackTrace();
	}

}
}

