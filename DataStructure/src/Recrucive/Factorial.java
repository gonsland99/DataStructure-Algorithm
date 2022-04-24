package Recrucive;

import java.util.*;

public class Factorial {
	static int factorial(int n) {
		if(n>0)
			return n * factorial(n-1);
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("팩토리얼 크기 지정: ");
		int x = sc.nextInt();
		
		System.out.println(x+"팩토리얼 결과: "+factorial(x));
	}
}
