package ch04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Number n = new Number();
		int number = n.get();// 숫자 3자리 받아오는 기능
		//System.out.println(number);
		
		//한자리씩 뜯어내기
		
		int baseball3 = number % 10;
		int baseball2 = (number / 10) % 10;
		int baseball1 = (number / 10 / 10) % 10;
		
		
		//스캐너로 값 받기
		
		Scanner s = new Scanner(System.in);
		int inputNumber1 = s.nextInt();
		int inputNumber2 = s.nextInt();
		int inputNumber3 = s.nextInt();
		
		int strike = 0; // 스트라이크를 개수를 저장할 변수
		int ball = 0; // 볼의 개수를 저장할 변수
		
		
		
		//서버              216
		//입력받은 숫자 927
		if(inputNumber1 == baseball1) {
			strike++; //strike = strike+1;
			
		}else if(inputNumber1 == baseball2 || inputNumber1 == baseball3) {
			ball++;
		}
		
		
		
		if(inputNumber2 == baseball2) {
			strike++; //strike = strike+2;
			
		}else if(inputNumber2 == baseball1 || inputNumber2 == baseball3) {
			ball++;
		}
		
		
		if(inputNumber3 == baseball3) {
			strike++; //strike = strike+3;
			
		}else if(inputNumber3 == baseball1 || inputNumber3 == baseball2) {
			ball++;
		}
		
		
		/* 코드 작성
		   스트라이크와 볼 검사 조건문 작성 
		*/
		if( baseball3 ==inputNumber1 ) {
			
		}
		
		
		
		System.out.println("스트라이크 => " + strike);
		System.out.println("볼 => " + ball);
	}
}

class Number {
	public int get() { //숫자 세자리
		int number = 0;
		try {
			URL url = new URL("http://ggoreb.com/busanit/baseball.txt");
			URLConnection urlConnection = url.openConnection();
			InputStream in = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			StringBuffer response = new StringBuffer();
			String data = null;
			while ((data = reader.readLine()) != null) {
				response.append(data);
			}
			number = Integer.parseInt(response.toString());
			reader.close();
			isr.close();
			in.close();
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
		return number;
	}
}