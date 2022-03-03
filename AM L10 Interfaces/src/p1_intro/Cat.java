package p1_intro;

public class Cat extends Pet {
	private String color;

	public Cat(String name, int weight, String color) {
		super(name, weight);
		this.color = color;
	}

	@Override
	public void move() {
		System.out.println("The cat is moving!");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + ", color=" + color + "]";
	}

}
