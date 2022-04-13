package model;

import java.io.Serializable;

public class PersonBagSingleton implements Serializable {
	private Person[] arr;
	private int nElems;
	private static PersonBagSingleton personBag;
	
	private PersonBagSingleton(int maxSize) {
		arr = new Person[maxSize];
	}
	
	public static PersonBagSingleton getPersonBag(int maxSize) {
		if(personBag == null) {
			personBag = new PersonBagSingleton(maxSize);
		}
		return personBag;
	}
	
	public void insert(Person person) {
		arr[nElems++] = person;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
