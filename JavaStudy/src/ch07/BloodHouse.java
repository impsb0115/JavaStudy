package ch07;
public class BloodHouse {
	
	
//���� ���� ���� üũ	
 public boolean isPossible(Human human) {//�޸��� �ް� �س���
	 
	 
 int age = 0; // �������� ���̸� Ȯ���Ͽ� ����
 boolean isPossible = false; // ���� ���� ����
 
 /* �Ѱܹ��� Human Ŭ�����κ��� age ���� Ȯ�� age = ? */
 age = human.age; //or human.getAge();
 
 /* age�� 16�� �̻� 69�� ���� �϶��� ���� �����ϵ��� ���ǹ� �ۼ� */
 if(age >=16 && age <=69) {
	 isPossible =true; //������ ������ �� �� = ��������
 }
 
 return isPossible;
 
 }

 //���� ���������� ���
 public String action(Human human) { //�޸��� �ް� �س���
	 
 String result = ""; // ���� ��� ����
 boolean pos = isPossible(human);//�Ҹ������� ���� 
 
 /* isPossible() �޼ҵ带 Ȱ���Ͽ� ���� ���� ���θ� Ȯ���ϴ� ���ǹ� �ۼ� */
 if(pos ==true) {
	 /* ���� ���� �� result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�. */
	 result ="������ �Ϸ�Ǿ����ϴ�."+ human.name+"�� �����մϴ�.";
	 
 }else {
	 /* ���� �Ұ� �� result = "������ �Ұ����մϴ�. */
	 result ="������ �Ұ����մϴ�.";
 }
 
 
 return result; //����
 }
}