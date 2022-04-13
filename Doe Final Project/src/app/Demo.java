package app;

import model.Person;
import model.PersonBag;
import util.Backup;
import util.Restore;

public class Demo {

	public static void main(String[] args) {
//		PersonBag personBag = new PersonBag(100);
//		Person p1 = new Person("A");
//		Person p2 = new Person("B");
//		personBag.insert(p1);
//		personBag.insert(p2);
//		personBag.display();
//		Backup.backupPersonBag(personBag);
		PersonBag restoredBag = Restore.restorePersonBag();
		System.out.println("After restoration: ");
		restoredBag.display();
//		restoredBag.insert(new Person("C"));
//		Backup.backupPersonBag(restoredBag);
		
		
	}

}
