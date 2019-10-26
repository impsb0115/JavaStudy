package string;

public class Exam12_2 {
	public static void main(String[] args) {
		
		//지정한 곳으 ㅣ앞과 뒤를 포함하여 자름
		String file = "/home/temp/Java.class";
		
		String[] arr= file.split("/"); //슬래시의 앞과 뒤를 잘라 배열로 만든다.=>첫번째 /앞도 잘라냄(공백)
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i].equals("")==true) {
				//공백은 출력안함
				
			}else {
				System.out.println(arr[i]); //=총 4개 출력
			}
			
		}
		
	}
}
