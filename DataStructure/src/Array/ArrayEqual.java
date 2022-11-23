package Array;

import java.util.Scanner;

public class ArrayEqual {
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) return false;
		for(int i=0; i<a.length; i++)
			if(a[i] != b[i]) return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 배열 값 동일여부 비교하기");
		System.out.print("배열길이: "); 
		int num = sc.nextInt();
		System.out.println("배열 a ============");
		int[] a = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print(i+"번째 수: ");
			a[i] = sc.nextInt();
		}
		System.out.println("배열 b ============");
		int[] b = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print(i+"번째 수: ");
			b[i] = sc.nextInt();
		}
		boolean same = equals(a, b);
		System.out.println(same ? "같음":"다름");
		
	}
}
