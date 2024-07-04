package ashokIT.__DataJPA_CompositeKey;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="bank_accounts")
@Data
@NoArgsConstructor
public class Account {

    @Column(name="branch_name")
    String branchName;

    @Column(name="min_balance")
    Integer minBalance;

    @EmbeddedId
    AccountPK accPk;


}
