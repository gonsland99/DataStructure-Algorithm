package Array;

import java.util.*;

public class CardConvRev {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEF";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while(x != 0);
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;		//변환전 정수
		int cd;		//기수
		int dno;	//변환 후 자릿수
		int retry;	//다시
		char[] cno = new char[32];	//변환 후 숫자 배열
		
		System.out.println("10진수 기수 변환------");
		do {
			do {
				System.out.println("변환할 정수 입력(양수만): ");
				no = sc.nextInt();
			} while(no <0);
			do {
				System.out.println("몇진수로 변환 할까요?(2~16진수)");
				cd = sc.nextInt();
			}while(cd<2 || cd>16);
			dno = cardConvR(no, cd, cno);
			
			System.out.println(cd+"진수: ");
			for(int i=dno-1; i>=0; i--)
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.println("한번 더 할레?(1.예/2.아니오)");
			retry = sc.nextInt();
		}while(retry == 1);
	}
}
