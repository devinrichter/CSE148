package app;

import java.util.Arrays;

import model.Instructor;
import model.Name;
import model.Person;
import model.PersonBag;
import model.Student;
import util.Backup;
import util.Restore;
import util.Utils;

public class Demo {

	public static void main(String[] args) {
//		PersonBag personBag = new PersonBag(100);
//		Person s1 = new Student("C", "CC", 3.5, "CS");
//		Person s2 = new Student("D", "DD", 2.5, "IT");
//		Person i1 = new Instructor("E", "EE", "Associate Professor", 10000.00);
//		Person i2 = new Instructor("F", "FF", "Professor", 20000.00);
//
//		personBag.insert(s1);
//		personBag.insert(s2);
//		personBag.insert(i1);
//		personBag.insert(i2);
//		personBag.display();
//		Backup.backupPersonBag(personBag);
//		PersonBag restoredBag = Restore.restorePersonBag();
//		System.out.println("After restoration: ");
//		restoredBag.display();
//		restoredBag.insert(new Student("A", "AA", 2.8, "MAT"));
//		restoredBag.insert(new Instructor("B", "BB", "Assistant Professor", 5000.00));
////		
//		Backup.backupPersonBag(restoredBag);

//		PersonBag restoredBag2 = Restore.restorePersonBag();
//		System.out.println("After restore again:");
//		restoredBag2.display();

//		Name name = Utils.emitName();
		String major = Utils.emitMajor();
		System.out.println(major);
	}

}
