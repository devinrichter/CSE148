package app;

import java.util.ArrayList;

public class DemoSearchWordsArray {

	public static void main(String[] args) {
		String[] trailNames = { "The Greenbelt A", "A GreenBelt Trail B", "New Trail" };
		ArrayList<String> list = searchByWords(trailNames, "trai");
		System.out.println(list);
	}

	public static ArrayList<String> searchByWords(String[] trailNames, String words) {

		ArrayList<String> matchList = new ArrayList<>();
		if (words.length() <= 3) {
			return matchList;
		} else {
			for (int i = 0; i < trailNames.length; i++) {
				int index = trailNames[i].toLowerCase().indexOf(words.toLowerCase());
				if (index >= 0) {
					matchList.add(trailNames[i]);
				}

			}

			return matchList;
		}
	}
}
