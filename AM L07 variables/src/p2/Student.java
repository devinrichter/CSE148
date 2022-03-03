package p2;

import java.util.Objects;

public class Student {
	private Name name;
	private double gpa;

	public Student(Name name, double gpa) {
		super();
//		this.name = new Name(name.getFirstName(), name.getLastName());
		this.name = new Name(name);
		this.gpa = gpa;
	}
	
	public Student(Student student) {
		this.name = new Name(student.name);
		this.gpa = student.gpa;
	}

	public Name getName() {
		return new Name(name);
	}

	public void setName(Name name) {
		this.name = new Name(name);
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(gpa, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa) && Objects.equals(name, other.name);
	}

}
