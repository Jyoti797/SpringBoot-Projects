package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@GetMapping("/welcome")
	public ModelAndView welcome(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg1", "Welcome to Spring Boot Application");
		mav.setViewName("welcome");
		return mav;
	}

	@GetMapping("/greet")
	public  ModelAndView greet(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg2", "Good Morning !!!! ");
		mav.setViewName("greet");
		return mav;
	}

}

//context path ==> name of our application

