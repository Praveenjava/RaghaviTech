package in.praveenit.ex;

public class Test {
	void meth1(int a, String s) {
		System.out.println(a + a); // 12
		System.out.println(s); // NIT
		System.out.println('a'); // a
		System.out.println(a); // 6
		System.out.println("s:" + s); // s NIT
	}

	void meth2(int a, int b) {
		System.out.println(a * a);
		System.out.println(b);
		// Test aobj = new Test();

	}

	void meth3(char c, int a) {
		System.out.println(c);
		System.out.println(a);

	}

	void main4(String s) {
		new Test().meth1(10, "Welcome To Hyd");
		System.out.println(s);
	}

	public static void main(String[] args) {
		System.out.println("start");
		new Test().meth2(5, 10);
		System.out.println("End");

		new Test().meth3('J', 100);
		new Test().main4("Java is Awesome");
		new Test().meth1(6, "NIT");
	}
}
