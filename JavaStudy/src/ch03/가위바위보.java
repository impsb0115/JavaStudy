package ch03;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {
public static void main(String[] args) {
	//가위바위보 공식 표현
	int com= 0; //초기화
	int player =0;//초기화
	
	//컴퓨터가 랜덤으로 가위바위보 내기
	Random r = new Random(); //Random import
	com = r.nextInt(3); //0 1 2 총 3가지 범위에서 출력
	System.out.println(com);
	
	//플레이어가 키보드 입력을 통해 값 출력
	Scanner s =new Scanner(System.in);//scanner import
	player = s.nextInt();
	
	
	if((player +1)%3 ==com) { //%3 해서 다시 0 1 2 로 회전
		System.out.println("컴퓨터 승");
	} else {
		if(player == com) {
			System.out.println("비김");
		}else {
			System.out.println("플레이어 이김");
		}
	}
	
}
}
