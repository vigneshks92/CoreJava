package test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {10,20,30,40};
		System.out.println("The length of the Array is " + num1.length);
		System.out.println("The number at 3rd position is " + num1[2]);
		System.out.println("The last number of the Array is " + num1[num1.length -1]);
		
		String[] name1 = {"abc" ,"xyz" ,"ccc"};
		System.out.println("The number at 3rd position is " + name1[2]);
		
		String name2 = "Clean India Green India";
		
		String[] Arraywords = name2.split(" ");
		System.out.println("The third array is " + Arraywords[2]);
		System.out.println("The total length of Array is " + Arraywords.length);
		

	}

}
