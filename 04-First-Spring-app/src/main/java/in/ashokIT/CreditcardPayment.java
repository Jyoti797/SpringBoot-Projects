package in.ashokIT;

public class CreditcardPayment implements IPayment {
    public CreditcardPayment() {
        System.out.println("Credit Crad Payment Constructor......");
    }

    @Override
    public String pay(double amount){
        //logic for credit card payment

        return  "Payemnt successfull through Credit Card";
    }
}
