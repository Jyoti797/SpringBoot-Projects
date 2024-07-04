package ashokIT.__SpringBoot_ComponentScan.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public UserDao() {
        System.out.println("UserDao :: Constructor");
    }
}

//component scanning will start from Base Package==> The package which contains start class is called as Base Package
//after base package scanning is completed it will scan sub packages...
// basePackage=> ashokIT
// springBean=> car, UserDao, UserService
//subpackages=> DAO, SERVICE
