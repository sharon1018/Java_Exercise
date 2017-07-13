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
	//Ū�����
	public static void readFile(String fileName) throws IOException{//�ߥX�ҥ~��demo���B�z
		InputStream is=new FileInputStream(new File(fileName));
		XSSFWorkbook wb=new XSSFWorkbook(is);//�إX�@��WB����
		//��Ū��SHEET�bŪROW�bŪCELL
		XSSFSheet Sheet=wb.getSheetAt(0);//Ū���Ĥ@��SHEET
		Iterator itRow=Sheet.rowIterator();//�^�Ǥ@�^�N��
		while(itRow.hasNext()) {
			XSSFRow row=(XSSFRow)itRow.next();//�૬��ROW����ƫ��O�~���~��ϥγo�Ӫ���
			
			Iterator itCell=row.cellIterator();
			while(itCell.hasNext()) {
				XSSFCell cell=(XSSFCell)itCell.next();
				System.out.print(cell+" ");
			}
			System.out.println("");
		}
		
	}
	
	//�N�{����Ƽg�JEXCEL
	public static void writeFile(String fileName, List<String[]> dataList) throws IOException{
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Test Sheet");
		XSSFRow titleRow=sheet.createRow(0);
		//�[�J���D�C
		XSSFCell cell=titleRow.createCell(0);
		cell.setCellValue("id");
		XSSFCell cell2=titleRow.createCell(1);
		cell.setCellValue("name");
		XSSFCell cell3=titleRow.createCell(2);
		cell.setCellValue("age");
		
		//�I�slist �N��Ƽg�JEXCEL
		for(int i=0;i<dataList.size(); i++) {
			XSSFRow row=sheet.createRow(i+1);//�Ĥ@��w�g�Q�ϥ�
			String[] rowData=dataList.get(i);//���o�Ĥ@ROW�����
			//�Nstring[]�@�ӭӨ��X�A��icell
			for(int j=0;j<rowData.length;j++) {
				XSSFCell cell1=row.createCell(j);
				cell1.setCellValue(rowData[j]);
			}
		}
		FileOutputStream fis=new FileOutputStream(fileName);
		wb.write(fis);//�N�L�g�J
		fis.flush();
		fis.close();
	}

}
