package ashokIT.__DataJPA_CompositeKey;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class AccountPK implements Serializable {
    private Integer accId;
    private String accType;
    private String holderName;


}
