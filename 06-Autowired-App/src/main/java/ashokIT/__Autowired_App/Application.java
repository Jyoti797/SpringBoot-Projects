package ashokIT.__Autowired_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");

		Car car =  context.getBean("car", Car.class);
		car.drive();

	}

}
