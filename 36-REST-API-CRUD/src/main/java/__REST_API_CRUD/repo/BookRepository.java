package __REST_API_CRUD.repo;

import __REST_API_CRUD.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
