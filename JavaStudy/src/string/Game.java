package string;

public class Game {
public static void main(String[] args) {
	//double d= Math.pow(2,38); 2�� 38�� ����ϱ�
	//System.out.println((long)d); ���ڰ��� ũ�� ������ long�� ��ȯ
		
		//�ƽ�ű�ڵ� ��ġ ����
	String text = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
	for(int i=0; i< text.length();i++){
		char c = text.charAt(i);
		c= (char)(c+2);//2�� �߰� +char�� ����ȯ
		System.out.print(c);
		
	}

}
}
