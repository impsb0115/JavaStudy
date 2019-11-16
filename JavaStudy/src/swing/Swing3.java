package swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/* �������̽� ��� �� Ŭ���� ��� */
public class Swing3 implements MouseListener {
	

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton btn =(JButton) e.getComponent();
		String text = btn.getText();
		System.out.println(text + "Ŭ��!!");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
	
	
	public Swing3() { // ������
		JFrame j = new JFrame();
		//j.setBounds(x, y, width, height);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(400, 200);
		
		// ��� ��ġ ������ (Layout)
		j.setLayout(new FlowLayout());
		
		MyListener m= new MyListener();
		
		// ��ư �߰� 
		JButton btn1 = new JButton();
		btn1.setText("��ư1");
		
		btn1.addMouseListener(m);
		j.add(btn1);

		JButton btn2 = new JButton();
		btn2.setText("��ư2");
		btn1.addMouseListener(m);
		j.add(btn2);
		
		
		j.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
	}
	

}






