package JAVA;

import java.util.ArrayList;
import java.util.List;

public class L15_List {

	public static void main(String[] args) {
		String str1="t1";
		String str2="t2";
		String str3="t3";
		List<String> list=new ArrayList<String>();
		list.add(str1);//�i����
		list.add(str1);
		list.add(str2);
		list.add(str3);
		list.remove(str2);
		
		for(String s : list) {
			System.out.println(s);
		}
		
		//�Y�O�n��W���o�@�Ӹ�ƪ���
		System.out.println(list.get(2));
		
	}

}
