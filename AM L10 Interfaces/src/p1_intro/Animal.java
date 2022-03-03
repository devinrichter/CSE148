package p1_intro;

public interface Animal {
	int weight = 0;
	
	void fly();

	void walk();

	void swim();

	default void show() {
		System.out.println("Hi");
	}
	
	static void jump() {
		System.out.println("The animal jumps!");
	}
}
