package lambda_expression;
interface Calc{
	int operation(int a, int b);
}

public class LambdaCalculator {

	public static void main(String[] args) {
		Calc add = (a, b) -> a + b;
		Calc sub = (a, b) -> a - b;
		Calc mul = (a, b) -> a * b;
		Calc div = (a, b) -> a / b;
		
		int x = 15;
		int y = 5;
		
		System.out.println("Addition: "+add.operation(x, y));
		System.out.println("Subtraction: "+sub.operation(x, y));
		System.out.println("Multiplication: "+mul.operation(x, y));
		System.out.println("Division: "+div.operation(x, y));

	}

}
