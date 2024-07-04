package __SB_REST_SWAGGER.student;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/student")
public class StudentController {

    @GetMapping(value="/getStudent")
    public String getStudent(){
        return "get student successfully....";
    }


    @PostMapping(value="/registerStudent")
    public String registerStudent(){
        return "student registered successfully.......";
    }

    @PutMapping(value = "/updateStudent")
    public String updateStudent(){
        return "student updated successfully.......";
    }

    @DeleteMapping(value = "/deleteStudent")
    public String deleteStudent(){
        return "student deleted successfully.......";
    }

}
