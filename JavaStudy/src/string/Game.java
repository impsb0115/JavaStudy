package string;

public class Game {
public static void main(String[] args) {
	//double d= Math.pow(2,38); 2의 38승 계산하기
	//System.out.println((long)d); 숫자값이 크기 때문에 long로 변환
		
		//아스킥코드 위치 변경
	String text = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
	for(int i=0; i< text.length();i++){
		char c = text.charAt(i);
		c= (char)(c+2);//2개 추가 +char로 형변환
		System.out.print(c);
		
	}

}
}
