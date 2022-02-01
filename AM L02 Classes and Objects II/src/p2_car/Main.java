package p2_car;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car("HONDA", 2022, "Blue", false, 30500.55);
		Car c2 = new Car("Tesla", 2021, "White", true, 50000.25);
		Car c3 = new Car();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
