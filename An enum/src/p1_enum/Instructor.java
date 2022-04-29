package p1_enum;

public class Instructor {
	private String name;
	private double salary;
	private Rank rank;
	
	public Instructor(String name, double salary, Rank rank) {
		super();
		this.name = name;
		this.salary = salary;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", salary=" + salary + ", rank=" + rank + "]";
	}
	
	
}
