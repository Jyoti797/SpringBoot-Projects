package in.ashokIT;

public class UpiPayment implements IPayment {

    public UpiPayment() {
        System.out.println("UPI Constructor......");
    }

    public String pay(double amount){
        //logic for Unified payment interface

        return  "Payemnt successfull through UPI";
    }
}
