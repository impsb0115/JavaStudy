package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fo= new FileOutputStream("D:/eclipse/file.txt");//~��ġ�� ���ϻ���
			fo.write(65);//���Ͼȿ� �ƽ�ű�ڵ� ����
			fo.write(80);
			fo.write(91);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
