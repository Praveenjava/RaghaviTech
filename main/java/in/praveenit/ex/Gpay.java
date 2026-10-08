package in.praveenit.ex;

public class Gpay implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Payment of " + amount + " Proceesing pament Gpay ");
	}

}
