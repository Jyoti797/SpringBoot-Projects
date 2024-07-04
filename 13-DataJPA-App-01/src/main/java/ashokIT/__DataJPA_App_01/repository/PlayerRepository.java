package ashokIT.__DataJPA_App_01.repository;

import ashokIT.__DataJPA_App_01.entity.Player;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {

        public List<Player> findByAgeGreaterThan(Integer age);


}
