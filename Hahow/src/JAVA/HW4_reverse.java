package JAVA;

public class HW4_reverse {

	public static void main(String[] args) {
		int num=-987654;  //題目
		if(num>0) {
			System.out.println((reverse(num)));
		}
		else {
			num=-num;//先移除負號
			char[] answer= reverse(num);
			System.out.print("-");//負號加回去
			System.out.println(answer);
		}
	}
	
	public static char[] reverse(int num) {
		String str=String.valueOf(num); //將題目先轉為字串
		char[] array=str.toCharArray(); //放入字元陣列中
		char[] result=new char[array.length]; //一新陣列存放REVERSE過後的結果
		
		for(int i=0;i<array.length;i++) {
			result[i]=array[array.length-i-1];//最後一個字元放入第一個(reverse)
		}
		return result;	//回傳型態須為char[]	
	}
}
