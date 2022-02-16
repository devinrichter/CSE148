package p2;

public class Demo {
	private static final String[] threeLetterMajors = 
		{"CSE", "CST", "MAT", "ENG", "PHY", "PED", "BUS", "PSY" };

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String courseNumber = getRandomMajor() + getRandomDigits();
			System.out.println(courseNumber);
		} 
	}

	public static String getRandomMajor() {
		return threeLetterMajors[(int) (Math.random() * threeLetterMajors.length)];
	}
	
	public static int getRandomDigits() {
		return 100 + (int) (Math.random() * 200) ;
	}

}
