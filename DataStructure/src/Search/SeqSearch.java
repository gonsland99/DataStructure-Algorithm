package Search;

import java.util.*;

public class SeqSearch {
	static int seqSearch(int[] a, int n, int key) {
		int i=0;
		while(true) {
			//배열크기n까지 반복하면 return(종료)
			if(i==n)
				return -1;
			if(a[i]==key)
				return i;
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int exit = -1; //프로그램 종료조건
		
		while(exit == -1) {
			System.out.print("데이터 개수: ");
			int num = sc.nextInt();
			int[] x = new int[num];
			
			for(int i=0; i<num; i++) {
				System.out.print("x["+i+"]: ");
				x[i] = sc.nextInt();
			}
			
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
