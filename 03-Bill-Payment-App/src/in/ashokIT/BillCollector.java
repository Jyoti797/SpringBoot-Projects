package in.ashokIT;

public class BillCollector {

    private IPayment obj;


//bill collector class is talking to interface
    public void setPayment(IPayment obj){
        this.obj = obj;
    }

    public BillCollector() {
    }

    public BillCollector(IPayment obj) {
        this.obj = obj;
    }

    public void collectPayment(double amount){
        String status = obj.pay(amount);
        System.out.println(status);
    }
}
