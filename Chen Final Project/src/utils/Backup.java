package utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.PersonBag;
import model.PersonBagSingleton;

public class Backup {

	public static void backupPersonBag(PersonBag personBag) {
		try {
			FileOutputStream fos = new FileOutputStream("backupFiles/PersonBag.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(personBag);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void backupPersonBagSingleton() {
		PersonBagSingleton personBag = PersonBagSingleton.getPersonBag(1000);
		try {
			FileOutputStream fos = new FileOutputStream("backupFiles/PersonBag.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(personBag);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void backupBags() {
		backupPersonBagSingleton();
		backupBookBag();
		backupClassroomBag();
		backupCourseBag();
	}
	
}
