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

//讀取檔案內容
public static void readTextFile(String fileName) { 
	//FIleReader fr=new FileReader(fileName);需要try catch包起
	FileReader fr=null;
	try {
		fr=new FileReader(fileName);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} 
	BufferedReader br=new BufferedReader(fr);
	String tmp=null;//放入一暫存變數
	try {
		while((tmp=br.readLine())!=null){//一行行讀入放進暫存變數
			System.out.println(tmp);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}finally { //需做關掉的動作,從最後的BR關掉即可
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
public static void writeTextFile(String fileName) {
	//FileWriter fw=new FileWriter(fileName);會有例外拋出
	//FileWriter fw=null;
	List<String> list=new ArrayList<String>();//先建立arrayList集合包含三個字串
	list.add("t1");
	list.add("t2");
	list.add("t3");
	
	try {
		FileWriter fw=new FileWriter(fileName);
		BufferedWriter bw=new BufferedWriter(fw);
		//開始寫入資料
		for(String str:list) {
			bw.write(str);//將讀進的的STRING放進WRITE
			bw.newLine();//換行
		}
		bw.flush();//將記憶體的資料寫進,把水管的水清空
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}

//複製一圖片到資料夾
public static void copyPictureFile(File source, File dest) {
	FileInputStream fis=null;
	FileOutputStream fos=null;
	try {
		fis=new FileInputStream(source);
		fos=new FileOutputStream(dest);
		//建立一個buffer,用byte所建立的
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
