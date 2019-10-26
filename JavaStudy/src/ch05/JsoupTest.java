package ch05;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
public static void main(String[] args) throws IOException {//����ó��
	
	
	
	
		//������ ������ �����´�.

		Document doc = Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=626907&weekday=wed").get(); //����ó��

		//���� �߿��� ���ϴ� �κ��� �����´�.

		//Elements contents = doc.select("td a"); //����� td���� a�� ��������� �� .Elements -> s �� ����
		Elements contents = doc.select("td.title a");//Ÿ��Ʋ �ڼ��ϰ� 
		
		for(int i=0; i<contents.size();i++) { //���� size or length
			
			Element e = contents.get(i); //Element �ܼ�
			String text=e.text();
			String no =text.substring(0,4); // (������ġ,����ġ)0���� �����Ͽ� 4���ڱ��� �����´�.=> 000ȭ  4�ڸ�
			String title = text.substring(5); //ȭ �������� ���  5���� ����
			System.out.println(no);
			System.out.println(title);
		}
		

		//���ϴ� �κ��� Elements���·� �Ǿ� �����Ƿ� �̸� String ���·� �ٲپ� �ش�.


		System.out.println("---------------");
		
		
		
		


}
}
