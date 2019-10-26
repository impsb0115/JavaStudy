package ch06;

public class Test01 {

	static int checkGrade(int n) {
		// void 일 경우 int result = 0; 없어도 됌. 지금은 return 필요없음
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

//		static void checkGrade(int kg) { // ...사용경우 모두 받아들임. 자주 사용하지는 않음.
//		int num =0;
//		if(kg <=4) {
//			
//			System.out.println("3등급입니다.");
//			num=3;
//			
//		}else if (kg <=7){
//			System.out.println("2등급입니다.");	
//			num=2;
//			
//		}else if (kg <=10) {
//			System.out.println("1등급입니다.");
//			num=1;
//		}else {
//			System.out.println("4등급입니다.");
//		}
//		
//	}

	public static void main(String[] args) {

		checkGrade(5);

	}

}
