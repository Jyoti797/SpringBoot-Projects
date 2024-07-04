package ashokIT.__SpringBoot_ComponentScan.CONFIG;

import ashokIT.__SpringBoot_ComponentScan.SECURITY.AppSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    public AppConfig() {
        System.out.println("App Config :: Constructor");
    }

    @Bean
    public AppSecurity createInstance(){
        AppSecurity as = new AppSecurity();
        //logic to secure
        return  as;
    }

}
