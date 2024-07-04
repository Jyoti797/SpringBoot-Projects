package ashokIT.__SpringBoot_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//bootstrapping method ===> mandatory method for a springBoot application
	ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
		System.out.println(context.getClass().getName());
		System.out.println("Beans Loaded :   " + context.getBeanDefinitionCount());

	}


}
