package IO;

import java.io.File;

public class IOutil {
	public static void createFolder(String fileName) {
		File file=new File(fileName);
		file.mkdirs();//�ɮק��W���٦��ɮק��|�@�_�Q�إߥX��
	}
public static String[] readFolder(String fileName) {
		File file=new File(fileName);
		return file.list();//���i�D�ofolder�b���� �A�^���ɮצW�ٰ}�C
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
