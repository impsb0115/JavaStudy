package string;

public class Substring {
	public static void main(String args[]) {
		
		//            123456789101112
		String str = "Java ������ �缺�� ���� ����������!!";
		
		
		//������� 24
		//int len =str.length();  //length �� 1���� �����Ѵ�. 
		while(true) {
			
			if(str.length() ==0) { 
				
				break;
			}
			str=str.substring(0,str.length()-1); //-1�ؾ� 0���� ����
			System.out.println(str);
		}
	
		
		//back space �����
		
		
		//str=str.substring(0,23);
		//str=str.substring(0,len-1);
		//System.out.println(str);
		
		//str=str.substring(0,22);
		//str=str.substring(0,str.length()-1);
		//System.out.println(str);
		
		
//		
//		String str = "Java ������ �缺�� ���� ����������!!";
//		String str1 = str.substring(0); //0���� ����ϱ�
//		System.out.println(str1);
//		
//		String str2=str.substring(5,8); //(5,7)=>5���� ���� 6���� ���. 8�̶�� ���� 
//		System.out.println(str2);
//
//		
//		
		
	}
}