package in.ashokit;

public class Car extends Engine {
    public void drive(){
        int status = super.start();

        if(status >= 1){
            System.out.println("Engine started successfully");
        }else{
            System.out.println("Engine failed to start");
        }

    }
}
