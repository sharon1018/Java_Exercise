package JAVA;

import java.util.Arrays;

public class L5_arrayCopy {

	public static void main(String[] args) {
		//arrays.copyOf(��l�}�C,����)
		int n[]={1,2};
		int[] n2=Arrays.copyOf(n,2);
		n2[1]=3;
		System.out.println(n[1]);//�S����
		
		//reference�Ϊ�����骺�t�O
		int[] num1={1,2};
		int[] num2=num1;//num1������reference�ѷӨ�num2�ѷӨ�P�@�Ӧa��
		num2[1]=3;
		System.out.println(num1[1]);//�]�Q�令3�F(refer���V�P�@�ӹ���)
		
	}

}
