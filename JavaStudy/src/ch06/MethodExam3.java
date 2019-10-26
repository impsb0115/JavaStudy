package ch06;

public class MethodExam3 {
	
	static int nextInt(int ... bound) { // ...사용경우 모두 받아들임. 자주 사용하지는 않음.
		return 0;
	}
	
	
	 
	static int nextInt(int bound) {
		double num=  Math.random(); //0.0 <= x  <1.0
		//System.out.println(num);
		int result = (int)(num *bound); // bound는 10이다. 0.0 <= x <10  	. double가 크기 때문에 int로 형변환하기	
		return result;
	}
	public static void main(String[] args) {
		nextInt(1,2,3,4,5);
		
		int num= nextInt(10);
		System.out.println(num); //절대 10이 나오지 않음.
}
}
