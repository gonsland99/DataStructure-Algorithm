package basicAlgorithm;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----1부터 n까지 합 구하기-----");
		System.out.print("n의 값: ");
		int n = sc.nextInt();
		int sum = 0;
		/*
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		*/
		for(int i=1; i<=n; i++)
			sum += i;
		System.out.println("결과: "+sum);
	}
}
