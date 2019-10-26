package ch05;
public class Exam5_1 {
	
 public static void main(String[] args) {
	 
	 
	 //1 3 5 7 9 만출력하기
	 
 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 // 코드 작성
 
 String sep =" ";
 //3. 반목문의 증감식 활용
 for(int i=0; i<=arr.length; i+=2) {
	
		 System.out.print(sep+arr[i]);
		 sep =", ";
		 //System.out.print(arr[i]+" ");
	 
 }
 
 //2. 요소의 값 기준 -요소가가 홀수인경우
 /* for(int i=0; i<=arr.length; i++) {
	
	 if(arr[i] %2 !=0) {
		 System.out.print(arr[i]+" ");
	 }
 }
 
 //1. index 기준 -index가 짝수인경우
 for(int i=0; i<=arr.length; i++) {
	
	 if(i %2 ==0) {
		 System.out.print(arr[i]+" ");
	 }
 }
 */
 }
}
