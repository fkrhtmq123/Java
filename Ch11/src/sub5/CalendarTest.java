package sub5;

import java.util.Calendar;

/*
 * 날짜 : 2020/05/19
 * 이름 : 김동욱
 * 내용 : 교재 p538 Calendar 클래스 실습하기
 */

public class CalendarTest {

	public static void main(String[] args) {
		
		// 싱글톤 객체(Ch06-sub4 참고)
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 \n", year, month, date);
		System.out.printf("%d시 %d분 %d초 \n", hour, min, sec);
		
	}
	
}
