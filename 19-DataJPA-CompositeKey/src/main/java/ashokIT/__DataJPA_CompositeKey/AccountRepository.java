package ashokIT.__DataJPA_CompositeKey;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
