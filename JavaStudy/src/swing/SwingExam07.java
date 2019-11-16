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
		frm.setLayout(new BorderLayout()); //������������ ����
		
		JPanel panelWest = new JPanel();
		panelWest.setLayout(new FlowLayout());
		panelWest.add(new JButton("�޴�1"));
		panelWest.add(new JButton("�޴�2"));
		panelWest.add(new JButton("�޴�3"));
		
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(3,3));
		
		
		for(int i=1; i<=9; i++) { //��ư 9�� ����� 
			panelCenter.add(new JButton(i+"")); //i+""�����߰��ؾ� �����ȶ� =����ó�� 
		}
		
		frm.add(panelWest,BorderLayout.WEST); //����
		frm.add(panelCenter,BorderLayout.SOUTH); //�߾�
		
		

		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

