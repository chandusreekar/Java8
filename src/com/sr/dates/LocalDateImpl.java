package com.sr.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateImpl {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getDayOfMonth());
		LocalDate startDate  = LocalDate.of(2018, Month.FEBRUARY, 24);
		System.out.println(startDate);
		
		//To validate if it  is a leap year
		
		LocalDate isLeapYear = LocalDate.parse("2001-05-15");
		System.out.println("Lear Year "+isLeapYear.isLeapYear());
		
		
		//Date Comparisions
		
		System.out.println(startDate.isBefore(today));
		System.out.println(startDate.compareTo(today));
		//current >given ---> >0
		//current< give ---> <0
		
		
		
		//Date Manipulations
		//2019-09-25
		//2021-10-27
		LocalDate dateOps1 = today.plusDays(2).plusMonths(1).plusYears(2);
		System.out.println(dateOps1);
		
		LocalDate dateOps2 = dateOps1.minusDays(2).minusMonths(1).minusYears(2);
		System.out.println(dateOps2);
		
		
		
		//Period
		
		Period period1 = Period.of(2, 1, 3);//(years,months,days)
		LocalDate dateOps3 = today.plus(period1);
		System.out.println("Period "+period1);
		System.out.println("Date "+dateOps3);
		
		//Period between two dates
		
		Period period2 = Period.between(startDate, today);
		System.out.println(period2);
		System.out.println(period2.getMonths());
		
		//Chrononical Unit
		
		System.out.println(ChronoUnit.WEEKS.between(startDate, today));
		
		String dob = "15/Jan/2011";
		LocalDate dobParse = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MMM/yyyy"));
		System.out.println(dobParse);
		
		
		String dobParse1 = dobParse.format(DateTimeFormatter.ofPattern("dd MMMM , yyyy"));
		
		System.out.println(dobParse1);
		
		//Temporal Adjusters
		
		
		LocalDate nextSaturday = today.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println(nextSaturday);
		
		
		//ZonedDateTime
		
		ZonedDateTime date1 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(date1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
