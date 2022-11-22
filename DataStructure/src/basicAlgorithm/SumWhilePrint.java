package basicAlgorithm;

import java.util.Scanner;

public class SumWhilePrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지 합구하기");
		System.out.print("n값 : ");
		int n = sc.nextInt();
		int sum = 0;
		
		System.out.println("1부터 "+n+"까지 합은");
		for(int i=1; i<=n; i++) {
			sum += i;
			if(i==n) {
				System.out.print(i+" = "+sum);
			}else{
				System.out.print(i+"+");
			}
		}
	}
}
