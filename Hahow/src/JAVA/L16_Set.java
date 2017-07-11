package JAVA;

import java.util.HashSet;
import java.util.Set;

public class L16_Set {
	//set沒有get方法,因為他沒有依序排列故沒有index

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		set.add("t1");
		set.add("t2");
		set.add("t3");
		
		set.remove("t2");
		System.out.println(set.size());
		
		for(String s : set) {
			System.out.println(s);
		}
		

	}

}
