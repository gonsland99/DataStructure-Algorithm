package basicAlgorithm;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----세정수 중 최대값 구하기-----");
		System.out.print("1번째 정수: "); int a = sc.nextInt();
		System.out.print("2번째 정수: "); int b = sc.nextInt();
		System.out.print("3번째 정수: "); int c = sc.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최댓값은 "+max);
	}
}
