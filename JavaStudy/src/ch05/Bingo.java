package ch05;

import java.util.Arrays;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {

		// 1- 빙고판의 숫자채우기
		int[] bingo = new int[25];
		for (int i = 0; i < 25; i++) { // 배열속에 1~25의 숫자 넣기. 반복문 사용가능.
			bingo[i] = i + 1; // +1로 0이 아닌 1부터 시작한다.
		}
		System.out.println(Arrays.toString(bingo));// 정직하게 출력해줌

		// 2 - 빙고숫자 섞어주기 만들기
		for (int i = 0; i < 100; i++) {
			Random r = new Random();
			int num = r.nextInt(25);
			int temp = bingo[0];
			bingo[0] = bingo[num];
			bingo[num] = temp;

		}
		System.out.println(Arrays.toString(bingo));// 정직하게 출력해줌

		// 3 - 빙고판 5개씩 출력 만들기

		for (int i = 0; i < 25; i++) {

			if (i % 5 == 0) // 5개 넘으면 줄바꿈하기
				System.out.println();

		// 빙고의 숫자 빼오기
			System.out.print((bingo[i] < 10) ? "0" + bingo[i] : bingo[i]);
			System.out.print(" ");
		}

	}

}