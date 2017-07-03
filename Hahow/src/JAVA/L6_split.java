package JAVA;

public class L6_split {

	public static void main(String[] args) {
		// 將字串轉陣列
		String str= "id, name, birth";
		String[] sArray=str.split(",");
		System.out.println(sArray[1]);
		System.out.println(sArray[1].trim());//trim():空白消失

	}

}
