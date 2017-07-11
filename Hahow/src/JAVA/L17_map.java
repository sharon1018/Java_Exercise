package JAVA;

import java.util.HashMap;
import java.util.Map;

public class L17_map {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String,Integer>();
		map.put("t1",1);
		map.put("t2",2);
		map.put("t3",3);
		
		System.out.println(map.get("t2"));
		//map.remove("t2");
		
		for(String key:map.keySet()) {//先將KEY都撈出來再取出KEY
			System.out.println(map.get(key));
		}
	}

}
