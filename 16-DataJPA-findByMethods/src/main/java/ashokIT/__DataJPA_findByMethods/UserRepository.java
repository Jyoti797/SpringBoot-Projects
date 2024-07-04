package ashokIT.__DataJPA_findByMethods;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    public List<User> findByUserHome(String home);

    public List<User> findByUserAge(Integer age);

    public List<User> findByUserAgeGreaterThan(Integer age);

    public List<User> findByUserAgeLessThanEqualAndAndUserGender(Integer age, String sex);

    public  List<User> findByUserHomeIn(List<String> homes);

    public  List<User> findByUserAgeAndUserHome(Integer age, String home);

    public  List<User>  findByUserHomeAndUserAgeAndUserGender(String home, Integer age, String Gender);

}
