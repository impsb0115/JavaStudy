package swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class swing1 {
	
	
	//�͸�Ŭ���� Ȱ��
	
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
		btn1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Ŭ��!");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {}
		});

		
		j.add(btn1); //â�� �ֱ�
		
		
		JButton btn2 =new JButton(); //����
		btn2.setText("��ư2");
		j.add(btn2); //â�� �ֱ�
		
		
		
		
		j.setVisible(true);//â�� ���� ���̰� �ϱ�. �ǵ��� �� �Ʒ��� �α�
	}
	

}
