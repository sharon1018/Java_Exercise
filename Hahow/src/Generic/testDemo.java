package Generic;

import java.util.ArrayList;
import java.util.List;

public class testDemo {

	public static void main(String[] args) {
		//��@�x�����O
		Foo<String> fooObj=new Foo<String>();
		fooObj.setFoo("test");
		System.out.println(fooObj.getFoo());
		
		Foo<Double> fooObj2=new Foo<Double>();
		fooObj2.setFoo(1.3d);
		System.out.println(fooObj2.getFoo());
		
		//�q�Φr��
		Foo<? extends List> fooObj3=new Foo<ArrayList>();
		Foo<? super ArrayList> fooObj4=new Foo<List>();
		//fooObj3.setFoo(1.3d);
		//System.out.println(fooObj3.getFoo());
	}

}
