package IO;

import java.io.File;

public class IOutil {
	public static void createFolder(String fileName) {
		File file=new File(fileName);
		file.mkdirs();//檔案夾上面還有檔案夾會一起被建立出來
	}
public static String[] readFolder(String fileName) {
		File file=new File(fileName);
		return file.list();//先告訴她folder在哪裡 再回傳檔案名稱陣列
	}
public static void deleteFolder(String fileName) {
	File file=new File(fileName);
	file.delete();
}
public static void readTextFile(String fileName) {
	
}
public static void writeTextFile(String fileName) {
	
}

}
