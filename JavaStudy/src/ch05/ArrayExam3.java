package ch05;

public class ArrayExam3 {
	
	public static void main(String[] args) {
		
		
		 int[] numbers = {3, 2, 1, 7, 4};

		 int min = Integer.MAX_VALUE;

		 for(int i = 0; i < numbers.length; i++) {
		 if(numbers[i] < min || min == 0) { //�迭 0�� �ֱ�
		 min = numbers[i];
		 }
		 }
		 System.out.println("�ּҰ� : " + min);
		 }

}
