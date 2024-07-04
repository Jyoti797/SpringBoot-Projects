package ashokIT.__DataJPA_Timestamping;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Table(name="product_master")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Product {


    @Column(name="product_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer productId;

    @Column(name="product_name")
    @NonNull
    String productName;

    @Column(name="product_price")
    @NonNull
    Integer productPrice;

    @Column(name="created_date", updatable = false)
    @CreationTimestamp
     LocalDate createdDate;

    @Column(name="updated_date", insertable = false)
    @UpdateTimestamp
    LocalDate updatedDate;

    public Product(int i, String roomFreshner, int i1) {
    }
}

//updatable=false :: colum value shold not updated when we do update operation
//insertable=false :: column value should not be inserted when we do insert operation
//@generatedvalue :; it is maintaining another table called Hibernate sequence for generating primary keys
