package in.ashokIT;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");

        BillCollector bc = context.getBean("billCollector", BillCollector.class);
        bc.collectPayment(9999);








    }
}
