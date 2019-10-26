package ch05;

import java.util.Arrays;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {

		// 1- �������� ����ä���
		int[] bingo = new int[25];
		for (int i = 0; i < 25; i++) { // �迭�ӿ� 1~25�� ���� �ֱ�. �ݺ��� ��밡��.
			bingo[i] = i + 1; // +1�� 0�� �ƴ� 1���� �����Ѵ�.
		}
		System.out.println(Arrays.toString(bingo));// �����ϰ� �������

		// 2 - ������� �����ֱ� �����
		for (int i = 0; i < 100; i++) {
			Random r = new Random();
			int num = r.nextInt(25);
			int temp = bingo[0];
			bingo[0] = bingo[num];
			bingo[num] = temp;

		}
		System.out.println(Arrays.toString(bingo));// �����ϰ� �������

		// 3 - ������ 5���� ��� �����

		for (int i = 0; i < 25; i++) {

			if (i % 5 == 0) // 5�� ������ �ٹٲ��ϱ�
				System.out.println();

		// ������ ���� ������
			System.out.print((bingo[i] < 10) ? "0" + bingo[i] : bingo[i]);
			System.out.print(" ");
		}

	}

}