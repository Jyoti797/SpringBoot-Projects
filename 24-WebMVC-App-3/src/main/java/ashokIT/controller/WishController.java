package ashokIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class WishController {

    @GetMapping("/wish")
    public String wish(){
        String msg = "All the best";
        return msg;
 //returning direct response
    }
}
