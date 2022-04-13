package app;

import model.Person;
import model.PersonBag;
import utils.Backup;
import utils.Restore;

public class Demo {

	public static void main(String[] args) {
		PersonBag personBag = new PersonBag(1000);
		personBag.insert(new Person("A", 2.5));
		personBag.insert(new Person("B", 3.5));
		personBag.insert(new Person("C", 1.5));
		Backup.backupPersonBag(personBag);
		personBag.display();
		PersonBag restoredBag = Restore.restorePersonBag();
		restoredBag.display();
	}

}
