package JAVA;

public class L9_replace {

	public static void main(String[] args) {
		// replace
		String str="aabcc123";
		System.out.println(str.replace("a","f"));
		//relaceAll(���W��ܪk, , )�Ĥ@�Ӥ���J�@�θ�replace�@��
		System.out.println(str.replaceAll("[a-z]","?"));
		/*���W��ܪk
		 * \d:�Ҧ��Ʀr 	
		 * \D:�D�Ʀr
		 * [a-zA-Z]:�Ҧ��r��
		 * java.util.regex.Pattern
		 * */
		
		//startswith
		System.out.println(str.startsWith("a"));
		//endswith
		System.out.println(str.endsWith("3"));
	}

}
