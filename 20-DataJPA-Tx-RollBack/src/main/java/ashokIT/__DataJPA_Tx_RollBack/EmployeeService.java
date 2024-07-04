package ashokIT.__DataJPA_Tx_RollBack;


import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    EmployeeRepository empRepo;
    AddressRepository addressRepo;

    public EmployeeService(EmployeeRepository empRepo, AddressRepository addressRepo) {
        this.empRepo = empRepo;
        this.addressRepo = addressRepo;
    }

    //ATOMICITY :; in a transaction all queries should be successfull or none of the queries should be successfull(All or None)
    //if any exception occurs then no data will be inserted to any 2 of databases
    //during INSERT,UPDATE,DELETE we need @Transactional
    @Transactional(rollbackOn = Exception.class)
    public  void saveData(){

        //inserting employee data into employee table
        Employee emp = new Employee();
        emp.setEmpId(205);
        emp.setEmpName("Jyoti Ranjan Mohanta");
        emp.setEmpSal(42000);
        empRepo.save(emp);

        //inserting address data into address table
        Address addr = new Address();
        addr.setAdressId(505);
        addr.setCity("Bhubaneswar");
        addr.setState("Odisha");
        addr.setCountry("India");
        addr.setEmpId(205);
        addressRepo.save(addr);

    }
}

//COMMIT :; storing data in database permanently
//ROLLBACK :: bringing database to previous state
