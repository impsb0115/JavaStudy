package swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



class PWHandler implements ActionListener { //텍스트 받아내기
	JTextField t;
	JPasswordField p;
	
	PWHandler(JTextField t, JPasswordField p){
		this.t =t;
		this.p =p;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String id= t.getText();
		String pw = p.getText();
		System.out.printf("%s, %s\n", id,pw);
	}
}


public class SwingExam8 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JLabel & JTextField");
		frm.setBounds(120, 120, 350, 150);
		frm.setLayout(new GridLayout(2, 2));

		JLabel idLabel = new JLabel("ID : ", SwingConstants.RIGHT);
		JTextField idText = new JTextField(10); //JTextField는 한줄만 입력가능, 엔터불가
		JLabel pwLabel = new JLabel("Password : ", SwingConstants.RIGHT);
		JPasswordField pwText = new JPasswordField(10);
		pwText.setEchoChar('*');
		
		//	addActionListener=모든 행위에 대해 허용. 마우스 &키보드 등 		
		pwText.addActionListener(new PWHandler(idText, pwText)); // 글자 받기 , PWHandler상속받기
		frm.add(idLabel);
		frm.add(idText);
		frm.add(pwLabel);
		frm.add(pwText);

		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

