package __REST_App_01.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcomeMsg(@RequestParam("name") String name) {
        String resPayLoad = name + "  Welcome to Ashok IT ";
        return new ResponseEntity<>(resPayLoad, HttpStatus.OK);

    }

    @GetMapping("/greet")
    public  String  getGreetMsg(){
        String resPayLoad = "Good morning !!!!";
        return resPayLoad;
    }
    //query params are used to send data in URL
    // query params will represent data in key-value format
    //query params will start with ?
    //query params will be separate by &
    //query params should present at end of URL
    //@RequestParam :: is used to read Query Parameters from URL






}
