package __WebMVC_ThymeLeaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome(Model model){
        model.addAttribute("msg", "Welcome to Ashok IT");
        return "welcome";
    }
}
