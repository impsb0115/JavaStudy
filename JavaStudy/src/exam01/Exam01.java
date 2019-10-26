package exam01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam01 {
	
	static final int INSERT =1; //���밪(���̻� �ٲ��� �����͵� ����) ,���
	static final int SELECT =2;
	static final int EXIT =3;
	//�������� ��� �迭 ����
	Member[] members =new Member[5];
	int count =0; //��� ���尪

	public static void main(String[] args) {

		boolean isExit = false;
		Exam01 e =new Exam01(); //���ѹݺ��� �ް����� �ʱ� ���� �ۿ� ����
		
		/* 1-1. ���α׷� ���� ��� */
		while (!isExit) {
			System.out.println("=================");
			System.out.println("1.�Է� 2.��ȸ 3.����");
			System.out.println("=================");

			// 1-2. ����� �Է� ���
			Scanner s = new Scanner(System.in);
			int inputNum = 0; 
			
			try{ //����ó��
				inputNum = s.nextInt();
				}catch(InputMismatchException e2) {
					System.out.println("�߸� �ԷµǾ����ϴ�.");
				}catch(Exception e3) {
					//�� ���� ���ܵ� ��� (�����ϰ����)
				}

			
			
			switch (inputNum) { // 1,2,3�� ��������
			case Exam01.INSERT: //Ŭ���� �ӿ��� �ϳ��� �����ϱ⿡  �ٸ� Ŭ������ ������ �ʰ� �տ� Ŭ������ �ְ���.
				e.insert();
				// �Է� �޼ҵ� ����
				break; // break�� ������ 2���� ���� ����
			case Exam01.SELECT:
				e.select();
				// ��ȸ �޼ҵ� ����
				break;
			case Exam01.EXIT:
				isExit = true; // 3�� �������� ����
				break;
			default: // ���̽� �ܷ� �ۼ������� ��� ���. �극��ũ ��� ��
				System.out.println("#1~3�� ���ڸ� �Է����ּ���.#");

			}//end switch
		}//end while

	}
	
	
	void insert() { //1�� ����
		Scanner s= new Scanner(System.in);
		
		System.out.println("�̸��� �Է����ּ���");
		String name = s.nextLine();//���ڿ� ������ 
		
		System.out.println("���̸� �Է����ּ���");
		int age = s.nextInt();
		
		Member m =new Member(); //��� Ŭ���� ȣ���ϰ� �Է°� �ֱ�
		m.name =name;
		m.age =age;
		members[count] = m; //���������� m �ֱ� 
		count++; //���������� �ο��ñ⶧���� �߰�
		
	}
	
	void select() {
		for(int i=0; i< count;i++) {//1�� ���  ī��Ʈ��ŭ�� ���
			if(members[i] != null) {//2�� ���  ���� �ƴϸ� ���
				System.out.printf(" �̸�:%s , ����:%d ",members[i].name,members[i].age);
			}
			
			
		}
	}
	
}//end Exam01 class





class Member{ //ȸ��ī�� Ŭ���������
	
	String name;
	int age;
	
}



