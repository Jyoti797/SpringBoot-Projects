package ashokIT.bindings;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class BookController {

    @GetMapping("/books")
    public String getBookData(Model model){
        //setting data to binding object
        Book b1 = new Book(101, "H.C Verma",649);
        Book b2 = new Book(102, "R.D Sharma Maths",769);
        Book b3 = new Book(103, "Ankit Aggarwal Economy",1299);

        List <Book> booksList =  Arrays.asList(b1,b2, b3);

        //adding data to model object
        model.addAttribute("books", booksList);

        //return view name
        return "books"; //return viewName
    }
}
