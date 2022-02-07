package p4_book;

public class BookHelper {

	public static void printFormattedBooks(int booksToCreate, String format) {
		for (int i = 0; i < booksToCreate; i++) {
			Book book = new Book(getTitle(), getPrice());
			System.out.printf(format, (i + 1), book.getTitle(), book.getPrice());
		}
	}

	private static String getTitle() {
		String title = "";
		int randomNumber = 5 + (int) (Math.random() * 6);
		for (int j = 0; j < randomNumber; j++) {
			title += (char) (65 + (int) (Math.random() * 26));
		}
		return title;
	}

	private static double getPrice() {
		return Math.random() * 100;
	}

}
