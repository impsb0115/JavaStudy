package ch03;

import java.util.Scanner;

public class Exam4_1 {

	public static void main(String[] args) {
		//8�ð� �̻�� ��پ˸�
		
		int workingTime =0;
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("�ٹ��ð��� �Է����ּ���: ");
		workingTime = s.nextInt();
		
		if(workingTime >= 8) {
			System.out.println("���~");
		}else{
			
			System.out.println("��� �ٹ�~");
		}
		
		
	}
	
	
}
