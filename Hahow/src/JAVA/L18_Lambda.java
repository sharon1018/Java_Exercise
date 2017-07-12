package JAVA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L18_Lambda {//��@�@����
	//�i�H�ۤv��@�Ψϥβ{�����R�A��k
	public static void main(String[] args) {
		//�إߤ�����ܼƦA��lambda��@
		Comparator<Integer> com=(x,y)->x-y; //�����w�g�w�q���A���ܫ᭱��J�ȴN���ݦA�@�w�q
		int result=com.compare(5,2);//comparator�̭���compare��k
		System.out.println(result);
		
		//JAVA8���s�\��:forEach
		List<String> list=new ArrayList<String>();//�إ�list����
		list.add("t1");
		list.add("t2");
		list.add("t3");
		list.forEach(name -> System.out.println(name));//�N���X���C�Ӹ�ƶǤJ�A�C�L�X��
		
		//�β{�����R�A��k
		Comparator<Integer> com1=Math::subtractExact;//���g�JMATH�o�ӦW�٦b�g�J�L���R�A��k
		int result1=com1.compare(5, 2);
		System.out.println(result);

	}

}
