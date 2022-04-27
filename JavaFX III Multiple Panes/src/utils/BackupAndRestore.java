package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.TrailBag;
import model.UserBag;

// handles binary files
public class BackupAndRestore {

	public static void backupUsers(UserBag userBag) {
		try {
			FileOutputStream fos = new FileOutputStream("UserBag.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(userBag);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void backupTrails(TrailBag trailBag) {
		// writeObject(trailBag)
	}
	
	public static void restoreUsers(UserBag userBag) {
		try {
			FileInputStream fis = new FileInputStream("UserBag.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			userBag =(UserBag)(ois.readObject());
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void restoreTrails(TrailBag trailBag) {
		// (TrailBag)readObject()
	}
	
	public static void backupAll(UserBag userBag, TrailBag trailBag) {
		backupUsers(userBag);
		backupTrails(trailBag);
	}
	
	public static void restoreAll(UserBag userBag, TrailBag trailBag) {
		restoreUsers(userBag);
		restoreTrails(trailBag);
	}
}
