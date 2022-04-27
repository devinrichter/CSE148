package p2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ExportAndImport {
	
	public static void exportBooks(String[] arr, String fileName) {
		
		try {
			File file = new File(fileName);
			PrintWriter writer = new PrintWriter(file);
			for(int i = 0; i < arr.length; i++) {
				writer.println(arr[i] + "\t" + (Math.random() * 200));
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static String[] importBooks(String fileName) {
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fileReader);
			int count = 0;
			while (true) {
				String line = br.readLine();
				if (line != null) {
					count++;
				} else {
					break;
				}
			}

			String[] arr = new String[count];
			br.close();
			fileReader.close();
			fileReader = new FileReader(fileName);
			br = new BufferedReader(fileReader);
			count = 0;
			while (true) {
				String line = br.readLine();
				if (line != null) {
					arr[count++] = line;
				} else {
					break;
				}
			}
			return arr;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
