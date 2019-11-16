package swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class swing1 {
	
	
	//익명클래스 활용
	
	public static void main(String[] args) {
	//기본설정
		JFrame j =new JFrame(); //판 만들기
		//j.setBounds(x,y,width,height); //좌표값으로 위치 크기 표현하기 
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창을 끌때 어떻게 할건지 ->EXIT_ON_CLOSE 창을 닫아라
		
		j.setSize(400, 200);//크기 표현하기 
		
	
		//요소 배치 관리자 Layout .j프레임에 버튼이 들어감
		
		j.setLayout(new FlowLayout());//자동 가운데정렬 후 가로가 꽉차면 밑으로 내려간다 
		
		
		//버튼 만들기
		
		JButton btn1 =new JButton(); //만들어서
		btn1.setText("버튼1");
		btn1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("클릭!");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {}
		});

		
		j.add(btn1); //창에 넣기
		
		
		JButton btn2 =new JButton(); //만들어서
		btn2.setText("버튼2");
		j.add(btn2); //창에 넣기
		
		
		
		
		j.setVisible(true);//창과 내용 보이게 하기. 되도록 맨 아래에 두기
	}
	

}
