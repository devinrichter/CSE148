package p1;

public class Student {
	// instance variables reflecting the STATE of an object (usually are nouns)
	private String name;
	private double gpa;
	
	// instance variable reflecting the behavior of an object (usually are verbs)
	private Playable playable; // function

	// an interface allows unimplemented functions (function placeholders) to be passed to a class.
	// these placeholders can be filled with actual implemented functions
	public Student(String name, double gpa, Playable playable) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.playable = playable;
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
	
	public void playSports() {
		playable.play();
	}
	
//	public void fastWalk() {
//		((BasketballPlayable)playable).walk();
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
