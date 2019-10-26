package ch06;

import java.util.Random;

public class MethodExam1 {

	// 메소드 만들기
	static void print(int count, char ch) { // static 넣어야 호출가능

		for (int i = 0; i < count; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(ch);
			}
			System.out.println();
		}

	}

	// string 변수로 선언
	static String print2(int count, char ch) { // but print일때 (int count, char ch,int a)이름이 동일해도 인자 수량이 다르면 구분가능.

		String result = "";// 누적
		for (int i = 0; i < count; i++) {
			for (int j = 0; j <= i; j++) {

				// System.out.print(ch);
			result = result + ch;

			}
			// System.out.println();
			result = result + "\n";
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(print2(5,'&'));

		//print(5, '@'); // 메소드 호출 첫번째 출력은 @로 출력

		//print(7, '#'); // (int count,char ch)작성한 조건과 동일한 순서와 동일하게 작성해야함.(숫자,글자)

		Random ran = new Random();
		int num = ran.nextInt(10);
		System.out.println(num);

	}

}
