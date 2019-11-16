package ch18;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListExam {
	public static void main(String[] args) {
		
		HashMap<String,Integer> map;
		ArrayList<HashMap<String,Integer>> list2; //ArrayList에 Map담기
// ----------------------------
		
// arrayList 이름을 가진 ArrayList 생성
		ArrayList<String> arrayList = new ArrayList<String>();
// ArrayList 에 element 추가
		arrayList.add("1번");
		arrayList.add("2번");
		arrayList.add("3번");
// ArrayList 에 element 추가
		arrayList.add("=> 4번");
		arrayList.add("=> 5번");
		for (int index = 0; index < arrayList.size(); index++) {
			System.out.println(arrayList.get(index));
		}
		
		arrayList.remove(4);   //3과 4 순서 변경시 에러가 뜬다. 3이 없어지며 번호가 당겨지기 때문에 4를 삭제못함 , 역순으로 먼저 삭제하기
		arrayList.remove(3);
// ArrayList 에 index를 부여한 element 추가
		arrayList.add(0, "=> 4번");
		arrayList.add(1, "=> 5번");
		for (int index = 0; index < arrayList.size(); index++) {
			System.out.println(arrayList.get(index));
		}
	}
}