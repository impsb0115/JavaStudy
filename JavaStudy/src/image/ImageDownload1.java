package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ImageDownload1 {
	public static void main(String[] args) throws IOException {
		//String imgUrl = "http://ggoreb.com/images/luffy.jpg";
		
		Connection con =Jsoup.connect("http://ggoreb.com/http/html1.jsp");
		Document doc =con.get();
		Elements eles =doc.getElementsByTag("img");
		for(int i=0;i <eles.size();i++) {
			String file = eles.get(i).attr("src");
			//indexOF,substring 
			///images/luffy.jpg 에서 두번째 /위치를 찾아 /뒤의 단어인 파일명을 출력하도록 하기
			int 위치 =file.lastIndexOf("/"); //마지막 /의 위치를 찾음 
			file = file.substring(위치+1);//  /까지 출력되니 그다음부터 출력되게 +1로 파일명만 출력
			
			System.out.println(file);
			
			String imgUrl = "http://ggoreb.com"+ eles.get(i).attr("src");//
			
			URL url = new URL(imgUrl);
			BufferedImage img = ImageIO.read(url);
			ImageIO.write(img, "jpg", new File(file));
		}
		
		
	}
}