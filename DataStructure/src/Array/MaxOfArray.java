package Array;

import java.util.Scanner;

public class MaxOfArray {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) 
				max = a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----가장 큰 키 구하기-----");
		System.out.print("사람수: ");
		int n = sc.nextInt();
		
		int[] height = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print(i+1+"번째 사람 키: ");
			height[i] = sc.nextInt();
		}
		
		System.out.println("키가 제일큰 사람은 "+maxOf(height)+"cm 입니다.");
	}
}
