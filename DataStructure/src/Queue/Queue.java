package Queue;

import java.util.ArrayList;

public class Queue<T> {
	ArrayList<T> queue = new ArrayList<T>();
	
	public void enqueue(T item) {
		queue.add(item);
	}
	public T dequeue() {
		if(queue.isEmpty()) {
			return null;
		}
		return queue.remove(0);
	}
	public static void main(String[] args) {
		Queue<Integer> q1 = new Queue<>();
		System.out.println(q1.dequeue());
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		
	}
}
