package ch06;

import java.io.File;
import java.io.IOException;

public class FileUtil {

	//���ϴ� ��ο� ���� ���� �ȿ� ���빰 �ֱ�
	public static void main(String[] args) throws IOException {
		File file =new File("c:/my_foler");//�������� ����
		
		//if(file.isDirectory()==false) {//���丮�� �ִ��� Ȯ���ϱ�. ������ ���� �����
		if(!file.isDirectory()) { //false��� !�� ���ϰ� ��� =������ ����
			file.mkdir();//��������� 
		}
		
		
		File file2 =new File("c:/my_foler/my_text.txt");
		file2.createNewFile();//���ϸ����
		
		
		
	}
}
