package Queue;

import java.util.*;

public class IntQueueTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue s = new IntQueue(64);
		
		while(true) {
			System.out.println("현재 데이터 수: "+s.size()+"/"+s.capacity());
			System.out.println("1.인큐 2.디큐 3.피크 4.덤프 5.종료");
			int menu = sc.nextInt();
			if(menu == 5) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.println("데이터: ");
				x = sc.nextInt();
				try {
					s.enqueue(x);
				}catch(IntQueue.OverflowIntQueueException e) {
					System.out.println("큐가 가득참");
				}
				break;
			case 2:
				try {
					x = s.dequeue();
					System.out.println("디큐한 데이터: "+x);
				} catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비었음");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터: "+x);
				} catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비었음");
				}
				break;
			case 4:
				s.dump();
				break;
			}
		}
	}
}
