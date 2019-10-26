package ch04;

public class Exam4_6 {
public static void main(String[] args) {
	
	for(int i=1; i<=5; i++) {
		
		for(int j=1 ; j<=i ; j++) {
			System.out.printf("*");
			
		}
		System.out.println();
	}
	
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			
			if(5 - i>=j) {
				System.out.print(" ");
			}else {
				System.out.print("#");
			}
			
			
		}
		System.out.println();
	}
	
	
	
	
}
}
