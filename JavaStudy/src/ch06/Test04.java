package ch06;

public class Test04 {
	
	static void dilemma(boolean a, boolean b) {
		
		if( a && !b) {
			System.out.println("B 10�� ����");
		}else if(a==true && b==true) {
			System.out.println("�Ѵ� ����");
		}else if(a==false && b==true) {
			System.out.println("A 10�� ����");
		}
		else if(a==false && b==false) {
			System.out.println("�Ѵ� ����");
		}
		
	}
	
	public static void main(String[] args) {
		
}
}
