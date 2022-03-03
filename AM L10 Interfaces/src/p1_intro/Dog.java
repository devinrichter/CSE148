package p1_intro;

public class Dog extends Pet {
	private String breed;

	public Dog(String name, int weight, String breed) {
		super(name, weight);
		this.breed = breed;
	}

	@Override
	public void move() {
		System.out.println("The dog is moving!");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + ", breed=" + breed + "]";
	}
	
	
}
