package JAVA;

public class HW3_BMI {

	public static void main(String[] args) {
	HW3_BMI demo=new HW3_BMI();
	System.out.println(demo.BMI(164, 51));

	}
	
	public double BMI(double height, double weight) {
		double result=weight/((height/100)*(height/100));
		return result;
		
	}

}
