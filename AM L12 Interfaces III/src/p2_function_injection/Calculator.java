package p2_function_injection;

public class Calculator {
	private Computable computable;
	
	public Calculator(Computable computable) {
		this.computable = computable;
	}
	
	public double addThem(double n1, double n2) {
		return computable.add(n1, n2);
//		return n1 + n2;
	}
	
	public double subtractThem(double n1, double n2) {
		return computable.subtract(n1, n2);
	}
}
