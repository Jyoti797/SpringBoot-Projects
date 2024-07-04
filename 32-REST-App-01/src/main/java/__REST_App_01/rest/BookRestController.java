package __REST_App_01.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @GetMapping("/book/{name}")
    public ResponseEntity<String> getBookPrice(@PathVariable("name") String name) {
        String resBody ="Price of " + name + " book is 1279INR ";
        return  new ResponseEntity<>(resBody, HttpStatus.OK);

    }

    @GetMapping("/book/{bookName}/{authorName}")
    public ResponseEntity<String> getBook(@PathVariable("bookName") String bookName, @PathVariable("authorName") String authorName){
        String resBody = "This book is " + bookName + " and author is " + authorName;
        return  new ResponseEntity<>(resBody, HttpStatus.OK);
    }
}
//path parameters
// path parameters :: used to send data to server through URL
//path parameters :: can present anywhere in URL
//path parameters :: is represented by {}
//path parameters :: should be represented in method URL pattern(Template Pattern)
//@PathVariable :: used to read data Path Parameteres

