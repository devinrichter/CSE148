package sandbox;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import util.Utilities;

public class DemoBuferedReader {

	public static void main(String[] args) {
		String titles = "rawData/textbooks/textbook_titles.txt";
		String isbns = "rawData/textbooks/textbook_isbns.txt";
		String[][] books = Utilities.makeBookTitleIsbnArr(titles, isbns);
		
		for(int i = 0; i < books.length; i++) {
			for(int j =0; j < books[i].length; j++) {
				System.out.print(books[i][j]);
				System.out.println("\t");
			}
			System.out.println();
		}

	}

}
