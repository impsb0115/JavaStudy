package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file3 {
	public static void main(String[] args) {//파일 복사하기
		try {
			FileInputStream fi= new FileInputStream("D:/eclipse/file.txt");
			FileOutputStream fo= new FileOutputStream("D:/eclipse/file2.txt");
			
			//글자 3번 가져와서 3번 작성
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
