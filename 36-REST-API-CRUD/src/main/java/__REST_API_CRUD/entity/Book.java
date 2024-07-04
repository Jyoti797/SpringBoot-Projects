package __REST_API_CRUD.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="book_dtls")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="book_id")
    Integer bookId;

    @Column(name="book_name")
    String bookName;

    @Column(name="book_price")
    Double bookPrice;

}
