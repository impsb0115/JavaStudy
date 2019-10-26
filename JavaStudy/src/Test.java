
import java.util.Random; //다른 위치에 존재하는 라이브러리 가져오기

public class Test { //실행 = 컨트롤+f11
	//main 입력후  컨트롤+스페이스 => 메인 메소드 선택
	public static void main(String[] args) {
		//라이브러리를 불러내는 코드 
		Random r= new Random();
		System.out.println(r.nextInt(4));
		
		
		
		//syso 컨트롤+스페이스 => 메인 메소드 선택
		System.out.println(1111); //출력문
		System.out.println("글자는 이렇게"); //컨트롤+알트+화살표 =>화살표 방향으로 복사 
		System.out.println(2*5);
		System.out.println(2+5);
		
		System.out.println("1+2 ="+1+2); //큰따옴표와 숫자가 합쳐지면 모두 글자취급함 => 1+2= 12로 출력
		System.out.println("1+2 ="+1*2); //곱하기 우선순
		System.out.println("1+2 ="+(1+2)); //숫자출력할경우()넣기
		
		
		
		
	}
}
