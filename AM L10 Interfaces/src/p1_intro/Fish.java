package p1_intro;

public class Fish extends Pet implements Animal,Eatable {
	private String color;
	private double length;

	public Fish(String name, int weight, String color, double length) {
		super(name, weight);
		this.color = color;
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Fish [color=" + color + ", length=" + length + "]";
	}

	@Override
	public void fly() {
		System.out.println("This is a flying fish");
	}

	@Override
	public void walk() {
		System.out.println("Fish cannot walk");
	}

	@Override
	public void swim() {
		System.out.println("Fish swims!");
	}

	@Override
	public void cook() {
		System.out.println("Stir fry the fish.");
	}

	@Override
	public void move() {
		System.out.println("The fish moves!");
	}

}
