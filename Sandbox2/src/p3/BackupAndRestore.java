package p3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BackupAndRestore {
	public static void backup(String fileName) {
		ArrayList<String> bookList = new ArrayList<>();

		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			for (int i = 0; i < 5; i++) {
				if (scanner.hasNextLine()) {
					bookList.add(scanner.nextLine());
				} else {
					break;
				}
			}

			FileOutputStream fos = new FileOutputStream("BookData/fiveBooksArrayList.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(bookList);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void restore(String fileName) {
		try {
			FileInputStream dos = new FileInputStream(fileName);
			ObjectInputStream oos = new ObjectInputStream(dos);
			ArrayList<String> list = (ArrayList<String>)(oos.readObject());
			ArrayList<String> newList = new ArrayList<>();
			newList.add(list.get(0));
			newList.add(list.get(1));
			for(String s : newList) {
				System.out.println(s);
			}
			oos.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
