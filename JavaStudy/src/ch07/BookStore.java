package ch07;

import java.util.Scanner;

public class BookStore {
	public static void main(String[] args) {
		Book book =new Book(); //불러오기
		
		Scanner s = new Scanner(System.in);
		System.out.println("제목을 입력해주세요");
		String 제목 =  s.nextLine(); //문장을 입력받을때 사용
		book.제목 =제목;
		
		System.out.println("저자를 입력해주세요");
		book.저자 =  s.nextLine(); //합쳐서 사용가능
		
		System.out.println("가격을 입력해주세요");
		book.price =  s.nextInt(); 
		
	}
}
