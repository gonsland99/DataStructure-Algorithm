package Array;


public class PhysicalExamination {
	static class PhyscalData{
		String name;
		int height; 	
		
		PhyscalData(String name, int height){
			this.name = name;
			this.height = height;
		}
	}
	static double aveHeight(PhyscalData[] data) {
		double sum = 0;
		for(int i=0; i<data.length; i++)
			sum += data[i].height;
		return sum / data.length;
	}
	public static void main(String[] args) {
		PhyscalData[] x = {
				new PhyscalData("gon", 170),
				new PhyscalData("son", 183),
				new PhyscalData("park", 175),
				new PhyscalData("cha", 177),
				new PhyscalData("lee", 160),
		};
		System.out.println("키 검사 리스트");
		System.out.println("이름     키");
		System.out.println("-----------");
		for(int i=0; i<x.length; i++)
			System.out.printf("%-8s%3d\n",x[i].name, x[i].height);
		System.out.printf("\n평균 키: %5.1fcm\n",aveHeight(x));
	}
}
