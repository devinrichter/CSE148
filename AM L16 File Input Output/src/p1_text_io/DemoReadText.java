package p1_text_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DemoReadText {

	public static void main(String[] args) {
		File file = new File("data.txt");
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String str = scanner.nextLine();
				String[] words = str.split(" ");
				System.out.println(Arrays.toString(words));
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			System.out.println("No such line to read!");
		}
		
		System.out.println("End!");
	}

}
