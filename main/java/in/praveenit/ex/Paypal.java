package in.praveenit.ex;

public class Paypal implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Payment of " + amount + " Proccessing type of Paypal");

	}

}
