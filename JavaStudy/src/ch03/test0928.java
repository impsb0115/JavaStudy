package ch03;

import java.util.Scanner;//가져오기

public class test0928 {
	public static void main(String[] args) {

		boolean result = 1 + 2 / 2 >= 1 + 1 * 2;
		System.out.println(result);

		System.out.println("----------");

		double div = (double) 5 / 2;
		System.out.println("나누기 결과 : " + div);

		System.out.println("----------");

		int 피제수 = 23;
		int 제수 = 5;
		int 몫 = 피제수 / 제수;
		int 나머지 = 피제수 % 제수;

		/* 몫 구하기 */
		/* 나머지 구하기 */
		System.out.println("몫 : " + 몫);
		System.out.println("나머지 : " + 나머지);

		System.out.println("----------");

		int num = 456;
		System.out.println(num / 100 * 100); // 나누기, 곱하기 연산자 이용
		System.out.println(num - num % 100); // 456-56 = 400

		System.out.println("----------");

		Scanner scanner = new Scanner(System.in); //라이브러리 import하기. (입력값 가져오기)
		System.out.print("2자리수 정수 입력(10~99)>>");
		int n = scanner.nextInt();
		int ten = 0; // 10의 자리 수를 저장할 변수
		int one = 0; // 1의 자리 수를 저장할 변수
		boolean isMatch = false; // 두 자리 수 비교 값을 저장할 변수
		
		/* ten 변수에 10의 자리 수 대입 */
		ten = n/10;
		
		/* one 변수에 1의 자리 수 대입 */
		n= n%10;
		
		/* isMatch 변수에 두 개의 자리 수 비교 값 저장 */
		isMatch = ten==one;
		
		System.out.println(isMatch);
		scanner.close();
		
		System.out.println("----------");
		
		int num0 = 12345;
		int num1 = num0 % 10; //5
		num0 = num0 / 10; //1234
		int num2 = num0 % 10; //4
		num0 = num0 / 10; //123
		int num3 = num0 % 10; //3
		num0 = num0 / 10; //12
		int num4 = num0 % 10; //2
		num0 = num0 / 10; //1
		int num5 = num0 % 10; //1
		num0 = num0 / 10; //0
		

		 int total = num1 + num2 + num3 + num4 + num5;
		 System.out.println("각 자리 숫자의 합 : " + total);
		
	}
}
