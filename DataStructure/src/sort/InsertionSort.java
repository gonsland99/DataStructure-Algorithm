package sort;

import java.util.Scanner;

public class InsertionSort {
	static void insertSort(int[] a, int n) {
		for(int i=0; i<n; i++) {
			int j;
			int tmp = a[i];
			for(j=i; j>0&&a[j-1]>tmp; j--)
				a[j] = a[j-1];
			a[j] = tmp;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----선택정렬-----");
		System.out.print("총 개수: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]: ");
			a[i] = sc.nextInt();
		}
		insertSort(a, n);
		for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
		
	}
}
