package string;

public class Test {
	
	public static void main(String[] args) {
		String s = "abc";
		
		
		//많은 데이터를 처리할때는 StringBuffer를 사용한다.
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<5000000;i++) {
			sb.append(i);
		}
		System.out.println("end!!");
		
		
		//오래걸림
//		for(int i=0; i <50000; i++) {
//			s= s+i;
//			
//		}
//		
//		System.out.println("end!!");
		
		
		
		
		
		
	}

}
