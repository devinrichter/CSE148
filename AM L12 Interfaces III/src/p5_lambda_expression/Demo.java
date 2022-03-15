package p5_lambda_expression;

public class Demo {

	public static void main(String[] args) {
		Computable add = (x, y) -> {
			return x + y;
		};
		
		Computable subtract = (x, y) -> {
			return x - y;
		};
		
		Computable multiply = (x, y) -> {
			return x * y;
		};
		
		Computable divide = (x, y) -> {
			return x / y;
		};
		
		System.out.println(add.compute(5, 4));
		System.out.println(subtract.compute(5, 4));
		System.out.println(multiply.compute(5, 4));
		System.out.println(divide.compute(5, 4));
		
	}

}
