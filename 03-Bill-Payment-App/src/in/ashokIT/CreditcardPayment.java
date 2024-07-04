package in.ashokIT;

public class CreditcardPayment implements IPayment {
    @Override
    public String pay(double amount){
        //logic for credit card payment

        return  "Payemnt successfull through Credit Card";
    }
}
