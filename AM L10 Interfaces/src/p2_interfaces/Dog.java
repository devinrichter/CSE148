package p2_interfaces;

public class Dog implements Moveable {
	private String name;
	private double weight;

	public Dog(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", weight=" + weight + "]";
	}

	@Override
	public void move() {
		System.out.println("The dog moves!");
	}

}
