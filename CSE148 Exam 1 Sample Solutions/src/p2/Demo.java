package p2;

public class Demo {

	public static void main(String[] args) {
		Truck truck1 = new Truck("HONDA", "2020", 40000, new Name("John", "Doe"), true);
		Truck truck2 = new Truck(truck1);
		truck1.getOwnerName().setFirstName("Bill");
		truck1.setEV(false);
		System.out.println(truck1);
		truck1.setEV(true);
		System.out.println(truck1);
	}

}
