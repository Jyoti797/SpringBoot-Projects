package ashokIT.__SpringBoot_ComponentScan.SECURITY;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class AppSecurity {
    public AppSecurity() {
        System.out.println("AppSecurity :: Constructor");
    }

}

//IOC will treat this as a configuration . IOC will not create the object. Programmer will crrate
//@configuration ==> programmer will do configuration manually
//@autoconfiguration ==> springboot will automatically do configuration for project

//@SpringBootApplication this annotation is equals to @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan

//@ComponentScan  ==> process of scanning packages in the Application to identify Bean Class is called Component scanning