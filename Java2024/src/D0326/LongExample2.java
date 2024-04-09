package D0326;

import java.util.Calendar;

public class LongExample2 {
	enum Week {
		MONDAY, TUESWDAY, WENESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	};

	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance();
		int iWeek = cal.get(Calendar.DAY_OF_WEEK);

		switch (iWeek) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESWDAY;
			break;
		case 4:
			today = Week.WENESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		System.out.println("오늘 요일 : " + today);

		if (today == Week.SUNDAY) {
			System.out.println("오늘은 쉬는 날 입니다.");
		} else {
			System.out.println("오늘은 공부하는 날 입니다.");
		}

	}

}
