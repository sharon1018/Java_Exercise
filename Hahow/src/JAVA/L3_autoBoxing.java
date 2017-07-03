package JAVA;

public class L3_autoBoxing {

	public static void main(String[] args) {
		//valueof
		double d1=3.14;
		Double d2=Double.valueOf(d1);
		System.out.println(d2);
		
		//autoboxing
		double d3=3.14;
		Double d4=d3;
		System.out.println(d4);
		
		//autounboxing
		Double d5=new Double(3.14);//物件
		/*若是Double d5=null -->編譯沒有問題,執行有exception
		因為它背後是 double d6=d5.doublValue(); 而d5現在是null*/
		double d6=d5;//基本型別
		System.out.println(d6);
	}
}
