package p5;

import java.util.Arrays;

public class Student {
	private Name name;
	private String id;
	private Course[] arr;
	private String major;
	private double gpa;

	private static int idCount = 0;

	public Student(Name name, Course[] arr, String major, double gpa) {
		super();
		this.name = name;
		this.id = String.valueOf(++idCount);
		this.arr = arr;
		this.major = major;
		this.gpa = gpa;
	}

	public Student(Name name) {
		super();
		this.name = name;
		this.id = String.valueOf(++idCount);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Course[] getArr() {
		return arr;
	}

	public void setArr(Course[] arr) {
		this.arr = arr;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", arr=" + Arrays.toString(arr) + ", major=" + major + ", gpa="
				+ gpa + "]";
	}

}
