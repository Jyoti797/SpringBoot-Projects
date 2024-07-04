package ashokIT.__DataJPA_CompositeKey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		AccountService accountservice = context.getBean(AccountService.class);

		accountservice.getDataUsingPK();
//		accountservice.saveAccData();





	}

}
