package model;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private double gpa;

	public Person(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gpa=" + gpa + "]";
	}

}
