package p1;

// Cat: subclass, child class, derived class
// Pet: superclass, parent class, base class
// A subclass (Cat) inherits non-private class members from the super class (Pet)
public class Cat extends Pet { // Cat class will inherit code from another class

	private String color;

	public Cat(String name, double weight, String color) {
		super(name, weight); // must be the very first thing in your constructor
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
//	@Override
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	@Override
//	public String getName() {
//		return name;
//	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + ", color=" + color + "]";
	}

	@Override
	public void show() {
		System.out.println(this.toString());
	}

}
