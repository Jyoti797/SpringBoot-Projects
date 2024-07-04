package in.ashokit.__IOC_APP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring-beans.xml");

		RestaurantService rs1 = context.getBean(RestaurantService.class);

		rs1.processPayment(1200.00);

		//RestaurantService rs2 = (RestaurantService) context.getBean("rs");
	}

}
