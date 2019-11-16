package swing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame; //���ӿ����� JPanel�� ���

class Paint1 extends JFrame{
	//JFrame�� ����� �׷��ִ� �޼ҵ�
	@Override
	public void paint(Graphics g) {
		g.drawLine(50, 50, 250, 250);
		g.drawRect(200, 200, 100, 100);
	}

	
}
public class test1 {
public static void main(String[] args) {
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); //�� �ػ� ũ�� ã��
	double w= dim.getWidth();
	double h= dim.getHeight();
	
	Paint1 p= new Paint1();
	
	int x = (int)w/2 -200;
	int y=(int)h/2 -150;
	
	p.setBounds(x, y, 400, 300); //JFrame �׸���
	p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	p.setVisible(true);
	
	
}
}
