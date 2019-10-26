package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fo= new FileOutputStream("D:/eclipse/file.txt");//~위치에 파일생성
			fo.write(65);//파일안에 아스킥코드 생성
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
