package ch06;

public class MethodExam3 {
	
	static int nextInt(int ... bound) { // ...����� ��� �޾Ƶ���. ���� ��������� ����.
		return 0;
	}
	
	
	 
	static int nextInt(int bound) {
		double num=  Math.random(); //0.0 <= x  <1.0
		//System.out.println(num);
		int result = (int)(num *bound); // bound�� 10�̴�. 0.0 <= x <10  	. double�� ũ�� ������ int�� ����ȯ�ϱ�	
		return result;
	}
	public static void main(String[] args) {
		nextInt(1,2,3,4,5);
		
		int num= nextInt(10);
		System.out.println(num); //���� 10�� ������ ����.
}
}
