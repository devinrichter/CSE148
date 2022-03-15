package p2;

public class Car extends Vehicle {
	private int numDoors;

	public Car(String make, String year, double price, Name ownerName, int numDoors) {
		super(make, year, price, ownerName);
		this.numDoors = numDoors;
	}

	public Car(Car car) {
		this(car.getMake(), car.getYear(), car.getPrice(), new Name(car.getOwnerName()), car.numDoors);
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	@Override
	public String toString() {
		return "Car [Make=" + getMake() + ", Year=" + getYear() + ", Price=" + getPrice() + ", OwnerName="
				+ getOwnerName() + ", Doors=" + numDoors + "]";
	}

}
