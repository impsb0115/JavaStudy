package ch06;


public class Test02 {
	//두 개의 정수 a, b가 입력되었을 때 a 와 b 사이에 속한 모든 정수의 합을 반환하는  getBetweenSum 메소드 만들기
	
	static void getBetweenSum(int a, int b) {
		int total = 0;
		
		//a와 b 위치 바꾸기
		int temp=0;
		if(a >b) {
			temp =a;
			a=b;
			b=temp;
		}
		 
		for(int i=a; i<=b;i++) {
			
			total +=i;
		}
		System.out.println(total);
	}
	
	
//	static void getBetweenSum(int a,int b) {
//		
//		int number = 0;
//		for(int i=a; i<=b;i++) {
//			 
//			number +=i;
//			
//		}
//		System.out.println(number);
//	}
	
	public static void main(String[] args) {
		
		getBetweenSum(5,3);
		
	}

}
