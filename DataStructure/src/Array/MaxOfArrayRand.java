package Array;

import java.util.*;

public class MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Random rand = new Random();
		
		System.out.println("제일 큰 수 찾기(1~50)");
		System.out.print("숫자 개수: ");
		int count = sc.nextInt();
		
		int[] nums = new int[count];
		System.out.println("-----결과-----");
		System.out.print("숫자 목록: ");
		for(int i=0; i<count; i++) {
			//nums[i] = rand.nextInt(50)+1;
			nums[i] = (int)(Math.random()*49+1);
			System.out.print(nums[i]+" ");
		}System.out.println();
		System.out.println("최대값: "+maxOf(nums));
		
	}
}
