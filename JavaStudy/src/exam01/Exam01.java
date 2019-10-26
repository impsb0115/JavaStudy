package exam01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam01 {
	
	static final int INSERT =1; //절대값(더이상 바뀌지 않을것들 고정) ,상수
	static final int SELECT =2;
	static final int EXIT =3;
	//전역변수 멤버 배열 생성
	Member[] members =new Member[5];
	int count =0; //멤버 저장값

	public static void main(String[] args) {

		boolean isExit = false;
		Exam01 e =new Exam01(); //무한반복을 받게하지 않기 위해 밖에 생성
		
		/* 1-1. 프로그램 설명 출력 */
		while (!isExit) {
			System.out.println("=================");
			System.out.println("1.입력 2.조회 3.종료");
			System.out.println("=================");

			// 1-2. 사용자 입력 대기
			Scanner s = new Scanner(System.in);
			int inputNum = 0; 
			
			try{ //예외처리
				inputNum = s.nextInt();
				}catch(InputMismatchException e2) {
					System.out.println("잘못 입력되었습니다.");
				}catch(Exception e3) {
					//그 외의 예외도 잡기 (완전하게잡기)
				}

			
			
			switch (inputNum) { // 1,2,3번 눌렀을때
			case Exam01.INSERT: //클래스 속에서 하나만 존재하기에  다른 클래스와 섞이지 않게 앞에 클래스명 넣고쓰기.
				e.insert();
				// 입력 메소드 실행
				break; // break가 없으면 2번도 같이 실행
			case Exam01.SELECT:
				e.select();
				// 조회 메소드 실행
				break;
			case Exam01.EXIT:
				isExit = true; // 3번 눌렀을때 종료
				break;
			default: // 케이스 외로 작성했을때 경고문 출력. 브레이크 없어도 됨
				System.out.println("#1~3번 숫자만 입력해주세요.#");

			}//end switch
		}//end while

	}
	
	
	void insert() { //1번 실행
		Scanner s= new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		String name = s.nextLine();//문자열 받을때 
		
		System.out.println("나이를 입력해주세요");
		int age = s.nextInt();
		
		Member m =new Member(); //멤버 클래스 호출하고 입력값 넣기
		m.name =name;
		m.age =age;
		members[count] = m; //전역변수에 m 넣기 
		count++; //넣을때마다 인원늘기때문에 추가
		
	}
	
	void select() {
		for(int i=0; i< count;i++) {//1번 방식  카운트만큼만 출력
			if(members[i] != null) {//2번 방식  널이 아니면 출력
				System.out.printf(" 이름:%s , 나이:%d ",members[i].name,members[i].age);
			}
			
			
		}
	}
	
}//end Exam01 class





class Member{ //회원카드 클래스만들기
	
	String name;
	int age;
	
}



