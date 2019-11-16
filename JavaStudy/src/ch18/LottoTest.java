package ch18;
import java.util.Set;
import java.util.TreeSet;

public class LottoTest {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		
		//숫자를 지정하고 당첨될 확률이 몇인지 찾기
		set.add("3");
		set.add("4");
		set.add("16");
		set.add("20");
		set.add("28");
		set.add("44");

		Set<String> myNumber = new TreeSet<String>();
		int count = 0;
		boolean isMatch = false;
		while (!isMatch) {
			myNumber.clear();
			while (myNumber.size() < 6) {
				int num = (int) (Math.random() * 45) + 1;
				myNumber.add(num + "");
			}
			isMatch = set.containsAll(myNumber); //두 셋의 요소를 비교하기 
			System.out.println(set);
			System.out.println(myNumber);
			count++;
			System.out.println(count);
		}
		System.out.println("시도횟수 : " + count);
	}
}