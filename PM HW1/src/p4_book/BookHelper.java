package p4_book;

public class BookHelper {
	
	
	
	public static void printFormattedBooks(int booksToCreate, String format) {
		for (int i = 0; i < booksToCreate; i++) {
			Book book = new Book(getTitle(), getPrice());
			System.out.printf(format, (i + 1), book.getTitle(), book.getPrice());
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
