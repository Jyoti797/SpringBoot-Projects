package in.ashokit;

public class Test {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.drive();
    }
}
//dont go for composition or inheritance since classes are tightly coupled
//java does not support multiple inheritance
//in order to achieve loosely coupling we have to use spring core module

