package timeObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class time {

	public static void main(String[] args) {
		
//		private DateTimeFormatter mntFrmt;
//		private DateTimeFormatter secFrmt;
//		private DateTimeFormatter msecFrmt;
		
//		DateTimeFormatter mntFrmt = null;
//		mntFrmt = new DateTimeFormatterBuilder()
//				.appendPattern("yyyyMMddHHmm")
//				.toFormatter();
//		System.out.println(mntFrmt);
//		
//		System.out.println("");
//		
//		DateTimeFormatter secFrmt = null;
//		mntFrmt = new DateTimeFormatterBuilder()
//				.appendPattern("yyyyMMddHHmmss")
//				.toFormatter();
//		System.out.println(secFrmt);
//		
//		System.out.println("");
//		
//		DateTimeFormatter msecFrmt = null;
//		mntFrmt = new DateTimeFormatterBuilder()
//				.appendPattern("yyyyMMddHHmmss")
//				.appendValue(ChronoField.MILLI_OF_SECOND, 3)
//				.toFormatter();
//		System.out.println(secFrmt);	
		
		//LocalDate (로컬 - 년,월,일 날짜 정보만을 준다)
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		//원하는 날짜를 넣어주어 LocalDate객체로 리턴시켜준다.
		LocalDate targetDate = LocalDate.of(2022,05,10);
		System.out.println(targetDate);
		
		//LocalTime (로컬 - 현재 시간 정보를 LocalTime객체로 리턴해준다)
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		//원하는 시간을 넝허주고 LocalTime객체로 넣어서 리턴해준다
		LocalTime targetTime = LocalTime.of(1,30,25,1);
		System.out.println(targetTime);
		
		//LocalDateTime (로컬 - 컴퓨터의 현재 날짜 시간 정보 모두를 반환)
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		LocalDateTime targetDateTime = LocalDateTime.of(2022, 05,14, 21, 15, 30, 50);
		System.out.println(targetDateTime);
		
		//이제 위에서 2022-05-14T21:15:35.20147099라는 형태였는데
		//날짜 다음에 Time을 알려주는 T도 나오고 참 형식이 거슬릴수 있다. 
		//이 형태를 바꿔보자
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분 ss초");
		String nowString = now.format(dateTimeFormatter);		
		System.out.println(nowString);
		//2022년 5월 14일 오후 9시 24분 (a가 들어가서 오후를 넣어준다)
		
		LocalDateTime now2 = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		String nowString1 = now.format(dateTimeFormatter1);		
		System.out.println(nowString1);
		
		System.out.println(LocalDateTime.parse("2019-12-25T10:15:30"));
		System.out.println(LocalDateTime.parse("2019-12-25 12:30:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		
		//날짜 사이에 시간차이를 구하기도 해야한다.
		LocalDateTime startDate = LocalDateTime.now(); 
		LocalDateTime endDate = LocalDateTime.of(2025,01,01,12,30,20,5000);

		System.out.println(ChronoUnit.DAYS.between(startDate, endDate));
		
		//ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.WEEKS, ChronoUnit.DAYS,
		//ChronoUnit.HOURS, ChronoUnit.SECONDS, ChronoUnit.MILLIS, ChronoUnit.NANOS


	}
	
	

}
