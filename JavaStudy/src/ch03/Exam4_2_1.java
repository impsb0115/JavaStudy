package ch03;

public class Exam4_2_1 {
	public static void main(String[] args) {

		// score가 2의 배수인 경우 “짝”, 3의 배수인 경우 “쿵”, 2의 배수이면서 3의 배수인 경우 “쿵짝”,그 외의 경우는 score가
		// 출력되도록 코드 작성

		int score = 6;

		if (score % 2 == 0 && score % 3 == 0) {
			System.out.println("쿵짝");

		} else if (score % 3 == 0) {
			System.out.println("쿵");

		} else if (score % 2 == 0) {
			System.out.println("짝");
		} else {
			System.out.println("xx");
		}

		System.out.println("======");

		for (int i = 1; i <= 10; i++) { // i++가 없을경우 무한증가/ i는 1이고 10이하일때 i++ 즉 10번 생성
			System.out.print(i);
		}

		System.out.println();
		System.out.println("======");

		for (int i = 10; i >= 1; i--) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("======");

		int 합계 = 0;

		for (int i = 1; i <= 10; i++) { // i++가 없을경우 무한증가/ i는 1이고 10이하일때 i++ 즉 10번 생성
				합계= 합계 +i;
		}
		System.out.println(합계);
		
	}
}
