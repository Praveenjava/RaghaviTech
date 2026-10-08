package in.praveenit.ex;

public class Main1 {
	public static void main(String[] args) {
		PaymentStrategy paypal = new Paypal();
		
		PaymentService ser = new PaymentService(paypal);
		ser.makePayment(1000);
		
		PaymentStrategy Gpay = new Gpay();
		PaymentService ser1 = new PaymentService(Gpay);
		ser1.makePayment(500);
	}

}
