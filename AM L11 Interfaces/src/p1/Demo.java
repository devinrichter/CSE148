package p1;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("John", new PlayBasketball());
		s1.playSports();
//		s1.readBooks();
		
		Student s2 = new Student("Julie", new Playable() {

			@Override
			public void play() {
				System.out.println("Play hockey!");
			}

//			@Override
//			public void read() {
//				System.out.println("Read fiction books!");
//			}
//			
		});
		
		s2.playSports();
//		s2.readBooks();
		
		
		//lambda expression to implement functional interface
		Student s3 = new Student("Zack", () -> System.out.println("Play football"));
		s3.playSports();
	}

}
