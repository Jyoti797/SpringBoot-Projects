package ashokit.__Spring_Beans_Scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");

//	Car brezza =	context.getBean("car", Car.class);
//	System.out.println(brezza.hashCode());

		Motor m1 =	context.getBean("motor", Motor.class);
		System.out.println(m1.hashCode());

		Motor m2 =	context.getBean("motor", Motor.class);
		System.out.println(m2.hashCode());
	}

}
