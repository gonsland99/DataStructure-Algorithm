package basicAlgorithm;

public class GugudanTable {
	public static void main(String[] args) {
		System.out.println("---------------곱셈표---------------");
		System.out.print(" 단 |");
		for(int i=1; i<=9; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		System.out.println("-----------------------------------");
		for(int i=2; i<=9; i++) {
			System.out.print(i+"단 |");
			for(int j=1; j<=9; j++) {
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}
	}
}
