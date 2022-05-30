package Array;

import java.util.Scanner;

public class DayOfYear {
	static int[][] mdays= {
		{31,28,31,30,31,30,31,31,30,31,30,31}, //평년
		{31,29,31,30,31,30,31,31,30,31,30,31}  //윤년: 4년마다 한번씩 366일
	};
	static int isLeap(int year) {
		//태양력 기준 4,400으로 나누면 0, 100으로 나누면 0이 아닌 년도를 윤년으로 판단
		return (year%4==0 && year%100!=0 ||year%400==0) ? 1 : 0; //윤년:1, 평년:0
	}
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		for(int i=1; i<m; i++)
			days += mdays[isLeap(y)][i-1];	//m-1월 일수 더하기
		return days;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("-----올해 경과 일수 구하기-----");
		do {
			System.out.print("년: "); int year = sc.nextInt();
			System.out.print("월: "); int month = sc.nextInt();
			System.out.print("일: "); int day = sc.nextInt();
			
			System.out.printf("올해 경과일: %d일",dayOfYear(year, month, day));
			
			System.out.print("한번 더 할까요?(1.예 / 0.아니오)");
			retry = sc.nextInt();
		} while(retry == 1);
	}
}
