package p1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>(1000);
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.addAll(list1);
		list2.add("X");
		list2.add("Y");
//		list2.forEach(s -> System.out.println("Hi! " + s));
//		for(String s : list2) {
//			System.out.println(s);
//		}
//		list2.remove(1);
//		
//		list2.remove("C");
//		System.out.println(list2);
//		System.out.println(list2.contains("X"));
		System.out.println(list2);
//		list2.removeAll(list1);
//		System.out.println(list2);
//		list2.removeIf(str -> str.equals("C") || str.equals("Y"));
//		System.out.println(list2);
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("X");
		list3.add("A");
		System.out.println(list2.containsAll(list3));
	}

}
