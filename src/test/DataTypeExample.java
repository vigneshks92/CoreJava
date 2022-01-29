package test;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 20;
		int num2 = 30;
		
		int sum = num1 + num2;
		int sub = num2 - num1;
		int mul = num1 * num2;
		float div = (float) num2 / num1;
		
//		String result = "The sum of two numbers is " + sum;
		System.out.println("The sum of two numbers is " + sum);
		System.out.println("The sub of two numbers is " + sub);
		System.out.println("The mul of two numbers is " + mul);
		System.out.println("The div of two numbers is " + div);
		
		String name = "Clean India Green India";
		System.out.println("Total number of char is" + name.length());
		
		char char1 = name.charAt(0);
		char char2 = name.charAt(name.length() -1);
		System.out.println("Character at first place is " + char1);
		System.out.println("Character at first place is " + char2);
		
		System.out.println("The string in uppercase is " + name.toUpperCase());
		System.out.println("The string in lowercase is " + name.toLowerCase());

	}

}
