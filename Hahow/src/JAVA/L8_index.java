package JAVA;

public class L8_index {
	//�Msubstring�@�_�ϥ�, �z�L�r�������ޭȦb��Jsubstring���ѼƤ�
	public static void main(String[] args) {
		String str="aabbccdd";
		// indexOf
		System.out.println(str.indexOf("a"));
		//lastIndexOf
		System.out.println(str.lastIndexOf("b"));
		//print:bbcc
		System.out.println(str.substring(str.indexOf("b"),str.lastIndexOf("c")+1));
		
		
		//contains
		System.out.println(str.contains("z"));

	}

}
