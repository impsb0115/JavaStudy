package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file3 {
	public static void main(String[] args) {//���� �����ϱ�
		try {
			FileInputStream fi= new FileInputStream("D:/eclipse/file.txt");
			FileOutputStream fo= new FileOutputStream("D:/eclipse/file2.txt");
			
			//���� 3�� �����ͼ� 3�� �ۼ�
			int data =fi.read();
			fo.write(data);
			
			data =fi.read();
			fo.write(data);
			
			data =fi.read();
			fo.write(data);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
