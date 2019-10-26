package ch03;

public class While {
	public static void main(String[] args) {
		
		int num = 123456789;
		
		while(num > 0) { //0이 될 때 까지 반복
			int num1 = num % 10; //5
			num = num / 10; //1234
			System.out.println(num1);
		} 
		
	}
	
}
