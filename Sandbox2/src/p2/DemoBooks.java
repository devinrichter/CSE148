package p2;

public class DemoBooks {

	public static void main(String[] args) {
		String[] books = ExportAndImport.importBooks("BookData/book_titles.txt");
		
		ExportAndImport.exportBooks(books, "BookData/titles.txt");
	}

}
