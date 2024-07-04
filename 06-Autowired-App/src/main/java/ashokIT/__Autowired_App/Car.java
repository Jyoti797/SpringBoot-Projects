package ashokIT.__Autowired_App;

public class Car {

    private  DiselEngine diselEng;
    public Car() {
        System.out.println("0 : param Car Constructor");
    }

    public void setDiselEng(DiselEngine diselEng) {
        this.diselEng = diselEng;
    }

    public Car(DiselEngine diselEng) {
        this.diselEng = diselEng;
        System.out.println("Car : Param Constructor....");
    }

    public  void drive(){
        int start = diselEng.start();
        if(start >= 1){
            System.out.println("Journey started.......");
        }else{
            System.out.println("Oops!!!!!! \n Engine failed to start");
        }
    }
}

//when we do autowiring byName, byType it executes setter injection byDefault. Threfore setter method is mandatory
