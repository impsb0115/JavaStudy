package string;

import java.util.Scanner;
/* �ݺ����� �̿��Ͽ� ���ڿ��κ��� ���� �������� */

/* ASCII_A �� �̸� ���ǵǾ� �ִ� �ƽ�Ű �ڵ� ����� �̿��Ͽ� */
/* �빮�ڿ� �ҹ��� �Է� ���� Ȯ�� */

/* �빮�ڿ� �ҹ��� �Է� ���ο� ���� ��� ��� */

public class Exam12_1_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		
	
		
		System.out.print("���̵� �Է����ּ���. => ");
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();
		System.out.println(id);
		
		
		boolean isUpper = false;
		boolean isLower = false;
		
		for(int i=0; i<id.length();i++) { //���ھ� �̾Ƴ���
			
			char c = id.charAt(i);
			if(c >= ASCII_A &&c <=ASCII_Z) {
				isUpper =true;
			}else if(c >= ASCII_a &&c <=ASCII_z) {
				isLower =true;
			}
			
		}
		if(isUpper &&isLower) {
			System.out.println("���ԿϷ�");
		}else {
			System.out.println("�ٽ� �Է��� �ּ���");
		}
		s.close();
	}
}