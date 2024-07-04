package ashokIT.__SpringBoot_Autowiring.DAO;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleDaoImpl  implements ReportDao {

    public OracleDaoImpl() {
        System.out.println("OracleDaoImpl :: Constructor.......");
    }

    @Override
    public  void findData(){
        System.out.println("Fetching Report Data from ORACLE Database.....");

    }
}
