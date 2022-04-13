package p2_binary_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("binaryFiles/data.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeDouble(65.55);
			dos.writeDouble(10.5);
			dos.writeDouble(20.5);
			dos.writeUTF("hi");
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("binaryFiles/data.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			for (int j = 0; j < 3; j++) {
				double d = dis.readDouble();
				System.out.println(d);
			}
			
			String str = dis.readUTF();
			System.out.println(str);
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Finished writing!");
	}

}
