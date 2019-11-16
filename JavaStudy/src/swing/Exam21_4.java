package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Exam21_4 {
 public static void main(String[] args) {
 Bingo b = new Bingo();
 b.display();
 }
}
class BtnHandler implements ActionListener {
	
	//가상의 2차원 배열 
	boolean[][]check =new boolean[5][5];  //false 25개 생성됨
	
	
 @Override
 public void actionPerformed(ActionEvent e) {
 JButton btn = (JButton) e.getSource();
 btn.setBackground(Color.LIGHT_GRAY);

 // 선택된 버튼의 좌표 확인 (setName으로 지정된 값)
 String xy = btn.getName(); //어딘가이 set이 있어서 get할 수 있음
 System.out.println(xy);
 
 // x와 y를 숫자로 변환,분리
 //01
 //34
 int x =Integer.parseInt(xy.substring(0,1));//문자열을 인트로 강제변환시킨다. 
 int y =Integer.parseInt(xy.substring(1,2));
 check[x][y]=true; 

 int count=0;
 
 /* 가로줄 완성 확인 코드  x는 고정 */
 for(int i=0; i<5; i++) {
	 //행고정 열 i값으로 변경되는 상태를 체크하여 5개가 만족되면 한줄 빙고!
	 if(check[x][i] ==true) {
		 count =count+1;
	 }
 }
 
 if(count==5) {
	 System.out.println("가로 1줄 빙고!");
 }
 
 
 count=0; //가로에서 count 값이 남아있기에 초기화시켜주기
 
 /* 세로줄 완성 확인 코드 y는 고정 */
 for(int i=0; i<5; i++) {
	 //열고정 행 i값으로 변경되는 상태를 체크하여 5개가 만족되면 한줄 빙고!
	 if(check[i][y] ==true) {
		 count++;
		 
	 }
	 
 }
 if(count==5) {
	 System.out.println("세로 1줄 빙고!");
 }
 
 
 }
}