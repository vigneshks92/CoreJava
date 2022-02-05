package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ArrayList1 = new ArrayList<String>();
		
		ArrayList1.add("Vignesh");
		ArrayList1.add("Dhivya");
		ArrayList1.add("Sriyan");
		ArrayList1.add("Mangai");
		ArrayList1.add("Hariesh");
		
		System.out.println("The Size of the Array List is " + ArrayList1.size());
		System.out.println(ArrayList1);
		
		ArrayList1.remove(0);
		
		System.out.println("The Size of the Array List is " + ArrayList1.size());
		System.out.println(ArrayList1);
		System.out.println("The Array at 0 index is " + ArrayList1.get(0));
		
		ArrayList1.set(1, "Wife");
		
		for (int index=0;index<ArrayList1.size();index++) {
			
			System.out.println(ArrayList1.get(index));
		}
		
		for (String Name:ArrayList1) {
			
			System.out.println(Name);
		}
		
		Iterator<String> Itr = ArrayList1.iterator();
		
		while (Itr.hasNext()) {
			
			System.out.println(Itr.next());
		}
		
		Collections.sort(ArrayList1);
		System.out.println(ArrayList1);

	}

}
