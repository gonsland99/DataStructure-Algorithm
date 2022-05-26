package basicAlgorithm;

import java.util.Scanner;

public class SumForPos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("-----1부터 n까지 합 구하기-----");
		//do-while을 이용
		//n이 0과 같거나 작으면 무한반복(사후 판단)
		//사후판단: 일단 실행되고 해당조건으로 판단
		do {
			System.out.print("n의 값: ");
			n = sc.nextInt();
		}while(n <= 0);
		int sum = 0;
		
		for(int i=1; i<=n; i++)
			sum += i;
		System.out.println("결과: "+sum);
	}
}
