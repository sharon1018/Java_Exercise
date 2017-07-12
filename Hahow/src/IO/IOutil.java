package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

//Ū���ɮפ��e
public static void readTextFile(String fileName) { 
	//FIleReader fr=new FileReader(fileName);�ݭntry catch�]�_
	FileReader fr=null;
	try {
		fr=new FileReader(fileName);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} 
	BufferedReader br=new BufferedReader(fr);
	String tmp=null;//��J�@�Ȧs�ܼ�
	try {
		while((tmp=br.readLine())!=null){//�@���Ū�J��i�Ȧs�ܼ�
			System.out.println(tmp);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}finally { //�ݰ��������ʧ@,�q�̫᪺BR�����Y�i
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
public static void writeTextFile(String fileName) {
	//FileWriter fw=new FileWriter(fileName);�|���ҥ~�ߥX
	//FileWriter fw=null;
	List<String> list=new ArrayList<String>();//���إ�arrayList���X�]�t�T�Ӧr��
	list.add("t1");
	list.add("t2");
	list.add("t3");
	
	try {
		FileWriter fw=new FileWriter(fileName);
		BufferedWriter bw=new BufferedWriter(fw);
		//�}�l�g�J���
		for(String str:list) {
			bw.write(str);//�NŪ�i����STRING��iWRITE
			bw.newLine();//����
		}
		bw.flush();//�N�O���骺��Ƽg�i,����ު����M��
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}

//�ƻs�@�Ϥ����Ƨ�
public static void copyPictureFile(File source, File dest) {
	FileInputStream fis=null;
	FileOutputStream fos=null;
	try {
		fis=new FileInputStream(source);
		fos=new FileOutputStream(dest);
		//�إߤ@��buffer,��byte�ҫإߪ�
		byte[] buffer= new byte[1024];
		int off=0;
		int len=0;
		while((len=fis.read(buffer))!=-1) {
			fos.write(buffer, off, len);
		}
		fos.flush();
		
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		try {
			fis.close();
			fos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

}
