package JAVA;

import java.util.Calendar;

public class L1_variable{
	public static String gender;//�ݩ� �~���]�i�s��
	public static void main(String args[]){
		gender="f";
		long l=123;//�ϰ��ܼ�
		Calendar calender=Calendar.getInstance();
		int year=calender.get(Calendar.YEAR);
		System.out.println(year);
		System.out.println(l);
	}

}
