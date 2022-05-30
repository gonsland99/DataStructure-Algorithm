package Array;

import java.util.Scanner;

public class MaxOfArray {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----가장 큰 키 구하기-----");
		System.out.print("사람수: ");
		int n = sc.nextInt();
		
		int[] h = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print((i+1)+"번째 사람 키: ");
			h[i] = sc.nextInt();
		}
		
		System.out.println("가장 큰 사람의 키: "+maxOf(h)+"cm");
	}
}
