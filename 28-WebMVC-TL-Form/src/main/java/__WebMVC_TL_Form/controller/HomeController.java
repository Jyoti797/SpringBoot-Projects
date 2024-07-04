package __WebMVC_TL_Form.controller;

import __WebMVC_TL_Form.bindings.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @GetMapping("/")
    public ModelAndView loadForm() {

        ModelAndView mav = new ModelAndView();

        String msgTxt = "Welcome to Spring Boot";
        mav.addObject("msg", msgTxt );
        mav.setViewName("home");

        return mav;
    }
}
