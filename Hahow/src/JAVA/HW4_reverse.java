package JAVA;

public class HW4_reverse {

	public static void main(String[] args) {
		int num=-987654;  //�D��
		if(num>0) {
			System.out.println((reverse(num)));
		}
		else {
			num=-num;//�������t��
			char[] answer= reverse(num);
			System.out.print("-");//�t���[�^�h
			System.out.println(answer);
		}
	}
	
	public static char[] reverse(int num) {
		String str=String.valueOf(num); //�N�D�إ��ର�r��
		char[] array=str.toCharArray(); //��J�r���}�C��
		char[] result=new char[array.length]; //�@�s�}�C�s��REVERSE�L�᪺���G
		
		for(int i=0;i<array.length;i++) {
			result[i]=array[array.length-i-1];//�̫�@�Ӧr����J�Ĥ@��(reverse)
		}
		return result;	//�^�ǫ��A����char[]	
	}
}
