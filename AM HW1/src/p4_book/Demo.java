package p4_book;

public class Demo {
	private static final int booksToCreate = 1000;
	private static final String format = "%-5d%15s%15.2f%n";

	public static void main(String[] args) {
		BookHelper.printFormattedBooks(booksToCreate, format);
	}

}
