package ashokIT.__DataJPA_Tx_RollBack;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="emp_address_tbl")
@Data
@NoArgsConstructor
public class Address {

    @Id
    @Column(name="address_id")
     Integer adressId;

    @Column(name="city")
    String city;

    @Column(name="state")
    String state;

    @Column(name="country")
    String country;

    @Column(name="emp_id")
    Integer empId;


}
