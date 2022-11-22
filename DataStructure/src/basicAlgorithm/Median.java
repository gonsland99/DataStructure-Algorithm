package basicAlgorithm;

public class Median {
	static int mid(int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;
	}
	public static void main(String[] args) {
		System.out.println(mid(1,2,3));
		System.out.println(mid(3,2,1));
		System.out.println(mid(3,0,5));
		System.out.println(mid(-1,2,-3));
	}
}
