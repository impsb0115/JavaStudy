package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file4 {
	public static void main(String[] args) {//파일 복사하기
		try {
			FileInputStream fi= new FileInputStream("D:/eclipse/file.bin");
			FileOutputStream fo= new FileOutputStream("D:/eclipse/file2.bin");
			

			while(true) {
				int data = fi.read();
				if (data == -1) break;
				fo.write(data);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
