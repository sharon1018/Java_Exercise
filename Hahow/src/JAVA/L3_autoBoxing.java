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
		Double d5=new Double(3.14);//����
		/*�Y�ODouble d5=null -->�sĶ�S�����D,���榳exception
		�]�����I��O double d6=d5.doublValue(); ��d5�{�b�Onull*/
		double d6=d5;//�򥻫��O
		System.out.println(d6);
	}
}
