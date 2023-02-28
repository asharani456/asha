package webdriver;
import java.io.FileInputStream; //Read
import java.io.FileOutputStream;//Write
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel_write {
	public static void main(String args[]) throws Exception{
	    FileInputStream fileinput = new FileInputStream("C:\\SeleniumData\\workbook.xlsx");
	    XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
	    XSSFSheet sheet = workbook.getSheet("test");
	    System.out.println(sheet.getSheetName());
	    System.out.println(sheet.getLastRowNum());
	System.out.println("Before updating Cell Data "+
	                                      sheet.getRow(2).getCell(1));
	    // Write the data to excel file
	    XSSFCell cell =  sheet.getRow(2).getCell(1);
	    cell.setCellValue("Test1234");
	    fileinput.close();
	    FileOutputStream fileOut = new FileOutputStream("C:\\SeleniumData\\book1.xlsx");
	    workbook.write(fileOut);
	    System.out.println("Updated data after write is done " + cell.getStringCellValue());
	    fileOut.close();
	   
	}
}
