package in.ashokIT;

public class BillCollector {

    private IPayment payment;


//settter injection
    public void setPayment(IPayment payment){
        this.payment = payment;
    }

//    public BillCollector() {
//    }

    //constructor injection
    public BillCollector(IPayment payment) {
        System.out.println("Bill Collector :: Param constructor ");
        this.payment = payment;
    }

    public void collectPayment(double amount){
        System.out.println("Injected: "+ payment.getClass().getName());
        String status = payment.pay(amount);
        System.out.println(status);
    }
}
