package swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



class PWHandler implements ActionListener { //�ؽ�Ʈ �޾Ƴ���
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
		JTextField idText = new JTextField(10); //JTextField�� ���ٸ� �Է°���, ���ͺҰ�
		JLabel pwLabel = new JLabel("Password : ", SwingConstants.RIGHT);
		JPasswordField pwText = new JPasswordField(10);
		pwText.setEchoChar('*');
		
		//	addActionListener=��� ������ ���� ���. ���콺 &Ű���� �� 		
		pwText.addActionListener(new PWHandler(idText, pwText)); // ���� �ޱ� , PWHandler��ӹޱ�
		frm.add(idLabel);
		frm.add(idText);
		frm.add(pwLabel);
		frm.add(pwText);

		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

