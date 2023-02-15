package com.jafa.cal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		// 날짜 형식화
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String formatDate = sdf.format(date);
		System.out.println(formatDate);
		
		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar);
		Date time = calendar.getTime();
		System.out.println(time);
		System.out.println(calendar.get(Calendar.YEAR)+"년");
		System.out.println(calendar.get(Calendar.MONTH)+1+"월");
		System.out.println(calendar.get(Calendar.DATE)+"일");
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2022, Calendar.JANUARY, 21);
		cal1.add(Calendar.DATE, 5);
		cal1.add(Calendar.DATE, -2);
		System.out.println(cal1.getTime());
	}
}
