package test;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		
		int num = scanner.nextInt();
		
		if(num%2==0) {
			System.out.println("Its a Even Number");
		}else {
			System.out.println("Its a Odd Number");
		}
		
		scanner.close();

	}

}
