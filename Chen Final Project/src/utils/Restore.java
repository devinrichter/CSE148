package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.PersonBag;
import model.PersonBagSingleton;

public class Restore {

	public static PersonBag restorePersonBag() {
		try {
			FileInputStream fis = new FileInputStream("backupFiles/PersonBag.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			PersonBag personBag = (PersonBag) ois.readObject();
			ois.close();
			return personBag;
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public static PersonBagSingleton restorePersonBagSingleton() {
		try {
			FileInputStream fis = new FileInputStream("backupFiles/PersonBag.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			PersonBagSingleton personBag = (PersonBagSingleton) ois.readObject();
			ois.close();
			return personBag;
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}
}
