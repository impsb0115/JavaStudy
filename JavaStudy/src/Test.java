
import java.util.Random; //�ٸ� ��ġ�� �����ϴ� ���̺귯�� ��������

public class Test { //���� = ��Ʈ��+f11
	//main �Է���  ��Ʈ��+�����̽� => ���� �޼ҵ� ����
	public static void main(String[] args) {
		//���̺귯���� �ҷ����� �ڵ� 
		Random r= new Random();
		System.out.println(r.nextInt(4));
		
		
		
		//syso ��Ʈ��+�����̽� => ���� �޼ҵ� ����
		System.out.println(1111); //��¹�
		System.out.println("���ڴ� �̷���"); //��Ʈ��+��Ʈ+ȭ��ǥ =>ȭ��ǥ �������� ���� 
		System.out.println(2*5);
		System.out.println(2+5);
		
		System.out.println("1+2 ="+1+2); //ū����ǥ�� ���ڰ� �������� ��� ��������� => 1+2= 12�� ���
		System.out.println("1+2 ="+1*2); //���ϱ� �켱��
		System.out.println("1+2 ="+(1+2)); //��������Ұ��()�ֱ�
		
		
		
		
	}
}
