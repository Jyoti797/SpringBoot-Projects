package in.ashokit;

public class Car{
    public void drive(){
      Engine eng = new Engine();
     int status =  eng.start();
//composition
        if(status >= 1){
            System.out.println("Engine started successfully");
        }else{
            System.out.println("Engine failed to start");
        }

    }
}
