package Queue;

import java.util.*;

//링버퍼: 배열의 길이를 넘어서는 데이터 추가 시 처음부터 다시 데이터를 삽입하는 버퍼
public class LastNElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = 5;	//배열 길이
		int[] a = new int[N];
		int cnt = 0;		//입력 데이터
		int retry = 1;		//반복수행 여부
		
		System.out.println("정수 입력");
		do {
			System.out.printf("%d번째 정수: ",cnt+1);
			//배열길이N 이후 데이터는 다시 0번째부터 데이터추가
			a[cnt++ % N] = sc.nextInt();
			if(cnt > N) {
				System.out.print("계속할까요?(1.예/2.아니오)");
				retry = sc.nextInt();
			} 
		} while(retry == 1);
			
		for(int i=0; i<a.length; i++)
			System.out.printf("%2d번째 정수 = %d\n",i+1, a[i%N]);
	}
}
