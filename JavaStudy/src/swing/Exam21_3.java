package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exam21_3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("��縸 ä��â");
		frame.setLayout(new FlowLayout());
		JTextArea area = new JTextArea(10, 20); // ��*�� 10*20
		area.setBackground(Color.cyan);
		area.setEditable(false); // ���� �Ұ�
		area.setFocusable(false); // ��Ŀ�� �Ұ�
		frame.add(area);
		/* JPanel ���� */
		JPanel panel = new JPanel();
		
		/* JTextField ���� */
		JTextField t = new JTextField(10); //�ؽ�Ʈ 10�� ����ũ���
		panel.add(t, BorderLayout.EAST);

		JButton btn = new JButton("����");
		panel.add(btn,BorderLayout.EAST);
		btn.addActionListener(new ActionListener() {
			/* JButton Ŭ�� �� �Էµ� ���ڸ� JTextArea�� ��� */
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String text=  t.getText(); //t���� ���ڸ� �̾ƿ´�.
				area.setText(area.getText()+"\n"+text); //area�� �ִ´�. area.getText()+�� �ϸ� ���� �־��� ���ڸ� �״�� �����Ѵ�.
				t.setText("");
			}
			
		});
		
		
		
		frame.add(panel);
		frame.setSize(300, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
