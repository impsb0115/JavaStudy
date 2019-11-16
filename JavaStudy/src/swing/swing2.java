package swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;



//�������̽� ��� �� Ŭ���� ���

class MyListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("click!!");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
}

public class swing2 {
	
	public static void main(String[] args) {
	//�⺻����
		JFrame j =new JFrame(); //�� �����
		//j.setBounds(x,y,width,height); //��ǥ������ ��ġ ũ�� ǥ���ϱ� 
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//â�� ���� ��� �Ұ��� ->EXIT_ON_CLOSE â�� �ݾƶ�
		
		j.setSize(400, 200);//ũ�� ǥ���ϱ� 
		
	
		//��� ��ġ ������ Layout .j�����ӿ� ��ư�� ��
		
		j.setLayout(new FlowLayout());//�ڵ� ������� �� ���ΰ� ������ ������ �������� 
		
		
		//��ư �����
		
		JButton btn1 =new JButton(); //����
		btn1.setText("��ư1");
		btn1.addMouseListener(new MyListener());

		j.add(btn1); //â�� �ֱ�
		
		
		JButton btn2 =new JButton(); //����
		btn2.setText("��ư2");
		
		j.add(btn2); //â�� �ֱ�
		
		
		
		
		j.setVisible(true);//â�� ���� ���̰� �ϱ�. �ǵ��� �� �Ʒ��� �α�
	}
	

}
