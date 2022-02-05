package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> Stack1 = new Stack<Integer>();
		
		Stack1.push(4);
		Stack1.push(8);
		Stack1.push(12);
		Stack1.pop();
		Stack1.push(20);
		
		System.out.println(Stack1);
		System.out.println(Stack1.peek());

	}

}
