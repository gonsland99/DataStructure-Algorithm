package Search;

import java.util.*;

class AgeSearchComparator {
	static class AgeData{
		private String name;
		private int age;
		
		public AgeData(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "AgeData [name=" + name + ", age=" + age + "]";
		}
		
		public static final Comparator<AgeData> AGE_ORDER = new AgeOrderComparator();
		
		public static class AgeOrderComparator implements Comparator<AgeData>{
			public int compare(AgeData a1, AgeData a2) {
				return (a1.age > a2.age) ? 1 : (a1.age < a2.age) ? -1 : 0;
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AgeData[] x = {
				new AgeData("a",20),
				new AgeData("b",30),
				new AgeData("c",25),
				new AgeData("e",50),
				new AgeData("d",10)
		};
		
		System.out.print("몇살인 사람을 찾을까요?");
		int age = sc.nextInt();
		int idx = Arrays.binarySearch(x, new AgeData("",age), AgeData.AGE_ORDER);
		
		
		if(idx < 0)
			System.out.println("해당 나이의 사람이 없음");
		else {
			System.out.println("x["+idx+"]에 있음");
			System.out.println("해당 정보: "+x[idx]);
		}

		for(int i=0; i<x.length; i++) {
			System.out.println(x[i]+" ");
		}
	}
}
