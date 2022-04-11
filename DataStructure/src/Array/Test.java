package Array;

public class Test {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = a.clone();
		b[2] = 5;
		//복제된 변수의 주소값은 다름
		System.out.println(a);	//123a439b
		System.out.println(b);	//7de26db8
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
		}
	}
}
