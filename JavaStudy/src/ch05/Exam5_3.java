package ch05;

import java.util.Random;

public class Exam5_3 {
 public static void main(String[] args) {
	 
	 //�迭 nums �� ����� ������ �������� ���� �� �ֵ��� �ڵ� �ۼ�
	 
 char[] nums = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
 for(int i = 0; i < nums.length; i++) {
	 Random r= new Random();
	 int num =r.nextInt(nums.length); //nums�� ���߿��� �������� 
	 
	 char temp=' '; //�����
	 temp = nums[0]; //0�� ��������� �־�д�
	 
	 nums[0] =nums[num]; //0��  �������ڸ� �ִ´�
	 nums[num]=temp; //������� �������縦 �־�д�
	 
 // �ڵ� �ۼ�
 }

 
 
 
 System.out.println(nums);
 }
}