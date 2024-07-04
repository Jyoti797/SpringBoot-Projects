package ashokIT.__SpringBoot_ComponentScan;

import ashokIT.__SpringBoot_ComponentScan.SECURITY.AppSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"walmart", "ashokIT"})
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}



}

//if you want IOC Container to create object of class then go for @Component
//if you want IOC to call the method to get object of it then go for @Bean.
// @Bean ==> here programmer is creating the Object & IOC is only calling the method
