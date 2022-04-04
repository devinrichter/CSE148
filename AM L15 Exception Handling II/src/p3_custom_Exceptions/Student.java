package p3_custom_Exceptions;

public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		if(gpa > 4.0) {
			try {
				throw new IncorrectGPAException("The GPA entered is too big!");
			} catch (IncorrectGPAException e) {
				System.out.println(e.getMessage());
			}
		} else if(gpa < 0.0) {
			try {
				throw new IncorrectGPAException("The GPA entered is too small!");
			} catch (IncorrectGPAException e) {
				System.out.println(e.getMessage());
			}
		} else {
		this.gpa = gpa;
		}
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
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
