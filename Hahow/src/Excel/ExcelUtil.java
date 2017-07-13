package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	//讀取資料
	public static void readFile(String fileName) throws IOException{//拋出例外由demo做處理
		InputStream is=new FileInputStream(new File(fileName));
		XSSFWorkbook wb=new XSSFWorkbook(is);//建出一個WB物件
		//先讀取SHEET在讀ROW在讀CELL
		XSSFSheet Sheet=wb.getSheetAt(0);//讀取第一個SHEET
		Iterator itRow=Sheet.rowIterator();//回傳一跌代器
		while(itRow.hasNext()) {
			XSSFRow row=(XSSFRow)itRow.next();//轉型成ROW的資料型別才能繼續使用這個物件
			
			Iterator itCell=row.cellIterator();
			while(itCell.hasNext()) {
				XSSFCell cell=(XSSFCell)itCell.next();
				System.out.print(cell+" ");
			}
			System.out.println("");
		}
		
	}
	
	//將程式資料寫入EXCEL
	public static void writeFile(String fileName, List<String[]> dataList) throws IOException{
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Test Sheet");
		XSSFRow titleRow=sheet.createRow(0);
		//加入標題列
		XSSFCell cell=titleRow.createCell(0);
		cell.setCellValue("id");
		XSSFCell cell2=titleRow.createCell(1);
		cell.setCellValue("name");
		XSSFCell cell3=titleRow.createCell(2);
		cell.setCellValue("age");
		
		//呼叫list 將資料寫入EXCEL
		for(int i=0;i<dataList.size(); i++) {
			XSSFRow row=sheet.createRow(i+1);//第一行已經被使用
			String[] rowData=dataList.get(i);//取得第一ROW的資料
			//將string[]一個個取出再放進cell
			for(int j=0;j<rowData.length;j++) {
				XSSFCell cell1=row.createCell(j);
				cell1.setCellValue(rowData[j]);
			}
		}
		FileOutputStream fis=new FileOutputStream(fileName);
		wb.write(fis);//將他寫入
		fis.flush();
		fis.close();
	}

}
