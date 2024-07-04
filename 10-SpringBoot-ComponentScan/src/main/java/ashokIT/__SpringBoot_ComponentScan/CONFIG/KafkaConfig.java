package ashokIT.__SpringBoot_ComponentScan.CONFIG;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
    public KafkaConfig() {
        System.out.println("Kafka Config :: Constructor");
    }

    //@bean methods for configuration

    //@bean methods are recommended to use only inside @Configuration classes
    //based on requirement we can have multiple configuration classes in our project


}
