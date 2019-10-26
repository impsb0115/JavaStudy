package string;
public class Exam12_3 {
 public static void main(String[] args) {
 String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
 // 코드 작성
 
 int idx=0;
 //무한반복
 while(true) {
	 
	 idx=str.indexOf(" ",idx+1);//공백찾기
	 if(idx ==-1) {
		 System.out.println(str); //만세는 공백이 없어서 출력되지 않는다. 그래서 땜빵식으로 넣기
		 break;
	 }  //내용이 크게없을때 {} 생략가능
	 String s = str.substring(0,idx); //-1로 돌아가기때문에 오류가 생김=> break넣기
	 System.out.println(s);
 }
 
 
 }
}
//출력결과
//동해물과
//동해물과 백두산이
//동해물과 백두산이 마르고
//동해물과 백두산이 마르고 닳도록
//동해물과 백두산이 마르고 닳도록 하느님이
//동해물과 백두산이 마르고 닳도록 하느님이 보우하사
//동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라
//동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세