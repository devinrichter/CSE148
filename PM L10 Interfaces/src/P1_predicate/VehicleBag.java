package P1_predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class VehicleBag {
	private Vehicle[] arr;
	private int nElems;

	public VehicleBag(int maxSize) {
		arr = new Vehicle[maxSize];
	}

	public Vehicle[] search(Predicate<Vehicle> predicate) {
		Vehicle[] temp = new Vehicle[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (predicate.test(arr[i])) {
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);

	}

	public Vehicle[] searchMake(String make) {
		Vehicle[] temp = new Vehicle[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getMake().equals(make)) { // ==
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}

	public Vehicle[] searchByDoors(int doors) {
		Vehicle[] temp = new Vehicle[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (arr[i] instanceof Car && ((Car) arr[i]).getNumDoors() == doors) {
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}

	public Vehicle[] removeNonEV() {
		Vehicle[] temp = new Vehicle[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (arr[i] instanceof Truck && (!((Truck) (arr[i])).isEV())) {
				temp[count++] = arr[i];
				for (int j = i; j < nElems - 1; j++) {
					arr[j] = arr[j + 1];
				}
				i--;
				nElems--;
			}
		}
		return Arrays.copyOf(temp, count);
	}

	public void insert(Vehicle vehicle) {
		arr[nElems++] = vehicle;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

}
