package ch03;

import java.util.Random;
import java.util.Scanner;

public class ���������� {
public static void main(String[] args) {
	//���������� ���� ǥ��
	int com= 0; //�ʱ�ȭ
	int player =0;//�ʱ�ȭ
	
	//��ǻ�Ͱ� �������� ���������� ����
	Random r = new Random(); //Random import
	com = r.nextInt(3); //0 1 2 �� 3���� �������� ���
	System.out.println(com);
	
	//�÷��̾ Ű���� �Է��� ���� �� ���
	Scanner s =new Scanner(System.in);//scanner import
	player = s.nextInt();
	
	
	if((player +1)%3 ==com) { //%3 �ؼ� �ٽ� 0 1 2 �� ȸ��
		System.out.println("��ǻ�� ��");
	} else {
		if(player == com) {
			System.out.println("���");
		}else {
			System.out.println("�÷��̾� �̱�");
		}
	}
	
}
}
