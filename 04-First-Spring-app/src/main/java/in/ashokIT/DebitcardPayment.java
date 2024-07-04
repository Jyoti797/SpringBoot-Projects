package in.ashokIT;

public class DebitcardPayment implements IPayment {

    public DebitcardPayment() {
        System.out.println("Debit Card Payment constructor.....");
    }

    public String pay(double amount){
        //logic for debit card payment

        return  "Payemnt successfull through Debit Card";
    }

}
