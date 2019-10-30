package com.streams2;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class TabletSource {

	static List<Tablet> tabletList = Arrays.asList(new Tablet[] {
			new Tablet("Cetrizine",LocalDate.of(2020, Month.NOVEMBER, 24)),
			new Tablet("Crocin",LocalDate.of(2019, Month.OCTOBER, 28)),
			new Tablet("Aspirin",LocalDate.of(2020, Month.FEBRUARY, 10)),
			new Tablet("Dcold",LocalDate.of(2019, Month.NOVEMBER, 30))
	});

}
