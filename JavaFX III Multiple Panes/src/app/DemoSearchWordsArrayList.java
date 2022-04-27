package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoSearchWordsArrayList {

	public static void main(String[] args) {
		String[] trailNames = { "The Greenbelt A", "A Greenbelt Trail B", "New Trail" };
		List<String> trailList = Arrays.asList(trailNames);
		
		trailList.forEach(str -> {
			if(str.contains("Trail")) {
				
			}
		});
//		System.out.println(trailList);
//		System.out.println(trailList.indexOf("Trail"));
//		
//		ArrayList<String> list = searchByWords(trailNames, "trai");
//		System.out.println(list);
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
