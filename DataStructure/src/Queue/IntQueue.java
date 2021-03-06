package Queue;

public class IntQueue {
	private int max;	//queue capacity
	private int front;	//첫번째 요소
	private int rear;	//마지막 요소
	private int num;	//현재 데이터 수
	private int[] que;	//큐 배열
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	public int enqueue(int x) throws OverflowIntQueueException{
		if(num >= max)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear == max)
			rear = 0;
		return x;
	}
	public int dequeue() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	public int peek() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i+front) % max;
			if(que[idx] == x)
				return idx;
		}
		return -1;
	}
	public void clear() {
		num = front = rear = 0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return num;
	}
	public boolean isEmpty() {
		return num <= 0;
	}
	public boolean isFull() {
		return num >= max;
	}
	public void dump() {
		if(num <= 0)
			System.out.println("큐가 비었음");
		else {
			for(int i=0; i<num; i++)
				System.out.print(que[(i+front) % max]+" ");
			System.out.println();
		}
	}
}
