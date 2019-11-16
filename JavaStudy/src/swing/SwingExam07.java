package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingExam07 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("GridLayout Test");
		frm.setBounds(120, 120, 400, 600);
		frm.setLayout(new BorderLayout()); //동서남북으로 정렬
		
		JPanel panelWest = new JPanel();
		panelWest.setLayout(new FlowLayout());
		panelWest.add(new JButton("메뉴1"));
		panelWest.add(new JButton("메뉴2"));
		panelWest.add(new JButton("메뉴3"));
		
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(3,3));
		
		
		for(int i=1; i<=9; i++) { //버튼 9개 만들기 
			panelCenter.add(new JButton(i+"")); //i+""문자추가해야 에러안뜸 =문자처리 
		}
		
		frm.add(panelWest,BorderLayout.WEST); //왼쪽
		frm.add(panelCenter,BorderLayout.SOUTH); //중앙
		
		

		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

