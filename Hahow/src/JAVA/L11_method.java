package JAVA;

public class L11_method {

	public static void main(String[] args) { //�D�{���Q�ϥ�sayHello(�b11_method�U)��k,�]�L���O�R�A���ݭnnew�X��
		L11_method test=new L11_method();
		System.out.println(test.sayHello("Ryan"));
	}
	
	public String sayHello(String name) {   //�^�Ǧr��,�ǤJ�Ȥ]�O�r��
		String ret="Hello " +name;
		
		return ret;  //�⵲�G�^�ǥX�h,���t�X�W�z����ƫ��A(String)
		
	}
}
