package ch05;

import java.util.Random;

public class Exam5_3 {
 public static void main(String[] args) {
	 
	 //배열 nums 각 요소의 순서가 랜덤으로 섞일 수 있도록 코드 작성
	 
 char[] nums = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
 for(int i = 0; i < nums.length; i++) {
	 Random r= new Random();
	 int num =r.nextInt(nums.length); //nums의 수중에서 랜덤으로 
	 
	 char temp=' '; //빈공간
	 temp = nums[0]; //0을 빈공간으로 넣어둔다
	 
	 nums[0] =nums[num]; //0에  랜덤숫자를 넣는다
	 nums[num]=temp; //빈공간에 랜덤소재를 넣어둔다
	 
 // 코드 작성
 }

 
 
 
 System.out.println(nums);
 }
}