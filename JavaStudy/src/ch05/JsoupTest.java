package ch05;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
public static void main(String[] args) throws IOException {//예외처리
	
	
	
	
		//웹에서 내용을 가져온다.

		Document doc = Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=626907&weekday=wed").get(); //예외처리

		//내용 중에서 원하는 부분을 가져온다.

		//Elements contents = doc.select("td a"); //띄어쓰기는 td밑의 a를 가져오라는 뜻 .Elements -> s 는 복수
		Elements contents = doc.select("td.title a");//타이틀 자세하게 
		
		for(int i=0; i<contents.size();i++) { //길이 size or length
			
			Element e = contents.get(i); //Element 단수
			String text=e.text();
			String no =text.substring(0,4); // (시작위치,끝위치)0부터 시작하여 4글자까지 가져온다.=> 000화  4자리
			String title = text.substring(5); //화 다음부터 출력  5부터 시작
			System.out.println(no);
			System.out.println(title);
		}
		

		//원하는 부분은 Elements형태로 되어 있으므로 이를 String 형태로 바꾸어 준다.


		System.out.println("---------------");
		
		
		
		


}
}
