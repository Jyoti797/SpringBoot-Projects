package ashokIT.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public ModelAndView welcome(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg1", "Welcome to ashok IT");
        mav.setViewName("welcome"); //setting view name
        return mav;

    }
}
