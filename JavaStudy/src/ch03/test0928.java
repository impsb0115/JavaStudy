package ch03;

import java.util.Scanner;//��������

public class test0928 {
	public static void main(String[] args) {

		boolean result = 1 + 2 / 2 >= 1 + 1 * 2;
		System.out.println(result);

		System.out.println("----------");

		double div = (double) 5 / 2;
		System.out.println("������ ��� : " + div);

		System.out.println("----------");

		int ������ = 23;
		int ���� = 5;
		int �� = ������ / ����;
		int ������ = ������ % ����;

		/* �� ���ϱ� */
		/* ������ ���ϱ� */
		System.out.println("�� : " + ��);
		System.out.println("������ : " + ������);

		System.out.println("----------");

		int num = 456;
		System.out.println(num / 100 * 100); // ������, ���ϱ� ������ �̿�
		System.out.println(num - num % 100); // 456-56 = 400

		System.out.println("----------");

		Scanner scanner = new Scanner(System.in); //���̺귯�� import�ϱ�. (�Է°� ��������)
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int n = scanner.nextInt();
		int ten = 0; // 10�� �ڸ� ���� ������ ����
		int one = 0; // 1�� �ڸ� ���� ������ ����
		boolean isMatch = false; // �� �ڸ� �� �� ���� ������ ����
		
		/* ten ������ 10�� �ڸ� �� ���� */
		ten = n/10;
		
		/* one ������ 1�� �ڸ� �� ���� */
		n= n%10;
		
		/* isMatch ������ �� ���� �ڸ� �� �� �� ���� */
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
		 System.out.println("�� �ڸ� ������ �� : " + total);
		
	}
}
