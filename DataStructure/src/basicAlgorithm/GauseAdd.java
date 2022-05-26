package basicAlgorithm;

public class GauseAdd {
	//가우스 덧셈 공식 
	//1~n까지 합은 (1+n)*(n/2)와 같다.
	static int gauseAdd(int n) {
		int sum;
		if(n%2 == 0)
			sum = (1+n)*(n/2);
		else
			sum = (1+n)*(n/2)+(n/2)+1;
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(gauseAdd(5));
		System.out.println(gauseAdd(3));
		System.out.println(gauseAdd(4));
		System.out.println(gauseAdd(10));
	}
}
