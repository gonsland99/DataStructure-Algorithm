package Recrucive;

import java.util.*;

public class EuclidGCD {
	//최대공약수(유클리드 호제법)
	static int gcd(int x, int y) {
		if(y==0)
			return x;
		else
			return gcd(y, x%y);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두정수의 최대공약수 구하기--------");
		System.out.print("a: "); int x = sc.nextInt();
		System.out.print("b: "); int y = sc.nextInt();
		
		System.out.println("최대공약수 "+gcd(x, y));
	}
}
