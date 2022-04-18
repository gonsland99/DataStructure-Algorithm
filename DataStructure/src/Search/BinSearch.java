package Search;

import java.util.*;

//이진검색	: 배열의 가운데를 기준으로 줄여나가며 검색
//선형검색에 비해 복잡도가 낮다(실행시간,사용하는공간 효율이 좋음)
class BinSearch {
	//이진검색 메서드
	static int binSearch(int[] a, int n, int key) {	//배열:a n:요소수 key:검색값
		int pl = 0;		//왼쪽값
		int pr = n-1;	//오른쪽값
		
		do {
			int pc = (pl+pr) / 2;
			if(a[pc] == key)
				return pc;
			else if(a[pc] < key)
				pl = pc+1;
			else
				pr = pc-1;
		} while(pl <= pr);
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 값을 입력하세요!");
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i] = sc.nextInt();
			} while(x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		
		int idx = binSearch(x, num, key);
		
		if(idx == -1)
			System.out.println(key+"는 없습니다.");
		else
			System.out.println(key+"는 x["+idx+"]에 있습니다.");
	}
}
