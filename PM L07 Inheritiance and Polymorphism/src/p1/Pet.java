package p1;

public abstract class Pet {
	private String name;
	private double weight;

	public Pet(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	public abstract void show();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() { // final means no overridden
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", weight=" + weight + "]";
	}

}
