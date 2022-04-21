package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import model.Name;

public class Utilities {
	private static Random random = new Random();
	private static String firstNames = "rawData/names/firstNames.txt";
	private static String lastNames = "rawData/names/lastNames.txt";
	private static String majors = "rawData/majors/Majors.txt";
	private static String isbns = "rawData/Textbooks/textbook_isbns.txt";
	private static String titles = "rawData/Textbooks/textbook_titles.txt";

	private static String[] firstNameArr = makeArray(firstNames);
	private static String[] lastNameArr = makeArray(lastNames);
	private static String[] majorArr = makeMajorArray(majors);
	private static String[][] titleAndIsbnArr = makeBookTitleIsbnArr(titles, isbns);
	
	
	
	public static String[][] makeBookTitleIsbnArr(String titles, String isbns) {
		String[][] arr = new String[10][2]; // 10 books, each book contains title and isbn
		for (int i = 0 ; i < 10; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = getString(5);
			}
		}
	
		return arr;
	}
	
	private static String getString(int n) {
		String str = "";
		for(int i = 0; i < n; i++) {
			str += (char)(65 + (int)(Math.random() * 26));
		}
		return str;
	}

	public static String[] emitTitleAndIsbn() {
		String[] book = titleAndIsbnArr[(int)(Math.random() * titleAndIsbnArr.length)];
		return book;
	}
	
	public static void importBooks(TextbookBag textbookBag) {
		for(int i = 0; i < titleAndIsbnArr.length; i++) {
			Book book =  new Book(titleAndISbnArr[i][0], titleAndISbnArr[i][1], emitName(), emitPrice());
			textbookBag.insert(book);
		}
	}
	
//	public static Name emitName() {
//		String randFirstName = firstNameArr[random.nextInt(firstNameArr.length)];
//		String randLastName = lastNameArr[random.nextInt(lastNameArr.length)];
//		return new Name(randFirstName, randLastName);
//	}
	
	public static String emitMajor() {
		String randMajor = majorArr[random.nextInt(majorArr.length)];
		return randMajor;
	}
	
	public static String[] makeMajorArray(String fileName) {
		File file = new File(fileName);
		String[] arr;
		try {
			Scanner scanner = new Scanner(file);
			String line = scanner.nextLine();
			arr = line.split(", ");
			scanner.close();
			return arr;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String[] makeArray(String fileName) {
		File file = new File(fileName);
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int lineCount = 0;
		while (scanner.hasNextLine()) {
			scanner.nextLine();
			lineCount++;
		}
		scanner.close();
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String[] arr = new String[lineCount];
		lineCount = 0;
		while(scanner.hasNextLine()) {
			arr[lineCount++] = scanner.nextLine();
		}
		scanner.close();
		return arr;
	}

}
