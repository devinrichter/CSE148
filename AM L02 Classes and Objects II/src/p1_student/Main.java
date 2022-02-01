package p1_student;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Alan", 20, 3.5);
		Student s2 = new Student();
		Student s3 = new Student("Bill");
		Student s4 = new Student("Cathy", 3.5, 22);
		Student.setMajor("ENGLISH");
//		System.out.printf("%-10S%10d%10.2f%10S%n", s1.getName(), s1.getAge(), s1.getGpa(), Student.getMajor());
//		System.out.printf("%-10S%10d%10.2f%10S%n", s2.getName(), s2.getAge(), s2.getGpa(), Student.getMajor());
//		System.out.printf("%-10S%10d%10.2f%10S%n", s3.getName(), s3.getAge(), s3.getGpa(), Student.getMajor());
//		System.out.printf("%-10S%10d%10.2f%10S%n", s4.getName(), s4.getAge(), s4.getGpa(), Student.getMajor());
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
