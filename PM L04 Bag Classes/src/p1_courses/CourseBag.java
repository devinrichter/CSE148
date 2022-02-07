package p1_courses;

// encapsulated array and methods
public class CourseBag {
	private Course[] arr;
	private int nElems;

	public CourseBag(int maxSize) {
		arr = new Course[maxSize];
//		nElems = 0;
	}
	
	public Course removeByCourseNumber(String courseNumber) {
		int i = 0;
		for(i = 0; i < nElems; i++) {
			if(arr[i].getCourseNumber().equals(courseNumber)) {
				break;
			}
		}
		
		if(i == nElems) { // no match found
			return null; 
		} else { // found it
			Course temp = arr[i];
			for(int j = i; j < nElems-1; j++) {
				arr[j] = arr[j+1];
			}
			nElems--;
			return temp;
		}
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

	public Course searchByCourseNumber(String courseNumber) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getCourseNumber().equals(courseNumber)) {
				return arr[i];
			}
		}
		return null;
	}

}
