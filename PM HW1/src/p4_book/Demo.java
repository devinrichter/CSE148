package p4_book;

import java.util.Random;

public class Demo {
	// refactor
	private static final int BOOKS_TO_CREATE = 10;
	private static final String FORMAT = "%-10d%15S%10.2f%n";

	public static void main(String[] args) {
		BookHelper.printFormattedBooks(BOOKS_TO_CREATE, FORMAT);
	}

}
