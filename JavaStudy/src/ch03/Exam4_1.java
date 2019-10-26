package ch03;

import java.util.Scanner;

public class Exam4_1 {

	public static void main(String[] args) {
		//8시간 이상시 퇴근알림
		
		int workingTime =0;
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("근무시간을 입력해주세요: ");
		workingTime = s.nextInt();
		
		if(workingTime >= 8) {
			System.out.println("퇴근~");
		}else{
			
			System.out.println("계속 근무~");
		}
		
		
	}
	
	
}
