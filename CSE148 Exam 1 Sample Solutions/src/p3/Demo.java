package p3;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Car car1 = new Car("BMW", "2022", 40000, new Name("Bill", "Doe"), 3);
		Car car2 = new Car("TESLA", "2022", 40000, new Name("Bill", "Doe"), 4);
		Car car3 = new Car("BENZ", "2022", 40000, new Name("Bill", "Doe"), 2);
		Truck truck1 = new Truck("HONDA", "2020", 20000, new Name("John", "Doe"), false);
		Truck truck2 = new Truck("TESLA", "2020", 20000, new Name("John", "Doe"), true);
		Truck truck3 = new Truck("GMC", "2020", 20000, new Name("John", "Doe"), false);
		
		VehicleBag theBag = new VehicleBag(10);
		theBag.insert(car1);
		theBag.insert(car2);
		theBag.insert(car3);
		theBag.insert(truck1);
		theBag.insert(truck2);
		theBag.insert(truck3);
		
//		System.out.println(Arrays.toString(theBag.searchByDoors(2)));
//		System.out.println(Arrays.toString(theBag.searchMake("TESLA")));
		System.out.println(Arrays.toString(theBag.removeNonEV()));
		theBag.display();
	}

}
