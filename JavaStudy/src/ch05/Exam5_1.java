package ch05;
public class Exam5_1 {
	
 public static void main(String[] args) {
	 
	 
	 //1 3 5 7 9 ������ϱ�
	 
 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 // �ڵ� �ۼ�
 
 String sep =" ";
 //3. �ݸ��� ������ Ȱ��
 for(int i=0; i<=arr.length; i+=2) {
	
		 System.out.print(sep+arr[i]);
		 sep =", ";
		 //System.out.print(arr[i]+" ");
	 
 }
 
 //2. ����� �� ���� -��Ұ��� Ȧ���ΰ��
 /* for(int i=0; i<=arr.length; i++) {
	
	 if(arr[i] %2 !=0) {
		 System.out.print(arr[i]+" ");
	 }
 }
 
 //1. index ���� -index�� ¦���ΰ��
 for(int i=0; i<=arr.length; i++) {
	
	 if(i %2 ==0) {
		 System.out.print(arr[i]+" ");
	 }
 }
 */
 }
}
