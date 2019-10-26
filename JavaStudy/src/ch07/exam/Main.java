package ch07.exam;

public class Main {
	
	public static void main(String[] args) {
		Account a =new Account(); //생성
		a.계좌번호 = "1002-03-0001000"; //값 따로 넣기
		a.잔액 =100000;
		
		a.계좌정보();
		System.out.println(a.계좌정보());//리턴
		
		Account b= new Account("1-2-3","홍길동",900000);
		System.out.println(b.계좌정보());
		
	}

}
