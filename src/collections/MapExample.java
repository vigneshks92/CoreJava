package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		map1.put(1, "Suraj");
		map1.put(2, "Niraj");
		map1.put(3, "Sam");
		map1.put(10, "Nil");
		
		System.out.println(map1);
		
		//update the data in map
		map1.put(2, "John");
		System.out.println(map1);
		
		//delete the entry
		map1.remove(10);
		System.out.println(map1);
		
		System.out.println(map1.get(3));
		
		//===============================================
		
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
		
		map2.put(1, "Suraj");
		map2.put(2, "Niraj");
		map2.put(3, "Sam");
		map2.put(10, "Nil");
		
		System.out.println(map2);
		
		//===============================================
		
		TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
		
		map3.put(1, "Suraj");
		map3.put(10, "Nil");
		map3.put(2, "Niraj");
		map3.put(3, "Sam");
	
		
		System.out.println(map3);
		
		
	}

}
