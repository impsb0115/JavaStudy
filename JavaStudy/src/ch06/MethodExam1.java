package ch06;

import java.util.Random;

public class MethodExam1 {

	// �޼ҵ� �����
	static void print(int count, char ch) { // static �־�� ȣ�Ⱑ��

		for (int i = 0; i < count; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(ch);
			}
			System.out.println();
		}

	}

	// string ������ ����
	static String print2(int count, char ch) { // but print�϶� (int count, char ch,int a)�̸��� �����ص� ���� ������ �ٸ��� ���а���.

		String result = "";// ����
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

		//print(5, '@'); // �޼ҵ� ȣ�� ù��° ����� @�� ���

		//print(7, '#'); // (int count,char ch)�ۼ��� ���ǰ� ������ ������ �����ϰ� �ۼ��ؾ���.(����,����)

		Random ran = new Random();
		int num = ran.nextInt(10);
		System.out.println(num);

	}

}
