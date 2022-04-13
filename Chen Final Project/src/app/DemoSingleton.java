package app;

import model.Person;
import model.PersonBagSingleton;
import utils.Backup;
import utils.Restore;

public class DemoSingleton {

	public static void main(String[] args) {
		PersonBagSingleton personBag = PersonBagSingleton.getPersonBag(1000);
		personBag.insert(new Person("A", 2.5));
		personBag.insert(new Person("B", 3.5));
		personBag.insert(new Person("C", 1.5));
		personBag.display();
		
		Backup.backupPersonBagSingleton();
		PersonBagSingleton personBag2 = Restore.restorePersonBagSingleton();
		personBag2.display();
		
	}

}
