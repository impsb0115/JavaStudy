package ch07;

import java.util.Scanner;

public class BookStore {
	public static void main(String[] args) {
		Book book =new Book(); //�ҷ�����
		
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
		String ���� =  s.nextLine(); //������ �Է¹����� ���
		book.���� =����;
		
		System.out.println("���ڸ� �Է����ּ���");
		book.���� =  s.nextLine(); //���ļ� ��밡��
		
		System.out.println("������ �Է����ּ���");
		book.price =  s.nextInt(); 
		
	}
}
