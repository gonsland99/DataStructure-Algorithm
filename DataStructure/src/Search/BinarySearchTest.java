package Search;

import java.util.*;

public class BinarySearchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력 하세요");
		System.out.print("x[0]: ");
		sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx < 0)
			System.out.println("해당값 없음");
		else
			System.out.println(key+"값은 x["+idx+"]에 있음");
	}
}
