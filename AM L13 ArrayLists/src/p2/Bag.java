package p2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Bag {
	private ArrayList<Student> list;

	public Bag(int maxSize) {
		list = new ArrayList<>(maxSize);
	}
	
	public ArrayList<Student> remove(Predicate<Student> predicate) {
		ArrayList<Student> temp = new ArrayList<>(list.size());
		for(Student s : list) {
			if(predicate.test(s)) {
				temp.remove(s);
			}
		}
		temp.trimToSize();
		return temp;
	}
	
	public ArrayList<Student> search(Predicate<Student> predicate) {
		ArrayList<Student> temp = new ArrayList<>(list.size());
		for(Student s : list) {
			if(predicate.test(s)) {
				temp.add(s);
			}
		}
		temp.trimToSize();
		return temp;
	}
	
	public void insert(Student student) {
		list.add(student);
	}
	
	public void display() {
//		System.out.println(list);
		for(Student s : list) {
			System.out.println(s);
		}
	}
}
