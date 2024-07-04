package __REST_Consumes_App.rest;

import __REST_Consumes_App.bindings.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @PostMapping(value="/book", consumes={"application/json", "application/xml"})
    public ResponseEntity <String> addBook(@RequestBody Book book) {
        System.out.println(book);

        //logic to store in DB
        String msg = " Book added successfully";
        return  new ResponseEntity<String>(msg, HttpStatus.CREATED);

    }
}
//POST Method
//It is used to create new record in the resource/server
//contains request body only
//client can send data to resource in request body
//to bind @RestController method to POST request we will use @PostMapping
//to read data from request body we will use @RequestBody annotation
//consumes :: represents in which format method can take input
//"Content-type" header represents in which format client sending data to request body
