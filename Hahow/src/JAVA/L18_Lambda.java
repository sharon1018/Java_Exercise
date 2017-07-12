package JAVA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L18_Lambda {//實作一介面
	//可以自己實作或使用現有的靜態方法
	public static void main(String[] args) {
		//建立比較器變數再用lambda實作
		Comparator<Integer> com=(x,y)->x-y; //介面已經定義型態的話後面輸入值就不需再作定義
		int result=com.compare(5,2);//comparator裡面的compare方法
		System.out.println(result);
		
		//JAVA8之新功能:forEach
		List<String> list=new ArrayList<String>();//建立list物件
		list.add("t1");
		list.add("t2");
		list.add("t3");
		list.forEach(name -> System.out.println(name));//將集合的每個資料傳入再列印出來
		
		//用現有的靜態方法
		Comparator<Integer> com1=Math::subtractExact;//先寫入MATH這個名稱在寫入他的靜態方法
		int result1=com1.compare(5, 2);
		System.out.println(result);

	}

}
