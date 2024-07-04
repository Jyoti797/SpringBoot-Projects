package ashokIT.__SpringBoot_Autowiring;



import ashokIT.__SpringBoot_Autowiring.SERVICE.ReportService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		ReportService rs = context.getBean(ReportService.class);

		rs.generateReport();
	}


}
