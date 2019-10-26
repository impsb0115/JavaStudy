package ch06;

public class Test04 {
	
	static void dilemma(boolean a, boolean b) {
		
		if( a && !b) {
			System.out.println("B 10년 복역");
		}else if(a==true && b==true) {
			System.out.println("둘다 석방");
		}else if(a==false && b==true) {
			System.out.println("A 10년 복역");
		}
		else if(a==false && b==false) {
			System.out.println("둘다 복역");
		}
		
	}
	
	public static void main(String[] args) {
		
}
}
