package com.streams2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesJava8Demo {

	public static void main(String[] args) {
		try(Stream<String> dataRepo = Files.lines(Paths.get("repo","tabletDoc.txt"))){
			//to convert Stream of String to a list
			List<Tablet> tabletList = dataRepo.map(FilesJava8Demo::getTabletData)
					.sorted(Comparator.comparing(Tablet::getExpiryDate))
					.collect(Collectors.toCollection(ArrayList::new));
			
			System.out.println("***********Tablets List which are expired***********");
			tabletList.stream().filter(t->t.expiryDate.isBefore(LocalDate.now()))
			.forEach(System.out::println);
			
		}
		catch (IOException e) {
		e.printStackTrace();
		}

	}
	
	public static Tablet getTabletData(String data) {
		String[] rows = data.split(",");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Tablet tablet = new Tablet(rows[0],LocalDate.parse(rows[1], formatter));
		return tablet;
	}


}
