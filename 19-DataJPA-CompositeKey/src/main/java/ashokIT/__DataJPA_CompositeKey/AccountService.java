package ashokIT.__DataJPA_CompositeKey;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    private AccountRepository accRepo;

    public AccountService(AccountRepository accRepo) {
        this.accRepo = accRepo;
    }
    public void getDataUsingPK(){
        AccountPK pk = new AccountPK();
        pk.setAccId(104);
        pk.setAccType("SAVINGS");
        pk.setHolderName("TCSss");

        Optional<Account> findById = accRepo.findById(pk);
        if(findById.isPresent()){
            System.out.println(findById.get());
        }
    }
    public  void saveAccData(){

        AccountPK pk = new AccountPK();
        pk.setAccId(104);
        pk.setAccType("SAVINGS");
        pk.setHolderName("TCS");

        Account acc = new Account();
        acc.setBranchName("Bhubaneswar");
        acc.setMinBalance(25000);


        acc.setAccPk(pk);//setting pk class object to entity object

        accRepo.save(acc);
    }
}
