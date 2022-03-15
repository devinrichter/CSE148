package p3;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		BookBag bag = new BookBag(10);
		Book b1 = new Book("A", 10.99);
		Book b2 = new Book("B", 15.99);
		Book b3= new Book("C", 10.99);
		Book b4 = new Book("C", 19.99);
		
		bag.insert(b1);
		bag.insert(b2);
		bag.insert(b3);
		bag.insert(b4);
		
		Book[] booksFound = bag.search((b) -> {
			return b.getPrice() <= 17.00;
		});
		
		System.out.println(Arrays.toString(booksFound));
	}

}
