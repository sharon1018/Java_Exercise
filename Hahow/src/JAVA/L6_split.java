package JAVA;

public class L6_split {

	public static void main(String[] args) {
		// �N�r����}�C
		String str= "id, name, birth";
		String[] sArray=str.split(",");
		System.out.println(sArray[1]);
		System.out.println(sArray[1].trim());//trim():�ťծ���

	}

}
