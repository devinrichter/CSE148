package p4_lambda_expression;

public class DemoFunctionalInterface {

	public static void main(String[] args) {
		Computable c1 = new Computable() {

			@Override
			public double compute(double n1, double n2) {
				return n1 + n2;
			}
			
		};
		
		Computable c2 = new Computable() {

			@Override
			public double compute(double n1, double n2) {
				return n1 - n2;
			}
			
		};
		
		Computable c3 = new Computable() {

			@Override
			public double compute(double n1, double n2) {
				return n1 * n2;
			}
			
		};
		
		Computable c4 = (x, y) -> {
				return x / y;
			};

	System.out.println(c1.compute(5,4));
	System.out.println(c2.compute(5,4));
	System.out.println(c4.compute(5,4));
}

}
