package ch07;

import javax.swing.JFrame;

public class Window {
	public static void main(String[] args) {
		
		
		
		JFrame frame = new JFrame("윈도우");
		frame.setBounds(200, 200, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼 눌렀을때 닫혀라.
		frame.setVisible(true);
		
		
	}
}