package Search;

import java.util.*;

public class SeqSearch2 {
	//보초법: 배열의 끝에 검색값을 추가하여 검색조건을 줄이는 방식 
	static int seqSearch(int[] a, int n, int key) {
		int i=0;
		a[n] = key; //검색값 배열에 추가
		while(true) {
			if(a[i]==key)
				break;
			i++;
		}
		return i==n ? -1 : i; //검색조건이 하나
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int exit = -1; //프로그램 종료조건
		
		System.out.print("데이터 개수: ");
		int num = sc.nextInt();
		int[] x = new int[num+1]; //배열 끝에 검색값을 추가하기 위해 +1해줌(보초법)
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		while(exit == -1) {
			
			System.out.print("검색할 값: ");
			int key = sc.nextInt();
			int idx = seqSearch(x, num, key); //x:배열, num:배열크기, key:검색값
			
			if(idx == -1) {
				System.out.println("존재하지 않는 값!");
				exit = -1;
			}else {
				System.out.println(key+"은(는) "+"x["+idx+"]에 있음!!");
				exit = 0;
			}
			System.out.println("-----------------");
		}
		
	}
}
