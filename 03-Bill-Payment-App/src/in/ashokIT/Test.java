package in.ashokIT;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {

        //setter injection
        BillCollector bc = new BillCollector();
        bc.setPayment(new UpiPayment());
        bc.collectPayment(1500);

        //constructor injection
//        BillCollector xy = new BillCollector(new CreditcardPayment());
//        xy.collectPayment(39999);

        //field injection
        //make Ipayment object public then field injection will work
//        BillCollector ab = new BillCollector();
//        DebitcardPayment sbi = new DebitcardPayment();
//        ab.obj = sbi;
//        ab.collectPayment(9999);

        //field Injection

//        Class<?> clz = Class.forName("in.ashokIT.BillCollector");
//        Field field = clz.getDeclaredField("obj");
//        field.setAccessible(true);
//
//        Object jyoti = clz.newInstance();
//        field.set(obj, new DebitcardPayment());//injecting value to variable
//
//        BillCollector bc = (BillCollector) jyoti;
//        bc.collectPayment(69999);





    }
}
