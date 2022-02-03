package p4_book;

import java.util.Random;

public class Demo {
 // refactor
	public static void main(String[] args) {
		printFormattedBooks();
	}

	public static void printFormattedBooks() {
		for (int i = 0; i < 1000; i++) {
			Book book = new Book(getTitle(), getPrice());
			System.out.printf("%-10d%20S%10.2f%n", (i + 1), book.getTitle(), book.getPrice());
		}
	}

	private static double getPrice() {
//		Random random = new Random(100);
//		return random.nextDouble();
		return Math.random()* 100;
	}

	private static String getTitle() {
		int letterCount = 5 + (int)(Math.random() * 6);
		String title = "";
		
		for (int i = 0; i < letterCount; i++) {
			title += (char) (65 + (int) (Math.random() * 26));
		}
		return title;
	}

	
}
