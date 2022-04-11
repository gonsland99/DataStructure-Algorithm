package basicAlgorithm;

public class Triangle {
	public static void main(String[] args) {
		int floor = 3;
		//삼각형
		for(int i=0; i<=floor; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//대칭삼각형
		for(int i=0; i<=floor; i++) {
			for(int j=0; j<=floor-(i+1); j++)
				System.out.print(" ");
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
		//역삼각형
		for(int i=0; i<=floor; i++) {
			for(int j=0; j<=floor-i; j++)
				System.out.print("*");
			for(int j=0; j<=i; j++)
				System.out.print(" ");
			System.out.println();
		}
		//대칭 역삼각형
		for(int i=0; i<=floor; i++) {
			for(int j=0; j<=i-1; j++)
				System.out.print(" ");
			for(int j=0; j<=floor-i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
