package com.ss.jb5.as1.b;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;

public class DateTime {

	public static void main(String[] args) {
		DateTime dt = new DateTime();
		System.out.println("Current Date=" + LocalDateTime.now());
		dt.lengthOfMonths(2011);
		Month july = Month.JULY;
		dt.howManyMons(july);
		LocalDate date = LocalDate.now();
		dt.cursedDate(date);
		LocalDate cursedDay = LocalDate.of(2021, Month.AUGUST, 13);
		dt.cursedDate(cursedDay);
	}
	
	public void lengthOfMonths(Integer year) {
		for (Month month : Month.values()) {
			YearMonth yearMonth = YearMonth.of(year, month);
			System.out.println("The month of " + month + " contains " + yearMonth.lengthOfMonth() + " days.");
		}
		System.out.println("***************************");

	}
	
	public void howManyMons(Month month) {		
		LocalDate date = Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		while (date.getMonth() == month) {
			System.out.println(date);
			date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		}
		System.out.println("***************************");
	}
	
	public void cursedDate(LocalDate date) {
		if (date.getDayOfMonth() == 13 && date.getDayOfWeek() == DayOfWeek.FRIDAY) {
			System.out.println("THIS IS A CURSED DATE!!!!!!! WATCH OUT!!");
		} else {
			System.out.println("Whew. You are safe.");
		}
		System.out.println("***************************");
	}
}
