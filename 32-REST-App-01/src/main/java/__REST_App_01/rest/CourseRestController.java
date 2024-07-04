package __REST_App_01.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

    @GetMapping("/course")
    public ResponseEntity<String> getCourseFee(@RequestParam("courseName") String courseName, @RequestParam("trainerName") String trainerName){
        String resBody = courseName + " By " + trainerName + " Fee is 7000INR";
        return new ResponseEntity<>(resBody, HttpStatus.OK);
    }



}
