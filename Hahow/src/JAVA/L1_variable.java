package JAVA;

import java.util.Calendar;

public class L1_variable{
	public static String gender;//屬性 外面也可存取
	public static void main(String args[]){
		gender="f";
		long l=123;//區域變數
		Calendar calender=Calendar.getInstance();
		int year=calender.get(Calendar.YEAR);
		System.out.println(year);
		System.out.println(l);
	}

}
