package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class file2 {
	public static void main(String[] args) {
		try {
			FileInputStream fo= new FileInputStream("D:/eclipse/file.txt");//~��ġ�� ���ϻ���
			int data =fo.read();
			System.out.println(data);
			System.out.println((char)data);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
