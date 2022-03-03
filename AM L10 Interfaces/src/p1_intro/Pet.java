package p1_intro;

public abstract class Pet {
	private String name;
	private int weight;

	public Pet(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	public abstract void move();
	
	public static void eat() {
		System.out.println("The pet is eating!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", weight=" + weight + "]";
	}
}
