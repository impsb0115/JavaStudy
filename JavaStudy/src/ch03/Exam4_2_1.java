package ch03;

public class Exam4_2_1 {
	public static void main(String[] args) {

		// score�� 2�� ����� ��� ��¦��, 3�� ����� ��� ������, 2�� ����̸鼭 3�� ����� ��� ����¦��,�� ���� ���� score��
		// ��µǵ��� �ڵ� �ۼ�

		int score = 6;

		if (score % 2 == 0 && score % 3 == 0) {
			System.out.println("��¦");

		} else if (score % 3 == 0) {
			System.out.println("��");

		} else if (score % 2 == 0) {
			System.out.println("¦");
		} else {
			System.out.println("xx");
		}

		System.out.println("======");

		for (int i = 1; i <= 10; i++) { // i++�� ������� ��������/ i�� 1�̰� 10�����϶� i++ �� 10�� ����
			System.out.print(i);
		}

		System.out.println();
		System.out.println("======");

		for (int i = 10; i >= 1; i--) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("======");

		int �հ� = 0;

		for (int i = 1; i <= 10; i++) { // i++�� ������� ��������/ i�� 1�̰� 10�����϶� i++ �� 10�� ����
				�հ�= �հ� +i;
		}
		System.out.println(�հ�);
		
	}
}
