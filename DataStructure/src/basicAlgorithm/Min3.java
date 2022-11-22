package basicAlgorithm;

public class Min3 {
	static int min(int a, int b, int c) {
		int min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		
		return min;
	}
	public static void main(String[] args) {
		System.out.println(min(1,2,3));
		System.out.println(min(1,2,5));
		System.out.println(min(5,2,1));
		System.out.println(min(1,5,2));
		System.out.println(min(10,1,-3));
	}
}
