package p3;

import java.util.Arrays;
import java.util.function.Predicate;

public class BookBag {
	private Book[] arr;
	private int nElems;
	
	public BookBag(int maxSize) {
		arr = new Book[maxSize];
	}
	
	public Book[] search(Predicate<Book> predicate) {
		Book[] temp = new Book[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public void insert(Book book) {
		arr[nElems++] = book;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

}
