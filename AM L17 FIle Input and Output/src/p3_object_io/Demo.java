package p3_object_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo {

	public static void main(String[] args) {
//		Student s1 = new Student("A", 3.0);
//		
//		try {
//			FileOutputStream fos = new FileOutputStream("objectFiles/data.dat");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(s1);
//			oos.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("objectFiles/data.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s = (Student)(ois.readObject());
			System.out.println(s);
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
