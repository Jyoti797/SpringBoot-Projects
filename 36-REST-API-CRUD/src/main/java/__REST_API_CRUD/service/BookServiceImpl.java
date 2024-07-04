package __REST_API_CRUD.service;

import __REST_API_CRUD.entity.Book;
import __REST_API_CRUD.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {

    BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String upsertBook(Book book) {

       Book save = bookRepository.save(book);
        if (book.getBookId() == null) {
            return "Record inserted successfully.....";
        } else {
            return "Record updated successfully.....";
        }

    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public String deleteBook(Integer bookId) {
        bookRepository.deleteById(bookId);
        return "Book deleted successfully.....";
    }
}
