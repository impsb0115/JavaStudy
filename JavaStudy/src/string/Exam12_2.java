package string;

public class Exam12_2 {
	public static void main(String[] args) {
		
		//������ ���� �Ӿհ� �ڸ� �����Ͽ� �ڸ�
		String file = "/home/temp/Java.class";
		
		String[] arr= file.split("/"); //�������� �հ� �ڸ� �߶� �迭�� �����.=>ù��° /�յ� �߶�(����)
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i].equals("")==true) {
				//������ ��¾���
				
			}else {
				System.out.println(arr[i]); //=�� 4�� ���
			}
			
		}
		
	}
}
