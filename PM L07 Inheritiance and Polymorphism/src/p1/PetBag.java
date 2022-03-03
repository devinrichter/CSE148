package p1;

import java.util.Arrays;

public class PetBag {
	private Pet[] arr;
	private int nElems;
	
	public PetBag(int maxSize) {
		arr = new Pet[maxSize];
		nElems = 0;
	}
	
	public Dog[] searchByBreed(String breed) {
		Dog[] temp = new Dog[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(arr[i] instanceof Dog) {
				Dog tempDog = (Dog)arr[i];
				if(tempDog.getBreed().equals(breed)) {
					temp[count++] = tempDog;
				}
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public Pet[] searchByName(String name) {
		Pet[] temp = new Pet[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			System.out.println("Inspecting: " + arr[i]);
			if(arr[i].getName().equals(name)) {
				System.out.println("Match Found: " + arr[i]);
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
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
				nElems--;
				i--;
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	
	public void insert(Pet pet) {
		arr[nElems++] = pet;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

}
