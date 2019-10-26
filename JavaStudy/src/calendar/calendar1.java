package calendar;

import java.util.Calendar;

public class calendar1 {
	public static void main(String[] args) {
		
		//달력 추출하기
		
		Calendar c = Calendar.getInstance();
		
		int year = c.get( Calendar.YEAR); //year :1 상수로 되어있음
		System.out.println(year);
		
		//1월 = 0  --- 12월 = 11
		int month = c.get( Calendar.MONTH); 
		System.out.println(month);
		
		//일= 1 ---토 = 7
		int week = c.get( Calendar.DAY_OF_WEEK); //현재 요일 
		System.out.println(week);
	}

}
