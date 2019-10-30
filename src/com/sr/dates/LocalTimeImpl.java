package com.sr.dates;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeImpl {

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		
		LocalTime afterTime = currentTime.plusHours(10).plusMinutes(2).plusSeconds(12);
		
		System.out.println("afterTime "+afterTime);
		
		Duration duration = Duration.between(currentTime, afterTime);
		System.out.println(duration);
		//Duration object of specified time
		Duration minutes = Duration.ofHours(12);
		
		System.out.println(minutes);
		
		

	}

}
