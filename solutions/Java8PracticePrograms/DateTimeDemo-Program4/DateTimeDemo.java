package com.streams2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DateTimeDemo {

	public static void main(String[] args) {

		System.out.println("Enter investment date in format 'dd/mm/yyyy':");
		String investment_date = new Scanner(System.in).nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate maturity_date = LocalDate.parse(investment_date, formatter);
		maturity_date = maturity_date.plusMonths(11).plusYears(4);
		System.out.println("Maturity date: " + maturity_date);

		LocalDate firstOfMonth = LocalDate.now().plusMonths(1).withDayOfMonth(1);
		LocalDate endOfMonth = LocalDate.now().plusMonths(1).withDayOfMonth(1).plusMonths(1).minusDays(1);

		List<LocalDate> week_days_list = new ArrayList<LocalDate>();
		long days = ChronoUnit.DAYS.between(firstOfMonth, endOfMonth);
		DayOfWeek dow;
		LocalDate date = firstOfMonth;

		for (long i = 0; i < days; i++) {
			dow = date.getDayOfWeek();
			if (!(dow.equals(DayOfWeek.SATURDAY) || dow.equals(DayOfWeek.SUNDAY))) {
				week_days_list.add(date);
			}
			date = date.plusDays(1);
		}

		System.out.println(week_days_list);

		List<String> tabletName = TabletSource.tabletList.stream()
				.filter(d -> d.expiryDate.isBefore(LocalDate.now().plusMonths(3))).map(tablet -> tablet.getName())
				.collect(Collectors.toList());
		System.out.println(tabletName);

		List<Tablet> sortedTablets = TabletSource.tabletList.stream()
				.sorted(Comparator.comparing(Tablet::getExpiryDate)).collect(Collectors.toList());
		System.out.println(sortedTablets);
	}

}
