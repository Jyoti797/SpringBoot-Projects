package ashokIT.__SpringBoot_Autowiring.DAO;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysql")
@Primary
public class MySqlDaoImpl implements ReportDao {

    public MySqlDaoImpl() {
        System.out.println("MySqlDaoImpl :: Constructor......");
    }

    @Override
    public  void findData(){
        System.out.println("Fetching Report Data from MySQL Database.....");

    }
}
