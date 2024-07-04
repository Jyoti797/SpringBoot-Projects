package ashokIT.__Bean_LifeCycle_App;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    public Engine() {
        System.out.println("Engine :: 0-param Constructor...");
    }
    @PostConstruct
    public void start(){
        System.out.println("Engine started successfully...");
    }
    @PreDestroy
    public void stop(){
        System.out.println("Engine stopped successfully...");
    }
}
