package IO;

import java.io.File;

public class readwriteDemo {

	public static void main(String[] args) {
		//String fileName="c:\\tmp\\test\\javatest1.txt\\";
		//IOutil.readTextFile(fileName);
		//IOutil.writeTextFile(fileName);
		
		String source="c:\\tmp\\cat1.jpg";
		String dest="c:\\tmp\\test\\cat11.jpg";//�ƻs����� �ɦW�O�ƻ�
		
		IOutil.copyPictureFile(new File(source), new File(dest));
	}

}
