package ch07;

public class InheritanceExam1 {
	
	
	static void move(Car c) {
		
	}
	
	
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();//Ŭ���� �ҷ�����
		Bus bs= new Bus();//Ŭ���� �ҷ�����
		move(bs);
		
		Car[] cars = {sc,bs};
		
		for(int i=0; i< cars.length;i++) {
			Car c =cars[i];
		
		
		}
		
		
		
		
		
//		Car c = sc;// �θ�� �а���Ű��.  Car c =(Car) sc; <-����
		
		//=> �̷���� sc.openSunloof()�� ������ ��
		
		
//		c.move(); //�̵�
//		//sc.move();
//		//sc.openSunloof(); 
//		
//		//����� ��� �ٽ� ��ȯ���� ( (SportsCar)c).openSunloof(); �� �ۼ�
//		( (SportsCar)c).openSunloof();
//		
//		
//		SportsCar cc = (SportsCar)c;
//		cc.openSunloof();
		
		
	}
}