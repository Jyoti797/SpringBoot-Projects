package ashokIT.__SpringBoot_ComponentScan;


import org.springframework.stereotype.Component;



@Component
public class Car {
    public Car() {
        System.out.println("Car Constructor");
    }
}
