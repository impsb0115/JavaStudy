package ch06;

public class Test01 {

	static int checkGrade(int n) {
		// void �� ��� int result = 0; ��� ��. ������ return �ʿ����
		int result = 0;
		if (n >= 10) {
			result =1;
			System.out.println(1);
		} else if (n >= 7) {
			result =2;
			System.out.println(2);
		} else if (n >= 4) {
			result =3;
			System.out.println(3);
		} else {
			result =4;
			System.out.println(4);
		}
		return result;
	}
//		

//		static void checkGrade(int kg) { // ...����� ��� �޾Ƶ���. ���� ��������� ����.
//		int num =0;
//		if(kg <=4) {
//			
//			System.out.println("3����Դϴ�.");
//			num=3;
//			
//		}else if (kg <=7){
//			System.out.println("2����Դϴ�.");	
//			num=2;
//			
//		}else if (kg <=10) {
//			System.out.println("1����Դϴ�.");
//			num=1;
//		}else {
//			System.out.println("4����Դϴ�.");
//		}
//		
//	}

	public static void main(String[] args) {

		checkGrade(5);

	}

}
