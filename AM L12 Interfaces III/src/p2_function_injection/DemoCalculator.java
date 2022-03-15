package p2_function_injection;

public class DemoCalculator {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(new MyComputable());
		Calculator c2 = new Calculator(new MyComputable());
		System.out.println(c1.addThem(5, 4));
		System.out.println(c2.subtractThem(5, 4));
	}

}
