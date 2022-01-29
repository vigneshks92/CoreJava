package test;

import java.lang.reflect.Array;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while loop to print 1 to 10
		
		int num1 = 1;
		
		while(num1<=10) {
			
			if(num1==5) {
				num1 = num1 + 1;
				continue;
			}
			
        System.out.println(num1);
        num1 = num1 + 1;
        
	}
		
		//For loop to print 1 to 10
		
		int count;
		for(count =1;count<=10;count++) {
			if(count==5) {
				break;
			}
			System.out.println("In For Loop " + count);
		}
		
		//For loop to print 10 to 1
		
		int count1;
		for(count1=10;count1>=1;count1--) {
			System.out.println("The count value " + count1);
		}
		
		//Arrat using loop
		
		int[] array1 = {10,20,30,40,50};
		
		for(int index=0;index<array1.length;index++) {
			System.out.println("Array position is " + array1[index]);
		}
		
		for(int var1:array1) {
			System.out.println(var1);
		}

}
}
