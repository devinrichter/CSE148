package p1_animals;

import java.util.Arrays;

public class PetBag {
	private Pet[] arr;
	private int nElems;

	public PetBag(int maxSize) {
		arr = new Pet[maxSize];
	}
	
	public Pet[] removeByName(String name) {
		Pet[] temp = new Pet[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getName().equals(name)) {
				temp[count++] = arr[i];
				for(int j = i; j < nElems-1; j++) {
					arr[j] = arr[j+1];
				}
				i--;
				nElems--;
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public Pet[] searchDogByBreed(String breed) {
		Pet[] temp = new Pet[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(arr[i] instanceof Dog) {
				if(((Dog)arr[i]).getBreed().equals(breed)) {
					temp[count++] = arr[i];
				}
			}
		}
		return Arrays.copyOf(temp, count);
	}

	public Pet[] searchCatByColor(String color) {
		Pet[] temp = new Pet[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(arr[i] instanceof Cat) {
				if(((Cat)arr[i]).getColor().equals(color)) {
					temp[count++] = arr[i];
				}
			}
		}
		return Arrays.copyOf(temp, count);
	}

	public Pet[] searchByWeight(int weight) {
		Pet[] temp = new Pet[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getWeight() >= weight) {
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}

	public Pet[] searchByName(String name) {
		Pet[] temp = new Pet[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getName().equals(name)) {
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public void insert(Pet pet) {
		arr[nElems++] = pet;
	}
}
