package ch07;

public class InheritanceExam1 {
	
	
	static void move(Car c) {
		
	}
	
	
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();//클래스 불러오기
		Bus bs= new Bus();//클래스 불러오기
		move(bs);
		
		Car[] cars = {sc,bs};
		
		for(int i=0; i< cars.length;i++) {
			Car c =cars[i];
		
		
		}
		
		
		
		
		
//		Car c = sc;// 부모로 둔갑시키기.  Car c =(Car) sc; <-정석
		
		//=> 이럴경우 sc.openSunloof()는 오류가 뜸
		
		
//		c.move(); //이동
//		//sc.move();
//		//sc.openSunloof(); 
//		
//		//사용할 경우 다시 변환시켜 ( (SportsCar)c).openSunloof(); 로 작성
//		( (SportsCar)c).openSunloof();
//		
//		
//		SportsCar cc = (SportsCar)c;
//		cc.openSunloof();
		
		
	}
}