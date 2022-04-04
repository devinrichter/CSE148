package p1_comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("A", 4.0);
		Student s2 = new Student("Z", 3.0);
		Student s3 = new Student("M", 1.0);
		
		Student[] arr = { s1, s2, s3 };
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("The user of Comparator:");
		Arrays.sort(arr, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return Double.compare(o1.getGpa(), o2.getGpa());
			}
			
		});
		
		Arrays.sort(arr, (o1, o2) -> Double.compare(o1.getGpa(), o2.getGpa()));
		System.out.println(Arrays.toString(arr));
	}

}
