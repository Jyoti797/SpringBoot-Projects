package ashokIT.controller;


import ashokIT.binding.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String getForm(Model model){
        User userObj = new User();
        model.addAttribute("user", userObj);
        return "index";

    }
}
