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
		JFrame frame = new JFrame("모양만 채팅창");
		frame.setLayout(new FlowLayout());
		JTextArea area = new JTextArea(10, 20); // 행*열 10*20
		area.setBackground(Color.cyan);
		area.setEditable(false); // 수정 불가
		area.setFocusable(false); // 포커싱 불가
		frame.add(area);
		/* JPanel 생성 */
		JPanel panel = new JPanel();
		
		/* JTextField 생성 */
		JTextField t = new JTextField(10); //텍스트 10자 정도크기로
		panel.add(t, BorderLayout.EAST);

		JButton btn = new JButton("전송");
		panel.add(btn,BorderLayout.EAST);
		btn.addActionListener(new ActionListener() {
			/* JButton 클릭 시 입력된 글자를 JTextArea로 출력 */
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String text=  t.getText(); //t에서 글자를 뽑아온다.
				area.setText(area.getText()+"\n"+text); //area로 넣는다. area.getText()+를 하면 먼저 넣었던 글자를 그대로 누적한다.
				t.setText("");
			}
			
		});
		
		
		
		frame.add(panel);
		frame.setSize(300, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
