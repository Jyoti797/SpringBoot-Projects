package ashokIT.__Data_JPA;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserCustom extends CrudRepository<User, Integer> {

    //retrive all users
    @Query (value = "from User")
    public List<User> getAllUsers();

    //retrive all users
    @Query (value = "select user_name from user_master where user_hometown='Kendrapada' ", nativeQuery = true)
    public  List<User> query1() ;
}
