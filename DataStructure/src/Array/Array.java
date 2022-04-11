package Array;

public class Array {
	public static void main(String[] args) {
		Integer[][][] data_list = {
				{
					{0, 2},
					{10, 0}
				},
				{
					{0, 8},
					{10, 0}
				}
		};
		
		System.out.println( data_list[1][0][1] );	//8
		System.out.println( data_list[1][1][0] );	//10
		System.out.println( data_list[0][0][1] );	//2
	}
}
