package JAVA;

public class L13_foreach {

	public static void main(String[] args) {
		int[] array= {1,2,3};
		int sum=0, sum2=0;
		
		for(int m: array) {
			sum2+=m;
			System.out.println(sum2);//foreach會把陣列的值傳給m(迭代)
		}
		
		for(int i=0;i<array.length;i++) {  //method 2
			sum+=array[i];
			System.out.println(sum);
		}

	}

}
