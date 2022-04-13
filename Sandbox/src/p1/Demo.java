package p1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("Output.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		char[] arr = {65, 66};
		
		pw.write(arr);
		pw.print(65);
		pw.close();
	}

}
