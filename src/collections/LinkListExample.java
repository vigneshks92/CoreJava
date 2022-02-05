package collections;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> List1 = new LinkedList<String>();
		
		List1.add("John");
		List1.add("Donald");
		List1.add("Jessie");
		List1.addFirst("Abraham");
		List1.addLast("Jose");
		
		System.out.println(List1);
		
		for(int index = 0;index<List1.size();index++) {
			
			System.out.println(List1.get(index));
			
		}
		
		
	}

}
