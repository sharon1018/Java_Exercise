package Excel;

import java.io.IOException;
import java.util.List;

public class demo {

	public static void main(String[] args) {
//		// Ū��EXCEL���
//		String readFileName="C:\\tmp\\test\\read.xlsx";
//		try {
//			ExcelUtil.readFile(readFileName);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		
		//�g�Jexcel���
		String writeFileName="C:\\tmp\\test\\write.xlsx";
		DataHelp dataHelp=new DataHelpImp();
		List<String[]> list=dataHelp.getData();
		try {
			ExcelUtil.writeFile(writeFileName,  list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("write excel");
	}

}
