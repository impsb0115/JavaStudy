package string;

public class IndexOF {
	
	public static void main(String[] args) {
		
		String str ="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		
		int count =0;
		int idx =0;
		while(idx>-1) {
			idx =str.indexOf("Lorem", idx); //idx는 0이기 때무에 계속 0만 반복한다
			
			if(idx !=-1) { //idx가 -1이 아닐때 카운트해라
				count++;
				System.out.println("Lorem 위치 : " +idx);
			}
			
			if(idx ==-1) { //idx가 -1일때 멈춰라
				break;
				
			}
			idx++; //그래서 증가시키기 = -1에서 다시  0이 됨 =무한반복 => break만들어서 조절하기
		}
		
		System.out.println(count);
		
		
		        
//		String str ="JAVA 개발자 양성을 통한 취업연계과정!!";
//		int idx =str.indexOf(" "); //위치찾기
//		System.out.println(idx); //4출력
//		
//		
//		while(idx >-1){ //와일로 공백위치찾기 (-1보다 클때까지)
//			
//			idx =str.indexOf(" ", idx+1); //4는 찾았기 때문에 그 후부터 시작해야해서 +1하기
//			System.out.println(idx);
//		}
//		
	
		
		
//		//다음 문장 위치 찾기
//		idx =str.indexOf(" ", 5); //4 다음 공백을 찾음 
//		System.out.println(idx);
//		
//		idx =str.indexOf(" ", 9); //5 다음 공백을 찾음 
//		System.out.println(idx);
//		
//		idx =str.indexOf(" ", 13); 
//		System.out.println(idx);
//		idx =str.indexOf(" ", 16); 
//		System.out.println(idx); //-1출력

	}

}
