package ch06;


public class Test02 {
	//�� ���� ���� a, b�� �ԷµǾ��� �� a �� b ���̿� ���� ��� ������ ���� ��ȯ�ϴ�  getBetweenSum �޼ҵ� �����
	
	static void getBetweenSum(int a, int b) {
		int total = 0;
		
		//a�� b ��ġ �ٲٱ�
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
