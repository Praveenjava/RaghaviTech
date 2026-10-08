package in.praveenit.ex;

public class FibonacciSeriesUsingRecursion {

	static int fibonacci(int n) {

		// Exit condition / Base condition
		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		// Recursive call
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {

		int n = 10;

		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
}
