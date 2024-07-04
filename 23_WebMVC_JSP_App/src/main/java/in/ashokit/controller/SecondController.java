package in.ashokit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {

    @GetMapping("/wish")
    public ModelAndView wish() {

        ModelAndView mav = new ModelAndView("wish");
        mav.addObject("msg3","Happy Birthday !!!! \n Many Mnay Happy returns of the day");
        mav.setViewName("wish");
        return mav;
    }
    
}
