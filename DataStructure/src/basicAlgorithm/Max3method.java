package basicAlgorithm;

public class Max3method {
	
	static int max(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		return max;
	}
	public static void main(String[] args) {
		System.out.println(max(1, 2, 3));
		System.out.println(max(1, 2, 5));
		System.out.println(max(3, 2, 1));
		System.out.println(max(1, 3, 2));
	}
}
