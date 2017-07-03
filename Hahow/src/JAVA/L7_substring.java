package JAVA;

public class L7_substring {

	public static void main(String[] args) {
		// 放一個變數:從哪裡開始取道結束; 兩個變數:取其中一部分
		String str="abcdef";
		System.out.println(str.substring(0, 4));//abcd,含頭不含尾
		//source code: : new String(value, beginIndex, subLen);
	}

}
