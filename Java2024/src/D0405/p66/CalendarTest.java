package D0405.p66;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		System.out.println(year + "년 ");
		System.out.println(month + "월 ");
		System.out.println(day + "일 ");

		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		if (ampm == Calendar.AM) {
			strampm = "오전";
		} else {
			strampm = "오후";
		}
		System.out.println(strampm + " ");

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.println(hour + "시 ");
		System.out.println(minute + "분 ");
		System.out.println(second + "초 ");
	}

}
