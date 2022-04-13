package p1_textfile_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
//		try {
//			FileWriter fw = new FileWriter("textfiles/data.txt", false);
//			PrintWriter pw = new PrintWriter(fw);
////			pw.printf("%10S%10.2f%n", "Alan", 1.1655);
////			pw.printf("%10S%10.2f%n", "Bill", 2.255);
////			pw.printf("%10S%10.2f%n", "Cathy", 3.5655);
//			char[] arr = {65, 66, 67};
//			pw.write(arr);
//			pw.print(65);
//			pw.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
		
		File file = new File("textFiles/data.txt");
		try {
			Scanner scanner = new Scanner(file);
			String line1 = scanner.nextLine();
			String line2 = scanner.nextLine();
			String line3 = scanner.nextLine();
			String line4 = scanner.nextLine();
			scanner.close();
			System.out.println(line1);
			String[] names = line2.split(" ");
			System.out.println("First Name: " + names[0] + "\t" + "Last Name: " + names[1]);
			
			names = line3.split("[#,]");
			System.out.println("First Name: " + names[0] + "\t" + "Last Name: " + names[1] + "\t" + names[2].charAt(0));
			
			String[] majors = line4.split(", ");
			for(String major : majors) {
				System.out.println(major);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
