package string;

public class Substring {
	public static void main(String args[]) {
		
		//            123456789101112
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		
		
		//문장길이 24
		//int len =str.length();  //length 는 1부터 시작한다. 
		while(true) {
			
			if(str.length() ==0) { 
				
				break;
			}
			str=str.substring(0,str.length()-1); //-1해야 0부터 시작
			System.out.println(str);
		}
	
		
		//back space 만들기
		
		
		//str=str.substring(0,23);
		//str=str.substring(0,len-1);
		//System.out.println(str);
		
		//str=str.substring(0,22);
		//str=str.substring(0,str.length()-1);
		//System.out.println(str);
		
		
//		
//		String str = "Java 개발자 양성을 통한 취업연계과정!!";
//		String str1 = str.substring(0); //0부터 출력하기
//		System.out.println(str1);
//		
//		String str2=str.substring(5,8); //(5,7)=>5부터 시작 6까지 출력. 8이라고 쓰기 
//		System.out.println(str2);
//
//		
//		
		
	}
}