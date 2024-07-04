package __REST_API_CRUD_H2_App.repo;

import __REST_API_CRUD_H2_App.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import static java.lang.System.in;

@RepositoryRestResource(path = "books")
public interface BookRepository extends JpaRepository<Book, Integer>{

}
