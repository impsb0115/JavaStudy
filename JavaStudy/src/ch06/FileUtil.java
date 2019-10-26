package ch06;

import java.io.File;
import java.io.IOException;

public class FileUtil {

	//원하는 경로에 폴더 만들어서 안에 내용물 넣기
	public static void main(String[] args) throws IOException {
		File file =new File("c:/my_foler");//가상으로 만듦
		
		//if(file.isDirectory()==false) {//디렉토리가 있는지 확인하기. 없으면 폴더 만들기
		if(!file.isDirectory()) { //false대신 !로 편하게 사용 =부정의 부정
			file.mkdir();//폴더만들기 
		}
		
		
		File file2 =new File("c:/my_foler/my_text.txt");
		file2.createNewFile();//파일만들기
		
		
		
	}
}
