package p3_function_injection;

public class DemoCalculator {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(new Computable() {

			@Override
			public double add(double n1, double n2) {
				return n1 + n2;
			}

			@Override
			public double subtract(double n1, double n2) {
				return n1 - n2;
			}
			
		});
		
		Calculator c2 = new Calculator(new Computable() {

			@Override
			public double add(double n1, double n2) {
				return n1 * n2;
			}

			@Override
			public double subtract(double n1, double n2) {
				return n1 / n2;
			}
			
		});
		
		
		System.out.println(c1.addThem(5, 4));
		System.out.println(c2.subtractThem(5, 4));
		
	}

}
