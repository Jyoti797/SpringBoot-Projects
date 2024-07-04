package ashokIT.__SpringBoot_App;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CacheManager implements ApplicationRunner {

    public  void run(ApplicationArguments args) throws Exception {
        System.out.println("Logic Executing to load data into cache.....");
    }
}
