package p3_interfaces;

public class DemoMoveable {

	public static void main(String[] args) {
		Moveable m1 = new DemoMoveable().new Dog();
		m1.move();
		
	}
	
	// private inner class
	private class Dog implements Moveable {
		@Override
		public void move() {
			System.out.println("The dog moves!");
		}
	}

	

}
