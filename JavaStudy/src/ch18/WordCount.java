package ch18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class WordCount {
	
	public static void main(String[] args) {
		
		StringBuffer text = new StringBuffer(); //���� �� StringBuffer ����ϱ� 
		
		text.append("�������� ����Ĩ ���� ��� �������� ����Ĩ�� ");
		text.append("������ ����Ĩ ������ ������ ����Ĩ�� ���� ");
		text.append("������ ����Ĩ�� �ǰ� �; ������ ����Ĩ ���� ���µ� ");
		text.append("������ ����Ĩ ������ ������ ����Ĩ �����Ⱑ ");
		text.append("�� ������ ����Ĩ�� �ƴϰ� �������� ����Ĩ�̴ϱ� ");
		text.append("�������� ����Ĩ���󿡼� ��� ����ؼ� ");
		text.append("�������� ����Ĩ�� ������ ����Ĩ�� �Ǵ� ���� �����ϰ� ");
		text.append("�������� ����Ĩ ����� ���ư���. ");
		
		String[] words = text.toString().split(" "); //���⸦ �������� �迭�� �����. ��������=0 ����Ĩ =1 ���� =2 ��� =3 �������� =4 ***
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		for (String word : words) {
			boolean isContain = wordMap.containsKey(word);
			int count = 1;
			if (isContain) {
				count = wordMap.get(word);
				count++;
			}
			wordMap.put(word, count);
		}
		
		System.out.println(wordMap);
	
		System.out.println("--------------------");
		
		
		//key�� set���� �ٲٱ� set�� get�� ���� iterator�� ����.
		Set<String> keys = wordMap.keySet();
		Iterator<String> iter = keys.iterator(); //key������ iterator�� ��ȯ
		while (iter.hasNext()) {
			String key = iter.next();
			int value = wordMap.get(key);
			System.out.println(key + " - " + value);
		}
	}
}
