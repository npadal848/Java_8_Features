package lambdaExpression;

public class LambdaExpression {

	public static void main(String[] args) {
		Addition addition = (x, y) -> System.out.println("Addition of " + x + " and " + y + " is " + (x + y));
		addition.add(2, 3);
		addition.subtract(4, 2);
	}
}

@FunctionalInterface
interface Addition {

	void add(int x, int y);

	/*
	 * Default, static and Object class overridden method also we can put in
	 * Functional interface along with one abstract method
	 */
	default void subtract(int x, int y) {
		System.out.println("Subtract: " + (x - y));
	}

	static void multiply(int x, int y) {
		System.out.println("Multiply: " + x * y);
	}

	@Override
	boolean equals(Object obj);

	@Override
	int hashCode();
}
