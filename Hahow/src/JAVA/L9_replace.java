package JAVA;

public class L9_replace {

	public static void main(String[] args) {
		// replace
		String str="aabcc123";
		System.out.println(str.replace("a","f"));
		//relaceAll(正規表示法, , )第一個不輸入作用跟replace一樣
		System.out.println(str.replaceAll("[a-z]","?"));
		/*正規表示法
		 * \d:所有數字 	
		 * \D:非數字
		 * [a-zA-Z]:所有字母
		 * java.util.regex.Pattern
		 * */
		
		//startswith
		System.out.println(str.startsWith("a"));
		//endswith
		System.out.println(str.endsWith("3"));
	}

}
