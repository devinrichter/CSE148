package p2;

public class Demo {

	public static void main(String[] args) {
		Worker w1 = new Worker("Adam", (hours, rate) -> {
			return hours * rate;
		});

		System.out.println(w1.getName() + ": " + w1.getPay(10.0, 20.0));
		
		Worker w2 = new Worker("Bill", (hours, rate) -> {
			return hours * rate * 1.1;
		});

		System.out.println(w2.getName() + ": " + w2.getPay(10.0, 20.0));
	}

}
