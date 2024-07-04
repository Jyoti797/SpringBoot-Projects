package __REST_API_CRUD.service;

import __REST_API_CRUD.entity.Book;

import java.util.List;

public interface BookService {

    public  String upsertBook(Book book);
    public List<Book> getAllBooks();
    public String deleteBook(Integer bookId);


}
