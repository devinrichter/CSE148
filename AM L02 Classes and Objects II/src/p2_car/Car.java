package p2_car;

public class Car {
	private String make;
	private int year;
	private String color;
	private boolean isEv;
	private double price;
	
	private static int numberOfCars = 0;

	public Car(String make, int year, String color, boolean isEv, double price) {
		super();
		this.make = make;
		this.year = year;
		this.color = color;
		this.isEv = isEv;
		this.price = price;
		numberOfCars++;
	}

	public Car(String make, int year, boolean isEv) {
		super();
		this.make = make;
		this.year = year;
		this.isEv = isEv;
		numberOfCars++;
	}

	public Car() {
		super();
		numberOfCars++;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isEv() {
		return isEv;
	}

	public void setEv(boolean isEv) {
		this.isEv = isEv;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}

	public static void setNumberOfCars(int numberOfCars) {
		Car.numberOfCars = numberOfCars;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", year=" + year + ", color=" 
					+ color + ", isEv=" + isEv + ", price=" + price
					+ "]";
	}
	
	

}
