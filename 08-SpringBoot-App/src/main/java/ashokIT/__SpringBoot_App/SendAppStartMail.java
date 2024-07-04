package ashokIT.__SpringBoot_App;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SendAppStartMail implements CommandLineRunner {


public  void run(String... args) throws Exception {
    System.out.println("Logic executing to send email..........");
}


}
