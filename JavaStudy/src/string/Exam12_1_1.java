package string;

import java.util.Scanner;
/* 반복문을 이용하여 문자열로부터 문자 꺼내오기 */

/* ASCII_A 등 미리 정의되어 있는 아스키 코드 상수를 이용하여 */
/* 대문자와 소문자 입력 여부 확인 */

/* 대문자와 소문자 입력 여부에 따라 결과 출력 */

public class Exam12_1_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		
	
		
		System.out.print("아이디를 입력해주세요. => ");
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();
		System.out.println(id);
		
		
		boolean isUpper = false;
		boolean isLower = false;
		
		for(int i=0; i<id.length();i++) { //한자씩 뽑아내기
			
			char c = id.charAt(i);
			if(c >= ASCII_A &&c <=ASCII_Z) {
				isUpper =true;
			}else if(c >= ASCII_a &&c <=ASCII_z) {
				isLower =true;
			}
			
		}
		if(isUpper &&isLower) {
			System.out.println("가입완료");
		}else {
			System.out.println("다시 입력해 주세요");
		}
		s.close();
	}
}