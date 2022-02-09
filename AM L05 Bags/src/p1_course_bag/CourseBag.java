package p1_course_bag;

import java.util.Arrays;

public class CourseBag {
	private Course[] arr;
	private int nElems;

	public CourseBag(int maxSize) {
		arr = new Course[maxSize];
	}

	public Course[] removeByCredits(int credits) {
		Course[] matches = new Course[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getCredits() == credits) {
				matches[count++] = arr[i];
				for(int j = i; j < nElems-1; j++) {
					arr[j] = arr[j+1];
				}
				nElems--;
				i--;
			}
		}
		return Arrays.copyOf(matches, count);
		
		
		
	}

	public Course removeByCourseNumber(String courseNumber) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (arr[i].getCourseNumber().equals(courseNumber)) {
				break;
			}
		}

		if (i == nElems) { // no match found
			return null;
		} else { // match found
			Course temp = arr[i];
			for (int j = i; j < nElems - 1; j++) {
				arr[j] = arr[j + 1];
			}
			nElems--;
			return temp;
		}
	}

	public Course[] searchByCredits(int credits) {
		Course[] matches = new Course[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getCredits() == credits) {
				matches[count++] = arr[i];
			}
		}
//		return matches;
		return Arrays.copyOf(matches, count);
	}

	public Course searchByCourseNumber(String courseNumber) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getCourseNumber().equals(courseNumber)) {
				return arr[i];
			}
		}
		return null;
	}

	public void insert(Course course) {
		arr[nElems++] = course;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

}
