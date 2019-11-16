package ch18;

import java.util.HashMap;

public class HashMapExam {
	public static void main(String[] args) {
		//     <String, String> 2개가 필요함
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");
		map.put("D", "4");
		System.out.println(map);
		
		
		map.put("A", "10"); //10으로 덮어버림
		System.out.println(map);
	}
}