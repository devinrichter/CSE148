package p1_text_io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DemoWriteText {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
		try {
			PrintWriter pw = new PrintWriter("output/dataWritten.txt");
			pw.println("Hi");
			pw.println("Bye");
			pw.println("Goodbye");
			for(int i = 0; i < numbers.length; i++) {
				pw.println(numbers[i]);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
