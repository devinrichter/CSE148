package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DemoDate {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
//		LocalDate date2 = LocalDate.of(2020, 4, 22);
//		System.out.println(date2);
		
		// DatePicker
//		
//		LocalDate date3 = LocalDate.parse("2018-11-01");
//        System.out.println(date3);
//
//        // Function call
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        System.out.println(formatter.format(date1));
	}

}
