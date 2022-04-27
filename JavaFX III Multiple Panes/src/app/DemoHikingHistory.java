package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DemoHikingHistory {

	public static void main(String[] args) {
//		Hike hike1 = new Hike("0", LocalDate.of(2020,04,01), 2.5);
//		Hike hike2 = new Hike("1", LocalDate.of(2020, 05, 02), 3.5);
//		Hike hike3 = new Hike("2", LocalDate.of(2020, 06, 3), 4.5);
//		Hike hike4 = new Hike("3", LocalDate.of(2021, 5, 4), 5.5);
//		
//		TrailBag trailBag = new TrailBag(10000);
//		
//		HikingHistory hikingHistory = new HikingHistory(trailBag);
//		hikingHistory.addHike(hike1);
//		hikingHistory.addHike(hike2);
//		hikingHistory.addHike(hike3);
//		hikingHistory.addHike(hike4);
		
		
//		try {
//			PrintWriter pw = new PrintWriter("Data.txt");
//			pw.println("A");
//			pw.println("B");
//			pw.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		File file = new File("Data.txt");
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
