package __REST_API_CRUD.rest;


import __REST_API_CRUD.entity.Book;
import __REST_API_CRUD.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookRestController {


    BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> allBooks = bookService.getAllBooks();
        return new ResponseEntity<>(allBooks, HttpStatus.OK);
    }

    @PostMapping("/book")
    public ResponseEntity <String> addBook(@RequestBody Book book) {
        String msg = bookService.upsertBook(book);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @PutMapping("/book")
    public ResponseEntity<String> updateBook(@RequestBody Book book) {
      String msg =  bookService.upsertBook(book);
      return new ResponseEntity<>(msg, HttpStatus.OK);

    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable  Integer bookId) {
        String msg = bookService.deleteBook(bookId);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }



}
