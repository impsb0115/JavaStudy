package ch18;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListExam {
	public static void main(String[] args) {
		
		HashMap<String,Integer> map;
		ArrayList<HashMap<String,Integer>> list2; //ArrayList�� Map���
// ----------------------------
		
// arrayList �̸��� ���� ArrayList ����
		ArrayList<String> arrayList = new ArrayList<String>();
// ArrayList �� element �߰�
		arrayList.add("1��");
		arrayList.add("2��");
		arrayList.add("3��");
// ArrayList �� element �߰�
		arrayList.add("=> 4��");
		arrayList.add("=> 5��");
		for (int index = 0; index < arrayList.size(); index++) {
			System.out.println(arrayList.get(index));
		}
		
		arrayList.remove(4);   //3�� 4 ���� ����� ������ ���. 3�� �������� ��ȣ�� ������� ������ 4�� �������� , �������� ���� �����ϱ�
		arrayList.remove(3);
// ArrayList �� index�� �ο��� element �߰�
		arrayList.add(0, "=> 4��");
		arrayList.add(1, "=> 5��");
		for (int index = 0; index < arrayList.size(); index++) {
			System.out.println(arrayList.get(index));
		}
	}
}