package p1;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
//		Pet p1 = new Pet("Pet1", 10);

		// Inheritance describes a relationship called "IS A" relationship!
		// a variable of the superclass type can reference objects of subclass types
		// this is known as polymorphism
		Pet d1 = new Dog("Dog1", 12, "Golden");

		Pet c1 = new Cat("Cat2", 5, "Black");

		Pet f1 = new Fish("Fish1", 2, 10.5, "Blue");

		Pet d2 = new Dog("Dog2", 80, "Golden");

		Pet c2 = new Cat("Cat2", 10, "Grey");

		Pet f2 = new Fish("Cat2", 2, 5, "Black");
		
		PetBag myBag= new PetBag(10);
		myBag.insert(c1);
		myBag.insert(c2);
		myBag.insert(f2);
		myBag.insert(f1);
		myBag.insert(d1);
		myBag.insert(d2);
		
		myBag.display();
		System.out.println("\nFound: ");
		
		Pet[] petsFound = myBag.searchByName("Cat2");
		
		System.out.println(Arrays.toString(petsFound));

//		c1.setName("Cat5");
//		System.out.println(c1.getName());
//
//		Pet[] arr = new Pet[10];
//		arr[0] = c1;
//		arr[1] = d1;
//		arr[2] = f1;
	}

}
