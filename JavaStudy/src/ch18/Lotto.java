package ch18;

import java.util.HashSet;
import java.util.Random;

public class Lotto {

	//set을 활용한 로또번호 생성기
	public static void main(String[] args) {
		
		HashSet<Integer> lotto =
				new HashSet<Integer>();
		
		while(true) {
			Random ran =new Random();
			int num =ran.nextInt(45);//0~44
			num=num+1;//1~45
			lotto.add(num); //로또에 숫자넣기
			if(lotto.size()==6) { //6개가 뽑히면 멈춰라 
				break;
			}
			
		}
		System.out.println(lotto);
	}
}
