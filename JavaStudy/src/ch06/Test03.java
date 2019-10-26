package ch06;

public class Test03 {
	
	static void getLastYear(int m) {
		//1~12월의 각 막달을 적어둔다. 배열로 각 순서가 적힌다.
		int[] month= {
				31,28,31,30,31,
				30,31,31,30,31,
				30,31
		};
		int date = month[m-1]; //0부터 시작하니 1을 뺀다
		System.out.println(date);
		
		//이것도 맞지만 좋은 코딩은 아님
//		int[] a = {1,3,5,7,8,10,12};
//		int[] b = {4,6,9,11};
//		
//		
//		int month =3;
//		for(int i =0; i< a.length; i++) {
//			if(a[i] ==month) {
//				System.out.println(31);
//			}
//		}
//		for(int i =0; i< b.length; i++) {
//			if(b[i] ==month) {
//				System.out.println(30);
//			}
//		}
		
	}
	
	public static void main(String[] args) {
		
		getLastYear(6);
		
	}

}
