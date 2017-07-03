package JAVA;

public class HW1 {

	public static void main(String[] args) {
		//double d=3.14
		double d=3.14;
		//d轉換為字串
		//基本資料轉字串 "valueOf"!!!!!
		String s=String.valueOf(d);
		//再轉為float
		//字串轉基本資料 "parseDouble"!!!!
		float f=Float.parseFloat(s);
		//轉為Float
		Float ff=new Float(f);
		//使用Float類型態的物件方法intValue
		int i=ff.intValue();
		//print
		System.out.println(i);

	}
}
