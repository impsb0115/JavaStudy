package string;

public class IndexOF {
	
	public static void main(String[] args) {
		
		String str ="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		
		int count =0;
		int idx =0;
		while(idx>-1) {
			idx =str.indexOf("Lorem", idx); //idx�� 0�̱� ������ ��� 0�� �ݺ��Ѵ�
			
			if(idx !=-1) { //idx�� -1�� �ƴҶ� ī��Ʈ�ض�
				count++;
				System.out.println("Lorem ��ġ : " +idx);
			}
			
			if(idx ==-1) { //idx�� -1�϶� �����
				break;
				
			}
			idx++; //�׷��� ������Ű�� = -1���� �ٽ�  0�� �� =���ѹݺ� => break���� �����ϱ�
		}
		
		System.out.println(count);
		
		
		        
//		String str ="JAVA ������ �缺�� ���� ����������!!";
//		int idx =str.indexOf(" "); //��ġã��
//		System.out.println(idx); //4���
//		
//		
//		while(idx >-1){ //���Ϸ� ������ġã�� (-1���� Ŭ������)
//			
//			idx =str.indexOf(" ", idx+1); //4�� ã�ұ� ������ �� �ĺ��� �����ؾ��ؼ� +1�ϱ�
//			System.out.println(idx);
//		}
//		
	
		
		
//		//���� ���� ��ġ ã��
//		idx =str.indexOf(" ", 5); //4 ���� ������ ã�� 
//		System.out.println(idx);
//		
//		idx =str.indexOf(" ", 9); //5 ���� ������ ã�� 
//		System.out.println(idx);
//		
//		idx =str.indexOf(" ", 13); 
//		System.out.println(idx);
//		idx =str.indexOf(" ", 16); 
//		System.out.println(idx); //-1���

	}

}
