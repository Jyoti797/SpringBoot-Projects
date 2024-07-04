package ashokIT.__DataJPA_App_01;

import java.util.List;

import ashokIT.__DataJPA_App_01.entity.Player;
import ashokIT.__DataJPA_App_01.repository.PlayerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		PlayerRepository playerRepository = context.getBean(PlayerRepository.class);

		// Player p1 = new Player();
		// p1.setPlayerId(25);
		// p1.setPlayerName("Kuldeep Yadav");
		// p1.setPlayerAge(27);
		// p1.setLocation("Uttar Pradesh");

		// playerRepository.save(p1);
		//save() is a upsert method since it is being used for both inert and update

		List <Player> result = playerRepository.findByAgeGreaterThan(30);

		result.forEach(user->{
			System.out.println(user);
		
		});




		
	}

}
