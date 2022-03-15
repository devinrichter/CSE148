package p2;

public abstract class Vehicle {
	private String make;
	private String year;
	private double price;
	private Name ownerName;
	
	public Vehicle(String make, String year, double price, Name ownerName) {
		super();
		this.make = make;
		this.year = year;
		this.price = price;
		this.ownerName = ownerName;
	}
	
	public Vehicle(Vehicle vehicle) {
		super();
		this.make = vehicle.make;
		this.year = vehicle.year;
		this.price = vehicle.price;
		this.ownerName = new Name(ownerName);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Name getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(Name ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", year=" + year + ", price=" + price + ", ownerName=" + ownerName + "]";
	}
	
	
}
