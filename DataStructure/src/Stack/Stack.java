package Stack;

import java.util.ArrayList;

public class Stack<T> {
	ArrayList<T> stack = new ArrayList<>();
	
	public void push(T item) {
		stack.add(item);
	}
	public T pop() {
		if(stack.isEmpty()) {
			return null;
		}
		return stack.remove(stack.size()-1);
	}
	
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		System.out.println(s1.pop());
		s1.push(1);
		s1.push(2);
		s1.push(3);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
	}
}
