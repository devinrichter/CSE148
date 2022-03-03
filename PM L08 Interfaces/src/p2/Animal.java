package p2;

public interface Animal {
	// in an interface, all variables are public, final, and static
	int count = 10;
	
	void jump();
	
	void walk();
	 
	void eat();
	
	public default void show() {
		System.out.println("Show!");
	}
	
	public static void drink() {
		System.out.println("Drink!");
	}

}
