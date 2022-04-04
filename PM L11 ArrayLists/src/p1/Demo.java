package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class Demo {

	public static void main(String[] args) {
		// Used to store objects ONLY
		// It is meant to store data of the same reference type
		// An arrayList is based on an array, but it is sugar coated
		// ArrayLists are created with a default array size of 10
		// It automatically expands and shrinks as necessary as you add or remove data
		// it is a good choice of data structure to use if you have no idea about the
		// data size.
		// it is also a disadvantage to use an arraylist because it is slower than an
		// array
		// But you could set the initial array size to whatever you want
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(40);
		list1.add(15);
		list1.add(5);
		

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(7);
		list2.add(30);

		list1.addAll(list2);
		
		

//		list1.forEach(new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t*t);
//			}
//			
//		});

//		list1.forEach((Integer t) -> System.out.println(t * t));

//		list1.removeIf(t -> t % 20 == 0);
		
		Collections.sort(list1);

		System.out.println(list1);

//		System.out.println(list1.size());

//		System.out.println(list1.containsAll(list2));

//		System.out.println(list1);
	}

}
