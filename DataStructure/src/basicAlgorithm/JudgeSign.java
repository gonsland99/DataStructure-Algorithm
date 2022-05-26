package basicAlgorithm;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----양수, 음수, 0 판단하기-----");
		System.out.print("판단할 정수 입력: ");
		int n = sc.nextInt();
		
		if(n > 0)
			System.out.println("양수");
		else if(n == 0)
			System.out.println("0");
		else
			System.out.println("음수");
	}
}
