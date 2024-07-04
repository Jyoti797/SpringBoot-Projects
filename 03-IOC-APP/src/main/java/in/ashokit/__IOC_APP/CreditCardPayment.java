package in.ashokit.__IOC_APP;

public class CreditCardPayment implements IPayment{
	
	public CreditCardPayment() {
		System.out.println("CreditCardPayment :: Constructor");
	}
	
	@Override
	public boolean payBill(double amt) {
		System.out.println("Credit-Card payment processing..");
		return true;
	}

}
