package JAVA;

public class HW1 {

	public static void main(String[] args) {
		//double d=3.14
		double d=3.14;
		//d�ഫ���r��
		//�򥻸����r�� "valueOf"!!!!!
		String s=String.valueOf(d);
		//�A�ରfloat
		//�r����򥻸�� "parseDouble"!!!!
		float f=Float.parseFloat(s);
		//�ରFloat
		Float ff=new Float(f);
		//�ϥ�Float�����A�������kintValue
		int i=ff.intValue();
		//print
		System.out.println(i);

	}
}
