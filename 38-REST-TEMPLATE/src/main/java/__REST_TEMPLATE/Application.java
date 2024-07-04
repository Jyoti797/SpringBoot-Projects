package __REST_TEMPLATE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        String apiURL = "https://handy-idiom-426910-p9.df.r.appspot.com/";
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> forEntity = rt.getForEntity(apiURL, String.class);


        String body = forEntity.getBody();
        System.out.println(body);


    }

}
