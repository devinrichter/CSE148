package p1_intro;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		Pet d1 = new Dog("C2", 5, "Golden");// due to polymorphism
		Pet c1 = new Cat("C1", 4, "Black");
		Pet d2 = new Dog("D2", 50, "Golden");// due to polymorphism
		Pet c2 = new Cat("C2", 4, "White");
		
//		Pet p1 = new Pet("Pet2", 5);
	
		Pet.eat();
		
		PetBag bag = new PetBag(10);
		bag.insert(d1);
		bag.insert(c1);
		bag.insert(d2);
		bag.insert(c2);
		
		Pet[] arrRemoved = bag.removeByName("C2");
		System.out.println(Arrays.toString(arrRemoved));
		bag.display();
	}

}
