package p1;

public interface Animal {
	
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
