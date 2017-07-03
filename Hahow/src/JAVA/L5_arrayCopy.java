package JAVA;

import java.util.Arrays;

public class L5_arrayCopy {

	public static void main(String[] args) {
		//arrays.copyOf(原始陣列,長度)
		int n[]={1,2};
		int[] n2=Arrays.copyOf(n,2);
		n2[1]=3;
		System.out.println(n[1]);//沒有變
		
		//reference及物件實體的差別
		int[] num1={1,2};
		int[] num2=num1;//num1的物件reference參照到num2參照到同一個地方
		num2[1]=3;
		System.out.println(num1[1]);//也被改成3了(refer指向同一個實體)
		
	}

}
