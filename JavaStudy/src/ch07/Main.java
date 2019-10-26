package ch07;
public class Main {
 public static void main(String[] args) {
	 
	 
 /* 헌혈자 정보 */
 Human human = new Human();
 human.setName("김");
 human.setType('O');
 human.setAge(20);

 /* BloodHouse 객체 생성 */

 String result = ""; // action() 메소드 호출 결과 저장
 
 BloodHouse bh =new BloodHouse();
 result = bh.action(human);//위에 만든 휴면을 액션에 다시 넣고 액션 호출, result에 대입
 
 /* action() 메소드를 호출하면서 매개변수로 헌혈자 정보 넘겨줌 */
 /* action() 메소드 호출 결과 출력 */
 System.out.println(result);
 
 
 }
}
