package ashokIT.__DataJPA_Tx_RollBack;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="employee_tbl")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @Column(name="emp_id")
    Integer empId;

    @Column(name="emp_name")
    String empName;

    @Column(name="emp_sal")
    Integer empSal;


}
