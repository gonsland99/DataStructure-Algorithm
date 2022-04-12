package Stack;

import java.util.*;

public class IntStackTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수: "+s.size()+"/"+s.capacity());
			System.out.println("1.푸시 2.팝 3.피크 4.덤프 5.종료");
			int menu = sc.nextInt();
			if(menu == 5) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.println("데이터: ");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택 가득참");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("pop데이터: "+x);
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택 비었음");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("peek데이터: "+x);
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비었음");
				}
				break;
			case 4:
				s.dump();
				break;
			}
		}
		System.out.println("종료 되었습니다.");
	}
}
