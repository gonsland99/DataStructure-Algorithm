package sort;

import java.util.Scanner;

public class SelectionSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	static void selectSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++)
				if(a[j] < a[min])
					min = j;
			swap(a, i, min);
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
		selectSort(a, n);
		for(int i=0; i<n-1; i++)
			System.out.print(a[i]+" ");
		
	}
}
