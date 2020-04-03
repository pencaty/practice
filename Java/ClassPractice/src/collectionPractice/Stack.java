package collectionPractice;

import java.util.ArrayList;

class Mystack {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("empty stack");
			return null;
		}
		return arrayStack.remove(len-1);
	}
}

public class Stack {
	
	public static void main(String[] args) {
		Mystack stack = new Mystack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
