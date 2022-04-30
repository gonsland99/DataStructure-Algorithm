package Recrucive;

import java.util.Scanner;

import Stack.IntStack;

public class Recur {
//	static void recur(int n) {
//		if(n>0) {
//			recur(n-1);
//			System.out.println(n);
//			recur(n-2);
//		}
//	}
//	static void recur(int n) {
//		while(n>0) {
//			recur(n-1);
//			System.out.println(n);
//			n = n-2;		//꼬리재귀의 제거
//		}
//	}
	static void recur(int n) {
		IntStack s = new IntStack(n);	//스택을 이용한 비재귀적 표현
		while(true) {
			if(n>0) {
				s.push(n);
				n = n-1;
				continue;
			}
			if(s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n-2;
				continue;
			}
			break;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력: ");
		int x = sc.nextInt();
		
		recur(x);
	}
}
