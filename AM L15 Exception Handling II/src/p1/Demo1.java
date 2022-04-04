package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age;
		do {
			try {
				age = scanner.nextInt();
				break;
			} catch(InputMismatchException e) {
				scanner.nextLine();
				System.out.println("The age entered is invalid!");
				System.out.println("Enter a valid age: ");
			}
			
		} while(true);
		System.out.println("The age entered is: " + age);
		System.out.println("Finished!");

	}

}
