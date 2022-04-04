package p2_unchecked_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoIllegalArgumentException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = 0; 
		System.out.println("Please enter your age as an integer: ");
		
		while (true) {
			try {
				age = scanner.nextInt();
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				scanner.nextLine();
				System.out.println("Hey the input is invalid!");
				System.out.println("Please enter a valid whole number: ");
			} catch(Exception e) {
				scanner.nextLine();
				System.out.println("Hey the input is invalid! The exception is caught by the Exception catch clause");
				System.out.println("Please enter a valid whole number: ");
			} finally {
				System.out.println("Finally! It will always be executed!");
			}
		}
		System.out.println("Your age is: " + age);
		
	}

}
